package CollectionPractice;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class WorkingOfLinkedHashSet {

	public static void main(String[] args) {
		 LinkedHashSet<String> lhs   = new LinkedHashSet<String>();

     lhs.add("ram");
     lhs.add("sita");
     lhs.add("ravan");
     lhs.add("hanuman");
     lhs.add("laxman");

     // Traversing elements
     Iterator<String> itr = lhs.iterator();
     while (itr.hasNext()) {
         System.out.println(itr.next());

	}

}
}