import java.util.Scanner;
class Stack{
    private int arr[];
    private int size;
    private int top;
public Stack(int size){
    this.size=size;
    arr=new int[size];
    top=-1;
}
public void push(int value){
    if(top==size-1){
        System.out.println("Stack overflow");
    }
    else{
        arr[++top]=value;
        System.out.println(value+"pushed");
    }
}
public void pop(){
    if(top==-1){
        System.out.println("Stack underflow");
    }
    else{
        System.out.println(arr[top--]+"popped");
    }
}
public void peek(){
    if(top==-1){
        System.out.println("Stack is empty");
    }
    else{
        System.out.println("Top element:"+arr[top]);
    }
}
}
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        Stack stack=new Stack(size);
        stack.push(40);
        stack.push(30);
        stack.push(20);
        stack.push(10);
        stack.peek();
        stack.pop();
    }
}