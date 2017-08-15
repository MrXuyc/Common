package com.sunshine.common.util;

import java.lang.reflect.Field;
import java.util.List;

/**
 * 集合工具类
 * @author MrXuyc
 *
 */
public class CollectionsUtil {
	/**
	 * 工具类禁止常见对象
	 */
	private CollectionsUtil(){}
	
	public <T> T getMinFieldSObject(List<T> objects ,String minField) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException{
		if(AssertUtil.isNull(objects)){
			return null;
		}
		int minIndex=0;
		for (int i =0;i<objects.size();i++) {
			T obj=objects.get(i);
			T minObj=objects.get(minIndex);
			Field field = obj.getClass().getField(minField);
			Object object = field.get(obj);
			Object minObject=field.get(minObj);
			if(object instanceof String){
				if(((String) object).compareTo((String) minObject)==-1){
					minIndex=i;
				}
			}
			
		}
		return (T)new Object();
	}
	
	private <T> void swap(List<T> objects,int index,int minIndex){
		objects.remove(minIndex);
		objects.add(minIndex, objects.get(index));
		objects.remove(index);
		objects.add(index, objects.get(minIndex));
	}
}
