package learn_java;

/**
 * Formula/ logic: Numbers are not divisible by more than half of the number
 *
 * http://javarevisited.blogspot.in/2012/04/java-program-to-print-prime-numbers-in.html
 * http://www.javatrainingprojects.com/JavaPrograms.htm
 *
 *
 * Created with IntelliJ IDEA.
 * User: sudheern
 * Date: 16/9/13
 * Time: 1:37 PM
 * To change this template use File | Settings | File Templates.
 */
public class PrimeNumbers {

    boolean isPrime_Simple(int num){
       for (int i =2; i< num; i++){
           if ((num % i) == 0)
               return false;
       }
        return true;
    }

    boolean isPrime(int num){
        for (int i =2; i<= num/2; i++){
            if ((num % i) == 0)
                return false;
        }
        return true;
    }



    public static void main (String args[]){
        int num = 507193;
        int limit = 131;
        PrimeNumbers pri = new PrimeNumbers();
        System.out.println(num+ " is prime number? " + pri.isPrime_Simple(num));
        System.out.println(num+ " is prime number? " + pri.isPrime(num));

        for(int i =2; i <= limit; i++ ){
            if (pri.isPrime(i))
            System.out.println(i+ " is prime number? " + i);
        }

    }

}
