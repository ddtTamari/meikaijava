package e_13_03;

public class e_13_03 {

	public static void main(String[] args) {
		AllPlayer human = new HumanPlayer();
		AllPlayer computer = new ComputerPlayer();

		int winOrLose = human.getHandShape() - computer.getHandShape();

		if (winOrLose == -1 || winOrLose == 2) {
			human.displayHandShape();
			computer.displayHandShape();
			System.out.println();
			System.out.println("あなたの勝ちです！");
		} else if (winOrLose == -2 || winOrLose == 1) {
			human.displayHandShape();
			computer.displayHandShape();
			System.out.println("あなたの負けです…");
		} else {
			human.displayHandShape();
			computer.displayHandShape();
			System.out.println("引き分けです：");
		}

		while (winOrLose == 0) {
			winOrLose = human.getHandShape() - computer.getHandShape();
			if (winOrLose == -1 || winOrLose == 2) {
				human.displayHandShape();
				computer.displayHandShape();
				System.out.println("あなたの勝ちです！");
			} else if (winOrLose == -2 || winOrLose == 1) {
				human.displayHandShape();
				computer.displayHandShape();
				System.out.println("あなたの負けです…");
			} else {
				human.displayHandShape();
				computer.displayHandShape();
			}
		}

	}

}
