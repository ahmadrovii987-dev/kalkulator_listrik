/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kalkulator_listrik.model;

public class Appliance {
    private String name;
    private double wattage;
    private double hoursPerDay;

    public Appliance(String name, double wattage, double hoursPerDay) {
        this.name = name;
        this.wattage = wattage;
        this.hoursPerDay = hoursPerDay;
    }

    public String getName() { return name; }
    public double getWattage() { return wattage; }
    public double getHoursPerDay() { return hoursPerDay; }

    public double getMonthlyKwh() {
        return ((wattage * hoursPerDay) / 1000.0) * 30.0;
    }

    public double calculateMonthlyCost(double tariffPerKwh) {
        return getMonthlyKwh() * tariffPerKwh;
    }
}