package Factory.SimpleFactory;

public class Printer implements Output{
	int printNum = MAX_CAHCE_LINE;
	@Override
	public void out() {
		System.out.println(printNum);
	}

	@Override
	public void getData(int num) {
			printNum=num;
	}

}
