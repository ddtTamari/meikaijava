package e_13_03;

import java.util.Scanner;

public class HumanPlayer extends AllPlayer {
	private int handShape;

	@Override
	public void displayHandShape() {
		if (this.handShape == 1) {
			System.out.println("あなたの出した手はグーです。");
		} else if (this.handShape == 2) {
			System.out.println("あなたの出した手はチョキです。");
		} else if (this.handShape == 3) {
			System.out.println("あなたの出した手はパーです。");
		}
	}

	public int getHandShape() {
		Scanner scan = new Scanner(System.in);
		System.out.println("あなたの出す手は(グー…1/チョキ…2/パー…3)");
		handShape = scan.nextInt();

		while (handShape != 1 && handShape != 2 && handShape != 3) {
			System.out.println("あなたの出す手は(グー…1/チョキ…2/パー…3)");
			handShape = scan.nextInt();
		}
		return handShape;
	}

}
