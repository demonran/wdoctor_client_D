package com.csu.message;

/**
 * 
 * @author ������  QQ:249782944
 * ѧУ:���ϴ�ѧ ��ѧԺ
 * EnterpriseIMServer :��ҵ��ʱͨѶ
 * Apr 27, 2010
 * 
 * ������Ӧ��Ϣ
 *     ���� 1:��Ϣͷ 2�� ��֤���
 */
public class LoginResponseMessage extends BaseMessage {

	private int loginResponse;     //���������ص�����֤��� 1����ȷ 0������
	private int errorReason;       //�����֤������� ����������� 
	                               //0���������ڲ����� 1��QQ�Ų���  2���������  3:�汾���� 4������ԭ��
	public LoginResponseMessage(){
		this.setMsgType(MessageType.LoginMessage_Type);
	}
	
	public int getErrorReason() {
		return errorReason;
	}
	public void setErrorReason(int errorReason) {
		this.errorReason = errorReason;
	}
	public int getLoginResponse() {
		return loginResponse;
	}
	public void setLoginResponse(int loginResponse) {
		this.loginResponse = loginResponse;
	}

	public String toString(){
		String str=null;
		if(loginResponse==1){
			str="����ɹ�";
		}else if(loginResponse==0){
			switch(errorReason){
			  case   0:str="����ʧ�ܣ��������ڲ����󣬴������Ϊ��"+errorReason;break;
			  case   1:str="����ʧ�ܣ�QQ�Ų��ԣ��������Ϊ��"+errorReason;break;
			  case   2:str="����ʧ�ܣ�������󣬴������Ϊ��"+errorReason;break;
			  case   3:str="����ʧ�ܣ��汾���󣬴������Ϊ��"+errorReason;break;
			  case   4:str="����ʧ�ܣ�����ԭ�򣬴������Ϊ��"+errorReason;break;
			  default :str="����ʧ�ܣ�����δ֪ԭ��";break;
			}
		}
		return str;
	}
}
