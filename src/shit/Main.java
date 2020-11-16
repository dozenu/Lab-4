package shit;

public class Main {
    public static void main(String[] args) {
        Worker turner1 = new Turner ("Валерий", "Жмышенко", "Альбертович", "Мужской", "Вчера", 7, 100, 3, 1, 5);
        Worker locksmith1 = new Locksmith ("Нариман", "Намазов", "Абу", "Мужской", "1980", 20, 2, 4, 3, "Дерево");
        HeadOfWorkshop headOfWorkshop1 = new HeadOfWorkshop ("Владимир", "Братишкин", "Шеф", "Мужской", "1998", 6, 20000, "Стрим хата", 89);
        Director director1 = new Director ("Максим", "Козлов", "Евгеньевич", "Мужской", "1990", 10, 10000, 1994);
        turner1.print();
        turner1.Taxes();
        locksmith1.print();
        locksmith1.Taxes();
        headOfWorkshop1.print();
        headOfWorkshop1.Taxes();
        director1.print();
        director1.Taxes();
    }
}
