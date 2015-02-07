package com.test.wdoctor.network.handler;

import org.apache.mina.core.service.IoHandlerAdapter;
import org.apache.mina.core.session.IdleStatus;
import org.apache.mina.core.session.IoSession;

import android.content.Context;
import android.os.Handler;
import android.util.Log;

import com.csu.message.BaseMessage;
import com.test.wdoctor.CommonContainer;
import com.test.wdoctor.network.messageProcess.ClientReceivedMessageProcess;
import com.test.wdoctor.network.socket.ConnectSession;
import com.test.wdoctor.utils.LogUtil;


public class ClientChatHandler extends IoHandlerAdapter {
	
	private static final String TAG = LogUtil.makeLogTag(ClientChatHandler.class);

	private Context context;
	public ClientChatHandler(Context context) {
		this.context = context;
	}

	/**
	 * 
	 * ���ӿ������������׳��쳣δ������ʱ�����˷��� 
	 */
	public void exceptionCaught(IoSession ioSession, Throwable throwable) throws Exception {
		
	}

	/**
	 * �����յ���Ϣ�󱻴��� 
	 * 
	 */
	public void messageReceived(IoSession ioSession, Object msg) throws Exception {
		BaseMessage message=(BaseMessage)msg;
		Log.i(TAG,"���ܵ�����ϢΪ��"+message);
		ClientReceivedMessageProcess messageProcess=new ClientReceivedMessageProcess();
		messageProcess.processMessage(message,context);
	}

	/**
	 * ��������Ϣ�󱻴��� 
	 * 
	 */
	public void messageSent(IoSession ioSession, Object msg) throws Exception {
		
	}

	/**
	 * ���Ự�ر�ʱ������
	 * 
	 */
	public void sessionClosed(IoSession ioSession) throws Exception {
		Log.e(TAG,"��������Ͽ����ӣ���");
//		EIMTrayIcon trayIcon=EIMTrayIcon.getInStance();
//		trayIcon.showIcon(EIMClientConfig.OffLineTryIcon_Type);
	}

	/**
	 * ���Ự����ʱ������ 
	 * 
	 */
	public void sessionCreated(IoSession ioSession) throws Exception {
		
	}
	/**
	 * 
	 * ���Ự����ʱ������ 
	 */
	public void sessionIdle(IoSession ioSession, IdleStatus msg) throws Exception {
		
	}
	/**
	 * 
	 * ���Ự��ʼʱ������ 
	 */
	public void sessionOpened(IoSession ioSession) throws Exception {
		ConnectSession clientConnect=ConnectSession.getInstance();
		Log.i(TAG,"�Ự�Ѿ���");
		clientConnect.setTextSession(ioSession);
		clientConnect.sendTextMessage(CommonContainer.loginMessage);
	}



}
