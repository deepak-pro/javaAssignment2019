import java.util.* ;

public class HashTableDemo {
	public static void main(String[] args) {
		Hashtable<String,String> ht = new Hashtable<>();

		ht.put("firstname","Deepak");
		ht.put("lastname","JOSHI");
		ht.put("id","4598");
		ht.put("age","21");
	
		Set<String> keys = ht.keySet();
		for(String key : keys){
			System.out.println(key + " have value " + ht.get(key));
		}


		//System.out.println(ht);	
	}
}