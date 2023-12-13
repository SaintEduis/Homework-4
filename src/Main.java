import java.nio.Buffer;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //В некотрых заданиях не указано точно <= или </>= или >, там я делал на своё усмотрение
        Scanner newObject = new Scanner(System.in);

        //exercise 1
        System.out.println("Введите ваш возраст: ");
        int age = newObject.nextInt();

        if (age >= 18)
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний.");
        else
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать.");

        //exercise 2
        System.out.println("Введите температуру: ");
        int temperature = newObject.nextInt();

        if (temperature >= 5)
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки.");
        else
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку.");

        //exercise 3
        System.out.println("Введите скорость: ");
        int speed = newObject.nextInt();

        if (speed > 60)
            System.out.println("Если скорость " + speed + ", то придётся заплатить штраф.");
        else
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно.");

        //exercise 4
        System.out.println("Введите возраст человека: ");
        int secondAge = newObject.nextInt();

        if (2 <= secondAge && secondAge <= 6)
            System.out.println("Если возраст человека равен " + secondAge + ", то ему нужно ходить в детский сад");
        else if (7 <= secondAge && secondAge <= 17)
            System.out.println("Если возраст человека равен " + secondAge + ", то ему нужно ходить в школу");
        else if (18 <= secondAge && secondAge <= 24)
            System.out.println("Если возраст человека равен " + secondAge + ", то ему нужно ходить в университет");
        else if (24 <= secondAge)
            System.out.println("Если возраст человека равен " + secondAge + ", то ему нужно ходить на работу");
        else
            System.out.println("Если возраст человека равен " + secondAge + ", то ему нужно научиться ходить :D");

        //exercise 5
        System.out.println("Введите возраст ребёнка: ");
        int thirdAge = newObject.nextInt();

        if (thirdAge <= 5)
            System.out.println("Если возраст ребёнка равен " + thirdAge + ", то ему нельзя кататься на аттракционе");
        else if (thirdAge <= 14)
            System.out.println("Если возраст ребёнка равен " + thirdAge + ", то ему можно кататься на аттракционе только в сопровождении взрослого");
        else
            System.out.println("Если возраст ребёнка равен " + thirdAge + ", то ему можно кататься на аттракционе без сопровождения взрослого");

        //exercise 6
        System.out.println("Введите сколько сидячих мест занято: ");
        int quantitySeatPlace = newObject.nextInt();
        System.out.println("Введите сколько стоячих мест занято: ");
        int quantityStandPlace = newObject.nextInt();

        if (quantitySeatPlace < 60 && quantityStandPlace < 52)
            System.out.println("В вагоне есть свободные сидячие и стоячие места");
        else if (quantitySeatPlace < 60 && quantityStandPlace >= 52)
            System.out.println("В вагоне есть свободные сидячие места");
        else if (quantitySeatPlace >= 60 && quantityStandPlace < 52)
            System.out.println("В вагоне есть свободные стоячие места");
        else
            System.out.println("В вагоне нет свободных мест");

        //exercise 7
        System.out.println("Введите по очереди три чесла через пробел: ");
        int one = newObject.nextInt(), two = newObject.nextInt(), three = newObject.nextInt();

        if (one >= two && one >= three)
            System.out.println("Наибольшее число: " + one);
        else if (two > one && two >= three)
            System.out.println("Наибольшее число: " + two);
        else
            System.out.println("Наибольшее число: " + three);
    }
}