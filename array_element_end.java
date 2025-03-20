import java.util.Scanner;
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
        System.out.print("Enetr new element to add at end");
        int newelement=sc.nextInt();
        int newarr[]=new int[arr.length+1];
        for(int i=0;i<n;i++){
            newarr[i]=arr[i];
        }
        newarr[newarr.length-1]=newelement;
        for(int num:newarr){
            System.out.print(num);
        }
        
    }
}


