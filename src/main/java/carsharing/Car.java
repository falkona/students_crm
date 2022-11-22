package carsharing;

import java.util.ArrayList;

public class Car {

    private String Model;
    private String number;
    private Integer year;
    private ArrayList<Driver> drivers;

    public Car(String model, String number, Integer year) {
        this.Model = model;
        this.number = number;
        this.year = year;
        this.drivers = new ArrayList<>();
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public void addDriver(Driver driver) {
        this.drivers.add(driver);
    }

    public ArrayList<Driver> getDrivers() {
        return this.drivers;
    }

    @Override
    public String toString() {
        return Model + ", " + number + ", " + year + ", водителей: " + getDriversCount();
    }

    public int getDriversCount() {
        return this.drivers.size();
    }
}
