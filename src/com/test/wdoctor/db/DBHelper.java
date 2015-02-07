package com.test.wdoctor.db;

import com.test.wdoctor.model.ChatMsg;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHelper extends SQLiteOpenHelper{
	
	 private final static String DB_NAME ="test.db";//���ݿ���
	 private final static int VERSION = 1;//�汾��

	 //Ϊ��ÿ�ι���ʱ���ô���dbName�Ͱ汾�ţ��Լ����¶���һ�����췽��
	 public DBHelper(Context cxt){
	  this(cxt, DB_NAME, null, VERSION);//��������Ĺ��췽��
	 }

	 //�汾���ʱ
	 public DBHelper(Context cxt,int version) {
	  this(cxt,DB_NAME,null,version);
	 }

	
	public DBHelper(Context context, String name, CursorFactory factory,
			int version) {
		super(context, name, factory, version);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		  String sql  = "update student ....";//�Լ���Update����
		  db.execSQL(sql);
	}
	

}
