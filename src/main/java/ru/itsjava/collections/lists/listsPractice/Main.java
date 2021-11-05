package ru.itsjava.collections.lists.listsPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Book> bookList_1 = new ArrayList<>();                  // Создать пустой список книг
        List<Book> bookList_2 = new ArrayList<>(20);    // Создать список размером 20

        Book book_1 = new Book("Pohititel tenei", "Mark Levi", 288);
        Book book_2 = new Book("Vino is oduvanchikov", "Ray Bredbery", 384);
        Book book_3 = new Book("Veronika reshaet umeret'", "Paulo Koelyo", 185);
        Book book_4 = new Book("Knigny vor", "Markus Zusak", 608);
        Book book_5 = new Book("1984", "Georg Oruel", 700);
        Book book_6 = new Book("Egevichnaya zima", "Sara Gio", 384);
        Book book_7 = new Book("Chuvstvo i chuvstvitelnost'", "Jane Ostin", 165);
        Book book_8 = new Book("Nad propast'u vo rgi", "Jerom Selinger", 272);
        Book book_9 = new Book("Chelovek v kartinkah", "Ray Bredbery", 420);
        Book book_10 = new Book("Grozovoi pereval", "Emilia Bronte", 384);
        Book book_11 = new Book("Nad propast'u vo rgi", "Jerom Selinger", 272);
        Book book_12 = new Book("Gordost' i predubegdenie", "Jane Ostin", 480);
        Book book_13 = new Book("Tri tovarischa", "Erikh Mariya Remark", 480);
        Book book_14 = new Book("Otvergennye", "Viktor Gugo", 1248);
        Book book_15 = new Book("Hroniki Narnii", "Clive Lewis", 882);
        Book book_16 = new Book("Voina i mir", "Lev Tolstoi", 1696);
        Book book_17 = new Book("Lolita", "Vladimir Nabokov", 211);
        Book book_18 = new Book("Oblomov", "Ivan Goncharov", 560);
        Book book_19 = new Book("Otzy i deti", "Ivan Turgenev", 416);
        Book book_20 = new Book("Jane Air", "Charlotte Bronte", 446);

        bookList_1.add(book_1);
        bookList_1.add(book_2);
        bookList_1.add(book_3);
        bookList_1.add(book_4);
        bookList_1.add(book_5);
        bookList_1.add(book_6);
        bookList_1.add(book_7);
        bookList_1.add(book_8);
        bookList_1.add(book_9);
        bookList_1.add(book_10);
        bookList_1.add(book_11);
        bookList_1.add(book_12);
        bookList_1.add(book_13);
        bookList_1.add(book_14);
        bookList_1.add(book_15);
        bookList_1.add(book_16);
        bookList_1.add(book_17);
        bookList_1.add(book_18);
        bookList_1.add(book_19);
        bookList_1.add(book_20);
        for (Book elemBook : bookList_1) {
            System.out.println(elemBook + " ");
        }
        System.out.println();

        System.out.println("Первая книга в списке = " + bookList_1.get(0)); // Получить первый элемент (первую книгу в списке)
        System.out.println("Последняя книга в списке = " + bookList_1.get(bookList_1.size() - 1)); // Получить последний элемент (последнюю книгу в списке)

        bookList_2.add(book_1); // Добавить подряд 5 элементов.
        bookList_2.add(book_2); // Добавить подряд 5 элементов.
        bookList_2.add(book_3); // Добавить подряд 5 элементов.
        bookList_2.add(book_4); // Добавить подряд 5 элементов.
        bookList_2.add(book_5); // Добавить подряд 5 элементов.
        for (Book elemBook : bookList_2) {
            System.out.println(elemBook + " ");
        }
        System.out.println();

        bookList_2.add(2, book_6); // Добавить шестой элемент в третию позицию
        bookList_2.add(0, book_7); // Добавить седьмой элемент в первую позицию
        for (Book elemBook : bookList_2) {
            System.out.println(elemBook + " ");
        }
        System.out.println();

        List<Book> bookList_3 = new ArrayList<>();
        bookList_3.addAll(0, bookList_2); // Записать в новый список все элементы предыдущего списка
        for (Book elemBook : bookList_3) {
            System.out.println(elemBook + " ");
        }
        System.out.println();

        bookList_3.remove(book_2); // Удалить элемент по значению (книге)
        bookList_3.remove(2); // Удалить элемент по индексу
        for (Book elemBook : bookList_3) {
            System.out.println(elemBook + " ");
        }
        System.out.println();

        System.out.println("Наличие book_7 в списке = " + bookList_3.contains(book_7)); // Проверить наличие элемента

        // Вывести список на экран в формате: List: [ Book{"7 навыков высокоэффективных людей", "Кови", 387};Book{"Java. Эффективное программирование", "Блох Дж.", 219};]
        System.out.print("List: [");
        for (Book book : bookList_3) {
            System.out.print("Book{\"" + book.getName() + "\", \"" + book.getAuthor() + "\", " + book.getNumberPages() + "};");
        }
        System.out.print("]");
        System.out.println();

        Book book_21 = new Book("Java. Biblioteka professionala", "Garry Cornell", 680);
        Book book_22 = new Book("Programmirovanie na Java ...", "Yakov Fine", 450);
        Book book_23 = new Book("Java 8 Polnoe rukovodstvo", "Gerbert Shildt", 515);
        Book book_24 = new Book("Filosofiya Java", "Bruce Eckel", 900);

        bookList_3.add(4, book_21); // Теперь надо хаотично в список добавить 4 книги с названием "Java"
        bookList_3.add(2, book_22); // Теперь надо хаотично в список добавить 4 книги с названием "Java"
        bookList_3.add(0, book_23); // Теперь надо хаотично в список добавить 4 книги с названием "Java"
        bookList_3.add(3, book_24); // Теперь надо хаотично в список добавить 4 книги с названием "Java"

        System.out.println("Список книг с добавленными книгами по Java: ");
        for (Book elemBook : bookList_3) {
            System.out.println(elemBook + " ");
        }
        System.out.println();

        // Отфильтровать список вернуть записи по некоторому условию
        // Условие на индекс: Индекс делится на 3
        System.out.println("Сортировка списка по условию - Индекс делится на 3: ");
        for (int i = 0; i < bookList_3.size(); i++) {
            if (((i % 3) == 0) && i != 0) {
                System.out.println(bookList_3.get(i) + " ");
            }
        }
        System.out.println();

        // Условие на значение: Вернуть количество книг, которые равны "Java"
        System.out.println("Сортировка списка по условию - Вернуть количество книг, которые равны \"Java\": ");
        for (Book book : bookList_3) {
            if (book.getName().contains("Java")) {
                System.out.println(book + " ");
            }
        }
        System.out.println();

        // Пропустить первые 3 книги в списке
        System.out.println("Пропустить первые 3 книги в списке: ");
        for (int i = 0; i < bookList_3.size(); i++) {
            if (i > 2) {
                System.out.println(bookList_3.get(i) + " ");
            }
        }
        System.out.println();

        // Пропустить первые 2 книги, которые равные "Java"
        System.out.println("Пропустить первые 2 книги, которые равные \"Java\" в списке: ");
        int bookCount = 0;
        for (Book book : bookList_3) {
            if ((bookCount < 2) && book.getName().contains("Java")) {
                bookCount++;
            } else
                System.out.println(book + " ");
        }
        System.out.println();

        // Возвращаем первую книгу, длина автора которого делится на 3
        System.out.println("Возвращаем первую книгу, длина автора которого делится на 3");
        for (Book book : bookList_3) {
            if (book.getAuthor().length() % 3 == 0) {
                System.out.println(book + " ");
                break;
            }
        }
        System.out.println();

        // Возвращаем все книги, длина автора которых делится на 3
        System.out.println("Возвращаем все книги, длина автора которых делится на 3");
        for (Book book : bookList_3) {
            if (book.getAuthor().length() % 3 == 0) {
                System.out.println(book + " ");
            }
        }
        System.out.println();

        Person petr = new Person("Petr", 72, "man");
        Person alex = new Person("Alex", 50, "man");
        Person ilya = new Person("Ilya", 18, "man");
        Person nik = new Person("Nikolai", 22, "man");
        Person galina = new Person("Galina", 70, "woman");
        Person elena = new Person("Elena", 61, "woman");
        Person nata = new Person("Nata", 19, "woman");

        List<Person> personList = new ArrayList<>(Arrays.asList(petr, alex, ilya, nik, galina, elena, nata));

//        Вернуть всех военнообязанных мужчин (пол), которым меньше 27 и
//        больше 18 и имя которых начинается на 'Н'
        System.out.println("Вернуть всех военнообязанных мужчин (пол), которым меньше 27 и больше 18 и " +
                "имя которых начинается на 'Н'");
        for (Person person : personList) {
            if ((person.getAge() <= 27) && (person.getAge() >= 18) &&
                    (!person.getIsMale().contains("woman")) && (person.getName().contains("N"))) {
                System.out.println(person + " ");
            }
        }
        System.out.println();

        // Найти средний возраст всех женщин
        System.out.println("Найти средний возраст всех женщин");
        int personCountAge = 0;
        int personCount = 0;
        for (Person person : personList) {
            if ((person.getIsMale().contains("woman"))) {
                personCountAge = personCountAge + person.getAge();
                personCount++;
            }
        }
        System.out.println((personCountAge/personCount));
        System.out.println();

    }
}
