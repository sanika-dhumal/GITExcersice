import java.util.*;

 public class MergeArrayUsingVector
 {
    public static void main(String[] args) 
	{
        Scanner obj = new Scanner(System.in);
       
        int a[] = new int[3];
        int b[] = new int[3];
        int c[]=new int[a.length+b.length];

        int m,i,j,t=0;

        System.out.print("Enter first array: ");
        for(i=0; i<a.length;i++)
         {
        a[i]=obj.nextInt();
        }
        System.out.print("Enter the second array: ");
        for(i=0; i<b.length; i++)
         {
        b[i]=obj.nextInt();
         }
        for(j=0; j<b.length; j++,t++)
         {
        a[t]=b[j];
         }
         System.out.println("after merging array");
         for(i=0; i<c.length;i++)
         {
         System.out.println(c[i]);
         }
         for(i=0; i<c.length; i++)
          {
         for(j=i+1; j<c.length; j++)
          {
        if(c[i]<c[j])
          {
        int temp=c[i];
               c[i]=c[j];
                c[j]=temp;
              }
          }
     }

        System.out.println("after sorting array");
           for(i=0; i<c.length; i++)
         System.out.println(c[i]);
                                
                          }
                  }