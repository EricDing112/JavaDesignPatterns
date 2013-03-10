package Factory.SimpleFactory;

public class Computer {
	Output output;
	public Computer(Output output){
		this.output = output;
	}
	public void out() {
		output.getData(100);
		output.out();
	}
	public static void main(String[] args) {
		OutputFactory factory = new OutputFactory();
		Computer computer = new Computer(factory.getOutput());
		computer.out();
	}
}
