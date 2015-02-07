package com.csu.message;

/**
 * 
 * @author ������  QQ:249782944
 * ѧУ:���ϴ�ѧ ��ѧԺ
 * EnterpriseIMServer :��ҵ��ʱͨѶ
 * Apr 27, 2010
 * 
 * 
 */
public class RepeatLoginMessage extends BaseMessage {

	public RepeatLoginMessage(){
		this.setMsgType(MessageType.RepeatLoginMessage_Type);
	}
	
	
	public RepeatLoginMessage(String destQQ){
		this();
		this.setSrcQQ(MessageType.sysQQ);
		this.setDestQQ(destQQ);
		
	}
	
	private String repeatLoginIP;

	public String getRepeatLoginIP() {
		return repeatLoginIP;
	}

	public void setRepeatLoginIP(String repeatLoginIP) {
		this.repeatLoginIP = repeatLoginIP;
	}
}
