package com.bawei.test;

/**
 * @author 邵文森
 *
 * 2019年4月21日
 */
//要求:封装一个工具类,传入一个参数,要求校验该参数是否为数字型,如果是则返回true,否则返回false

public class Test2 {
	public static boolean isNumber(String str) {
		if(str==null&&str.trim().length()==0) {
			return false;
		}
		byte[] bs = str.getBytes();
		for(int i=0;i<str.length();i++) {
			if((bs[i]==45)&&(i==0)) {
				continue;
			}
			if((bs[i]<48)||bs[i]>57) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		
		System.out.println(isNumber("acd"));
	}
	
}
