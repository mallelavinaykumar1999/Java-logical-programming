import java.util.*;
public class StringBulider
{
	public static void main(String[] args) {
		String s="hello ";
		StringBuilder s1=new StringBuilder(s);
		
		System.out.println(s1.append("vinay"));
		System.out.println(s1.insert(0,"vinay"));
		System.out.println(s1.replace(1,3,"vinay"));
		System.out.println(s1.delete(1,3));
		System.out.println(s1.reverse());
	}
}