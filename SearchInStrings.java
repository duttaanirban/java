import java.util.Arrays;

public class SearchInStrings {
    public static void main(String[] args) {
        String name = "Anirban";
        char target = 'i';
        System.out.println(search(name,target));
        //displaying the string name in array
        System.out.println(Arrays.toString(name.toCharArray()));
    }

    static boolean search(String str, char target) {
        if (str.length() == 0) {
            return false;
        }
        
        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)) {
                return true;
            }
         }
        return false;

    }

    static boolean search2(String str, char target) {
        if (str.length() == 0) {
            return false;
        }
        
        for (char ch : str.toCharArray()) {
            if (target == ch) {
                return true;
            }
        }
        return false;
    }
}
