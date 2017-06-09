import java.io.*;
import java.util.Scanner;
public class Armstrong {
    public static void main(String args[])
    {
        int n,sum=0;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        
                while(n>0)
                {int m=n%10;
                n=n/10;
                sum=sum+m*m;
                
       }
                if(sum==n)
                {System.out.println("armstrong");
                }else
                {System.out.println("no");
                }
    }
    
}
