package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapTest1 {

	public static void main(String[] args) {

// <key의 타입, value의 타입> 형태로 타입 기재
		HashMap<String, Integer> mart = new HashMap<String, Integer>();
		HashMap<String, Integer> mart2 = new HashMap<>();

// 추가
		mart.put("새우깡", 1500);
		mart.put("양파링", 30000);
		mart.put("감자깡", 1500);
		mart.put("스윙칩", 1500);
		// HashMap은 중복된 키가 들어올 경우 값을 바꿈.
		// HashSet은 중복된 값이 들어올 경우 값 자체를 입력하지 않음.
		// 단, equals의 판단 기준에 따라서 없는 값인데도 set에 있다고 판단할 수는 있음.
		mart.put("스윙칩", 1000);
		System.out.println(mart);

// 삭제
		// 새우깡이란 key를 삭제
		mart.remove("새우깡");
		System.out.println(mart);

// 길이
		System.out.println("size: " + mart.size());

// 포함 여부
		// containsKey() : key 포함 여주
		// containsValue() : 값 포함 여부
		System.out.println(mart.containsKey("새우깡"));
		System.out.println(mart.containsValue(1500));
		System.out.println();

// 조회
		// key를 통해 찾아 value를 출력
		System.out.println("양파링 키: " + mart.get("양파링"));

		// 하나씩 조회
		// 키만 뽑을 경우 keySet() -> iterator()
		System.out.println(mart.keySet());
		Iterator<String> iter = mart.keySet().iterator();
		while (iter.hasNext()) {
			System.out.print(iter.next() + " ");
		}
		System.out.print("\n\n");

		// 값만 뽑을 경우 values() -> iterator()
		System.out.println(mart.values());
		Iterator<Integer> iter1 = mart.values().iterator();
		while (iter1.hasNext()) {
			System.out.print(iter1.next() + " ");
		}
		System.out.print("\n\n");

		// 한 쌍으로 뽑을 경우
		// entrySet()을 활용
		System.out.println(mart.entrySet());
		Set<Entry<String, Integer>> items = mart.entrySet();
		for (Entry<String, Integer> entry : items) {
			System.out.print(entry + " ");
		}

	}

}
