public class Tiger implements Animal, Carnivorous {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

    }

    @Override
    public int getNoOfLegs() {
        return 4;
    }

    @Override
    public void habitat() {
        Carnivorous.super.habitat();
        System.out.println("Tiger habitat on land");
    }

}
