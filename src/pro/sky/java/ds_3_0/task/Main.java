package pro.sky.java.ds_3_0.task;

public class Main {
    public static void main(String[] args) {
        task12();
        task3();
    }

    public static void task12() {
        System.out.println("Задание 1 *********************************************************************");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника - " + fullName);

        System.out.println("\nЗадание 2 *********************************************************************");
        String upperFullName = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета - " + upperFullName);
    }

    public static void task3() {
        System.out.println("\nЗадание 3 *********************************************************************");
        String fullName = "Иванов Семён Семёнович";
        String fullName2 = fullName.replace('ё', 'е');
        System.out.println("Оригинал - " + fullName);
        System.out.println("Данные ФИО сотрудника - " + fullName2);

        System.out.println("\n2 способ - из подсказки, с использованием split() и replace()");
        String[] words = fullName.split(""); //words = {"И", "в", ...}
        System.out.print("Данные ФИО сотрудника - ");
        for (String word : words) {
            if (word.contains("ё")) {
                word = "е";
            }
            System.out.print(word);
        }

        System.out.println("\n\n" + "3 способ - с использованием массива char");
        char[] chr = fullName.toCharArray(); //c = {'И', 'в', ...}
        System.out.print("Данные ФИО сотрудника - ");
        for (int i = 0; i < chr.length; i++) {
            if (chr[i] == 'ё') {
                chr[i] = 'е';
            }
            System.out.print(chr[i]);
        }
        System.out.print("\nДанные ФИО сотрудника - ");
        System.out.println(chr); //можно так вывести содержание массива типа char (в скобках ничего кроме chr добавить нельзя)
    }
}
