/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicletester;

import javax.swing.*;

public class VehicleTester{
  public static void main(String[] args) {
    String passengers = JOptionPane.showInputDialog("How many passengers");
    String fuelPrice = JOptionPane.showInputDialog("What is the price of gas today in $/L?");
    int p = Integer.parseInt(passengers);
    double fP = Double.parseDouble(fuelPrice);
    Vehicle car1 = new Vehicle(7.5, 60.0, 60.0, 0.0, 5.75, p, fP);
    //Show Vehicle Info
    System.out.println(car1);

    //Drive car for 100km
    car1.driveVehicle(100.0);
    System.out.println(car1);

    //Drive car for 450 kms
    car1.driveVehicle(450.0);
    System.out.println(car1);

    //Try to drive 1000 km - runs out of gas
    car1.driveVehicle(1000.0);
    System.out.println(car1);

    //Add 25L of gas
    car1.addFuel(25.0);
    System.out.println(car1);

    //Try to add 100 L of gas
    car1.addFuel(100.0);
    System.out.println(car1);
   
    System.out.println( "Revenue = $" + car1.getRevenue());
    System.out.println("Cost = $" + car1.getCost());
    System.out.println("Profit = $" + car1.getProfit());
  }
}