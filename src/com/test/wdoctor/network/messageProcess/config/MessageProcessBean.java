package com.test.wdoctor.network.messageProcess.config;

/**
 * 
 * @author ������  QQ:249782944
 * ѧУ:���ϴ�ѧ ��ѧԺ
 * EnterpriseIMServer :��ҵ��ʱͨѶ
 * May 7, 2010
 * 
 */
public class MessageProcessBean {

	private int    messageType;
	private String processName;
	private String desc;
	private String processClass;
	
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getProcessClass() {
		return processClass;
	}
	public void setProcessClass(String processClass) {
		this.processClass = processClass;
	}
	public String getProcessName() {
		return processName;
	}
	public void setProcessName(String processName) {
		this.processName = processName;
	}
	public int getMessageType() {
		return messageType;
	}
	public void setMessageType(int messageType) {
		this.messageType = messageType;
	}
	
	
}
