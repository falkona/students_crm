import carsharing.Car;
import carsharing.Driver;
import postoffice.Client;
import students.Bachelor;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main (String[] args) {
        //workWithStudents();
        //workWithCars();
        workWithPostOffice();
    }

    public static void workWithStudents() {
        Bachelor daria = new Bachelor();
        daria.setFullName("Нос Дарья Дмитриевна");
        daria.setDirectionPrefix("ПМИ");
        daria.setDateOfBirth(666844081);
        daria.setEnrollDate(1598927281);

        System.out.println(daria.getGroup());
        System.out.println(daria.getFullName());
    }

    public static void workWithCars() {
        Car toyota = new Car("Toyota", "a111aa34", 2020);
        Car mercedes = new Car("Mercedes", "c111cc34", 2016);
        Car lada = new Car("Lada", "e111ee34", 2012);

        Driver daria = new Driver("Нос Дарья", "123123");
        Driver julia = new Driver("Иванова Юлия", "456456");

        toyota.addDriver(daria);
        mercedes.addDriver(daria);
        mercedes.addDriver(julia);

        ArrayList<Car> carsList = new ArrayList<>();
        carsList.add(toyota);
        carsList.add(mercedes);
        carsList.add(lada);

        Comparator<Car> yearComparator = Comparator.comparing(Car::getYear).reversed();
        Comparator<Car> numberComparator = Comparator.comparing(Car::getNumber).reversed();
        Comparator<Car> ratingComparator = Comparator.comparing(Car::getDriversCount).reversed();
        carsList.sort(ratingComparator);
        for (Car car : carsList) {
            System.out.println(car);
        }
        // показать работу с выводом объекта в строку, сортировку
    }

    public static void workWithPostOffice() {
        ArrayDeque<Client> clients = new ArrayDeque<>();
        Client a1 = new Client("a1");
        Client b2 = new Client("b2");
        Client c3 = new Client("c3");

        clients.add(a1);
        //clients.add(b2);
        clients.add(c3);

        // показать методы push, pop, peek
        clients.push(b2);
        System.out.println("***************");
        for (Client client : clients) {
            System.out.println(client);
        }
    }

}

