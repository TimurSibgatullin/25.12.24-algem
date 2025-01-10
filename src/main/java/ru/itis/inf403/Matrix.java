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
        return det.determine();
    }

    public Matrix multRVector(LAVector vector) {
        if (columns() == 1) {
            float[][] temp = new float[rows()][vector.getSize()];
            for (int i = 0; i < rows(); i++) {
                for (int j = 0; j < vector.getSize(); j++) {
                    temp[i][j] = components[i][0] * vector.getComponent(j);
                }
            }
            return new Matrix(temp);
        } else {
            return null;
        }
    }

    public LAVector multLVector(LAVector vector) {
        float[] res = new float[rows()];
        if (rows() == vector.getSize()) {
            for (int i = 0; i < columns(); i++) {
                float temp = 0;
                for (int j = 0; j < vector.getSize(); j++) {
                    temp += vector.getComponent(j) * getComponents()[j][i];
                }
                res[i] = temp;
            }
            return new LAVector(res);
        } else {
            return null;
        }
    }

    public Matrix transp() {
        float[][] res = new float[columns()][rows()];
        for (int i = 0; i < rows(); i++) {
            for (int j = 0; j < columns(); j++) {
                res[j][i] = components[i][j];
            }
        }
        return new Matrix(res);
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
