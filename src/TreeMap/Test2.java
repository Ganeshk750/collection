package TreeMap;

import java.util.TreeMap;

public class Test2 {

	public static void main(String[] args) {
		
     //Constructor approach for adding one collection object to another collection objects		
		 TreeMap<String,Integer> t = new TreeMap<String,Integer>();
		   t.put("ratan", 111);
		   t.put("ganesh", 105);
		   TreeMap<String,Integer> t1 = new TreeMap<String,Integer>(t);
		   t1.put("mukesh",117);
		   System.out.println(t1);//{ganesh=105, mukesh=117, ratan=111}
		   
		   //putAll() approach for adding more then one collection to another collection
		   TreeMap<String,Integer> t3= new TreeMap<String,Integer>();
		   t3.put("sontosh", 112);
		   t3.put("mohan", 108);
		   TreeMap<String,Integer> t4 = new TreeMap<String,Integer>();
		   t4.put("ratan1", 113);
		   t4.put("ganesh1", 155);
		   TreeMap<String,Integer> t5 = new TreeMap<String,Integer>();
		   t5.put("pintu", 90);
		   t5.putAll(t3);
		   t5.putAll(t4);
		   System.out.println(t5);//{ganesh1=155, mohan=108, pintu=90, ratan1=113, sontosh=112}
		   
	}

}
