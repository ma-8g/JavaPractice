
public class OperationWithArgs {

	public static void main(String[] args) {
		double x = 4;
		double y = 2;

		for (EnumOperation op : EnumOperation.values()) {
			System.out.printf("%d: %s (%s) %f %s %f = %f%n", op.getNumber(), op, op.getName(), x, op, y,
					op.calculate(x, y));
		}
	}

	enum EnumOperation {
		ADD(1, "足し算") {
			@Override
			public double calculate(double x, double y) {
				return x + y;
			}
		},
		SUBTRACT(2, "引き算") {
			@Override
			public double calculate(double x, double y) {
				return x - y;
			}
		},
		MULTIPLY(3, "掛け算") {
			@Override
			public double calculate(double x, double y) {
				return x * y;
			}
		},
		DIVIDE(4, "割り算") {
			@Override
			public double calculate(double x, double y) {
				return x / y;
			}
		};

		private final int number;
		private final String name;

		EnumOperation(int number, String name) {
			this.number = number;
			this.name = name;
		}

		public int getNumber() {
			return number;
		}

		public String getName() {
			return name;
		}

		public abstract double calculate(double x, double y);
	}
}
