package Java_Basic;

import java.util.ArrayList;

public class ArrayListExample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ArrayList<String> names = new ArrayList<String>();
       names.add("Name1");
       names.add("Name2");
       names.add("Name3");
       
        System.out.println(names.size());
        
//       names.remove(1);
//       System.out.println(names);
//       System.out.println(names.get(2));
       
       for (int i =0; i<names.size(); i++)
       System.out.println(names.get(i));

	}

}
