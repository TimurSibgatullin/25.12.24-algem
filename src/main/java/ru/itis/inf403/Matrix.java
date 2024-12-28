package ru.itis.inf403;

public class Matrix {
    private float[][] components;

    public Matrix(float[][] components) {
        this.components = components;
    }

    public Matrix(LAVector[] rows) {
        float[][] res = new float[rows.length][rows[0].getSize()];
        for (int i = 0; i < rows.length; i++) {
            res[i] = rows[i].getComponents();
        }
        this.components = res;
    }

    public Matrix(int columns, int rows) {
        //TODO создать матрицу из 0
        float[][] res = new float[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                res[i][j] = (float) 0;
            }
        }
        this.components = res;
    }

    public Matrix(int size, float diagElement) {
        //TODO создать квадратную матрицу из diagElement на главной диагонали
        float[][] res = new float[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j) {
                    res[i][j] = diagElement;
                } else {
                    res[i][j] = (float) 0;
                }
            }
        }
        this.components = res;
    }

    public int rows() {
        return this.components.length;
    }

    public int columns() {
        return this.components[0].length;
    }

    public float det() {
        //TODO вычислить определитель
        Determinator det = new Determinator(this.components);
        det.determine();
        return 0;
    }

    public LAVector multRVector(LAVector vector) {
        return null;
    }

    public LAVector multLVector(LAVector vector) {
        return null;
    }

    public Matrix transp() {
        return null;
    }

    public float[][] getComponents() {
        return components;
    }

    public String toString() {
        String res = "";
        for (float[] row : this.components) {
            for (float element : row) {
                res += element + " ";
            }
            res += "\n";
        }
        return res.substring(0, res.length()-2);
    }
}
