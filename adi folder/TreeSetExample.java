import java.util.*;

class Employee{

	int id;
	String name;
	
	
	Employee(id , name)
	{
	this.id = id;
	this.name = name;
	}
}


public class TreeSetExample {

   public static void main(String args[]) {
     
      TreeSet treeSet = new TreeSet();
      
	  Employee employee = new Employee(1,'A');
	  Employee employee1 = new Employee(2,'B');
	  Employee employee2 = new Employee(3,'C');
	  
      treeSet.add(employee);
	  treeSet.add(employee1);
	  treeSet.add(employee2);
    
      System.out.println(treeSet);
   }
}