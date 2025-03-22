import java.util.*;
class Main{
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
   for(int i=0;i<n;i++){
       System.out.print(arr[i]);
   }
   System.out.println();
    int middleindex=n/2;
   int newArr[]=new int[n-1];
   for(int i=0;i<middleindex;i++){
       newArr[i]=arr[i];
   }
   for(int i=middleindex;i<n-1;i++){
       newArr[i]=arr[i+1];
   }
   for(int num:newArr){
       System.out.print(num);
   }
   
}
}