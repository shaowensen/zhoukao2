package com.bawei.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * @author 邵文森
 *
 * 2019年4月21日
 */
public class Test3 {

		//集合工具类
	public static boolean notEmpty(Collection<?> coll)  {
		return coll!=null&&!coll.isEmpty();
	}
	public static boolean notEmpty(Map<?,?>map) {
		return map!=null&&!map.isEmpty();
	}
	public static void main(String[] args) {
		List l =new ArrayList<>();
		boolean b = notEmpty(l);
		System.out.println(b);
	}
}
