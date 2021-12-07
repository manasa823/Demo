import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class demo {
	
	
	
	public static int sumOfDigits(int number) {
		int sum=0;
		while(number!=0) {
		sum=sum+(number%10);
		number=number/10;
		}
		return sum;
	}
	
	public static void lastTwoDigits(int[] A) {
		for(int i=0;i<A.length;i++) {
			int temp = A[i]*5;
			String value=Integer.toString(temp);
			System.out.println(value.substring(value.length()-2));
		}
	}
	
	public static String longestPalindrome(String s) {
		int len = s.length();
		String pal="";
		for(int i=0;i<len;i++) {
			for(int j=i;j<len;j++) {
				String sub = s.substring(i,j),rev = "";
				for(int k=sub.length()-1;k>=0;k--){
					char ch = sub.charAt(k);
					rev = rev+ch;
				}
				if(sub.equalsIgnoreCase(rev) && sub.length()>pal.length()) {
					pal = sub;
					System.out.println(pal);
				}
				else
					continue;
			}
		}
		return pal;
	}
	
	public static ArrayList<Integer> duplicateNumbers(int[] a) {
		ArrayList<Integer> temp = new ArrayList<Integer>();
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					temp.add(a[i]);	
				}
			}
		}
		return temp;
	}
	
	public static void duplicateCount(String s) {
		char[] c = s.toCharArray();
		Map<Character,Integer> result = new HashMap<Character,Integer>();
		for(char ch:c) {
			if(result.containsKey(ch)) {
				result.put(ch,result.get(ch)+1);	
			}
			else {
				result.put(ch, 1);
			}
		}
		System.out.println(result);
	}
	
	static int getSum(int n){
		int sum=0;
		while(n>0) {
			 sum = sum+n%10;
			 n=n/10;
			}
		if(sum<=9) {
			return sum;
		}
		else {
			return getSum(sum);
		}
		}
	
	
	
	public static void main(String args[]) throws ParseException {
	
		/*
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * System.out.println("Enter a number: "); String input = sc.next();
		 */
		SimpleDateFormat dt = new SimpleDateFormat("dd-mm-yyyy");
		String s = "10061997";
		String date = s.substring(0,2)+"-"+s.substring(2,4)+"-"+s.substring(4);
		Date d = dt.parse(date);
		System.out.println(d);
		
		
}
}
