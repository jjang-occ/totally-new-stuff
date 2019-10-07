/**
 * @author justi
 * @version 9/4/2019
 */
package mystuff;
import java.util.Random;

public class TestProgram {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("yay");
        Random r = new Random(10072019);
        for (int i = 0; i < 20; ++i)
        {
            System.out.print(r.nextInt(100) + " ");
        }
        System.out.println();
        // Repeat the same pseudo-random sequence by re-seeding with the same seed
        r.setSeed(10072019);
        for (int i = 0; i < 20; ++i)
        {
            System.out.print(r.nextInt(100) + " ");
        }
        System.out.println();

    }

}
