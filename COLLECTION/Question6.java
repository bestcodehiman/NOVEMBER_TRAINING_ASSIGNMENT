package COLLECTION;

import java.util.HashMap;
import java.util.TreeMap;

public class Question6 {
	public static void main(String args[]) {
		HashMap<String, Integer> cityPopulationMap = new HashMap<String, Integer>() {
			{
				put("indore", 10000);
				put("pune", 20000);
				put("chennai", 50000);
				put("banglore", 80000);
				put("kochi", 5000);
				put("mumbai", 100000);
			}
		};
		System.out.println("Intial map key values : " + cityPopulationMap);
		TreeMap<String, Integer> sortedMap = new TreeMap<String, Integer>(cityPopulationMap);
		System.out.println("Sorted map by using keys : " + sortedMap);
	}
}
