package ru.itis.inf403;

public class Determinator extends Matrix{
    private int[][] permutations;

    public Determinator(float[][] components) {
        super(components);
    }

    public int fact(int n) {
        int res = 1;
        for (int i = 1; i <= n; i++) {
            res *= i;
        }
        return res;
    }

    public float determine() {
        float[][] matrix = this.getComponents();
        if (this.columns() == this.rows()) {
            int n = this.columns();
            this.permutations = new int[fact(n)][];
            int[] src = new int[n];
            for (int i = 0; i < n; i++) {
                src[i] = i;
            }
            this.permute(src, 0, n-1, 0);
            String res = "";
            for (int[] row : this.permutations) {
                for (int element : row) {
                    res += element + " ";
                }
                res += "\n";
            }
            System.out.println(res.substring(0, res.length() - 2));
            return 0;
        } else {
            return 0;
        }
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

    public int[] swap(int[] src, int i, int j) {
        int temp;
        temp = src[i];
        src[i] = src[j];
        src[j] = temp;
        return src;
    }

}
