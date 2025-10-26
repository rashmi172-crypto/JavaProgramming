package NumberGame;
import java.util.Scanner;

public class NumberGame {
	public static void gussingNumberGame() {
		Scanner sc = new Scanner(System.in);
		int number = 1+(int)(100*Math.random());
		int k = 5;
		System.out.println("A number choose between 1 to 100");
		System.out.println("you have" + k + "attemps to correct the guess number" );
		for(int i=0;i<k;i++) {
			System.out.println("enter your guess number: ");
			int guess = sc.nextInt();
			if(guess==number) {
				System.out.println("Congrats!! you guess the correct number");
				sc.close();
				return;
			}
			else if(guess<number) {
				System.out.println("the number is greater than " + guess);
			}
			else {
				System.out.println("the number is smaller than " + guess);
			}
		}
		System.out.println("you have exhausted all attemps. the correct number was " + number);
		sc.close();
	}
public static void main(String[] args) {
	gussingNumberGame();
}
}
