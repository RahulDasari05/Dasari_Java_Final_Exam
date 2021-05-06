/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question11;

import java.util.Objects;

/**
 *
 * @author S542040
 */
public class Vehicle {
    
    private int sales;
    private String vehiclename;

    public Vehicle(int sales, String vehiclename) {
        this.sales = sales;
        this.vehiclename = vehiclename;
    }

    public int getSales() {
        return sales;
    }

    public void setSales(int sales) {
        this.sales = sales;
    }

    public String getVehiclename() {
        return vehiclename;
    }

    public void setVehiclename(String vehiclename) {
        this.vehiclename = vehiclename;
    }

    @Override
    public String toString() {
        return "Vehicle{" + "sales = " +sales + ", vehiclename = " + vehiclename + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 47 * hash + Objects.hashCode(this.vehiclename);
        return hash;

    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Vehicle other = (Vehicle) obj;
        return Objects.equals(this.vehiclename, other.vehiclename);
    }
    

    
    
    
    
}
