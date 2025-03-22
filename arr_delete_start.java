import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int newarr[]=new int[n-1];
        for(int i=1;i<n;i++){
            newarr[i-1]=arr[i];
        }
        for(int num:newarr){
            System.out.print(num);
        }
    }
}