package com.test.wdoctor.network.messageProcess;

import android.content.Context;

import com.csu.message.BaseMessage;
import com.csu.message.RepeatLoginMessage;

public class RepeatLoginMessageProcess implements IMessageProcess{

	public void processMessage(BaseMessage message,Context context) {
		RepeatLoginMessage repeatMessage=(RepeatLoginMessage)message;
		final String ip=repeatMessage.getRepeatLoginIP();
//		Runnable run=new Runnable(){
//			EIMMainFrame mainFrame=EIMMainFrame.getInstance();
//			public void run(){
//				EIMTrayIcon qqTrayIcon=EIMTrayIcon.getInStance();
//				qqTrayIcon.showIcon(EIMClientConfig.OffLineTryIcon_Type);
//				ClientChatSocket.getInstance().setStart(false);
//				ConnectSession.getInstance().close();
//				String errorInfo="���QQ��IpΪ:"+ip+"�ĵط���½��";
//				Object[] options = {"���µ�¼","�˳�","ȡ��"};
//				BaseFrame.centerWindow(mainFrame);
//				mainFrame.setVisible(true);
//		        int response=JOptionPane.showOptionDialog ( mainFrame, errorInfo,"���µ�¼",JOptionPane.YES_OPTION ,JOptionPane.PLAIN_MESSAGE,
//		                null, options, options[0] );
//		        if (response == 0)
//		         {
//		        	mainFrame.setVisible(false);
//		        	EIMLoginFrame qqLoginFrame=EIMLoginFrame.getInstance();
//		        	qqLoginFrame.setVisible(true);
//		        	}
//		        else if(response == 1)
//		         {
//		        	System.exit(0);
//		        	}
//		        else if(response == 2)
//		         {
//		        	
//		         }
//			}
//		};

	}

}
