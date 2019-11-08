import java.lang.*;
import java.util.* ;
class Employee
{
	int id ;
	@Override
	public String toString()
	{
		return ""+ id ;
	}
}

public class HashSetWithGenerics 
{
	public static void main(String[] args) 
	{
		HashSet<Employee> hs = new HashSet<Employee>() ;
		Employee e1 = new Employee();
		e1.id = 45 ;
		hs.add(e1) ;
		System.out.println(hs) ;
	}
}
