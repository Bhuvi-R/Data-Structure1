import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
        System.out.print(arr[i]);
        }
        int newelement=sc.nextInt();
        int newarr[]=new int[n+1];
        newarr[0]=newelement;
        for(int i=0;i<n;i++){
            newarr[i+1]=arr[i];
        }
        System.out.println("New array");
        for(int num:newarr){
            System.out.print(num);
        }
    }
}