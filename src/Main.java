public class Main {
    public static void main (String argsp[]) {
        calc(760);
    }

    public static long calc (long number){
        long revert=revertNumber(number);
        long result=number+revert;
        System.out.println(revert+"+"+number+"="+result);
        if (!isPalindrome(result)) {
            calc(result);
        }
        return 0;
    }

    public static long revertNumber (long number){
        long palindrome = number;
        long reverse = 0;

        while (palindrome != 0) {
            long remainder = palindrome % 10;
            reverse = reverse * 10 + remainder;
            palindrome = palindrome / 10;
        }

        return reverse;
    }

    public static boolean isPalindrome (long number) {
        long revert = revertNumber(number);
        if (number==revert) {
            return true;
        }

        return false;
    }

}
