/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question3;

/**
 *
 * @author S542040
 */
public class Course {

    private String name;
    private int courses;

    public Course(String name, int courses) {
        this.name = name;
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "Course{" + "name=" + name + ", courses=" + courses + '}';
    }

}
