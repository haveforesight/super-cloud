package com.test;

import java.util.Arrays;
import java.util.List;

public class Demo1 {
	
	public static void main(String[] args) {
		List<?> names = Arrays.asList(new String[]{"yiifaa"});
		//  通配符声明的集合，获取的元素都是Object类型
		List<Object> allNames =Arrays.asList(new String[]{"yiifee"});
	//	allNames.addAll(names);
		//  只能以Object迭代元素
		for(Object name: names) {
		    System.out.println(name);
		}
	}

}
