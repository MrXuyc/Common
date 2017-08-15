package com.sunshine.common.util;
/**
 * 
 * @author MrXuyc
 *
 */
public class AssertUtil {
	/**
	 * 禁止实例化
	 */
	private AssertUtil(){};
	/**
	 * 判断对象是否为null，如果是String则判断还需要是否是"" | "   "
	 * @param obj
	 */
	public static boolean isNull(Object obj){
		if(obj!=null){
			if(obj instanceof String){
				if(("".equals(((String) obj).trim()))){
					//为""   "   "
					return true;
				}
			}
			return false;
		}else{
			return true;
		}
	}
	
}
