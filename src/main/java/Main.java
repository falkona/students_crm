import carsharing.Car;
import carsharing.Driver;
import postoffice.Client;
import sportsmen.Sportsman;
import students.Bachelor;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main (String[] args) {
    //"Задача 5.8");
    /* Дано натуральное число. Определить
    1. Количество цифр 3 в нем
    2. Сколько раз в нем встречается последняя цифра
    3. Количество четных цифр в нем
    4. Сумму его цифр, больших пяти
    5. Произведение его цифр, больших семи
    6. Сколько раз в нем встречаются цифры 0 и 5 (всего)*/

        int number = 12;
        String numberString = Integer.toString(number); // "123456"
        int[] numberArray = new int[numberString.length()];
        for (int i = 0; i < numberString.length(); i++) {
            numberArray[i] = Character.getNumericValue(numberString.charAt(i));
        }

        //1. Количество цифр 3 в нем
        int countOf3 = 0;
        for (int j = 0; j < numberArray.length; j++) {
            if (numberArray[j] == 3) {
                countOf3++;
            }
        }
        System.out.println(countOf3);

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

    public static void workWithScanner() {
        Scanner sc = new Scanner(System.in);
        int n = 2;
        int sum = 0;
        int a = sc.nextInt();
        int b = sc.nextInt();

        for(int i = a; i <= b; i++) {
            System.out.print(a + " ");
            System.out.println("===============");
            System.out.println("i = " + i);
            System.out.println("Сумма до вычисления = " + sum);
            sum = sum + i;
            System.out.println("Сумма после вычисления = " + sum);
        }

        System.out.println(sum);


        System.out.println("sum = " + sum);

    }

}

