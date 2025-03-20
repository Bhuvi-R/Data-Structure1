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
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]);
        }
        System.out.println();
        System.out.println("Enter new element to add");
        int newelement=sc.nextInt();
        int newarr[]=new int[n+1];
        int middleindex=n/2;
        for(int i=0;i<middleindex;i++){
            newarr[i]=arr[i];
        }
        newarr[middleindex]=newelement;
        for(int i=middleindex;i<n;i++){
            newarr[i+1]=arr[i];
        }
        for(int num:newarr){
            System.out.print(num);
        }
    }
}