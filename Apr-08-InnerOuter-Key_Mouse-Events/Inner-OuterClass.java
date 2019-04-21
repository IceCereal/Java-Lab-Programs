class Outer_Demo1{
	public void methodOuter(){
		System.out.println("I AM OUTSIDE");
	}

	class Inner{
		public void methodInner(){
			System.out.println("I AM INSIDE");
			//static int val;
		}
	}

	public static void main(String[] args) {
		Outer_Demo1 outerObj = new Outer_Demo1();
		
		outerObj.methodOuter();
	}
}

class Outer_Demo1_Driver{
	public static void main(String[] args) {
		Outer_Demo1 outerObj = new Outer_Demo1();
		Outer_Demo1.Inner innerObj = outerObj.new Inner();

		innerObj.methodInner();
		outerObj.methodOuter();
	}
}

class Outer_Demo2{
	static int flag = 0;
	
	static class Inner{
		int variableInner = 42;

		public void methodInner(){
			int flag = 2;
			
			System.out.println(Outer_Demo2.flag);
			System.out.println(variableInner);
			System.out.println(flag);
		}
	}

	public static void main(String[] args) {
		Outer_Demo2.Inner outerObj = new Outer_Demo2.Inner();

		outerObj.methodInner();
	}
}