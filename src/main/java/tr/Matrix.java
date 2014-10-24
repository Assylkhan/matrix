package tr;

import java.util.Random;

public class Matrix {
    private int[][] value;

    public Matrix(int rowCount, int colCount){
        value = new int[rowCount][colCount];
    }

    public void autoFill(){
        for (int i = 0; i < getRowCount(); i++) {
            for (int j = 0; j < getColumnCount(); j++) {
                value[i][j] = new Random().nextInt(10);
            }
        }
    }

    public int[][] getValue(){
        return value;
    }

    public int[][] multiply(Matrix array){
        int[][] result = new int[getRowCount()][array.getColumnCount()];
        for (int i = 0; i < getRowCount(); i++) {
            for (int j = 0; j < array.getColumnCount(); j++) {
                for (int k = 0; k < getColumnCount(); k++) {
                    result[i][j] += value[i][k] * array.value[k][j];
                }
            }
        }
        return result;
    }

    public int getRowCount(){
        return value.length;
    }
    public int getColumnCount(){
        return value[0].length;
    }
}