package com.test.wdoctor.network.socket;

import java.net.InetSocketAddress;

import org.apache.mina.core.filterchain.DefaultIoFilterChainBuilder;
import org.apache.mina.filter.codec.ProtocolCodecFilter;
import org.apache.mina.filter.codec.serialization.ObjectSerializationCodecFactory;
import org.apache.mina.transport.socket.nio.NioSocketConnector;

import android.content.Context;
import android.util.Log;

import com.test.wdoctor.network.handler.ClientChatHandler;
import com.test.wdoctor.utils.LogUtil;

/**
 * 
 * @author ������  QQ:249782944
 * ѧУ:���ϴ�ѧ ��ѧԺ
 * EnterpriseIMClient :��ҵ��ʱͨѶ
 * May 11, 2010
 * 
 * �ͻ���������Ϣ����socket ����
 */
public class ClientChatSocket extends EIMClientSocket {
	
	private static final String TAG = LogUtil.makeLogTag(ConnectSession.class);
	
	private static ClientChatSocket instance;
	
	public static ClientChatSocket getInstance(){
		if(instance==null){
			instance= new ClientChatSocket();
		}
		return instance;
	}
	
	private ClientChatSocket(){
	}
	
	public boolean closedSocket() {
		this.getConnector().dispose();
		this.setStart(false);
		Log.i(TAG,"�ͻ��ر����������������");
		return true;
	}

	public void initSocket(Context context) {
		this.setHandlerAdapter(new ClientChatHandler(context));
		this.setConnector(new NioSocketConnector());
		Log.i(TAG,"�ͻ���ʼ�����������������");
	}

	/**
	 * @param handler 
	 * 
	 */
	public boolean startSocket(Context context)  {
		try{
			if(this.isStart()==false){
				this.initSocket(context);
				/**�����������ݵĹ�����		             */
				DefaultIoFilterChainBuilder chain=this.getConnector().getFilterChain();
				ObjectSerializationCodecFactory objscf=new ObjectSerializationCodecFactory();
				ProtocolCodecFilter protocolCodecFilter=new ProtocolCodecFilter(objscf);
				chain.addLast("myTextChain", protocolCodecFilter);
			    this.getConnector().setHandler(this.getHandlerAdapter());
				/**�������ӳ�ʱ��ʱ�� Ϊ��һ����  �����ʱ�����Թ�С		 */
				this.getConnector().setConnectTimeoutMillis(EIMClientSocket.timeOutMillis);
				Log.i(TAG,"ip/port:"+this.getServer_IP_Port()+"/"+this.getServer_Socket_Port());
				InetSocketAddress textInetSocketAddress=new InetSocketAddress(this.getServer_IP_Port(),this.getServer_Socket_Port());
				/**��������		 */
				this.connectFuture=this.getConnector().connect(textInetSocketAddress);
				Log.i(TAG,"�Ѿ������û�������");
				this.setStart(true);
				Log.i(TAG,"�ͻ��������������������");
			}
			return true;
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
		
		
		
	}

}
