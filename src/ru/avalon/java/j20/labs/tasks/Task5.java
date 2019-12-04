package ru.avalon.java.j20.labs.tasks;

import ru.avalon.java.j20.labs.Task;

import java.io.IOException;
import java.util.Locale;
import java.util.Map;
import java.util.ResourceBundle;

/**
 * Задание №5
 *
 * <p>Тема: "Потоковый ввод-вывод. Чтение локализованных ресурсов".
 */
public class Task5 implements Task {

    /**
     * {@inheritDoc}
     */
    @Override
    public void run() throws IOException {
        Locale defLocale = new Locale("en");
        Locale.setDefault(defLocale); // устанавливаем локализацию по умолчанию
        ResourceBundle rb = read("resources.strings.titles"); // получаем ресурс с локализацией по умолчанию
        String menuEdit = rb.getString("menu.edit"); // получаем свойство ресурса в виде строки
        System.out.println("Пункт меню в локализации по умолчанию: " + menuEdit); 
        System.out.println("name = " + rb.getBaseBundleName()); // получаем имя считанного ресурса
        Locale locale = new Locale("fr"); // создаем локализацию
        ResourceBundle rbf = read("resources.strings.titles", locale); // получаем ресурс с указанием локализации
        String menuEditF = rbf.getString("menu.edit"); // Получаем свойство ресурса в виде строки
        System.out.println("Пункт меню в выбранной локализации: " + menuEditF);
        
        // Получить системные переменные окружения:
//        Map<String, String> env = System.getenv();
//        for (Map.Entry<String, String> me : env.entrySet()) {
//            System.out.println(me.getKey() + " = " + me.getValue());
//        }
        /*
         * TODO(Студент): Выполнить задание №5
         *
         * 1. Реализовать метод read.
         *
         * 2. Прочитать ресурсы с использованием локализации по умолчанию.
         *
         * 3. Прочитать ресурсы с использованием локализации, отличной от той,
         *    которая задана по умолчанию.
         *
         * 4. С использованием отладчика сравнить полученные ресурсы и
         *    проверить корректность работы программы.
         */
    }

    /**
     * Выполняет чтение локализованных ресурсов с использованием
     * локализации по умолчанию.
     *
     * @param path путь к файлу ресурсов
     * @return новый экземпляр типа {@link ResourceBundle}
     */
    private ResourceBundle read(String path) {
        return ResourceBundle.getBundle(path);
    }

    /**
     * Выполняет чтение локализованных ресурсов.
     *
     * @param path путь к файлу ресурсов
     * @return новый экземпляр типа {@link ResourceBundle}
     */
    private ResourceBundle read(String path, Locale locale) {
        return ResourceBundle.getBundle(path, locale);
    }
}
