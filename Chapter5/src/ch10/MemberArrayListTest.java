package ch10;

public class MemberArrayListTest {

	public static void main(String[] args) {

		MemberArrayList memberArrayList = new MemberArrayList();
		
		Member seoyun = new Member(1001, "Seoyun");
		Member baeseong = new Member(1002, "Baeseong");
		Member huigyeong = new Member(1003, "Huigyeong");
		Member suin = new Member(1004, "Suin");
		Member myeongsik = new Member(1005, "Myeongsik");
		
		memberArrayList.addMember(seoyun);
		memberArrayList.addMember(baeseong);
		memberArrayList.addMember(huigyeong);
		memberArrayList.addMember(suin);
		memberArrayList.addMember(myeongsik);
		
		memberArrayList.showAllMember();
		memberArrayList.removeMember(suin.getMemberId());
		memberArrayList.showAllMember();
		
	}

}
