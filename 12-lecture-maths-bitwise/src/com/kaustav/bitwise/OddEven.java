/*the last number or the binary form of the number determines if the number is
odd or even i.e. if it is 1 then teh number is odd and if it is 0 the number
is even*/
/*so if we & the last number with 1 then it will return 1 if the last number is 1
i.e. the whole number is odd and will return 0 if the last number is 0 i.e. the
whole number is even*/
package com.kaustav.bitwise;

public class OddEven {
    public static void main(String[] args) {
        System.out.println(isEven(10));
        System.out.println(isEven(11));

    }
    static boolean isEven(int n) {
        return (n&1)==0;
    }
}
