/*
  K4-8@		³Ì®lðÇÝñÅA»ÌðoÍ·é
  Kú		66ú
  »ìÒ		Êmü
 */
package e_04_08;
import java.util.Scanner;
public interface e_04_08 {

	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);

		//CÓÌúIÆð\·y
		int x;
		int y = 0;
		//1ÈãÌªüÍ³êéÜÅJèÔµ·«¼·
		do {
			System.out.print("®lF");
			x = stdIn.nextInt();
		}while(x <= 0);
		//xª0ÈºÉÈéÜÅ\ÅèA»ÌÔyðê¸Â«·±ÆÉæÁÄðßé
		while (x > 0){
			x /= 10;
			y++;
		}
		//ð\¦·é
		System.out.println("»ÌlÍ" + y + "Å·B");

	}

}
