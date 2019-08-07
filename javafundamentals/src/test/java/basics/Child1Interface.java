package basics;

public class Child1Interface implements ParentInterface{

	public void method1() {
		System.out.println("method1 Implemented from Parent");
		
	}
	
	public void method2() {
		System.out.println("Own Method2");
		
	}
	
	public static void main(String[] args) {
		ParentInterface p=new Child1Interface();
		
		Child1Interface c=new Child1Interface();
		
		p.method1();
		c.method1();
		c.method2();
		
	}

}
