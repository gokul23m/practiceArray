import java.util.*;
class Frequency{
       public static void main(String[] args){
              Scanner sc=new Scanner(System.in);
              System.out.println("Enter no of elements");
                 int n=sc.nextInt();
                 int a[]=new int[n];
                for(int i=0;i<n;i++){
                       a[i]=sc.nextInt();
                    }
                   

                for(int i=0;i<n;i++){
                     int freq=1;
                     for(int j=i+1;j<n;j++){
                           if(a[i]==a[j]){
                           freq++;
                              a[j]=0;
                           }
                     }
                      
                      if(freq>1 && a[i]!=0)
                      
                     System.out.println("Duplicates :"+a[i]);
               }
                
       }
}