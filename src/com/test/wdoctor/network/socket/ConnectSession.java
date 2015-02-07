package com.test.wdoctor.network.socket;

import org.apache.mina.core.session.IoSession;

import android.util.Log;

import com.csu.message.BaseMessage;
import com.test.wdoctor.utils.LogUtil;


/**
 * 
 * 
 * ����ͻ������Ӷ��� ȫ�ֵ���ģʽ
 *  ���Ӷ��������
 *     1
 *     2
 *     3
 *
 */
public class ConnectSession {
	
	private static final String TAG = LogUtil.makeLogTag(ConnectSession.class);
	
private static ConnectSession instance;
	
	private IoSession textSession;     //����Ự���Ӷ���
	private IoSession fileSession;     //�ļ��Ự���Ӷ���
	private IoSession cinemaSession;   //��Ƶ�Ự���Ӷ���
	private String    owerQQ;          //�˻Ự���Ӷ���������ߵ�qq��
	
	private ConnectSession(){
		
	}
	
	public static ConnectSession getInstance(){
		if(instance==null){
			instance=new ConnectSession();
		}
		return instance;
	}

	public void close(){
		if(textSession!=null){
			textSession.close();
		}
		if(fileSession!=null){
			fileSession.close();
		}
		if(cinemaSession!=null){
			cinemaSession.close();
		}
	}
	/**
	 * 
	 * @param msg
	 */
	public void sendTextMessage(BaseMessage msg){
		Log.i(TAG,"���͵���ϢΪ��"+msg);
		textSession.write(msg);
	}
	/**
	 * 
	 * @param msg
	 */
	public void sendFileMessage(BaseMessage msg){
		fileSession.write(msg);
	}
	
	/**
	 * 
	 * @param msg
	 */
	public void sendCinemaeMessage(BaseMessage msg){
		cinemaSession.write(msg);
	}
	
	public IoSession getCinemaSession() {
		return cinemaSession;
	}

	public void setCinemaSession(IoSession cinemaSession) {
		this.cinemaSession = cinemaSession;
	}

	public IoSession getFileSession() {
		return fileSession;
	}

	public void setFileSession(IoSession fileSession) {
		this.fileSession = fileSession;
	}

	public String getOwerQQ() {
		return owerQQ;
	}

	public void setOwerQQ(String owerQQ) {
		this.owerQQ = owerQQ;
	}

	public IoSession getTextSession() {
		return textSession;
	}

	public void setTextSession(IoSession textSession) {
		this.textSession = textSession;
	}


}
