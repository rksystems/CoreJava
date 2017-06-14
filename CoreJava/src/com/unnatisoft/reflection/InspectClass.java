package com.unnatisoft.reflection;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import com.unnatisoft.threads.Student;

public class InspectClass {

	public static void main(String[] args) {
		Class myClass = Student.class;
		String className = myClass.getName();
		String simpleClassName = myClass.getSimpleName();
		int modifiers = myClass.getModifiers();
		Package pack = myClass.getPackage();
		Class superclass = myClass.getSuperclass();
		Class[] interfaces = myClass.getInterfaces();
		Constructor<Student>[] constructors = myClass.getConstructors();
		Method[] method = myClass.getMethods();
		Field[] fields = myClass.getFields();
		Annotation[] annotations = myClass.getAnnotations();
		
		System.out.println(myClass);
		System.out.println(className);
		System.out.println(simpleClassName);
		System.out.println(modifiers);
		System.out.println(pack);
		System.out.println("superclass "+superclass);
		for(Class c: interfaces)
		System.out.println("interfaces "+c.getName());
		for(Constructor s: constructors)
		System.out.println("constructors "+s.getName());
		/*for(Method s: method)
		System.out.println("method "+s.getName());
		for(Field s: fields)*/
		/*System.out.println("fields "+s.getName());
		for(Annotation s: annotations)
		System.out.println("annotations "+s.toString());*/
	}

}
