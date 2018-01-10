package cn.itcast.factory;

import java.util.HashMap;
import java.util.Map;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class BeanFactory {
	
	private static final Map<String,Object> map = new HashMap<String,Object>();
	static{
		SAXReader sax = new SAXReader();
		try {
			Document document = sax.read(BeanFactory.class.getClassLoader().getResourceAsStream("bean.xml"));
			Element root = document.getRootElement();
			String id = root.attributeValue("id");
			String clazz = root.attributeValue("class");
			Object obj = Class.forName(clazz).newInstance();
			map.put(id, obj);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static Object getBean(String id){
		return map.get(id);
	}
}
