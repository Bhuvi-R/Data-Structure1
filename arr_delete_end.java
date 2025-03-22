import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Original array:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]);
        }
        System.out.println();
        if(n==0||n==1){
            System.out.println("The array is empty after deleting the last element.");
        }
        else{
        int newarr[]=new int[n-1];
        for(int i=0;i<n-1;i++){
            newarr[i]=arr[i];
        }
        System.out.println("After deleting last element of an array:");
        for(int i=0;i<n-1;i++){
             System.out.print(newarr[i]);
        }
        }
        
    }
}