
public class day5 {
public static void main(String[] args) {

    //question 1
    int n=4;
    for(int i=n;i>=1;i--)
    {
        for(int j=0;j<i;j++)
        {
            System.out.print("*");

        }
        System.out.println("\n");
    }

    //question 2
    int sum=0;
    int n1=3;
    for(int i=0;i<n1;i++)
    {
        sum+=(2*i);
    }
    System.out.println("THe sum of first n1 even no. is "+sum);
    
    //question 3
    int n2=5;
    for(int i=1;i<=10;i++)
    {
        System.out.printf("%d * %d = %d\n",n2,i,n2*i);
    }

    //question 4
    int n3=10;
    for(int i=10;i>=1;i--)
    {
        System.out.printf("%d * %d = %d\n",n3,i,n3*i);
    }

    //question 5
    int n4=5;
    int j=1;
    int factorial=1;
    while(j<=n4)
    {
        factorial*=j;
        j++;

    }
    System.out.println("Factorial of 5 is "+factorial);

    //question 6,7,8 repeat
    
    //question 9
    int n5=8;
    int sum2=0;
    for(int i=1;i<=2;i++)
    {
        sum2+=n5*i;

    }
    System.out.println("The value of sum is "+sum2);

    //question 10 repeat
}
    
}