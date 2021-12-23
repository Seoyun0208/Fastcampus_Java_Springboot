package ch16.gamelevel;

public class BeginnerLevel extends PlayerLevel{

	@Override
	public void run() {

		System.out.println("아주 천천히 달립니다.");
		
	}

	@Override
	public void jump() {

		System.out.println("아직 점프를 할 수 없습니다.");
	
	}

	@Override
	public void turn() {

		System.out.println("아직 돌지 못합니다.");
		
	}

	@Override
	public void showLevelMessage() {

		System.out.println("***** 초급자 레벨입니다. *****");
		
	}

}
