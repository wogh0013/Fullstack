package w1206ClassTest;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassTest {
	public static void main(String[] args) throws ClassNotFoundException {
		String s1 = new String("Hello");
		
		Class c1 = s1.getClass();
		System.out.println(c1.getName());
		
		Class c2 = String.class;
		System.out.println(c2.getName());
		
		Class c3 = Class.forName("java.lang.String");
		System.out.println(c3.getName());
		
		Field[] field = c3.getFields(); //자기 안에 있는 모든 변수들에 대한 정보를 다 줌.
		for(Field f : field) {
			System.out.println(f);
		}
		
		Method[] method = c3.getMethods();
		for(Method m : method) {
			System.out.println(m);
		}
		
	}
}
