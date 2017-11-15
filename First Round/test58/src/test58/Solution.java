package test58;

public class Solution {
    public int lengthOfLastWord(String s) {
    	return s.trim().length()-s.trim().lastIndexOf(" ")-1;
    }
    
    public static void main(String[] args){
    	String a = "";
    	System.out.println(a.trim());
    	System.out.println(a.trim().length());
    	System.out.println(a.trim().lastIndexOf(" "));
    }
}

//1、int indexOf(String str) ：返回第一次出现的指定子字符串在此字符串中的索引。 
//2、int indexOf(String str, int startIndex)：从指定的索引处开始，返回第一次出现的指定子字符串在此字符串中的索引。 
//3、int lastIndexOf(String str) ：返回在此字符串中最右边出现的指定子字符串的索引。 
//4、int lastIndexOf(String str, int startIndex) ：从指定的索引处开始向后搜索，返回在此字符串中最后一次出现的指定子字符串的索引。