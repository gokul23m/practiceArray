import java.util.*;
class LeftRotate{
       public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of times to rotate");
         int n=sc.nextInt();
          System.out.println("Enter size");
        int size=sc.nextInt();
        int a[]=new int [size];

        //input
        for(int i=0;i<size;i++){
            a[i]=sc.nextInt();
        }
           // rotate 

             for(int i=0;i<n;i++){

                   int first=a[0];
            for(int j=0;j<size-1;j++){
                    a[j]=a[j+1];
            }
            a[size-1]=first;

             }

      //print
        for(int x:a){
            System.out.print(x+",");
        }
                
       }
}