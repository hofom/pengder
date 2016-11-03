package com.slark.pengder.notice;

import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

import freemarker.cache.StringTemplateLoader;
import freemarker.template.Configuration;
import freemarker.template.Template;

public class  NoticeContext {
	private String title = null;
	private String template = null;
	private Map rootMap = null;
	
	public NoticeContext(String title,String template) {
		this.title = title;
		this.template = template;
	}
	
	public Map getRootMap(){
		if(this.rootMap == null)
			this.rootMap = new HashMap();
		return this.rootMap;
	}
	
	public NoticeContext setRootMap(Map rootMap){
		this.rootMap = rootMap; 
		return this;
	}
	
	public NoticeContext putMap(Object key,Object value){
		if(this.rootMap == null)
			this.rootMap = new HashMap();
		this.rootMap.put(key, value);
		return this;
	}
	
	public String getTitle(){
		return this.title;
	}
	
	public String getContext() {
		try {
			if(template != null && rootMap != null){
				StringTemplateLoader stringLoader = new StringTemplateLoader();
				stringLoader.putTemplate("1", template);
				Configuration cfg = new Configuration();
				cfg.setTemplateLoader(stringLoader);
				Template t = cfg.getTemplate("1");
				StringWriter out = new StringWriter();
				t.process(rootMap, out);
				return out.toString();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return template;
	}

}
