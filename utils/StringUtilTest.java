package utils;

/**
 * To test the StringUtil class
 */
public class StringUtilTest {
    public static void main(String[] argv) {
        System.out.println("test isEmpty");
        System.out.println(StringUtil.isEmpty(null));
        System.out.println(StringUtil.isEmpty(""));
        System.out.println(StringUtil.isEmpty("     "));
        System.out.println(StringUtil.isEmpty("abc"));

        System.out.println("test isEqual");
        System.out.println(StringUtil.isEqual(null, "abc"));
        System.out.println(StringUtil.isEqual("abc", "abc"));
        System.out.println(StringUtil.isEqual("def", "abc"));

        System.out.println("test isNumberOnly");
        System.out.println(StringUtil.isNumberOnly("123446454"));
        System.out.println(StringUtil.isNumberOnly("123446454a"));
    }
}
