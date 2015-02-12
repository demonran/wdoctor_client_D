package com.test.wdoctor.utils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import android.net.Uri;
import android.util.Log;

public class HttpUtil {

	 /*
     * �������ϻ�ȡͼƬ�����ͼƬ�ڱ��ش��ڵĻ���ֱ���ã������������ȥ������������ͼƬ
     * �����path��ͼƬ�ĵ�ַ
     */
    public static File getImage(String path, File cache) throws Exception { 
    	String name = null ;
    	if (path!=null && path.contains("/")) {
    		name = path.substring(path.lastIndexOf("/"));  //+1
    		
    		File file = new File(cache, name);
            Log.d("wonderdemo","getImageURI="+ path + ", local_file=" + file.getAbsolutePath());
            // ���ͼƬ���ڱ��ػ���Ŀ¼����ȥ���������� 
            if (file.exists()) {
                return file;//Uri.fromFile(path)��������ܵõ��ļ���URI
            } else {
                // �������ϻ�ȡͼƬ
                URL url = new URL(path);
                HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                conn.setConnectTimeout(5000);
                conn.setRequestMethod("GET");
                conn.setDoInput(true);
                if (conn.getResponseCode() == 200) {

                    InputStream is = conn.getInputStream();
                    FileOutputStream fos = new FileOutputStream(file);
                    byte[] buffer = new byte[1024];
                    int len = 0;
                    while ((len = is.read(buffer)) != -1) {
                        fos.write(buffer, 0, len);
                    }
                    is.close();
                    fos.close();
                    return file;
                }
            }
    	}        
        return null;
    }
}
