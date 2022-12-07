import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        //Задача 1
        System.out.println("Задача 1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника — " + fullName);

        //Задача 2
        System.out.println("\nЗадача 2");
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName.toUpperCase());

        //Задача 3
        System.out.println("\nЗадача 3");
        firstName = "Семён";
        middleName = "Семёнович";
        lastName = "Иванов";
        fullName = lastName + " " + firstName + " " + middleName;
        if (fullName.contains("ё")) {
            fullName = fullName.replace("ё","e");
        }
        System.out.println("Данные ФИО сотрудника — " + fullName);
    }
}