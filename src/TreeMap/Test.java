package TreeMap;

import java.util.TreeMap;

public class Test {
   public static void main(String[] args) {
	
	   TreeMap<String,Integer> t = new TreeMap<String,Integer>();
	   t.put("ratan", 111);
	   t.put("ganesh", 105);
	   t.put("aditya", 102);
	   t.put("deepak", 106);
	   System.out.println(t);//{aditya=102, deepak=106, ganesh=105, ratan=111}
       
	   TreeMap<Integer, String> t1 = new TreeMap<Integer,String>();
	   t1.put(111,"ratan");
	   t1.put(105,"ganesh");
	   t1.put(102,"aditya");
	   t1.put(106,"deepak");
	   System.out.println(t1);//{102=aditya, 105=ganesh, 106=deepak, 111=ratan}
   }
}
