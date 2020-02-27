// Sample KerML code
package Classes {
	
	feature f: A;

	public class A {
		feature b: B;
		protected port in c: C;
	}
	
	abstract class B {
		public abstract feature a: A;
		packaged abstract feature x: C;
		package P { }
	}
	
	private class C specializes B {
		private y: A, B[0..*];
		z is y;
	}
	
}