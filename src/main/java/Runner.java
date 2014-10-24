import tr.Matrix;

/**
 * Created by Асылхан on 23.10.2014.
 */
public class Runner {
    public static void main(String[] args) {
        Matrix a = new Matrix(3, 3);
        a.autoFill();
        Matrix b = new Matrix(3, 4);
        b.autoFill();
        Matrix c = a.multiply(b);
        System.out.println(c.getValue());
        System.out.println("Commit");
    }
}