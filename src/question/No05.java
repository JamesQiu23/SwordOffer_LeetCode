package question;

/*请实现一个函数，把字符串 s 中的每个空格替换成"%20"。*/


public class No05 {
    public static void main(String[] args) {
        Solution05 solution = new Solution05();
        String we_are_happy = solution.replaceSpace("We are happy");
        System.out.println(we_are_happy);
    }
}


class Solution05 {
    public String replaceSpace(String s) {
        int length = s.length();
        int count = 0;
        char[] tempArray = new char[length*3]; //最多每个假设都是空格，1变3
        for (int i = 0; i < s.length(); i++) {
            char singleChar = s.charAt(i);
            if(' ' == singleChar){
                tempArray[count] = '%';
                tempArray[count+1] = '2';
                tempArray[count+2] = '0';
                count = count+3;
            }
            else{
                tempArray[count] = singleChar;
                count++;
            }
        }
        String newStr = new String(tempArray, 0, count);
        return newStr;
    }
}


class Solution05_2 {
    public String replaceSpace(String s) {
       return s.replaceAll(" ","%20");
    }
}