package observerPattern;

public interface Subject {
//	public String action = "";
	public void attach(Observer observer);
	public void detach(Observer observer);
	public void notifyObservers();
	public String getAction();
	public void setAction(String action);
}
