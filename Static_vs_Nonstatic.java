package Java_Basic;

public class Static_vs_Nonstatic {

	static int num = 50;
    int num2 = 60;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(num);
		Static_vs_Nonstatic obj  = new Static_vs_Nonstatic();
		System.out.println(obj.num2);
		obj.nonstatic();
	}
	
	public void nonstatic() {
		
		//ClassName objName = new ClassName();
		
	
		
		System.out.println(num);
		System.out.println(num2);
		
	}

	 static {
		 
		 System.out.println("Static run................");
	}

}
