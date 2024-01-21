import java.util.Scanner;
public class day4 {
    public static void main(String[] args) {
        //question 1
        // int a=10;
        // if(a=11)
        // System.out.println("i am 11");
        // else
        // System.out.println("i am not 11");

        //gave error

        //question 2
        byte m1,m2,m3;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your marks in physics");
        m1=sc.nextByte();

        System.out.println("Enter your marks in chemistry");
        m2=sc.nextByte();

        System.out.println("Enter your marks in maths");
        m3=sc.nextByte();

        float avg=(m1+m2+m3)/3.0f;
        if(avg>=40 && m1>=33 && m2>=33 && m3>=33)
        {
            System.out.println("Congratutions, You have been promoted");
    
        }
        else {
            System.out.println("Sorry, You have not been promoted! please try again");
        }

        //question 3
        float tax=0;
        System.out.println(" Enter your income ");
        float income=sc.nextFloat();
        if(income<2.5)
        {
            tax=tax+0;
        }
        else if(income>2.5f && income<5f)
        {
            tax=tax + 0.05f* (income - 2.5f);
        }

        else if(income>5f && income<10f)
        {
            tax=tax + 0.05f* (5.0f - 2.5f);
            tax=tax + 0.2f* (income - 5f);

        }

        else if(income>10f)
        {
            tax=tax + 0.05f* (10.0f - 5f);
            tax=tax + 0.05f* (5.0f - 2.5f);
            tax=tax + 0.3f* (income - 10f);

        }
        System.out.println("Total tax paid is "+ tax);

        //question 4
        System.out.println("Enter your day no.");
        Scanner sc1=new Scanner(System.in);
        int day=sc1.nextInt();
    
        switch (day) {
            case 1-> System.out.println("Monday");
            case 2-> System.out.println("Tuesday");
            case 3-> System.out.println("Wednesday");
            case 4-> System.out.println("Thursday");
            case 5-> System.out.println("Friay");
            case 6-> System.out.println("Saturday");
            case 7-> System.out.println("Sunday");
              
        }

        //question 5
        System.out.println("Enter the year.");
        Scanner sc2=new Scanner(System.in);
        int year=sc2.nextInt();
        if(year%400==0 )
        System.out.println("leap year");

        else if(year%100==0 )
        System.out.println(" not a leap year");

        else if(year%4==0 )
        System.out.println("leap year");

        else
        System.out.println(" not a leap year");

        //question6
        System.out.println("Enter the website name ");
        Scanner sc3= new Scanner(System.in);
        String website=sc3.next();

        if(website.endsWith(".org"))
        System.out.println("This is an organisational website");
        
        else if(website.endsWith(".com"))
        System.out.println("This is a commercial website");
        
        else if(website.endsWith(".in"))
        System.out.println("This is an Indian website");



        
    }

    
}