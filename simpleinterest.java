import java.util.*;
class simpleinterest{
public static void main(String[] args){
System.out.print("Enter Principal :");
Scanner Pri=new Scanner(System.in);
int principal=Pri.nextInt();
System.out.print("Enter Rate :");
Scanner Ra= new Scanner(System.in);
int rate=Ra.nextInt();
System.out.print("Enter Time :");
Scanner Ti=new Scanner(System.in);
int time=Ti.nextInt();
System.out.println((principal*rate*time)/100);
}
}