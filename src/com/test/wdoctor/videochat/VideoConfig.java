package com.test.wdoctor.videochat;
//package com.test.wdoctor.videocaht;
//
//import android.app.Activity;
//import android.graphics.Color;
//import android.os.Bundle;
//import android.view.View;
//import android.view.View.OnClickListener;
//import android.view.Window;
//import android.widget.ArrayAdapter;
//import android.widget.Button;
//import android.widget.CheckBox;
//import android.widget.ImageButton;
//import android.widget.RadioButton;
//import android.widget.Spinner;
//import android.widget.TextView;
//
//import com.test.wdoctor.R;
//
//public class VideoConfig extends Activity{
//	private ImageButton mImgBtnReturn;
//	private TextView mTitleName;
//	
//	private Button mSaveBtn;
//	private ConfigEntity mConfigEntity;		
//	// ����������
//	private RadioButton mServerModelConfigBtn;
//	// �Զ�������
//	private RadioButton mCustomModelConfigBtn;
//	
//	private TextView mResolutionTV;
//	private CheckBox mEnableP2PBox;
//	private CheckBox mVideoOverlayBox;
//	private CheckBox mUseARMv6Box;
//	private CheckBox mUseAECBox;
//	private CheckBox mUseHWCodecBox;
//	private CheckBox mVideoRotateBox;
//	private CheckBox mFixColorDeviation;
//	private CheckBox mVideoShowGPURender;
//	private CheckBox mVideoAutoRotation;
//	private Spinner mVideoSizeSpinner;
//	private Spinner mVideoBitrateSpinner;
//	private Spinner mVideoFPSSpinner;
//	private Spinner mVideoQualitySpinner;
//	private Spinner mVideoPresetSpinner;
//
//	private final String[] mArrVideoSizeStr = {"176 x 144", "320 x 240��Ĭ�ϣ�", "352 x 288", "640 x 480", "720 x 480", "1280 x 720"};
//	private final int[] mArrVideoWidthValue = {176,320,352,640, 720, 1280};
//	private final int[] mArrVideoHeightValue = {144,240,288,480, 480, 720};
//	
//	private final String[] mArrVideoBitrateStr = {"��������ģʽ", "60kbps��Ĭ�ϣ�", "80kbps", "100kbps", "150kbps", "200kbps", "300kbps", "500kbps", "800kbps", "1Mbps"};
//	private final int[]	mArrVideoBitrateValue = {0,60*1000,80*1000,100*1000,150*1000,200*1000,300*1000,500*1000,800*1000,1000*1000};
//	
//	private final String[] mArrVideofpsStr = {"2 FPS", "4 FPS", "6 FPS", "8 FPS", "10FPS��Ĭ�ϣ�", "15FPS", "20FPS", "25FPS"};
//	private final int[]	mArrVideofpsValue = {2,4,6,8,10,15,20,25};
//	
//	private final String[] mArrVideoQualityStr = {"��ͨ��Ƶ����", "�е���Ƶ������Ĭ�ϣ�", "�Ϻ���Ƶ����"};
//	private final int[] mArrVideoQualityValue = {2,3,4};
//	
//	private final String[] mArrVideoPresetStr = {"���Ч�ʣ��ϵ�����","�ϸ�Ч�ʣ��ϵ�����","���ܾ��⣨Ĭ�ϣ�","�ϸ��������ϵ�Ч��","����������ϵ�Ч��"};
//	private final int[] mArrVideoPresetValue = {1,2,3,4,5};
//	
//	@Override
//	protected void onCreate(Bundle savedInstanceState) {
//		super.onCreate(savedInstanceState);
//		requestWindowFeature(Window.FEATURE_CUSTOM_TITLE);
//		
//		mConfigEntity = ConfigService.LoadConfig(this);
//		setContentView(R.layout.videoconfig);
//		
//		getWindow().setFeatureInt(Window.FEATURE_CUSTOM_TITLE, R.layout.titlebar);  
//		mImgBtnReturn = (ImageButton) this.findViewById(R.id.returnImgBtn);
//		mTitleName = (TextView) this.findViewById(R.id.titleName);
//		mImgBtnReturn.setOnClickListener(onClickListener);
//		mTitleName.setText("��Ƶ��������");
//		//��ʼ������
//		InitialLayout();
//	}
//	
//	private void InitialLayout() {
//		
//		// ����P2P��������
//		mEnableP2PBox = (CheckBox)this.findViewById(R.id.enableP2PBox);
//		mEnableP2PBox.setTextColor(Color.BLACK);
//		mEnableP2PBox.setChecked(mConfigEntity.mEnableP2P != 0);
//		
//		// Overlay��Ƶģʽ
//		mVideoOverlayBox = (CheckBox)this.findViewById(R.id.videoOverlayBox);
//		mVideoOverlayBox.setTextColor(Color.BLACK);
//		mVideoOverlayBox.setChecked(mConfigEntity.mVideoOverlay != 0);
//		
//		// ��ת��Ƶ
//		mVideoRotateBox = (CheckBox)this.findViewById(R.id.videoRotateBox);
//		mVideoRotateBox.setTextColor(Color.BLACK);
//		mVideoRotateBox.setChecked(mConfigEntity.mVideoRotateMode != 0); 
//		
//		// ������Ƶ�ɼ�ƫɫ����
//		mFixColorDeviation = (CheckBox)this.findViewById(R.id.fixColorDeviation);
//		mFixColorDeviation.setTextColor(Color.BLACK);
//	    mFixColorDeviation.setChecked(mConfigEntity.mFixColorDeviation != 0);  
//		
//	    // ������ƵGPU��Ⱦ
//	    mVideoShowGPURender = (CheckBox)this.findViewById(R.id.videoShowGPURender);
//	    mVideoShowGPURender.setTextColor(Color.BLACK);
//	    mVideoShowGPURender.setChecked(mConfigEntity.mVideoShowGPURender!=0); 	
//	    
//	    // ������Ƶ�����豸�Զ���ת
//	    mVideoAutoRotation = (CheckBox)this.findViewById(R.id.videoAutoRotation);
//	    mVideoAutoRotation.setTextColor(Color.BLACK);
//	    mVideoAutoRotation.setChecked(mConfigEntity.mVideoAutoRotation != 0); 
//		
//	    // ǿ��ʹ��ARMv6ָ�����ȫģʽ��
//	    mUseARMv6Box = (CheckBox)this.findViewById(R.id.useARMv6Box);
//	    mUseARMv6Box.setTextColor(Color.BLACK);
//	    mUseARMv6Box.setChecked(mConfigEntity.mUseARMv6Lib != 0); 
//	    
//	    // ���û���������AEC��
//	    mUseAECBox = (CheckBox)this.findViewById(R.id.useAECBox);
//	    mUseAECBox.setTextColor(Color.BLACK);
//	    mUseAECBox.setChecked(mConfigEntity.mEnableAEC != 0); 
//	    
//	    // ����ƽ̨����Ӳ������루������Ӧ�ó���
//	    mUseHWCodecBox = (CheckBox)this.findViewById(R.id.useHWCodecBox);
//	    mUseHWCodecBox.setTextColor(Color.BLACK);
//	    mUseHWCodecBox.setChecked(mConfigEntity.mUseHWCodec != 0);
//	  
//	    // ��������ģʽѡ����
//	    TextView configModelLable = (TextView)this.findViewById(R.id.configModelLable);
//	    configModelLable.setTextColor(Color.BLACK);
//	    configModelLable.setText("ѡ������ģʽ�� ");
//	     
//	    mServerModelConfigBtn = (RadioButton)findViewById(R.id.serverModelConfigBtn);
//	    mCustomModelConfigBtn = (RadioButton)findViewById(R.id.customModelConfigBtn);
//	    mServerModelConfigBtn.setTextColor(Color.BLACK);
//	    mCustomModelConfigBtn.setTextColor(Color.BLACK);
//    	mServerModelConfigBtn.setOnClickListener(onClickListener);
//    	mCustomModelConfigBtn.setOnClickListener(onClickListener);
//	    
//    	if (mConfigEntity.mConfigMode == ConfigEntity.VIDEO_MODE_SERVERCONFIG)
//    		mServerModelConfigBtn.setChecked(true);
//    	else
//    		mCustomModelConfigBtn.setChecked(true);
//    		
//    	//ѡ����Ƶ�ֱ��ʣ�
//    	mResolutionTV = (TextView)this.findViewById(R.id.resolutionTV);
//    	mResolutionTV.setTextColor(Color.BLACK);
//   	
//    	// ������Ƶ�ֱ���
//    	mVideoSizeSpinner = (Spinner)this.findViewById(R.id.videoSizeSpinner);
//    	ArrayAdapter<String> videoSizeAdapter; 
//    	videoSizeAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,mArrVideoSizeStr);  
//    	videoSizeAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);  
//    	mVideoSizeSpinner.setAdapter(videoSizeAdapter);  
//    	mVideoSizeSpinner.setVisibility(View.VISIBLE);
//    	int iSelectVideoSize = 0;
//    	for(int i=0; i<mArrVideoWidthValue.length; i++)
//    	{
//    		if(mArrVideoWidthValue[i] == mConfigEntity.mResolutionWidth)
//    		{
//    			iSelectVideoSize = i;
//    			break;
//    		}
//    	}
//    	mVideoSizeSpinner.setSelection(iSelectVideoSize);
//
//    	//��������
//    	mVideoBitrateSpinner = InsertSpinnerInterface(1, mArrVideoBitrateStr, mArrVideoBitrateValue, mConfigEntity.mVideoBitrate);
//    	//����֡��
//    	mVideoFPSSpinner = InsertSpinnerInterface(2, mArrVideofpsStr, mArrVideofpsValue, mConfigEntity.mVideoFps); 	
//    	//������Ƶ����
//    	mVideoQualitySpinner = InsertSpinnerInterface(3, mArrVideoQualityStr, mArrVideoQualityValue, mConfigEntity.mVideoQuality);
//    	// ������ƵԤ�����
//    	mVideoPresetSpinner = InsertSpinnerInterface(4, mArrVideoPresetStr, mArrVideoPresetValue, mConfigEntity.mVideoPreset);
//    	
//    	// ��������ģʽ��ȷ���Ƿ���Ҫ��ʾ�Զ����������
//    	CustomControlsShow(mConfigEntity.mConfigMode == 0 ? false : true);
//    	
//    	mSaveBtn = (Button)this.findViewById(R.id.saveBtn);
//    	mSaveBtn.setText("��������");
//    	mSaveBtn.setOnClickListener(onClickListener);
//	}
//		
//	OnClickListener onClickListener = new OnClickListener() {
//		@Override
//		public void onClick(View v) {
//			if (v == mSaveBtn){
//				SaveConfig();
//			}else if (v == mCustomModelConfigBtn) {
//				CustomControlsShow(true);
//			}else if (v == mServerModelConfigBtn) {
//				CustomControlsShow(false);
//			}else if (v == mImgBtnReturn) {
//				destroyCurActivity();
//			}
//		}
//	};
//	
//	private void CustomControlsShow(boolean bEnable) {
//		mVideoSizeSpinner.setEnabled(bEnable);
//    	mVideoBitrateSpinner.setEnabled(bEnable);
//    	mVideoFPSSpinner.setEnabled(bEnable);
//    	mVideoQualitySpinner.setEnabled(bEnable);
//    	mVideoPresetSpinner.setEnabled(bEnable);	    	
//	}
//	
//	private void SaveConfig()
//	{
//		mConfigEntity.mConfigMode = mServerModelConfigBtn.isChecked() ? ConfigEntity.VIDEO_MODE_SERVERCONFIG : ConfigEntity.VIDEO_MODE_CUSTOMCONFIG;
//		mConfigEntity.mResolutionWidth = mArrVideoWidthValue[mVideoSizeSpinner.getSelectedItemPosition()];
//		mConfigEntity.mResolutionHeight = mArrVideoHeightValue[mVideoSizeSpinner.getSelectedItemPosition()];
//		mConfigEntity.mVideoBitrate = mArrVideoBitrateValue[mVideoBitrateSpinner.getSelectedItemPosition()];
//		mConfigEntity.mVideoFps = mArrVideofpsValue[mVideoFPSSpinner.getSelectedItemPosition()];    	
//		mConfigEntity.mVideoQuality = mArrVideoQualityValue[mVideoQualitySpinner.getSelectedItemPosition()];  
//		mConfigEntity.mVideoPreset = mArrVideoPresetValue[mVideoPresetSpinner.getSelectedItemPosition()]; 
//
//		mConfigEntity.mVideoOverlay = mVideoOverlayBox.isChecked() ? 1 : 0;
//		mConfigEntity.mVideoRotateMode = mVideoRotateBox.isChecked() ? 1 : 0;
//		mConfigEntity.mFixColorDeviation = mFixColorDeviation.isChecked() ? 1 : 0;
//		mConfigEntity.mVideoShowGPURender = mVideoShowGPURender.isChecked() ? 1 : 0;
//		
//		mConfigEntity.mVideoAutoRotation = mVideoAutoRotation.isChecked() ? 1 : 0;
//		
//		mConfigEntity.mEnableP2P = mEnableP2PBox.isChecked() ? 1 : 0;
//		mConfigEntity.mUseARMv6Lib = mUseARMv6Box.isChecked() ? 1 : 0;
//		mConfigEntity.mEnableAEC = mUseAECBox.isChecked() ? 1 : 0;
//		mConfigEntity.mUseHWCodec = mUseHWCodecBox.isChecked() ? 1 : 0;
//		
//    	ConfigService.SaveConfig(this, mConfigEntity);
//    	
//    	this.setResult(RESULT_OK);
//    	this.finish();
//	}
//	
//	private Spinner InsertSpinnerInterface(int spinnerIndex, String[] context, int[] value, int select) {			
//		Spinner spinner = null;
//		if (spinnerIndex == 1){
//			spinner = (Spinner)this.findViewById(R.id.videoBitrateSpinner);
//		}else if (spinnerIndex == 2) {
//			spinner = (Spinner)this.findViewById(R.id.videoFPSSpinner);
//		}else if (spinnerIndex == 3) {
//			spinner = (Spinner)this.findViewById(R.id.videoQualitySpinner);
//		}else if (spinnerIndex == 4) {
//			spinner = (Spinner)this.findViewById(R.id.videoPresetSpinner);
//		}
//		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, context);
//		adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//		spinner.setAdapter(adapter);
//		spinner.setVisibility(View.VISIBLE);
//		
//		int offset = 0;
//		for (int i = 0; i < value.length; i++)
//		{
//			if (value[i] == select)
//			{
//				offset = i;
//				break;
//			}
//		}
//		
//		spinner.setSelection(offset);
//		
//		return spinner;
//	}
//	
//	private void destroyCurActivity() {
//		onPause();
//		onDestroy();
//		finish();
//	}
//
//	@Override
//	protected void onDestroy() {
//		// TODO Auto-generated method stub
//		super.onDestroy();
//	}
//
//	@Override
//	protected void onPause() {
//		// TODO Auto-generated method stub
//		super.onPause();
//	}
//}
