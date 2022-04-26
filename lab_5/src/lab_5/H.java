package lab_5;

public class H extends G {
	protected String h;
	private X x = new X("X from class H");
	
	public H(String a, String b, String c, String d, String e, String f, String g, String h, X x) {
		super(a, b, c, d, e, f, g, x);
		this.h = h;
	}

	@Override
	public String toString() {
		return "Class H inherits from G [h=" + h + ", g=" + g + ", f=" + f + ", e=" + e + ", d=" + d + ", c=" + c + ", b=" + b + ", a=" + a
				+ ", x=" + x + "]";
	}	
}
