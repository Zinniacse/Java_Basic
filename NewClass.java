package Java_Basic;

import Java_Basic.ParentInheritance;

public class NewClass extends ParentInheritance{

	public static void main(String[] args) {
		
//		add(10,20);
		
		String name1 = "JAVA";
		String name2 = "Java";
//				
//				if (name1.equals(name2)) {
//					System.out.println("Equal");
//		}
//				
//				else {
//					
//					System.out.println("Not Equal");
//				}
//
		
		if (name1.equalsIgnoreCase(name2)) {
			System.out.println("Equal");
}
		
		else {
			
			System.out.println("Not Equal");
		}


	}

}
