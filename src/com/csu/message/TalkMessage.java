package com.csu.message;

/**
 * 
 * @author ������  QQ:249782944
 * ѧУ:���ϴ�ѧ ��ѧԺ
 * EnterpriseIMServer :��ҵ��ʱͨѶ
 * Apr 27, 2010
 * 
 *   �û�������Ϣ
 *    ���� 1:��Ϣͷ 2����������
 */
public class TalkMessage extends BaseMessage {
	
	private  String talkMsg;  //��������
	
	public TalkMessage(){
		this.setMsgType(MessageType.TalkMessage_Type);
	}

	public String getTalkMsg() {
		return talkMsg;
	}

	public void setTalkMsg(String talkMsg) {
		this.talkMsg = talkMsg;
	}
	
	public String toString(){
		return "�ͻ��ˣ��û�"+this.getSrcQQ()+"�� ����"+this.getDestQQ()+"������������Ϣ:"+talkMsg;
	}
}
