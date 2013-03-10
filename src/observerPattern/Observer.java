package observerPattern;

public abstract class Observer {
	String name;
	Subject subject;
	public Observer(String name,Subject subject) {
		this.name=name;
		this.subject=subject;
	}
	public abstract void update();
}
