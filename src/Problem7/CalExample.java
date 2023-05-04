package Problem7;

public class CalExample {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		calculator.setCalculator(new Add());
		calculator.run();
		calculator.setCalculator(new Div());
		calculator.run();
		calculator.setCalculator(new Sub());
		calculator.run();
		calculator.setCalculator(new Mul());
		calculator.run();
	}	

}
