import java.util.Scanner;

public class fibonacci
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int firstdigit = 1, seconddigit = 1;
	    System.out.print("Enter Digit:");
	    int amount = in.nextInt();
	    System.out.println(firstdigit);
        System.out.println(seconddigit);
	    for(int i = 2; i < amount; i++)
	    {
		    int answer = firstdigit + seconddigit;
		    firstdigit = seconddigit;
		    seconddigit = answer;
		    System.out.println(answer);
	    }
    }
}
