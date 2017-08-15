package com.sunshine.common.single;
/**
 * 通过jvm初始化类方式，解决因为JIT重排序优化引起的 访问未实例化对象
 * @author MrXuyc
 *
 */
public class EHSingleObjectFactory {
	
	private static class SingleObjectHolder{
		private static SingleObject singleObj=new SingleObject();
	}
	
	public static SingleObject getInstanl(){
		return SingleObjectHolder.singleObj;
	}
}
