import java.util.Random;
import java.util.Scanner;
public class rockpaper {
    public static void main(String[] args) {
        System.out.println("Enter your choice in uppercase");
        Scanner sc=new Scanner(System.in);
        String u=sc.next();
        
        int userinput;
        if(u=="ROCK")
        userinput=0;
        else if(u=="PAPER")
        userinput=1;
        else
        userinput=2;

        Random r=new Random();
        int computerinput=r.nextInt(2);

        if(computerinput==1)
        System.out.println("computer choose ROCK");

        else if(computerinput==2)
        System.out.println("computer choose PAPER");
        
        else
        System.out.println("computer choose SESSIOR");

        if(computerinput==userinput)
        System.out.println("tie");

        else if(computerinput==0 && userinput==1 || computerinput==1 && userinput==2 )
        System.out.println("You win");
        else
        System.out.println("Computer wins");
    }
    
}
