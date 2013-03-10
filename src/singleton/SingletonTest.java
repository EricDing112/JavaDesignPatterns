package singleton;

class Singleton {
	private static Singleton sin = null;

	private Singleton() {
	}

	public static Singleton getInstance() {
		if (sin == null) {
			sin = new Singleton();
		}
		return sin;
	}
}

public class SingletonTest {
	public static void main(String[] args) {
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		System.out.println(s1==s2);
	}
}
