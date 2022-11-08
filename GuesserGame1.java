import java.util.*;

class Guesser

{
	int guessNum1;
	int guessNum2;
	
	
	int guessNum1()
	{	
	  System.out.println("Guesser Game");
	  System.out.println("");
	  System.out.println("TERMS & CONDITIONS");
	  System.out.println("For Round 1: Qualification players guess the number less than or equal to guesser number");
	  System.out.println("For Round 2: players exactly guess the guesser number");
	  System.out.println("");
	  
	  Scanner sc= new Scanner(System.in);
	  System.out.print("Guesser guess the number for first Round");
	  guessNum1 =sc.nextInt();
	   
	  if(guessNum1<=50)
	  {
		  System.out.println("OK proceed within the range");
	  }
	  else
	  {
		  System.out.println("No within the Range ");
		  System.out.println("Sorry,Please Try Again");
		  guessNum1();
	  }
	  return guessNum1;
	    
	
	    
	}
	int guessNum2()
	{	
	  
	  Scanner sc= new Scanner(System.in);
	  System.out.print("Guesser guess the number for Second Round");
	  guessNum2 =sc.nextInt();
	   
	  if(guessNum2<=50)
	  {
		  System.out.println("OK proceed within the range");
	  }
	  else
	  {
		  System.out.println("No within the Range ");
		  System.out.println("Sorry,Please Try Again");
		  guessNum2();
	  }
	  return guessNum2;
	    
	
	    
	}
}

class Player
{
	int guessNum1;
	int guessNum2;
	
	int guessNum1()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Players kindly guess the First number for Qualifying Round 1");
		guessNum1=scan.nextInt();
		return guessNum1;
	}
	int guessNum2()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Players kindly guess the Second number for Qualifying Round 2");
		guessNum2=scan.nextInt();
		return guessNum2;
	}
}

class Umpire
{
	int numFromGuesser1;
	int numFromGuesser2;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;
	
	void collectNumFromGuesser1()
	{
		Guesser g=new Guesser();
		numFromGuesser1=g.guessNum1();
	}
	void collectNumFromPlayers1()
	{
		Player p1=new Player();
		Player p2=new Player();
		Player p3=new Player();
		numFromPlayer1=p1.guessNum1();
		numFromPlayer2=p2.guessNum1();
		numFromPlayer3=p3.guessNum1();
	}
	void compareForRound1()
	{
		if(numFromGuesser1>=numFromPlayer1)
		{
			if(numFromGuesser1>=numFromPlayer2 && numFromGuesser1==numFromPlayer3 )
			{
				System.out.println("All players Qualified for Round 2");
			
				
			}
			else if(numFromGuesser1>=numFromPlayer2 )
			{
				System.out.println("Player 1 & Player2 Qualified for Round 2");
			}
			else if(numFromGuesser1>=numFromPlayer3)
			{
				System.out.println("Player 1 & Player3 Qualified for Round 2");
			}
			else
			{
			System.out.println("Player 1 Directly won the Game");
			
			}
				
		}
		
	
	
		else if(numFromGuesser1>=numFromPlayer2)
		{
			if(numFromGuesser1>=numFromPlayer3)
			{
				System.out.println("Player 2 & Player 3 Qualified for Round 2");
			}
			else
			{
			System.out.println("Player 2 Directly won the Game");
			
			}
		}
		else if(numFromGuesser1>=numFromPlayer3)
		{
			System.out.println("Player 3 Directly won the Game");
		}
		else
		{
			System.out.println("Game lost Try Again!");
			
		}
		
		
		
	}
	void collectNumFromGuesser2()
	{
		Guesser g=new Guesser();
		numFromGuesser2=g.guessNum2();
	}
	void collectNumFromPlayers2()
	{
		Player p1=new Player();
		Player p2=new Player();
		Player p3=new Player();
		numFromPlayer1=p1.guessNum2();
		numFromPlayer2=p2.guessNum2();
		numFromPlayer3=p3.guessNum2();
	}
	void compareForRound2()
	{
		if(numFromGuesser2==numFromPlayer1)
		{
			if(numFromGuesser2==numFromPlayer2 && numFromGuesser2==numFromPlayer3 )
			{
				System.out.println("All players won the Game");
			
				
			}
			else if(numFromGuesser2==numFromPlayer2 )
			{
				System.out.println("Player 1 & Player2 won the Game");
			}
			else if(numFromGuesser2==numFromPlayer3)
			{
				System.out.println("Player 1 & Player3 won the Game");
			}
			else
			{
			System.out.println("Player 1 won the Game");
			}
			
		}
	
	
		else if(numFromGuesser2==numFromPlayer2)
		{
			if(numFromGuesser2==numFromPlayer3)
			{
				System.out.println("Player 2 & Player 3 won the Game 2");
			}
			else
			{
			System.out.println("Player 2 won the Game");
			}
		}
		else if(numFromGuesser2==numFromPlayer3)
		{
			System.out.println("Player 3 won the Game");
		}
		else
		{
			System.out.println("Game lost Try Again!");

		}
		
		
	}
	
	
}
public class GuesserGame1 
{

	public static void main(String[]args)
	
	{
		Umpire obj1 = new Umpire();
		obj1.collectNumFromGuesser1();
		obj1.collectNumFromPlayers1();
		obj1.compareForRound1();
		
		Umpire obj2 = new Umpire();
		obj2.collectNumFromGuesser2();
		obj2.collectNumFromPlayers2();
		obj2.compareForRound2();
		
		

	}

}


