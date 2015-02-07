package com.test.wdoctor.network.socket;

import org.apache.mina.core.future.ConnectFuture;
import org.apache.mina.core.service.IoHandlerAdapter;
import org.apache.mina.transport.socket.nio.NioSocketConnector;

import android.content.Context;

/**
 * 
 * @author ������  QQ:249782944
 * ѧУ:���ϴ�ѧ ��ѧԺ
 * EnterpriseIMClient :��ҵ��ʱͨѶ
 * May 8, 2010
 * 
 * ��mina�������Լ���װ�Ŀͻ��˵�����Socket����ʵ�֣�������Ϊ������
 *   ����
 *     1:�ͻ��������� �� �ͻ�������
 *     2:�����ip��˿ں�
 *     3:��ʼ�� ��  �ر� Socket��һ�з���
 */
public abstract class EIMClientSocket {

	private boolean isStart=false;                          //�ж�Socket�Ƿ��Ѿ�������
	public final static int timeOutMillis=60*1000;         //���ӳ�ʱ��ʱ��
	private  int     server_Socket_Port=9090;                   //Ҫ���ӵ�Socket�ļ����˿�
	private  String     server_IP_Port="115.28.92.230";                    //Ҫ���ӵ�Socket��IP
	private IoHandlerAdapter handlerAdapter;               //��Ϣ������
	private NioSocketConnector connector;                  //�ͻ���������
	public  ConnectFuture connectFuture;                   //�ͻ�������
	
	/**
	 * ��ʼ��Socket
	 */
	public abstract void initSocket(Context context);
	/**
	 * ����Socket
	 */
	public abstract boolean startSocket(Context context) ;
	/**
	 * �ر�Socket
	 */
	public abstract boolean closedSocket() ;
	
	
	public IoHandlerAdapter getHandlerAdapter() {
		return handlerAdapter;
	}
	public void setHandlerAdapter(IoHandlerAdapter handlerAdapter) {
		this.handlerAdapter = handlerAdapter;
	}
	public boolean isStart() {
		return isStart;
	}
	public void setStart(boolean isStart) {
		this.isStart = isStart;
	}
	public NioSocketConnector getConnector() {
		return connector;
	}
	public void setConnector(NioSocketConnector connector) {
		this.connector = connector;
	}
	public int getServer_Socket_Port() {
		return server_Socket_Port;
	}
	public void setServer_Socket_Port(int server_Socket_Port) {
		this.server_Socket_Port = server_Socket_Port;
	}
	public String getServer_IP_Port() {
		return server_IP_Port;
	}
	public void setServer_IP_Port(String server_IP_Port) {
		this.server_IP_Port = server_IP_Port;
	}
}
