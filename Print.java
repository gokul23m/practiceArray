import java.util.*;
class Print{
       public static void main(String[] args){
           Scanner sc=new Scanner(System.in);
              System.out.println("Enter no of elements");
             int n=sc.nextInt();
             int a[]=new int[n];

        //user input
             for(int i=0;i<n;i++){
                   a[i]=sc.nextInt();
             }

             //a={1,2,3,4,5};
             
          //printing
              for(int i=1;i<n;i+=2){
                       System.out.println(a[i]);
              }
       }
}