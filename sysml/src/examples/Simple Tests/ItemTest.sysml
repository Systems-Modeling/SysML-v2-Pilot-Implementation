package ItemTest {
	
	item f: A;

	public item def A {
		item b: B;
		protected ref part c: C;
	}
	
	abstract item def B {
		public abstract part a: A;
	}
	
	private part def C {
		private ref in y: A, B;
	}
	
	port def P {
		item in a1: A;
		item out a2: A;
	}
	
}