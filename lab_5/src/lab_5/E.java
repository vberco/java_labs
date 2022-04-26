package lab_5;

public class E extends D {
	protected String e;

	public E(String a, String b, String c, String d, String e, X x) {
		super(a, b, c, d, x);
		this.e = e;
	}

	@Override
	public String toString() {
		return "Class E inherits from D [e=" + e + ", d=" + d + ", c=" + c + ", b=" + b + ", a=" + a + ", x=" + x +  "]";
	}
}
