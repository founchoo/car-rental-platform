package com.dart.carrentalplatform.util;

import java.lang.reflect.Field;

public class ClassUtil {

	public static String[] getFiledName(Object o) {
    	Field[] fields = o.getClass().getDeclaredFields();
       	String[] fieldNames = new String[fields.length];
    	for(int i = 0; i < fields.length; i++) {
    		System.out.println(fields[i].getType());
    		fieldNames[i] = fields[i].getName();
    	}
    	return fieldNames;
    }
}