package com.test.wdoctor.model;

import java.io.Serializable;
import java.util.List;

/**
 * 
 * @author ������  QQ:249782944
 * ѧУ:���ϴ�ѧ ��ѧԺ
 * EnterpriseIMServer :��ҵ��ʱͨѶ
 * Apr 28, 2010
 * 
 */
public class MsgFriendGroup extends Group implements Serializable {
	
	private List<MsgUser> userList;    //����û��б�
	
	public List<MsgUser> getUserList() {
		return userList;
	}
	public void setUserList(List<MsgUser> userList) {
		this.userList = userList;
	}
	public List<MsgUser> getGrops() {
		return userList;
	}
	public String toString(){
		StringBuffer buffer=new StringBuffer();
		buffer.append("\n"+this.getGroupName()+" Ⱥ��Ϣ����:\n");
		buffer.append("roupID:\" "+this.getGroupID()+"\"");
		buffer.append("roupOwerID:\" "+this.getGroupOwerID()+"\"");
		buffer.append("roupName:\" "+this.getGroupName()+"\"\n");
		buffer.append("����û��б�:\n");
		for(MsgUser user: userList){
			buffer.append(user+"\n");
		}
		buffer.append("\n");
		return buffer.toString();
	}

}