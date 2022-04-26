package lab_5;

public class D extends C {
	protected String d;
	protected X x = new X("X from class D");
	
	public D(String a, String b, String c, String d, X x) {
		super(a, b, c, x);
		this.d = d;
	}

	@Override
	public String toString() {
		return "Class D inherits from C [d=" + d + ", c=" + c + ", b=" + b + ", a=" + a + ", x=" + x + "]";
	}
}
