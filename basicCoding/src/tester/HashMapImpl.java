package tester;

import java.util.HashMap;
import java.util.Map;

public class HashMapImpl {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Prateek");
		map.put(2, "Anuja");
		map.put(3, "Kabeer");
		map.put(3, "Kabeer");
		map.put(4, "Zyzz");
		map.put(4, "Zyzz");
		System.out.println("iterating HashMap.....");
//		for (Map.Entry m : map.entrySet()) {
//			System.out.println(m.getKey() + "  " + m.getValue());
//		}
		System.out.println(map);
		for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() + " , " + m.getValue());
		}
	}

}
