import java.io.*;
import java.util.*;
  public class StrPos{
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a String:");
      String str=sc.next();
      String str1=" ";
      for(int i=0;i<str.length();)
      {
        str1=str1+str.charAt(i);
		i=i+3;
      }
      System.out.println("ANSWER:"+str1);
    }
  }  
