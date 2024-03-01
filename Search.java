import java.util.*;
class Search{
       public static void main(String[] args){
           Scanner sc=new Scanner(System.in);
             int key=sc.nextInt();
             String res="not present";
              
            int a[]={2,5,6,8,3};

             for(int i=0;i<a.length;i++){
                    if(a[i]==key){
                           res="present";
                           break;
                    }
             }
             System.out.println(res);
       }
}