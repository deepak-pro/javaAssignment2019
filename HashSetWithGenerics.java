import java.util.* ;
class Employee{
	int id ;
	@Override
	public String toString(){
		return ""+ id ;
	}
}

public class HashSetWithGenerics {
	public static void main(String[] args) {
		HashSet<Employee> a = new HashSet<Employee>() ;
		Employee e1 = new Employee();
		e1.id = 45 ;
		a.add(e1) ;
		System.out.println(a) ;
	}
}
