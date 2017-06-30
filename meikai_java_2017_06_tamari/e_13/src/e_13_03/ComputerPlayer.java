package e_13_03;

import java.util.Random;

public class ComputerPlayer extends AllPlayer {
	int handShape;

	public void displayHandShape() {
		if(this.handShape == 1){
			System.out.println("コンピューターの出した手はグーです。");
		}else if(this.handShape == 2){
			System.out.println("コンピューターの出した手はチョキです。");
		}else if(this.handShape == 3){
			System.out.println("コンピューターの出した手はパーです。");
		}
	}

	public int getHandShape() {
		Random rand = new Random();
		handShape = rand.nextInt(3) + 1;
		return handShape;
	}

}
