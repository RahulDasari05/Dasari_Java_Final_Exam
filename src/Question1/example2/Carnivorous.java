package Question1.example2;

/**
 *
 * @author S542040
 */
public interface Carnivorous {

    public default void habitat() {
        System.out.println("Carnivorous habitat both on land and in water");
    }
}
