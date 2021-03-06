/**
 * @ClassName FirstUniqChar
 * 在字符串中找出第一个只出现一次的字符
 * @Author: K
 * @create: 2019/8/15-23:14
 **/
public class FirstUniqChar {
    public static int firstUniqChar(String s) {
        int[] a = new int[26];
        for(int i = 0;i < s.length();i++){
            a[s.charAt(i) - 'a']++;
        }
        for(int i = 0;i < s.length();i++){
            if(a[s.charAt(i) - 'a'] == 1){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String s = "loveleetode";
        System.out.println(firstUniqChar(s));
    }
}
