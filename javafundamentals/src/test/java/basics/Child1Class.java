package basics;

public class Child1Class  extends ParentClass{
	
	@Override
	public void method1() {
		System.out.println("Extended from parent to child");
	}
	
	public void method2() {
		System.out.println("Child's own method");
	}
	
		
	public static void main(String[] args) {
		ParentClass g=new Child1Class();
		g.method1();

	}

}
