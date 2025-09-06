package class3;

public class RunLengthEncode {
    public static String runLengthEncode(String str) {
        StringBuilder encoded = new StringBuilder();
        int count = 1;
        for (int i = 1; i < str.length(); i++) {
            if (i < str.length() && str.charAt(i) == str.charAt(i - 1)) {
                count++;
            }  else {
                encoded.append(count);
                encoded.append(str.charAt(i-1));
                count = 1;
            }
        }
        return encoded.toString();
    }

    public static void main(String[] args) {
        String test = "AAAAABBBCCDAA";
        System.out.println("Original: " + test);
        System.out.println("Encoded: " + runLengthEncode(test));
    }
}
