/**
 * @author JiaYanZhao
 * @date 2021/3/26 14:54
 */
public class DoubleCheck {
    public static void main(String[] args) {

        System.out.println(null == null);

        Double cc = Double.NaN;
        Double bb = Double.NaN;

        System.out.println(bb.equals(cc));
        System.out.println(Double.toString(cc));
        System.out.println(Double.doubleToRawLongBits(0.0 / 0.0));
        System.out.println(Double.doubleToRawLongBits(0.0 / 0.0));


        System.out.println((char) 50);
        char[] charArr = new char[]{'a', 'b', 'c'};
        System.out.println(charArr + "------");
    }

}
