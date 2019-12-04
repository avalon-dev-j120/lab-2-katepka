package ru.avalon.java.j20.labs.models;

import java.text.ParseException;

/**
 * Модель представления о стране.
 */
public class Country {
    /**
     * Код страны.
     */
    private final String code;
    /**
     * Название страны.
     */
    private final String name;

    /**
     * Основное конструктор класса.
     *
     * @param code код страны
     * @param name название страны
     */
    public Country(String code, String name) {
        this.code = code;
        this.name = name;
    }

    /**
     * Возвращает код страны.
     *
     * @return строковый код страны
     */
    public String getCode() {
        return code;
    }

    /**
     * Возвращает название страны.
     *
     * @return название страны
     */
    public String getName() {
        return name;
    }

    /*
     * TODO(Студент): для класса Country переопределить методы equals и hashCode
     */

    /**
     * Возвращает экземпляр страны созданный из переданного
     * текста в формате 'Код:Название'.
     *
     * @param text тектс в формате 'Код:Название'
     * @return новый экземпляр типа {@Link Country}.
     * @throws ParseException в случае, если переданная строка
     * имеет неверный формат.
     */
    public static Country valueOf(String text) throws ParseException {
        /*
         * TODO(Студент): Реализовать метод valueOf класса Country
         * TODO: Пофиксить баг с пропадающей 249 строкой в countries.txt ???
         */
        String ek[] = text.split("[:=]");
        if (ek.length > 1) {
            return new Country(ek[0], ek[1]);
        }
        int fspace = text.indexOf(" ");
        if (fspace != -1) {
            return new Country(text.substring(0, fspace), text.substring(fspace + 1));
        }
        throw new ParseException("Unrecognized country", 1);
    }
}
