import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        System.out.println(" Задача 1 ");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + ' ' + firstName + ' ' + middleName;

        System.out.println("ФИО сотрудника " + fullName);
        System.out.println();


        System.out.println(" Задача 2 ");
        System.out.println("Данные ФИО сотрудника для заполнения отчета " + fullName.toUpperCase());

        System.out.println();


        System.out.println( " Задача 3 ");
                firstName = "Семён";
                 middleName = "Семёнович";
                 lastName = "Иванов";
         fullName = lastName + ' ' + firstName+ ' ' + middleName;

        fullName = fullName.replace('ё', 'е');
        System.out.println( " Данные ФИО сотрудника  " +  fullName);

                }}











