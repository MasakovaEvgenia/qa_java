package com.example;
import java.util.List;

public class Lion {
    private Feline feline; // объявила приватное поле feline типа Feline ( Feline - семейство кошачьих)
    private boolean hasMane; // объявила приватное поле есть ли грива (mane - грива как я поняла)

    public Lion(Feline feline, String sex) throws Exception { // Инъекция зависимостей происходит в конструкторе, объявила публичный конструктор класса Lion, который принимает объект feline типа Feline и строку sex - пол
        this.feline = feline;
        if ("Самец".equals(sex)){ // Если самец, устанавливаем hasMane в true (грива есть)
            hasMane = true;
        } else if ("Самка".equals(sex)) { // Если самка - гривы нет, будет false
            hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - самец или самка"); // если пол неопределен, то покажи сообщение
        }
    }

    public int getKittens() { // метод возвращает количество котят у семейства кошачьих
        return feline.getKittens();
    }

    public boolean doesHaveMane() { // метод возвращает наличие гривы у кошки
        return hasMane;
    }

    public List<String> getFood() throws Exception { //  публичный метод , который возвращает список типа String (вызов метода eatMeat у объекта feline) и может выбросить исключение
        return feline.getFood("Хищник");
    }
}
