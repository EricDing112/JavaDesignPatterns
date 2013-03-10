package observerPattern;

import java.util.ArrayList;

public class Boss implements Subject{
	String action;
	ArrayList<Observer> observers = new ArrayList<Observer>();
	
	@Override
	public void attach(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void detach(Observer observer) {
		observers.remove(observer);
	}

	@Override
	public void notifyObservers() {
		for (Observer item : observers) {
			item.update();
		}
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}
}
