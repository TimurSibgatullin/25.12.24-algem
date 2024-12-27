package ru.itis.inf403;

public class Matrix {
    private float[][] components;

    public Matrix(float[][] components) {

    }

    public Matrix(LAVector[] rows) {

    }

    public Matrix(int columns, int rows) {
        //TODO создать матрицу из 0
    }

    public Matrix(int size, float diagElement) {
        //TODO создать квадратную матрицу из diagElement на главной диагонали
    }

    public int rows() {
        return 0;
    }

    public int columns() {
        return 0;
    }

    public float det() {
        //TODO вычислить определитель
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

    public String toString() {
        return "";
    }
}
