import java.util.Arrays;

public class string {
    public static int count(String str) {
        int count = 0;

        for(int i =0; i<str.length(); i++) {
            char ch = str.charAt(i);
            if(ch == 'a' || ch== 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
                
            }
            
        }
        return count;
        
    }
    public static void anagram(String str1, String str2) {
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        //str2.toLowerCase().replaceAll(str1, str2)

        if(str1.length() == str2.length()) {
            char[] str1charArray = str1.toCharArray();
            char[] str2chararray = str2.toCharArray();

            Arrays.sort(str1charArray);
            Arrays.sort(str2chararray);
            boolean result = Arrays.equals(str1charArray, str2chararray);

            if(result) {
                System.out.println("True");
            }else {
                System.out.println("False");
            }
            




        }
        else {
            System.out.println("false");
        }
        

    }
    public static void main(String[] args) {
        String str1 = "hasrh";
        String str2 = "Harsh";
        //System.out.println(count(str));
        anagram(str1, str2);
        System.out.println( str2 = str2.toLowerCase());
        str2.toLowerCase().replaceAll("a", "b");
        
    
    }
    
}
