package hashmap;

import java.security.KeyStore.Entry;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

public class  HashMap{
	
	public static void main(String[] args) {
		Employee e1 = new Employee("ram",1000);
        Employee e2 = new Employee("shyam",1002);
        Employee e3 = new Employee("sita",1003);
        
        Map<Employee,String> map = new java.util.HashMap<Employee,String>();
        
        map.put(e1, "employee1");
        System.out.println(map.get(e3));
        map.put(e2, "employee2");
        System.out.println(map.get(e3));
        map.put(e3, "employee3");
        System.out.println(map.get(e3));
        System.out.println(e1.hashCode());
        System.out.println(e1.equals(e2));
        System.out.println(map.size());
        
        Iterator<Map.Entry<Employee, String>> itr = map.entrySet().iterator();
        while(itr.hasNext()) {
        	Map.Entry<Employee, String> entry = itr.next(); 
        	System.out.println(entry.getKey()+ "=" + entry.getValue());
        	
        }
	}

}

 class Employee{
	String name;
	int id;
	
	public Employee(String name,int id) {
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
@Override
public String toString() {
	
	return name + " " + id;
}
}

 