import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

//input array=[2,1,3,6,4,5]
//output = [2,4,6,5,3,1]
public class TestDemo {

	static void sortArray(int[] a) {
		int len = a.length;
		Set<Integer> even = new TreeSet<Integer>();
		Set<Integer> odd = new TreeSet<Integer>();
		
		for(int i=0;i<len;i++) {
			if(a[i]%2==0) {
				even.add(a[i]);
			}
			else {
				odd.add(a[i]);
			}
		}
		Object[] e = new Object[even.size()];
		Object[] o = new Object[odd.size()];
		e=even.toArray();
		o=odd.toArray();
		for(int i=0;i<3;i++) {
			a[i]=(int) e[i];
		}
		for(int i=3;i<len;i++) {
			a[i]=(int) o[len-i-1];
		}
		for(int i=0;i<len;i++)	
		System.out.println(a[i]);	
	}
	
	public static int countOfWords(String s) {
		s=s.toLowerCase();
		String[] words = s.split(" ");
		return words.length;
	}
	
	public static HashMap<String, Integer> dupWords(String s){
		String[] words = s.split(" ");
		TreeMap<String,Integer> map = new TreeMap<String,Integer>();
		HashMap<String,Integer> result = new HashMap<String,Integer>();
		for(int i=0;i<words.length;i++) {
			if(map.containsKey(words[i])) {
				map.put(words[i], map.get(words[i])+1);
			}
			else
				map.put(words[i], 1);
		}
		System.out.println(map);
		int count =0;
		String re = "";
		for(Entry<String,Integer> r:map.entrySet()) {
			if(r.getValue()>count) {
				re = r.getKey();
				count = r.getValue();
			}
		}
		result.put(re, count);
		return result;
	}
	
	public static String removeDup(String s) {
		String[] words = s.split(" ");
		TreeSet<String> set = new TreeSet<String>();
		for(int i=0;i<words.length;i++) {
			set.add(words[i]);
		}
		Object[] w = set.toArray();
		String result = "";
		for(int i=0;i<w.length;i++)
			result = result+w[i]+" ";
		return result;
	}
	
	public static String removeDupChar(String s) {
		char[] c = s.toCharArray();
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++) {
			set.add(c[i]);
		}
		Object[] r = set.toArray();
		String result="";
		for(int i=0;i<r.length;i++) {
			result = result+r[i];
		}
		return result;
	}
	
	public static Object[] dupNumbers(int[] a) {
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(int i=0;i<a.length;i++) {
			if(map.containsKey(a[i]))
				map.put(a[i], map.get(a[i])+1);
			else
				map.put(a[i],1);
		}
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i:map.values()) {
			if(map.get(i)>1) {
				list.add(i);
			}
		}
		Object[] r = list.toArray();
		return r;
	}
	
	public static int[] sortDes(int[] a) {
		TreeSet<Integer> set = new TreeSet<Integer>();
		for(int i=0;i<a.length;i++) 
			set.add(a[i]);
		Object[] r = set.toArray();
		int[] result = new int[r.length];
		for(int i=r.length-1;i>=0;i--) {
			result[r.length-1-i]=(int) r[i];
		}
		return result;
	}
		
	public static int missingNumber(int[] a) {
		TreeSet<Integer> set = new TreeSet<Integer>();
		for(int i=0;i<a.length;i++) 
			set.add(a[i]);
		Object[] r = set.toArray();
		int number = 1;
		for(int i=0;i<r.length;i++) {
			if((int)r[i]==number) {
				number++;
				continue;
			}
			else
				break;
		}
		return number;
	}
	
	public static boolean sumOfTwo(int[] a, int sum) {
		boolean result=false;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]+a[j]==sum) {
					result = true;
					break;
				}
			}
		}
		return result;
	}
	
	public static int productOfTwo(int[] a) {
		int product = 0;
		for(int i=0;i<a.length-1;i++) {
			if(a[i]*a[i+1]>product) {
				product = a[i]*a[i+1];
			}
		}
		return product;
	}
	
	public static boolean isPalindrome(int n) {
		int num=n,r=0;
		boolean b=false;
		while(n!=0) {
			r=r*10+n%10;
			n=n/10;
		}
		if(r==num)
			b=true;
		return b;
	}
	
	public static int nearPalindrome(int n) {
		int diff1=0,diff2=0,n1=0,n2=0;
		for(int i=n;;i++) {
			if(isPalindrome(i)) {
				diff1=i-n;
				n1=i;
				break;
			}
		}
		for(int i=n;;i--) {
			if(isPalindrome(i)) {
				diff2=n-i;
				n2=i;
				break;
			}
	}
		if(diff1<diff2)
			return n1;
		else
			return n2;
	}
	
	public static void method(String s) {
		String [] sa = s.split(" ");
		int count = sa[0].length();
		String small="",lon="";
		for(int i=1;i<sa.length;i++) {
			if(count<sa[i].length()) {
				lon = sa[i];
				count = sa[i].length();
				System.out.println(lon);
			}
		}
		for(int i=0;i<sa.length;i++) {
			if(count>sa[i].length()) {
				small = sa[i];
				count = sa[i].length();
				System.out.println(small);
			}
		}
		System.out.println("Longest: "+lon);
		System.out.println("Smallest: "+small);
	}
	
	
		public static void main(String args[]) {
			
			String s = "this is a very very bad example of how bad a program can go to prove bad example";
			HashMap<String,Integer> r = new HashMap<String,Integer>();
			r = dupWords(s);
			System.out.println(r);
		}
	
}
