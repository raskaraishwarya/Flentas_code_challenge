import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        for(int i=0;i<t;i++)
        {
            int n=s.nextInt();
            int a[]=new int[n];
            for(int l=0;l<n;l++)
            {
                a[l]=s.nextInt();
 
            }
            Arrays.sort(a);
            
            long sum=0;
 
            while(n>3){
                sum+=Math.min(2*a[1]+a[0]+a[n-1],2*a[0]+a[n-1]+a[n-2]);
                n-=2;
            }
            if(n==3)
                sum+=a[0]+a[1]+a[2];
            else if(n==2)
                sum+=a[1];
            else sum+=a[0];
            System.out.println(sum);
            
           
 
        }
        
    }
}