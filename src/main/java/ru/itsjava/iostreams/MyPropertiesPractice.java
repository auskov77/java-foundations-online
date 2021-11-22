package ru.itsjava.iostreams;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class MyPropertiesPractice {

    public static void main(String[] args) throws IOException {
        ClassLoader classLoader = MyPropertiesPractice.class.getClassLoader();
        InputStream inputStream = classLoader.getResourceAsStream("myapp.properties");

        Properties propsFromStream = new Properties();
        propsFromStream.load(inputStream);
        System.out.println("Мое имя = " + propsFromStream.getProperty("myName"));
        System.out.println("Мой никнейм = " + propsFromStream.getProperty("myNickName"));
    }
}

//1. Создать свои настройки app.properties, в которых будут лежать твое имя и никнейм.  - yes
//2. Считать и вывести настройки на экран с помощью getResourceAsStream                 - yes