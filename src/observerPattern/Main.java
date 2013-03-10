package observerPattern;

public class Main {
	public static void main(String[] args) {
//		Secretary secretary1 = new Secretary();
		Boss boss = new Boss();
		StockObserver observer1 = new StockObserver("zhangsan", boss);
		NBAObserver observer2 = new NBAObserver("lisi", boss);
		
		boss.attach(observer1);
		boss.attach(observer2);
		
		boss.detach(observer2);
		
		boss.setAction("我回来了");
		boss.notifyObservers();
	}
}
