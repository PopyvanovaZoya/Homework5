package ru.geekbrains.Homework5;

public class Sample01 {
    public static void main(String[] args) {
        Person[] persArr = new Person[5];
        persArr[0] = new Person("Мухин Андрей Борисович", "ГИП", "123@mail.ru", "89028594123", 80000, 30);
        persArr[1] = new Person("Бунин Александр Витальевич", "Генеральный директор", "124@mail.ru", "89115868733", 100000, 40);
        persArr[2] = new Person("Синяк Василий Петрович", "Инженер", "125@mail.ru", "89022345144", 50000, 45);
        persArr[3] = new Person("Пронько Александр Иванович", "Инженер", "126@mail.ru", "89124947634", 40000, 55);
        persArr[4] = new Person("Сытин Мурат Валерьевич", "Техник", "127@mail.ru", "89048234111", 30000, 25);

        for (int i = 0; i < persArr.length; i++) {
            if (persArr[i].age > 40) persArr[i].displayInfo();
        }
    }
}
