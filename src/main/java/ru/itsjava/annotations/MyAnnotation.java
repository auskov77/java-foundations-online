package ru.itsjava.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME) // какое у нее время жизни. Чтобы мы смогли считать эту аннотацию через Retention
@Target(ElementType.TYPE) // где она будет действовать
public @interface MyAnnotation {
    // будем передавать какое-нибудь сообщение и флаг
    String message();
    boolean flag();

}
