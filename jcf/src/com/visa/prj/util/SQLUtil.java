package com.visa.prj.util;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import com.visa.prj.annotations.Column;
import com.visa.prj.annotations.Table;

public class SQLUtil {
	
	public static String generateCreateSQL(Class<?> clazz) {
		StringBuilder builder = new StringBuilder();
		Table t = clazz.getAnnotation(Table.class);
		if(t!= null) {
			builder.append("Create Table");
			builder.append(" ");
			builder.append(t.name());
			builder.append("(");		
			Method[] methods = clazz.getDeclaredMethods();//Methods in class but not inherited
			for (Method m : methods) {
				if(m.getName().startsWith("get"))
				{
					Column c = m.getAnnotation(Column.class);
					if(c!=null) {
						builder.append(c.name());
						builder.append(" ");
						builder.append(c.type());
						builder.append(",");
					}
					
					
					
				}
			}
		}
		builder.setCharAt(builder.lastIndexOf(","), (')'));
		return builder.toString();
	}
	public static String generateInsertSQL(Object obj) {
		StringBuilder builder = new StringBuilder();
		Table t = obj.getClass().getAnnotation(Table.class);
		if(t!=null) {
			builder.append("INSERT INTO");
			builder.append(" ");
			builder.append(t.name());
			builder.append(" values(");	
			Map<String,String> mp= new HashMap<String,String>();
			Method[] methods = obj.getClass().getDeclaredMethods();//Methods in class but not inherited
			for (Method m : methods) {
				if(m.getName().startsWith("get"))
				{
					Column c = m.getAnnotation(Column.class);{
						if(c!=null) {
							try {
								mp.put(c.name(),m.invoke(obj).toString());
							} catch (IllegalAccessException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							} catch (IllegalArgumentException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							} catch (InvocationTargetException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
						}
					
				}
			}
			builder.append(mp.keySet().toString().replaceAll("[\\[\\],]", ""));
			builder.append(") values (");
			
			for(String key:mp.keySet())
			{
				builder.append(mp.get(key));
			}
			builder.append(")");
			
		}
		return builder.toString();
		}
}
