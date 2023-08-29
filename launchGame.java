package guesser;
import java.util.Scanner;

 class Guesser{
	 int guesserNum;
	 
	 int guessNum() {
		 System.out.println("Guesser Guess the Number:");
		 Scanner scan = new Scanner(System.in);
		 guesserNum = scan.nextInt();
		 
		 return guesserNum;
	 }
	  
 }
 
  class Player{
	   int playerNum;
	   
	   int guessNum() {
		   System.out.println("Player Guess The Number: ");
		   Scanner scan = new Scanner(System.in);
		   playerNum = scan.nextInt();
		   return playerNum;
	   }
  }
  
  class Umpire{
	  int numFromPlayer1;
	  int numFromPlayer2;
	  int numFromPlayer3;
	  int numFromGuesser;
	  
	  void askGuesser() {
		  Guesser g = new Guesser();
		  numFromGuesser = g.guessNum();
	  }
	  
	  void askPlayers() {
		  Player p1 = new Player();
		  numFromPlayer1 = p1.guessNum();
		  
		  Player p2 = new Player();
		  numFromPlayer2 = p2.guessNum();
		  
		  Player p3 = new Player();
		  numFromPlayer3 = p3.guessNum();
		  
	  }
	  
	  void compare() {
		  
		   if(numFromPlayer1 == numFromGuesser && numFromPlayer2 == numFromGuesser && numFromPlayer3 == numFromGuesser) {
			  System.out.println("Player 1 and Player 2 and Player 3 Wins");
		  }
		   else if(numFromPlayer1 == numFromGuesser && numFromPlayer2 == numFromGuesser) {
				  System.out.println("Player 1 and Player 2 Wins");
		  }
		   else if(numFromPlayer1 == numFromGuesser && numFromPlayer3 == numFromGuesser) {
				  System.out.println("Player 1 and Player 3 Wins");
		  }
		   else if(numFromPlayer2 == numFromGuesser && numFromPlayer3 == numFromGuesser) {
				  System.out.println("Player 2 and Player 3 Wins");
		   }
		   
		  else if(numFromPlayer1 == numFromGuesser) {
			  System.out.println("Player 1 Wins");
		  }
		   
		  else if(numFromPlayer2 == numFromGuesser) {
			  System.out.println("Player 2 Wins");
		  }
		   
		  else if(numFromPlayer3 == numFromGuesser) {
			  System.out.println("Player 3 Wins");
		  }
		  
		  else {
			  System.out.println("Game LOST! ");
		  }
	  }
  }


public class launchGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Umpire u = new Umpire();
         u.askGuesser();
         u.askPlayers();
         u.compare();
	}

}
