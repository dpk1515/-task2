
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author USER
 */
public class StickSize {
     public static void main(String args[])
    {
        int a[]= new int[10];
        int b[]=new int[10];
        int c[]=new int[10];
        int i,n,j,m,x,count=0,y;
        StickSize st=new StickSize();
       Scanner s=new Scanner(System.in);
       System.out.println("Enter the no of elements in the  first array");
       m=s.nextInt();
       System.out.println("Enter the elements of first array");
        
        for(i=0;i<m;i++)
        {
            a[i]=s.nextInt();
            
        } 
       System.out.println("Enter the no of elements in the  second  array");
       n=s.nextInt();
        
       System.out.println("Enter the elements of second array");
        
        for(i=0;i<n;i++)
        {
            b[i]=s.nextInt();
            
        }
       
        //x=b[0];
        //System.out.println(+x);
       for(i=0;i<n;i++)
       {
           x=b[i];
           for(j=0;j<m;j++)
           {
               if(x>a[j])
               {
                   count++;
              
               }   
           }
            System.out.println("result is"+" " +x+" "+count);
            count = 0;
       }
        
        
    }
}
