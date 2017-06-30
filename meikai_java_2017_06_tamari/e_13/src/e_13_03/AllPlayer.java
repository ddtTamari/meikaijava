package e_13_03;

public abstract class AllPlayer {

	public abstract int getHandShape();

	public abstract void displayHandShape();
	
	

	public void putHand() {
		displayHandShape();
		getHandShape();
	}
}
