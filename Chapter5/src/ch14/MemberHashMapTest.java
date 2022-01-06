package ch14;

import java.util.HashMap;

public class MemberHashMapTest {

	public static void main(String[] args) {
		
		MemberHashMap memberHashMap = new MemberHashMap();
		
		Member myeongsik = new Member(1005, "Myeongsik");
		Member seoyun = new Member(1001, "Seoyun");
		Member baeseong = new Member(1002, "Baeseong");
		Member huigyeong = new Member(1003, "Huigyeong");
		
		memberHashMap.addMember(seoyun);
		memberHashMap.addMember(baeseong);
		memberHashMap.addMember(huigyeong);
		memberHashMap.addMember(myeongsik);
		
		memberHashMap.showAllMember();
		
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		hashMap.put(1005, "Myeongsik");
		hashMap.put(1001, "Seoyun");
		hashMap.put(1002, "Baeseong");
		hashMap.put(1003, "Huigyeong");
		
		System.out.println(hashMap);
		
	}

}
