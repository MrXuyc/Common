package com.sunshine.common.single;
/**
 * 防止jvm的JIT重排序优化
 * @author MrXuyc
 *
 */
public class LHSingleObject {
	
	private static volatile LHSingleObject singleObject;
	
	private LHSingleObject(){
		
	}
	
	public static LHSingleObject getInstance(){
		if(singleObject==null){
			synchronized (LHSingleObject.class) {
				if(singleObject==null){
					singleObject=new LHSingleObject();
				}
			}
		}
		return singleObject;
	}
	
}
