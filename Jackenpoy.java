import java.util.Scanner;
class Jackenpoy{
	public static void main(String args[]){
		
		System.out.print("             ---------------------------------------------------------------");
		System.out.print("\n                                     WELCOME TO JACK EN POY");
		System.out.print("\n                          This Filipino game needs two player that \n                                  Enter thier ROCK,PAPER,SCCISOR");
		System.out.print("\n                                       Player can input");
		System.out.print("\n                                            0=Rock");
		System.out.print("\n                                            1=Scissor");
		System.out.print("\n                                            2=Paper");	
		System.out.print("\n             ---------------------------------------------------------------");
		int p1,p2;
		Scanner key=new Scanner(System.in);
		System.out.print("\n                                           Player 1:");
		p1=key.nextInt();
		System.out.print("\n                                           Player 2:");
		p2=key.nextInt();
		
		if(p1==p2)
		System.out.print("\n                                           It's a Draw!\n                                            Play Again");
		else if(p1==0&&p2==1)
		System.out.print("\n                                           Player 1 Wins!");
		else if(p1==2&&p2==0)
		System.out.print("\n                                           Player 1 Wins!");
		else if(p1==1&&p2==2)
		System.out.print("\n                                           Player 1 Wins!");
		else if(p1==1&&p2==0)
		System.out.print("\n                                           Player 2 Wins!");
		else if(p1==2&&p2==1)
		System.out.print("\n                                           Player 2 Wins!");
		else if(p1==0&&p2==2)
		System.out.print("\n                                           Player 2 Wins!");
		
		
	}
}	
	