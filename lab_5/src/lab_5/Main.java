package lab_5;

public class Main {

	public static void main(String[] args) {
		var x = new X("class X");
		var a = new A("class A", x);
		var b = new B("class A", "class B", x);
		var c = new C("class A", "class B", "class C", x);
		var d = new D("class A", "class B", "class C", "class D", x);
		var e = new E("class A", "class B", "class C", "class D", "class E", x);
		var f = new F("class A", "class B", "class C", "class D", "class E", "class F", x);
		var g = new G("class A", "class B", "class C", "class D", "class E", "class F", "class G", x);
		var h = new H("class A", "class B", "class C", "class D", "class E", "class F", "class G", "class H", x);
		var i = new I("class A", "class B", "class C", "class D", "class E", "class F", "class G", "class H", "class I", x);
		var j = new J("class A", "class B", "class C", "class D", "class E", "class F", "class G", "class H", "class I", "class J", x);
		
		System.out.println(a.toString());
		System.out.println(b.toString());
		System.out.println(c.toString());
		System.out.println(d.toString());
		System.out.println(e.toString());
		System.out.println(f.toString());
		System.out.println(g.toString());
		System.out.println(h.toString());
		System.out.println(i.toString());
		System.out.println(j.toString());
	}
}
