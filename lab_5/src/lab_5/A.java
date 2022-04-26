package lab_5;

public class A {
	protected String a;
	protected X x = new X("first X");
	
	public A() {}
	
	public A(String a, X x) {
		this.a = a;
		//this.x = new X("class X");
	}

	@Override
	public String toString() {
		return "A [a=" + a + ", x=" + x + "]";
	}	
}
