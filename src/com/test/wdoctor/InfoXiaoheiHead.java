package com.test.wdoctor;



import android.app.Activity;
import android.os.Bundle;
import android.view.MotionEvent;

public class InfoXiaoheiHead extends Activity{

	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);	
		setContentView(R.layout.info_xiaohei_head);
		//requestWindowFeature(Window.FEATURE_NO_TITLE);//ȥ��������
		//getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
        //        WindowManager.LayoutParams.FLAG_FULLSCREEN);   //ȫ����ʾ
		//Toast.makeText(getApplicationContext(), "���ӣ��úñ��У�", Toast.LENGTH_LONG).show();
		//overridePendingTransition(R.anim.hyperspace_in, R.anim.hyperspace_out);

   }
	@Override
	public boolean onTouchEvent(MotionEvent event){
		finish();
		return true;
	}
	
}