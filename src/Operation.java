
public class Operation {

	public static void main(String[] args) {
		double x = 4;
		double y = 2;

		for (EnumOperation op : EnumOperation.values()) {
			System.out.printf("%f %s %f = %f%n", x, op, y, op.calculate(x, y));
		}
	}

	enum EnumOperation {
		ADD {
			@Override
			public double calculate(double x, double y) {
				return x + y;
			}
		},
		SUBTRACT {
			@Override
			public double calculate(double x, double y) {
				return x - y;
			}
		},
		MULTIPLY {
			@Override
			public double calculate(double x, double y) {
				return x * y;
			}
		},
		DIVIDE {
			@Override
			public double calculate(double x, double y) {
				return x / y;
			}
		};

		public abstract double calculate(double x, double y);
	}
}
