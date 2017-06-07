import java.io.*;
import java.util.Scanner;
public class revstr
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
String s=new StringBuffer(str).reverse().toString();
System.out.println(s);
}
}
