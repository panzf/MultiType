package com.yueus.bean;

import com.yueus.factory.TypeFactory;
import com.yueus.factory.TypeTable;

import java.util.List;

public class TestBean {
	public String code;
	public String message;
	public List<TypeTable> list;

	public static class OneTest implements TypeTable {
		public String os="第一种item类型  android";
		public String url;
		public String uid;
		public  String type="1";
		@Override
		public int type(TypeFactory typeFactory) {
			// TODO Auto-generated method stub
			return typeFactory.parseType(type);
		}

	}

	public static class TwoTest implements TypeTable {
		public String tws="第二种item类型 green robot";
		public String urls;
		public String nkname;
		public  String type="2";
		@Override
		public int type(TypeFactory typeFactory) {
			// TODO Auto-generated method stub
			return typeFactory.parseType(type);
		}

	}

	public static class NormalTest implements TypeTable {
		
		public String time;
		public String icon;
		public String introduction="第三种item类型  normal state";
		public  String type="999";
		@Override
		public int type(TypeFactory typeFactory) {
			return typeFactory.parseType(type);
		}

	}
}
