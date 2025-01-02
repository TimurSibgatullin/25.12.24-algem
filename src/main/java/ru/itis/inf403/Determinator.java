//package ru.itis.inf403;
//
//public class Determinator extends Matrix{
//    public Determinator(float[][] components) {
//        super(components);
//    }
//
//    public Determinator(LAVector[] rows) {
//        super(rows);
//    }
//
//    public int fact(int n) {
//        int res = 1;
//        for (int i = 1; i <= n; i++) {
//            res *= i;
//        }
//        return res;
//    }
//
//    public float determine() {
//        float[][] matrix = this.getComponents();
//        if (this.columns() == this.rows()) {
//            int n = this.columns();
//            float[] permutations = new float[fact(n)];
//            float[] src = new float[n];
//            for (int i = 0; i < n; i++) {
//                src[i] = i;
//            }
//            this.permute(src, 0, n-1);
//            return 0;
//        } else {
//            return 0;
//        }
//    }
//
//    private float[] permute(float[] src, int l, int r) {
//        if (l == r) {
//            System.out.println(str);
//        } else {
//            for (int i = l; i <= r; i++) {
//                str = swap(str, l, i);
//                permute(str, l + 1, r);
//                str = swap(str, l, i);
//            }
//        }
//    }
//
//    public String swap(String a, int i, int j) {
//        char temp;
//        char[] charArray = a.toCharArray();
//        temp = charArray[i];
//        charArray[i] = charArray[j];
//        charArray[j] = temp;
//        return String.valueOf(charArray);
//    }
//
//}
