import tr.Matrix;

import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        Matrix a = new Matrix(3, 3);
        a.autoFill();
        Matrix b = new Matrix(3, 4);
        b.autoFill();
        System.out.println(Arrays.deepToString(a.multiply(b)));
    }
}