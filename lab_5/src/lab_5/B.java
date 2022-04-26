package lab_5;

public class B extends A {
	protected String b;
	
	public B(String a, String b, X x) {
		super(a, x);
		this.b = b;
	}

	@Override
	public String toString() {
		return "Class B inherits from A [b=" + b + ", a=" + a + ", x=" + x + "]";
	}

	
}
