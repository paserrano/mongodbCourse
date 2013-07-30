package com.tengen;

import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

import freemarker.template.Configuration;
import freemarker.template.Template;

public class HelloFreeMarker {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration configuration = new Configuration();
		configuration.setClassForTemplateLoading(HelloFreeMarker.class, "/");
		
		try
		{
			Template helloTEmplate = configuration.getTemplate("hello.ftl");			
			StringWriter writer = new StringWriter();
			Map<String,Object> helloMap = new HashMap<String, Object>();
			helloMap.put("name","Freemarker");
			helloTEmplate.process(helloMap, writer);
			System.out.println(writer);		
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

}
