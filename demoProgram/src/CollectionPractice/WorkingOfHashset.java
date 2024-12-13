package CollectionPractice;

import java.util.HashSet;
import java.util.Iterator;

public class WorkingOfHashset {

	public static void main(String[] args) {
		// Creating HashSet and
        // adding elements
        HashSet<String> hs = new HashSet<String>();

        hs.add("manoj");
        hs.add("raja");
        hs.add("love");
        hs.add("Is");
        hs.add("Very helpful");

        // Traversing elements
        Iterator<String> itr = hs.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
	}

}
}
