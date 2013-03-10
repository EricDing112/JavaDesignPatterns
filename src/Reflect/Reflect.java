package Reflect;


interface IPerson{
	public void say();
}

class APerson implements IPerson{
	@Override
	public void say() {
		System.out.println("IM A");
	}
}

class BPerson implements IPerson{
	@Override
	public void say() {
		System.out.println("IM B");
	}
}

public class Reflect {
	public void switchPerson(String name){
		//纯反射
//		Class<?> person = null;
//			try {
//				person =Class.forName(name);
//			} catch (ClassNotFoundException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			try {
//				Method method = person.getMethod("say");
//				method.invoke(person.newInstance());
//			} catch (SecurityException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			} catch (NoSuchMethodException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			} catch (IllegalArgumentException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			} catch (IllegalAccessException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			} catch (InvocationTargetException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			} catch (InstantiationException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		//面向接口的反射
	IPerson person = null;
	try {
		person = (IPerson) Class.forName(name).newInstance();
	} catch (InstantiationException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IllegalAccessException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	person.say();
	}
	public static void main(String[] args) {
		Reflect reflect = new Reflect();
		reflect.switchPerson("Reflect.APerson");
	}
}
