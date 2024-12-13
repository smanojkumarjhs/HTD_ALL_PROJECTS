package CollectionPractice;

import java.util.LinkedHashMap;
import java.util.Set;

public class WorkingOfLinkedHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     LinkedHashMap<Integer, String> lhm = new LinkedHashMap<Integer,String>();
     lhm.put(1, "radha");
     lhm.put(2, "shyam");
     lhm.put(3, "narayan");
     Set s =lhm.entrySet();
     for(Object o : s) {
    	 System.out.println(o);
     }
     
	}

}
