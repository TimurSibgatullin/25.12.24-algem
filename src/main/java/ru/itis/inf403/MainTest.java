package ru.itis.inf403;

public class MainTest {
    public static void main(String[] args) {
        LAVector v1 = new LAVector(3);
        System.out.println("Создание пустого вектора v1 размера n: " + v1);

        LAVector v2 = new LAVector(new float[] {2, 1, 3});
        System.out.println("Создание вектора v2 по заданному массиву: " + v2);

        LAVector v3 = new LAVector(3, 4);
        System.out.println("Создание вектора v3 размера n, заполненного элементами m: " + v3);

        System.out.println("Сложение вектора v2 с вектором v3: " + v2.plusVector(v3));

        System.out.println("Умножение вектора v2 на число m: " + v2.multNumber(3));

        System.out.println("Сложение вектора v2 с вектором v3: " + v2.plusVector(v3));

        System.out.println("Скалярное произведение вектора v2 с вектором v3: " + v2.scalarMult(v3));

        System.out.println("Поиск модуля вектора v2: " + v2.abs());

        System.out.println("Получить элемент вектора v2 по индексу n: " + v2.getComponent(3));

        System.out.println("Получить размер вектора v2: " + v2.getSize());


        Matrix m1 = new Matrix(new float[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}});
        System.out.println("Создание матрицы m1 по заданному двумерному массиву: \n" + m1);

        Matrix m2 = new Matrix(new LAVector[] {v2, v3, v2.plusVector(v3)});
        System.out.println("Создание матрицы m2 по заданному массиву векторов: \n" + m2);

        Matrix m3 = new Matrix(3, 3);
        System.out.println("Создание пустой матрицы m3 размера n*m: \n" + m3);

        Matrix m4 = new Matrix(3, (float) 2);
        System.out.println("Создание квадратной матрицы m4 размера n с заполненной диагональю: \n" + m4);

        System.out.println("Получить количество строк: " + m1.rows());

        System.out.println("Получить количество столбцов: " + m1.columns());

    }
}
