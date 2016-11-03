package com.slark.pengder.service.notice;

import java.io.StringWriter;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import freemarker.cache.StringTemplateLoader;
import freemarker.template.Configuration;
import freemarker.template.Template;

public class testFreemarker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		String temp = "${name}你好:${date},??${name}";
		StringTemplateLoader stringLoader = new StringTemplateLoader();
		stringLoader.putTemplate("1", temp);
		Configuration cfg = new Configuration();  
		cfg.setTemplateLoader(stringLoader);
		Template t = cfg.getTemplate("1");
		Map r = new HashMap();
		r.put("name", "xx");
		r.put("date", new Date().toLocaleString());
		StringWriter sw = new StringWriter();
		t.process(r, sw);
		System.out.println(sw);
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
