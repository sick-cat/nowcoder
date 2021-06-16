package jia.JZoffer.difficult;

/**
 * @author JiaYanZhao
 * @date 2021/6/4 15:43
 *
 * 替换空格
 * 描述
 * 请实现一个函数，将一个字符串中的每个空格替换成“%20”。
 * 例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 */
public class JZ2 {
    public static void main(String[] args) {
        System.out.println(replaceSpace("We Are Happy"));
        System.out.println(replaceSpace2("We Are Happy"));
    }

    public static String replaceSpace (String s) {
        return s.replaceAll(" ", "%20");
    }

    public static String replaceSpace2 (String s) {
        char[] chars = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char aChar : chars) {
            if (aChar == ' '){
                sb.append("%20");
            } else {
                sb.append(aChar);
            }

        }
        return sb.toString();
    }
}
