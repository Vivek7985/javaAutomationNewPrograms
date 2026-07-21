package string;

public class str {
public static void main(String[] args) {
	
	String S="Vivek sale";
	String S1="ViVek SaLE";
	
	System.out.println(S.length());//to measure total words in word.
    System.out.println(S.charAt(7));//to print word at index 7 (here it include space also)
    System.out.println(S.substring(4));//here it will print from given index.
    System.out.println(S.substring(4, 10));//here it will print from, to given index
    System.out.println(S.equals(S1));//boolean check for both methods and give result as a true or false.
    System.out.println(S.equalsIgnoreCase(S1));//check both the string without case wise.
    System.out.println(S.concat(" "+ S1));
    System.out.println(S.indexOf("l"));
    System.out.println("");
    
    System.out.println(S1.length());
    System.out.println(S1.charAt(8));
    System.out.println(S1.substring(2, 10));
    System.out.println(S1.equals(S));
    System.out.println(S1.equalsIgnoreCase(S));
    System.out.println(S1.concat(" " + S));
    System.out.println(S1.indexOf("E"));
  
	}

}
