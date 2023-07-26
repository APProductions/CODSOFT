package Tasks;

import java.util.Scanner;

public class task1 {

	public static void main(String[] args) {
				
		int max=100;
		int min=1;
		int score=0,totalscore=0;
							
		  Scanner sc=new Scanner(System.in);
		
		  System.out.println("\t\tNumber Game \n INSTRUCTIONS :\n 1:The Secrate Number is in between 1 to 100 \n 2:You will get 10 attempts to guess the number correctly. \n 3:Score will get counted based on the attempts taken to guess the right number.\n");
		
			for(int j=0;j<10;j++) 
			{
			int randnum= (int) (Math.random()*(max-min+1)+min);
			 System.out.println("Round Number "+(j+1));
				 for(int i=0;i<10;i++) 
				 {
					 System.out.println("Attempt Number :"+(i+1));
						System.out.print("Enter Number :");
							int num=sc.nextInt();
								if(num==randnum) 
								 {
								   score=10-(i+1);
								   System.out.println(" is Correct \n You Won the Game \n Score is :"+score);
								   totalscore +=score;
									break;
									}
									else if(num>randnum)
									 {
										System.out.println("To high\n");
										}
										 else if(num<randnum)
										 {
											System.out.println("To Low\n");
											}
											   }
											  System.out.println("\n Want to Play Again?(yes/no)");
											    int r=sc.nextInt();
												 if(r==0)
												 {
													 System.out.println(" \t\tGame Over\t\t ");
													break;
												 	}
											}
									}
							}
