package com.csu.message;

/**
 * 
 * @author ������  QQ:249782944
 * ѧУ:���ϴ�ѧ ��ѧԺ
 * EnterpriseIMServer :��ҵ��ʱͨѶ
 * Apr 27, 2010
 * 
 * ������Ϣ�ĸ��࣬��Ϣͷ����������������Ϣ������ӵ�еġ�
 */
public class BaseMessage implements java.io.Serializable{
	
	private int msgType;        //��Ϣ����
	private String srcQQ;       //��Ϣ�ķ�����
	private String destQQ;      //��Ϣ�Ľ�����
	
	public String getDestQQ() {
		return destQQ;
	}
	public void setDestQQ(String destQQ) {
		this.destQQ = destQQ;
	}
	public int getMsgType() {
		return msgType;
	}
	public void setMsgType(int msgType) {
		this.msgType = msgType;
	}
	public String getSrcQQ() {
		return srcQQ;
	}
	public void setSrcQQ(String srcQQ) {
		this.srcQQ = srcQQ;
	}
	
	public String toString(){
		return "��Ϣ����:"+msgType+"  ������:"+srcQQ+"  ������:"+destQQ;
	}
}
