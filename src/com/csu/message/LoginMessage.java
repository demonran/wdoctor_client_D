package com.csu.message;

/**
 * 
 * @author ������  QQ:249782944
 * ѧУ:���ϴ�ѧ ��ѧԺ
 * EnterpriseIMServer :��ҵ��ʱͨѶ
 * Apr 27, 2010
 * 
 * ������Ϣ
 *      ���� 1����Ϣͷ 2�������ߵ��˺ź�����
 */
public class LoginMessage extends BaseMessage {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String owerQQ;   //�����ߵ�QQ��
	private String pwd;     //�����ߵ�����
	private String state;   //�����ߵ�״̬
	private String loginID;
	
	public LoginMessage(){
		this.setDestQQ(MessageType.sysQQ);
		this.setMsgType(MessageType.LoginMessage_Type);
	}
	public String getOwerQQ() {
		return owerQQ;
	}
	
	public void setOwerQQ(String owerQQ) {
		this.owerQQ = owerQQ;
	}
	
	public String getPwd() {
		return pwd;
	}
	
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getLoginID() {
		return loginID;
	}
	public void setLoginID(String loginID) {
		this.loginID = loginID;
	} 
}
