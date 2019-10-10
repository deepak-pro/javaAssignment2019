import java.util.*;

class Account{
	String id ;
	@Override
	public String toString(){
		return id + "@gmail.com";
	}
}

class Ankur {
	public static void main(String[] args) {
		HashSet<Account> a = new HashSet<Account>() ;
		Account a1 = new Account();
		a1.id = "AnkurBarve29" ;
		a.add(a1) ;
		System.out.println(a) ;
	}
}