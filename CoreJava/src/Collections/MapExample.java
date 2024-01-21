package Collections;

import java.util.HashMap;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// In map order will not be maintained data can be extracted my key and value
		HashMap<String, Integer> map1 = new HashMap<String, Integer>();

		map1.put("item1", 100);
		map1.put("item2", 200);
		map1.put("item3", 300);
		map1.put("item4", 400);

		System.out.println(map1);

		map1.put("item3", 600);// update the value of already present key since no duplicate keys
		System.out.println(map1);

		// find the value of particular key
		System.out.println("the price of item4 is:" + map1.get("item4"));

		// remove element
		map1.remove("item2");
		System.out.println(map1);

		for (int value : map1.values()) {
			System.out.println("values of the map are: " + value);
		}

		for (String str : map1.keySet()) {
			System.out.println("key of the map are: " + str);
			System.out.println("value of the key is:" + map1.get(str));
		}

		// find out occurrance of each word in the sting using the hash map or we can
		// also do this using getorDefault(e) method
		String str1 = "clean world green world happy world green happy";

		String[] stringarray = str1.split(" ");
		HashMap<String, Integer> map2 = new HashMap<String, Integer>();
		int value;
		for (String str : stringarray) {
			if (map2.containsKey(str)) {
				value = map2.get(str) + 1;
				map2.put(str, value);
			} else {
				map2.put(str, 1);
			}
		}
		System.out.println(map2);
	}

}
