package com.test.wdoctor.componet;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.GridView;

import com.test.wdoctor.MainWeixin;
import com.test.wdoctor.R;
import com.test.wdoctor.ShakeActivity;
import com.test.wdoctor.adapter.MMListAdapter;
import com.test.wdoctor.model.Function;

public class DiscoveryTab{
	
	private View view;
	
	private GridView fucntionGrid;
	
	private Activity mainActivity;
	
	public DiscoveryTab(final Activity mainActivity) {
		this.mainActivity = mainActivity;
		
		LayoutInflater mLi = LayoutInflater.from(mainActivity);
		
		view = mLi.inflate(R.layout.main_tab_friends, null);
	        
        
        final List<Function> functions = new ArrayList<Function>();
        
        functions.add(new Function(Function.Type.PENGYOUQUAN,"����Ȧ"));
        functions.add(new Function(Function.Type.PENGYOUQUAN,"ɨһɨ"));
        functions.add(new Function(Function.Type.PENGYOUQUAN,"ҡһҡ"));
//        functions.add(new Function(3,"���Ż���"));
//        functions.add(new Function(4,"�����Ӻ�"));
//        functions.add(new Function(5,"����סԺ"));
//        functions.add(new Function(6,"���Ҷ�̬"));
//        functions.add(new Function(7,"ҽ������"));
        
        
	}
	
	public View getView()
	{
		return view;
	}
	
	public GridView getGucntionGrid()
	{
		return fucntionGrid;
	}
	
	public void btn_shake(View v) {                                   //�ֻ�ҡһҡ
		Intent intent = new Intent (mainActivity,ShakeActivity.class);			
		mainActivity.startActivity(intent);	
	}

}
