package com.workintech.pacificCarCompany.company;

public class CarCompany {
    public static void main(String[] args) {
        CarSkeleton tesla = new ElectricCar("Tesla", "Clean fuel",
                10, 100);
        CarSkeleton toyota = new HybridCar("Toyota", "Nearly clean",
                0.08, 100, 4);
        System.out.println(toyota.drive());
    }
}
