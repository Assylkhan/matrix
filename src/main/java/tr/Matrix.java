package tr;

import java.util.Random;

/**
 * Created by Асылхан on 23.10.2014.
 */
public class Matrix {
    private int[][] value;

    public Matrix(int rowCount, int colCount){
        value = new int[rowCount][colCount];
    }

    public void autoFill(){
        for (int i = 0; i < getColumnCount(); i++) {
            for (int j = 0; j < getRowCount(); j++) {
                value[i][j] = new Random().nextInt(100);
            }
        }
    }

    public int[][] getValue(){
        return value;
    }

    public void Print(){
        for (int i = 0; i < getColumnCount(); i++) {
            for (int j = 0; j < getRowCount(); j++) {
                System.out.print(value[i][j] + "");
            }
            System.out.println();
        }
    }

    public Matrix multiply(Matrix array){
        Matrix result = new Matrix(getColumnCount(), array.getRowCount());
        for (int i = 0; i < getColumnCount(); i++) {
            for (int j = 0; j < getRowCount(); j++) {
                for (int k = 0; k < getRowCount(); k++) {
                    result.value[i][k] = value[i][j] + array.value[j][k];
                }
            }
        }
        return result;
    }

    public int getRowCount(){
        return value[0].length;
    }
    public int getColumnCount(){
        return value.length;
    }
}