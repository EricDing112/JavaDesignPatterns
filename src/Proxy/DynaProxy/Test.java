package Proxy.DynaProxy;

public class Test {
	public static void main(String[] args) {
		Dog target = new GunDog();
		Dog dog = (Dog) MyProxyFactory.getProxy(target);
//		Dog dog = (Dog) JDKProxy.getPoxyObject(target);
		dog.info();
		dog.run();
	}
}
