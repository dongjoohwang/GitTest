package day0516;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class RefelctionEx1 {

	public static void main(String[] args) throws Exception {
		
		Class clsName = Class.forName("day0516/Test10");
		Object obj = clsName.getDeclaredConstructor().newInstance();
		
		System.out.println(obj.getClass().getName());
		
		Method[] method = clsName.getDeclaredMethods();
		
		System.out.println(method);
		
		for(Method m : method)
			System.out.println(m);
		
		Field[] fiels = clsName.getDeclaredFields();
		for(Field f : fiels)
			System.out.println(f.getInt(obj));
	}

}

class Test10 {
	
	int num=10;
	int num2=20;
	int num3=30;
	
	void func1() {}
	void func2() {}
	void func3() {}
	
}















