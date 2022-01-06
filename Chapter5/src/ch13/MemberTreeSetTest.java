package ch13;

import java.util.TreeSet;

public class MemberTreeSetTest {

	public static void main(String[] args) {

		/*
		TreeSet<String> set = new TreeSet<String>();
		
		set.add("Seoyun");
		set.add("Baeseong");
		set.add("Huigyeong");
		
		System.out.println(set);
		*/
		
		MemberTreeSet memberTreeSet = new MemberTreeSet();
		
		Member myeongsik = new Member(1005, "Myeongsik");
		Member seoyun = new Member(1001, "Seoyun");
		Member baeseong = new Member(1002, "Baeseong");
		Member huigyeong = new Member(1003, "Huigyeong");
		
		memberTreeSet.addMember(seoyun);
		memberTreeSet.addMember(baeseong);
		memberTreeSet.addMember(huigyeong);
		memberTreeSet.addMember(myeongsik);
		
		memberTreeSet.showAllMember();
		
	}

}
