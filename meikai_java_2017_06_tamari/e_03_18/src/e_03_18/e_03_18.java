/*
  ‰‰K3|18@	0C1C2‚Ì‚¢‚¸‚ê‚©‚Ì’l‚Ì—”‚ğ¶¬A‚»‚Ì’l‚É‚æ‚Á‚ÄƒO[ƒ`ƒ‡ƒLƒp[‚¢‚¸‚ê‚©‚ğ•\¦‚³‚¹‚é
  ‰‰K“ú		6Œ6“ú
  »ìÒ		‹Ê—˜m”ü
 */
package e_03_18;
import java.util.Scanner;
public interface e_03_18 {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);

		System.out.print("ŒF"); int month = stdIn.nextInt();

		switch(month){
			case 1 :	System.out.println("“~"); break;
			case 2 :	System.out.println("“~"); break;
			case 3 :	System.out.println("t"); break;
			case 4 :	System.out.println("t"); break;
			case 5 :	System.out.println("t"); break;
			case 6 :	System.out.println("‰Ä"); break;
			case 7 :	System.out.println("‰Ä"); break;
			case 8 :	System.out.println("‰Ä"); break;
			case 9 :	System.out.println("H"); break;
			case 10 :	System.out.println("H"); break;
			case 11:	System.out.println("H"); break;
			case 12 :	System.out.println("“~"); break;
			default :  System.out.println("1`12‚ÌŠÔ‚Ì”‚ğ“ü‚ê‚Ä‚­‚¾‚³‚¢B"); break;
		}
	}
}
