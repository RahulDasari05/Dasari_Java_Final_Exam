/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question2;

/**
 *
 * @author S542040
 */
public class GeometricDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Question 2 by Rahul Dasari");
        GeometricObject[] array = new GeometricObject[5];
        GeometricObject geo1 = new Square(true, 3.5);
        GeometricObject geo2 = new Square(false, 4.0);
        GeometricObject geo3 = new Square(true, 2.5);
        GeometricObject geo4 = new Square(false, 5.5);
        GeometricObject geo5 = new Square(true, 2.3);
        array[0] = geo1;
        array[1] = geo2;
        array[2] = geo3;
        array[3] = geo4;
        array[4] = geo5;
        System.out.println("***********************************");
        System.out.println("***********************************");
        for (GeometricObject obj : array) {
            Square square = (Square) (obj);
            if (square.isColorable()) {
                square.howToColor();
            } else {
                System.out.println("Square is not coloured");

            }
            System.out.println("Area of square is "+ Math.round(square.calculateArea() * 100) / 100.0);
            System.out.println("***********************************");
            System.out.println("***********************************");
        }

    }

}