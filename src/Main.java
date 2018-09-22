import java.math.BigInteger;

public class Main {
    public static void main (String argsp[]) {
        calc(new BigInteger("196"));
//        System.out.println(a.add(b));
    }

    public static BigInteger calc (BigInteger number){
        BigInteger revert=revertNumber(number);
        BigInteger result=number.add(revert);
        System.out.println(revert.toString()+"+"+number.toString()+"="+result.toString());
        if (!isPalindrome(result)) {
            calc(result);
        }
        return new BigInteger("0");
    }

    public static BigInteger revertNumber (BigInteger number){
        BigInteger palindrome = new BigInteger(number.toString());
        BigInteger reverse = new BigInteger("0");
        BigInteger ten = new BigInteger("10");

        while (palindrome.compareTo(BigInteger.ZERO) != 0) {
            BigInteger remainder = new BigInteger(palindrome.toString());
            remainder = remainder.remainder(ten);
            reverse = reverse.multiply(ten).add(remainder);
            palindrome = palindrome.divide(ten);
        }

        return reverse;
    }

    public static boolean isPalindrome (BigInteger number) {
        BigInteger revert = revertNumber(number);
        if (number.equals(revert)) {
            return true;
        }

        return false;
    }

}
