class Train {
    private String number;
    private String name;
    private String time;

    public Train(String number, String name, String time) {
        this(number, name); 
        this.time = time;
    }

    public Train(String number, String name) {
        this.number = number;
        this.name = name;
        this.time = "не указано"; 
    }

    public Train() {
        this.number = "не указан";
        this.name = "не указан";
        this.time = "не указано";
    }

    public void receiveTrain() {
        System.out.println("Поезд рейса " + name);
    }

    public String getNumber() {
        return number;
    }

    public void displayInfo() {
        System.out.println("Номер поезда: " + number + ", Название: " + name + ", Время: " + time);
    }
}

public class Main {
    public static void main(String[] args) {
        Train train1 = new Train("001", "Экспресс", "10:00");
        Train train2 = new Train("002", "Скорый", "12:30");
        Train train3 = new Train("003", "Пассажирский");
        
        train1.displayInfo();
        train2.displayInfo();
        train3.displayInfo();

        train1.receiveTrain();
        train2.receiveTrain();
        train3.receiveTrain();
    }
}
