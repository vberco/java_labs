package lab_5;

public class J extends I {
	protected String j;

	public J(String a, String b, String c, String d, String e, String f, String g, String h, String i, String j, X x) {
		super(a, b, c, d, e, f, g, h, i, x);
		this.j = j;
	}

	@Override
	public String toString() {
		return "Class J inherits from I [j=" + j + ", i=" + i + ", h=" + h + ", g=" + g + ", f=" + f + ", e=" + e + ", d=" + d + ", c=" + c
				+ ", b=" + b + ", a=" + a + ", x=" + x + "]";
	}
}
