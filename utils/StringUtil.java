package utils;

/**
 * A null safe String util class to do some common functions
 */
public class StringUtil {
    /**
     * A Null safe method to check if the string is null or empty (zero length) or only contains space or tab
     * @param val a String passed
     * @return true: if the passed in string is null or length is 0 or only contains space or tab(\t)
     * fase: if the passed string is not null and contains non white space
     */
    public static boolean isEmpty(String val) {
        if (val == null || val.isEmpty()) {
            return true;
        }
        else {
            int index = 0;
            while (index < val.length()) {
                char ch = (char)(val.charAt(index));
                if (ch != ' ' && ch != '\t' ) {
                    return false;
                }
                index++;
            }
            return true;
        }
    }

    /**
     * A null safe String comparison function
     * @param val1
     * @param val2
     * @return true if both strings are not null and have the same content, false if any of the string is null or they don't have the same content
     */
    public static boolean isEqual(String val1, String val2) {
        if (val1 == null || val2 == null ) {
            return false;
        }
        return val1.equals(val2);
    }

    /**
     * A null safe String check to see if it only contains numbers
     * @param val1
     * @return true if the passed in string is not null and contains only numbers, false otherwise
     */
    public static boolean isNumberOnly(String val1) {
        if (val1 == null) {
            return false;
        }
        else {
            for (int i = 0; i < val1.length(); i++) {
                if (val1.charAt(i) < '0' || val1.charAt(i) > '9') {
                    return false;
                }
            }
        }
        return true;

    }
}
