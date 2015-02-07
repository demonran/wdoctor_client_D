package com.csu.message;



public class FriendGroupMessage extends BaseMessage {

//	private MsgUser ower;         //��½�ߵ���Ϣ
	private String friendGroupXML;//�����б���Ϣ
	private String teamXML;       //Ⱥ�б���Ϣ
	
	public FriendGroupMessage(){
		this.setMsgType(MessageType.FriendGroupMessage_Type);
		this.setSrcQQ(MessageType.sysQQ);
	}
	
	public FriendGroupMessage(String friendGroupOwerQQ){
		this();
		this.setDestQQ(friendGroupOwerQQ);
	}

	public String getFriendGroupXML() {
		return friendGroupXML;
	}

	public void setFriendGroupXML(String friendGroupXML) {
		this.friendGroupXML = friendGroupXML;
	}

	public String getTeamXML() {
		return teamXML;
	}

	public void setTeamXML(String teamXML) {
		this.teamXML = teamXML;
	}

//	public MsgUser getOwer() {
//		return ower;
//	}
//
//	public void setOwer(MsgUser ower) {
//		this.ower = ower;
//	}
	

}
