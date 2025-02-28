class Train {
    private String number;
    private String name;
    private String time;

    // Конструктор с тремя параметрами
    public Train(String number, String name, String time) {
        this(number, name); // Вызов конструктора с двумя параметрами
        this.time = time;
    }

    // Конструктор с двумя параметрами
    public Train(String number, String name) {
        this.number = number;
        this.name = name;
        this.time = "не указано"; // Инициализация по умолчанию
    }

    // Конструктор без параметров
    public Train() {
        this.number = "не указан";
        this.name = "не указан";
        this.time = "не указано"; // Инициализация по умолчанию
    }

    // Метод receiveTrain
    public void receiveTrain() {
        System.out.println("Поезд рейса " + name);
    }

    // Метод getNumber
    public String getNumber() {
        return number;
    }

    // Метод для вывода информации о поезде
    public void displayInfo() {
        System.out.println("Номер поезда: " + number + ", Название: " + name + ", Время: " + time);
    }
}

public class Main {
    public static void main(String[] args) {
        // Создание трех экземпляров класса Train
        Train train1 = new Train("001", "Экспресс", "10:00");
        Train train2 = new Train("002", "Скорый", "12:30");
        Train train3 = new Train("003", "Пассажирский");

        // Вывод значений переменных на консоль
        train1.displayInfo();
        train2.displayInfo();
        train3.displayInfo();

        // Вызов методов для каждого объекта
        train1.receiveTrain();
        train2.receiveTrain();
        train3.receiveTrain();
    }
}