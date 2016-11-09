import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
public class XandOs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner read = new Scanner(System.in);
		String [][] board = {{" ", " ", " "}, {" ", " ", " "}, {" ", " ", " "}};
		
		int userPos;
		
		System.out.println("Enter the position on the board to place an X (enter 1 to 9)");
		
		userPos = read.nextInt();		
		
		if (userPos >= 1 && userPos <= 3) {
			
			board[0][userPos-1] = "X";
			
		}
		
		else if (userPos >= 4 && userPos <=6) {
			
			board[1][userPos-4] = "X";
			
		}
		
		else {
			
			board[2][userPos-7] = "X";
			
		}
		
		System.out.println();
		
		for (int i = 0; i < 3; i++) {
			
			
			for (int j = 0; j < 3; j++) {
				
				
				System.out.print(board[i][j] + " | ");
				
				
			}
			System.out.println();
			System.out.println("-----------");

			
		}
	}
	
	public static void aiRecurse (String [][] currentBoard) {
		
		
		
	}

}
