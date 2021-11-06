package com.vantu.space;

/**
 * FindDuplicateNumber
 *
 * @author Tu Tran
 * @version FindDuplicateNumber.java Nov 02 2021 11:05 tvtu
 **/
public class FindDuplicateNumber {
    public void hasDuplicates(int[] arrA) {
        for (int i = 0; i < arrA.length; i++) {
            if (arrA[Math.abs(arrA[i])] < 0) {
                System.out.println(Math.abs(arrA[i]));
                break;
            } else {
                arrA[Math.abs(arrA[i])] = -arrA[Math.abs(arrA[i])];
            }
        }
    }
    public static void main(String[] args) {
        int a[] = {1, 6, 1, 5, 2, 3, 3, 2};
        new FindDuplicateNumber().hasDuplicates(a);
    }
}
