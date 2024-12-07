package examples;
import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the string");
		String input=s.next();
		String i1=input.toLowerCase();
		boolean b=ispalindrome(i1);
		if(b)
		{
			System.out.println("String is a palindrome");
		}
		else
		{
			System.out.println("string is not a palindrome");
		}

	}

 public static boolean ispalindrome(String s)
 {
	int left=0;
	int right=s.length()-1;
	while(left<right)
	{
		if(s.charAt(left)!=s.charAt(right))
		{
			return false;
		}
		left++;
		right--;
	}
	 return true;
 }
 }