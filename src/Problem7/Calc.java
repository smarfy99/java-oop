package Problem7;

public abstract class Calc {
	protected int a, b;
	void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	abstract int calculate();
}

class Add extends Calc {
	@Override
	public int calculate() {
		return a + b;
	}
}

class Sub extends Calc {
	@Override
	public int calculate() {
		return a - b;
	}
}

class Mul extends Calc {
	@Override
	public int calculate() {
		return a * b;
	}
}

class Div extends Calc {
	@Override
	public int calculate() {
		if (b != 0) {
			return a / b;
		} else {
			throw new ArithmeticException("Cannot divide by zero");
		}
	}
}
