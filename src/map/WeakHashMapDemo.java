package map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.WeakHashMap;

public class WeakHashMapDemo {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("-----hashMap-----");
		WeakClassDemo weakClassDemo1 = new WeakClassDemo();

		Map<WeakClassDemo, Integer> hashMap = new LinkedHashMap<>();
		hashMap.put(weakClassDemo1, 1);

		System.out.println("hashMap: " + hashMap);
		weakClassDemo1 = null;
		System.gc();
		Thread.sleep(5000);
		System.out.println("hashMap: " + hashMap);

		System.out.println("-----weakHashMap-----");
		
		WeakClassDemo weakClassDemo2 = new WeakClassDemo();

		Map<WeakClassDemo, Integer> weakHashMap = new WeakHashMap<>();
		weakHashMap.put(weakClassDemo2, 1);

		System.out.println("weakHashMap: " + weakHashMap);
		weakClassDemo2 = null;
		System.gc();
		Thread.sleep(5000);
		System.out.println("weakHashMap: " + weakHashMap);

	}
}
