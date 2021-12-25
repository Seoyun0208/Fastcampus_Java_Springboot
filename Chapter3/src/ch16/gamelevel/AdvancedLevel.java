package ch16.gamelevel;

public class AdvancedLevel extends PlayerLevel{

	@Override
	public void run() {

		System.out.println("빠르게 달립니다.");
		
	}

	@Override
	public void jump() {

		System.out.println("높이 점프할 수 있습니다.");
	
	}

	@Override
	public void turn() {

		System.out.println("아직 돌지 못합니다.");
		
	}

	@Override
	public void showLevelMessage() {

		System.out.println("***** 중급자 레벨입니다. *****");
		
	}

}