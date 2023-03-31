import java.util.*;
public class Tokenizer
{
	public static void main(String[] args) {
		String s="hai hello welcome to bitlabs";
		StringTokenizer t=new StringTokenizer(s);
		System.out.println("no of tokens in the strig: "+t.countTokens());
		while(t.hasMoreTokens()){
		    System.out.println(t.nextToken());
		}
	}
}