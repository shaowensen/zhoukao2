package com.bawei.test;

/**
 * @author 邵文森
 *
 * 2019年4月20日
 */
public class StrTest {
	
	public static String hidden(String str,Integer index) {
		
		if(str==null) {
			return null;
		}
		char[] c = str.toCharArray();
		StringBuilder result=new StringBuilder();
		for(int i=0;i<c.length;i++) {
			result.append(i>=index?'*':c[i]);
		}
		return result.toString();
	}
	
	public static void main(String[] args) {
		System.out.println(hidden("八维教育机构",2));
	}
	
}
