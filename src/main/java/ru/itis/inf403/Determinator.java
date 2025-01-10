package ru.itis.inf403;

public class Determinator extends Matrix{
    private int[][] permutations;

    public Determinator(float[][] components) {
        super(components);
    }

    private int fact(int n) {
        int res = 1;
        for (int i = 1; i <= n; i++) {
            res *= i;
        }
        return res;
    }

    public float determine() {
        float[][] matrix = this.getComponents();
        if (this.columns() == this.rows()) {
            float result = 0;
            int n = this.columns();
            this.permutations = new int[fact(n)][];
            int[] src = new int[n];
            for (int i = 0; i < n; i++) {
                src[i] = i;
            }
            this.permute(src, 0, n-1, 0);
            for (int i = 0; i < permutations.length; i++) {
                float multiply = 1;
                for (int j = 0; j < permutations[i].length; j++) {
                    multiply *= matrix[j][permutations[i][j]];
                }
                result += (float) (Math.pow(-1.0, (inversions(permutations[i]) % 2 + 2))) * multiply;
            }
            return result;
        } else {
            return 0;
        }
    }

    private int inversions(int[] src) {
        int res = 0;
        for (int i = 0; i < src.length; i++) {
            for (int j = i; j < (src.length - 1); j++) {
                if (src[i] > src[j + 1]) {
                    res += 1;
                }
            }
        }
        return res;
    }

    private int permute(int[] src, int l, int r, int idx) {
        if (l == r) {
            this.permutations[idx] = src.clone();
            return idx + 1;
        } else {
            for (int i = l; i <= r; i++) {
                src = swap(src, l, i);
                idx = permute(src,l + 1, r, idx);
                src = swap(src, l, i);
            }
        }
        return idx;
    }

    private int[] swap(int[] src, int i, int j) {
        int temp;
        temp = src[i];
        src[i] = src[j];
        src[j] = temp;
        return src;
    }
}
