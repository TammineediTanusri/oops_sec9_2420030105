package strings;

public class Stringmethods {
	public static void main(String[] args) {
        String str1 = "Hello Java World";
        String str2 = "hello java world";
        String str3 = "Java";

        // 1. length()
        System.out.println("1. Length of str1: " + str1.length());

        // 2. charAt(int index)
        System.out.println("2. Character at index 6: " + str1.charAt(6));

        // 3. substring(int beginIndex)
        System.out.println("3. Substring from index 6: " + str1.substring(6));

        // 4. substring(int beginIndex, int endIndex)
        System.out.println("4. Substring from index 0 to 5: " + str1.substring(0, 5));

        // 5. equals(String anotherString)
        System.out.println("5. str1 equals str2? " + str1.equals(str2));

        // 6. equalsIgnoreCase(String anotherString)
        System.out.println("6. str1 equalsIgnoreCase str2? " + str1.equalsIgnoreCase(str2));

        // 7. compareTo(String anotherString)
        System.out.println("7. compareTo (str1 vs str2): " + str1.compareTo(str2));

        // 8. compareToIgnoreCase(String anotherString)
        System.out.println("8. compareToIgnoreCase (str1 vs str2): " + str1.compareToIgnoreCase(str2));

        // 9. contains(CharSequence s)
        System.out.println("9. str1 contains 'Java'? " + str1.contains("Java"));

        // 10. startsWith(String prefix)
        System.out.println("10. str1 starts with 'Hello'? " + str1.startsWith("Hello"));

        // 11. endsWith(String suffix)
        System.out.println("11. str1 ends with 'World'? " + str1.endsWith("World"));

        // 12. indexOf(String str)
        System.out.println("12. indexOf 'Java' in str1: " + str1.indexOf("Java"));

        // 13. lastIndexOf(String str)
        System.out.println("13. lastIndexOf 'a' in str1: " + str1.lastIndexOf("a"));
    }
}
