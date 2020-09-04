// Sample KerML code
package Classes {
	
	feature f: A;

	public class id '1' A {
		feature b: B;
		protected in port c: C;
	}
	
	abstract class id '2' B {
		public abstract feature a: A;
		packaged abstract feature x: C;
		package P { }
	}
	
	private class C specializes B {
		private y: A, B[0..*];
		z is y;
	}
	
}