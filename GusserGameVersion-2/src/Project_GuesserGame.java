import java.util.Scanner;
//This is my first basic project using Java(JSE). It is console based project.
// Enhancements made:

// 1--Made all data members private(encapsulation)
// 2--Created a constructor in Player class to get name of player as argument 
//    when Player object is created and to print the name when taking input
// 3--added methods both in player class to increment the score 
// 	  and also display them.
// 4--Added functionality to either continue the game or exit it
// 5--Added Draw method to be called if 2 players guessed correctly.

public class Project_GuesserGame {
	public static void main(String[] args) {

		while (true) {
			System.out.println("****Welcome to The Guesser Game****");
			System.out.println();
			Umpire u = new Umpire();
			u.collectNumFromGuesser();
			u.collectNumFromPlayers();
			u.play();

			System.out.println();

			u.scoreBoard();

			System.out.println("Do you want to continue the game(y/n)");
			Scanner scan = new Scanner(System.in);
			String s = scan.next();
			if (s.equals("y"))
				continue;
			else if (s.equals("n"))
				System.out.println("ThankYou for playing!!");
			break;
		}
	}
}

class Guesser {
	private int guessNum;

	int guessNum() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Guesser kindly guess the number");
		guessNum = scan.nextInt();
		return guessNum;
	}
}

class Player {
	private int guessNum;
	String name;
	private static int scoreP1;
	private static int scoreP2;
	private static int scoreP3;

	Player(String name) {
		this.name = name;
	}

	int guessNum() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Player " + name + " kindly guess the number");
		guessNum = scan.nextInt();
		return guessNum;
	}

	static void dispScore() {
		System.out.println("_______Score Board______");
		System.out.println("Player1" + ":" + scoreP1);
		System.out.println("Player2" + ":" + scoreP2);
		System.out.println("Player3" + ":" + scoreP3);
	}

	static void updateScoreP1() {
		scoreP1++;
	}

	static void updateScoreP2() {
		scoreP2++;
	}

	static void updateScoreP3() {
		scoreP3++;
	}
}

class Umpire {
	private int numFromGuesser;
	private int numFromPlayer1;
	private int numFromPlayer2;
	private int numFromPlayer3;
	private int drawNum1;
	private int drawNum2;

	Player p1 = new Player("p1");
	Player p2 = new Player("p2");
	Player p3 = new Player("p3");
	Guesser g = new Guesser();

	void collectNumFromGuesser() {
		numFromGuesser = g.guessNum();
	}

	void collectNumFromPlayers() {
		numFromPlayer1 = p1.guessNum();
		numFromPlayer2 = p2.guessNum();
		numFromPlayer3 = p3.guessNum();
	}

	void scoreBoard() {

		Player.dispScore();
	}

	void draw(Player draw1, Player draw2) {
		collectNumFromGuesser();
		drawNum1 = draw1.guessNum();
		drawNum2 = draw2.guessNum();
	}

	void play() {

		if (numFromGuesser == numFromPlayer1) {
			if (numFromGuesser == numFromPlayer2 && numFromGuesser == numFromPlayer3) {
				System.out.println("----------------");
				System.out.println("No one won!Draw between all Players.");
				System.out.println("----------------");
			}

			else if (numFromGuesser == numFromPlayer2) {
				System.out.println("----------------");
				System.out.println("Draw between Player 1 & Player2");
				System.out.println("----------------");
				while (true) {
					draw(p1, p2);
					if (drawNum1 == numFromGuesser && drawNum2 != numFromGuesser) {
						System.out.println("----------------");
						System.out.println("Player 1 won the game");
						System.out.println("----------------");
						Player.updateScoreP1();
						break;
					} else if (drawNum2 == numFromGuesser && drawNum1 != numFromGuesser) {
						System.out.println("----------------");
						System.out.println("Player 2 won the game");
						System.out.println("----------------");
						Player.updateScoreP2();
						break;
					} else {
						System.out.println("----------------");
						System.out.println("Nobody won!");
						System.out.println("----------------");
					}
				}
			} else if (numFromGuesser == numFromPlayer3) {
				System.out.println("----------------");
				System.out.println("Draw between Player 1 & Player3");
				System.out.println("----------------");
				while (true) {
					draw(p1, p3);
					if (drawNum1 == numFromGuesser && drawNum2 != numFromGuesser) {
						System.out.println("----------------");
						System.out.println("Player 1 won the game");
						System.out.println("----------------");
						Player.updateScoreP1();
						break;
					} else if (drawNum2 == numFromGuesser && drawNum1 != numFromGuesser) {
						System.out.println("----------------");
						System.out.println("Player 3 won the game");
						System.out.println("----------------");
						Player.updateScoreP3();
						break;
					} else {
						System.out.println("----------------");
						System.out.println("Nobody won!");
						System.out.println("----------------");
					}
				}
			} else {
				System.out.println("----------------");
				System.out.println("Player 1 won the game");
				System.out.println("----------------");
				Player.updateScoreP1();
			}
		} else if (numFromGuesser == numFromPlayer2) {
			if (numFromGuesser == numFromPlayer3) {
				System.out.println("----------------");
				System.out.println("Draw between Player 2 & Player3");
				System.out.println("----------------");
				while (true) {
					draw(p2, p3);
					if (drawNum1 == numFromGuesser && drawNum2 != numFromGuesser) {
						System.out.println("----------------");
						System.out.println("Player 2 won the game");
						System.out.println("----------------");
						Player.updateScoreP2();
						break;
					} else if (drawNum2 == numFromGuesser && drawNum1 != numFromGuesser) {
						System.out.println("----------------");
						System.out.println("Player 3 won the game");
						System.out.println("----------------");
						Player.updateScoreP3();
						break;
					} else {
						System.out.println("----------------");
						System.out.println("Nobody won!");
						System.out.println("----------------");
					}
				}
			} else {
				System.out.println("----------------");
				System.out.println("Player 2 won the game");
				System.out.println("----------------");
				Player.updateScoreP2();
			}
		} else if (numFromGuesser == numFromPlayer3) {
			System.out.println("----------------");
			System.out.println("Player 3 won the game");
			System.out.println("----------------");
			Player.updateScoreP3();
		} else {
			System.out.println("----------------");
			System.out.println("Nobody won!");
			System.out.println("----------------");
		}

	}

}
