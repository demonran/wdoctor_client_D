package com.test.wdoctor.utils;

import android.graphics.Color;

/**
 * 
 * @author ������  qq��249782944
 * ��Ŀ��jinyaostarQQ
 * ʱ�䣺2009-8-5����09:11:59
 *
 */
public class FontAttrib {

	public static final int GENERAL = 0; // ����

	  public static final int BOLD = 1; // ����

	  public static final int ITALIC = 2; // б��

	  public static final int BOLD_ITALIC = 3; // ��б��

	  private String text = null, name = null; // Ҫ������ı�����������

	  private int style = 0, size = 0; // ��ʽ���ֺ�

	  private Color color = null, backColor = null; // ������ɫ�ͱ�����ɫ

	  /**
	   * һ���յĹ��죨�ɵ�������ʹ�ã�
	   */
	  public FontAttrib() {
		  
	  }



	  /* �����ע�;Ͳ�д�ˣ�һ�������� */

	  public String getText() {
	   return text;
	  }

	  public void setText(String text) {
	   this.text = text;
	  }

	  public Color getColor() {
	   return color;
	  }

	  public void setColor(Color color) {
	   this.color = color;
	  }

	  public Color getBackColor() {
	   return backColor;
	  }

	  public void setBackColor(Color backColor) {
	   this.backColor = backColor;
	  }

	  public String getName() {
	   return name;
	  }

	  public void setName(String name) {
	   this.name = name;
	  }

	  public int getSize() {
	   return size;
	  }

	  public void setSize(int size) {
	   this.size = size;
	  }

	  public int getStyle() {
	   return style;
	  }

	  public void setStyle(int style) {
	   this.style = style;
	  }
}
