/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question5;

/**
 *
 * @author S542040
 */
public class Circle {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double areaOfCircle() {
        return Math.round((Math.PI * radius * radius)*100)/100.0;
    }

}