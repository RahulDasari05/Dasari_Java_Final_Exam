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
public  class GeometricObject implements Colorable{
    private double side;
    private boolean color=true;
    public GeometricObject(double side) {
        this.side = side;
    }
   public double calculateArea(){
        return side*side;
    }
    @Override
    public void howToColor() {
        
        System.out.println("Color all four sides"); 
    }
    
    
}