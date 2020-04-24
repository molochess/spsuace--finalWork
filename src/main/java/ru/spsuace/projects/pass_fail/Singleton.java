package ru.spsuace.projects.pass_fail;


/**
 * Надо реализовать ленивый синглтон. Важно, что бы объект можно было получить только через метод getInstance()
 * Так же важно, чтобы объект был создан только один раз и метод getInstance() всегда возвращал один и тот же объект.
 *
 * getInstance может вызываться из многих потоков одновременно.
 *
 * НЕЛЬЗЯ ИСПОЛЬЗОВАТЬ AtomicReference
 */
public class Singleton {

    public static Singleton getInstance() {
        return null;
    }
}
