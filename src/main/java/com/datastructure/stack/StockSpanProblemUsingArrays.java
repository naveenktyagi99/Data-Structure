package com.datastructure.stack;

public class StockSpanProblemUsingArrays {

    public void stockspan(int days[], int[] s) {

        s[0] = 1;
        for (int i = 1  ; i < days.length; i++) {
            s[i] = 1;
            for (int j = i-1;  (j>=0); j--){
                if(days[i] >= days[j]){
                    s[i]++;
                }

            }

        }
    }

    public static void main(String arr[]) {
        int days[] = {10, 4, 5, 90, 120, 80};
        int s[] = new int[days.length];
        StockSpanProblemUsingArrays object = new StockSpanProblemUsingArrays();
        object.stockspan(days, s);
        for (int a : s) {
            System.out.print(a + " , ");
        }
    }
}
