package ru.itsjava.interfaces;

public class InterfacesPractice {
    public static void main(String[] args) {
//        Gin khottabith = new Gin();// обычная запись, чаще всего реализация такая
        Creatable khottabith = new Gin();// есть полиморфизм, благодаря позднему связываю подтянется именно нужная реализация

        khottabith.createWish(); //

//        ссылка у нас типа интерфейса Creatable, а реализация это конкретный класс, который реализует этот интерфейс new Gin() реализуется с помощью ключевого слова implements

        Creatable badGin = new BadGin(); // создали по ссылке Creatable, но реализация BadGin()
        badGin.createWish(); //

        khottabith.canYouCreateWish();
        badGin.canYouCreateWish();
    }
}
