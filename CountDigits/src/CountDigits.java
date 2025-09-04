public class CountDigits {
    public static void main(String[] args) {
        int count = 0;

        for (int i = 0; i <= 100; i++)
        {
            String number = String.valueOf(i);

            for (int j = 0; j < number.length(); j++)
                if (number.charAt(j) == '8') count++;
        }

        System.out.println("# of 8 appearances from 0 to 100: " + count);
    }
}
