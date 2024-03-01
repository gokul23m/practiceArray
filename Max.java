import java.util.*;
class Max{
       public static void main(String[] args){
           Scanner sc=new Scanner(System.in);
              
            int a[]={4,2,5,6,1,3};
              int max=a[0];
              for(int i=0;i<a.length;i++){
                      if(max < a[i]){
                           max=a[i];
                      }
              }
             
             System.out.println(max);
       }
}