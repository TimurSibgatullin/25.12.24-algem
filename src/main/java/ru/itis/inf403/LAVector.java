package ru.itis.inf403;

public class LAVector {

    private float[] components;

    public LAVector(int size) {
        this.components = new float[size];
    }

    public LAVector(float[] components) {
        this.components = components;
    }

    public LAVector(int size, float value) {
        float[] res = new float[size];
        for (int i = 0; i < size; i++) {
            res[i] = value;
        }
        this.components = res;
    }

    public LAVector plusVector(LAVector other) {
        if (this.components.length == other.components.length) {
            float[] res = new float[this.components.length];
            for (int i = 0; i < this.components.length; i++) {
                res[i] = this.components[i] + other.components[i];
            }
            return new LAVector(res);
        }
        return null;
    }

    public LAVector multNumber(float number) {
        float[] res = new float[this.components.length];
        for (int i = 0; i < this.components.length; i++) {
            res[i] = this.components[i] * number;
        }
        return new LAVector(res);
    }

    public float scalarMult(LAVector other) {
        if (this.components.length == other.components.length) {
            float res = 0;
            for (int i = 0; i < this.components.length; i++) {
                res += this.components[i] * other.components[i];
            }
            return res;
        }
        return 0;
    }

    public float abs() {
        float res = 0;
        for (float component : this.components) {
            res += component * component;
        }
        return (float) Math.sqrt(res);
    }

    public float getComponent(int n) {
        if (this.components.length != 0) {
            for (int i = 0; i < this.components.length; i++) {
                if (i == n) {
                    return this.components[i];
                }
            }
        }
        return 0;
    }

    public int getSize() {
        return this.components.length;
    }

    public String toString() {
        String res = "";
        for (float component : this.components) {
            res += component + " ";
        }
        return res;
    }

    public float[] getComponents() {
        return components;
    }
}
