package com.company;



import java.util.ArrayList;
class VampireNumbers {

    //printing 100 vampire numbers
    public static void printVampireNumbers(int quantity) {
        int count = 0;
        int num = 1000;
        while (count < quantity) {
            //checks if the number is vampire number
            if (isVampire(num)) {
                count++;
                System.out.println(count);
                System.out.println(num);
                //count++;
                // System.out.println(count);
            }

            num++;
        }
    }

    public static boolean isVampire(int num) {
        //checks whether even number of digits are present or not
        if (digitsCondition(num)) {
            //counts the number of digits
            int length = countOfDigits(num);
            ArrayList<String> permutations = new ArrayList<String>();
            //finds the permutations of the number
            permutationsOfString(Integer.toString(num), "", permutations);
            String num1, num2;
            for (String str : permutations) {
                //takes two permutations
                num1 = str.substring(0, length / 2);
                num2 = str.substring(length / 2);
                //checks if both the numbers(permutations) has trailing zeros or having leading zeros
                if (!((hasLeadingZeros(num1) || hasLeadingZeros(num2)) || (hasTrailingZeros(num1) && hasTrailingZeros(num2)))) {
                    //checks whether their product gives the original number
                    if (Integer.parseInt(num1) * Integer.parseInt(num2) == num)
                        return true;
                }
            }
        }
        return false;
    }

    public static boolean digitsCondition(int num) {

        int count = countOfDigits(num);
        if (count >= 4 && count % 2 == 0)
            return true;
        else
            return false;
    }

    public static int countOfDigits(int num) {
        int count = 0;
        while (num > 0) {
            count++;
            num /= 10;
        }
        return count;
    }

    public static boolean hasTrailingZeros(String num) {
        if (Integer.parseInt(num) % 10 == '0')
            return true;
        return false;
    }

    public static boolean hasLeadingZeros(String num) {
        if (num.charAt(0) == '0')
            return true;
        return false;
    }

    public static void permutationsOfString(String num, String ans, ArrayList<String> res) {
        if (num.length() == 0) {
            res.add(ans);
            return;
        }
        //finds the permutations

        for (int i = 0; i < num.length(); i++) {
            char target = num.charAt(i);
            //Till the length of the required permutation adds the number to array list
            String ros = num.substring(0, i) + num.substring(i + 1);
            permutationsOfString(ros, ans + target, res);

        }
    }

}
public class Main {
    public static void main(String[] args) {
        VampireNumbers v=new VampireNumbers();
        v. printVampireNumbers(100);

    }
}
