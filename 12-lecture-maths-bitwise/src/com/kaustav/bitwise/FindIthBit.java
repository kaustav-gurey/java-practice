//find out the ith bit of the number: is it 1 or 2
package com.kaustav.bitwise;

public class FindIthBit {
    public static void main(String[] args) {
        //237 in binary is 11101101 i.e 1st bit is 1, 2nd is 0, 3rd is 1 and so on
        System.out.println(ithBit(237,1));
        System.out.println(ithBit(237,2));
        System.out.println(ithBit(237,3));
        System.out.println(ithBit(237,4));
        System.out.println(ithBit(237,5));
        System.out.println(ithBit(237,6));
        System.out.println(ithBit(237,7));
        System.out.println(ithBit(237,8));

        System.out.println();

        //45 in binary is 101101
        System.out.println(ithBit(45,1));
        System.out.println(ithBit(45,2));
        System.out.println(ithBit(45,3));
        System.out.println(ithBit(45,4));
        System.out.println(ithBit(45,5));
        System.out.println(ithBit(45,6));

    }
    static int ithBit(int num, int i) {
        //this will create a mask with all 0s but 1 only in the ith position
        int n = 1<<i-1;
        //if 1&bit in ith position is 0 then bit in ith position is 0, else 1
        if((num&n) == 0) {
            return 0;
        }
        return 1;
    }
}
