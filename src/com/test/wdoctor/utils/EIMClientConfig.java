package com.test.wdoctor.utils;

import com.csu.message.MessageType;

public class EIMClientConfig {
	/**����ʱ���̵�ͼ��  */
	public static final int  OnlineTryIcon_Type      =11111110;
	/**����ʱ���̵�ͼ��  */
	public static final int  OffLineTryIcon_Type     =11111111;
	/**����ʱ���̵�ͼ��  */
	public static final int  LoginingTryIcon_Type    =11111112;
	/**����ʱ���̵�ͼ��  */
	public static final int  YinShengTryIcon_Type     =11111113;
	
	public static String  getLoginErrrorReasonByType(int faile_reason){
		String reason="";
		switch(faile_reason){
		case MessageType.LoginResponse_Faile_QQReason:
			reason="�û������ڣ�";break;
		case MessageType.LoginResponse_Faile_PwdReason:
			reason="QQ�������";break;
		case MessageType.LoginResponse_Faile_SerReason:
			reason="�������ڲ�����";break;
		case MessageType.LoginResponse_Faile_VisonReason:
			reason="QQ�汾����";break;
		case MessageType.LoginResponse_Faile_OtherReason:
			reason="QQ��¼δ֪����";break;
		}
		return reason;
	}
	
}
