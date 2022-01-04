package ch12;

public class MemberHashSetTest {

	public static void main(String[] args) {

		MemberHashSet memberHashSet = new MemberHashSet();
		
		Member seoyun = new Member(1001, "Seoyun");
		Member baeseong = new Member(1002, "Baeseong");
		Member huigyeong = new Member(1003, "Huigyeong");
		
		memberHashSet.addMember(seoyun);
		memberHashSet.addMember(baeseong);
		memberHashSet.addMember(huigyeong);

		memberHashSet.showAllMember();
		
		Member myeongsik = new Member(1003, "Myeongsik");
		memberHashSet.addMember(myeongsik);
		
		memberHashSet.showAllMember();
		
	}

}
