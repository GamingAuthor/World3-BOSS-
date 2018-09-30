import java.util.HashMap;

public class HashMapCalculator {

	public Object commonKeyValuePairs(HashMap<String, String> hashmap1, HashMap<String, String> hashmap2) {
		int map = 0;
		for (String a : hashmap1.keySet()) {
			for (String b : hashmap2.keySet()) {
				if (a.equals(b) && hashmap1.get(a).equals(hashmap2.get(b))) {
					map++;
				}
			}
		}
		return map;
	}

}
