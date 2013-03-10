package observerPattern;


public class NBAObserver extends Observer{
	public NBAObserver(String name,Subject subject) {
		super(name, subject);
	}
	
	@Override
	public void update() {
		System.out.println(subject.getAction()+"! "+name+" 关闭NBA直播，继续工作！");
	}
}
