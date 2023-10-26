public class Main {
    public static void main(String[] args) {

        System.out.println("Задача №1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("Ф.И.О. сотрудника — " + fullName);

        System.out.println("Задача №2");
        String reportingName = fullName;
        System.out.println("Данные Ф.И.О. сотрудника для заполнения отчета — " + reportingName.toUpperCase());

        System.out.println("Задача №3");
        String newFullName = "Иванов Семён Семёнович";
        newFullName = newFullName.replace("ё", "е");
        System.out.println("Данные Ф. И. О. сотрудника — " + newFullName);
    }
}