package lab_5;

public class G extends F {
	protected String g;
	
	public G(String a, String b, String c, String d, String e, String f, String g, X x) {
		super(a, b, c, d, e, f, x);
		this.g = g;
	}

	@Override
	public String toString() {
		return "Class G inherits from F [g=" + g + ", f=" + f + ", e=" + e + ", d=" + d + ", c=" + c + ", b=" + b + ", a=" + a + ", x=" + x + "]";
	}
}
