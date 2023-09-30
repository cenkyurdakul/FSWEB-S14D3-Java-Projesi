package com.workintech.pacificCarCompany.company;

public class GasPoweredCar extends CarSkeleton{
    private double avgKmLitre;
    private int cylinders;

    public GasPoweredCar(String name, String description, double avgKmLitre, int cylinders) {
        super(name, description);
        this.avgKmLitre = avgKmLitre;
        this.cylinders = cylinders;
    }

    public double getAvgKmLitre() {
        return avgKmLitre;
    }

    public void setAvgKmLitre(double avgKmLitre) {
        this.avgKmLitre = avgKmLitre;
    }

    public int getCylinders() {
        return cylinders;
    }

    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }
}
