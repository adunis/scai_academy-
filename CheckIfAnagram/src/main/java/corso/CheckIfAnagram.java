package corso;

import java.util.Arrays;

public class CheckIfAnagram {

    public boolean isAnagram(String str1, String str2){
        if (str1.length()!=str2.length() || str1 == str2) return false; 

       char[] strArray1 = str1.toCharArray();
       char[] strArray2 = str2.toCharArray();
        Arrays.sort(strArray1);
        Arrays.sort(strArray2);

        if (strArray1 == strArray2) {return true;} else {return false;}
    }


}