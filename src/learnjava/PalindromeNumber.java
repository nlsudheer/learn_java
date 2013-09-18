package learnjava;

/**
 * Created with IntelliJ IDEA.
 * User: sudheern
 * Date: 15/9/13
 * Time: 1:27 PM
 * To change this template use File | Settings | File Templates.
 */
public class PalindromeNumber {

    public static void main(String args[]) {
        int num, tempNum;
        num = tempNum = 121;
        int rem, palNum;
        rem = palNum = 0;

        while (tempNum > 0) {
            rem = tempNum % 10;
            tempNum = (int) tempNum / 10;
            palNum = palNum + (rem * 10);
        }
        if (palNum == num) {
            System.out.println(num + " is a palindrome number");
        } else {
            System.out.println(num + " is not a palindrome number");
        }
    }
}
