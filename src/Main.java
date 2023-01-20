import Transport.Car;
import Transport.Bus;
import Transport.Transport;


public class Main {
    public static void main(String[] args) {


        Car car [] = new Car [5];

        car [0] = new Car(1.7, "МКП", "sedan", "AA111AA77", 5, "Lada", "Granta", 2017, "Russia", "yellow", 150);
        car [1] = new Car(3.0, "АКП", "sedan", "A222AA77", 4, "Audi", "A8 50 L TDI quattro", 2020, "А222АА77", "black", 315);
        car [2] = new Car(3.0, "АКП", "coupe", "A333A777", 2, "BMW", "Z8", 2021, "A333AA77", "black", 360);
        car [3] = new Car(2.4, "АКП", "jeep", "A444AA77", 4, "KIA", "Sportage 4-го поколения", 2018, "South Korea", "red", 230);
        car [4] = new Car(1.6, "МКП", "sedan", "A555AA77", 5, "Hyundai", "Avante", 2016, "South Korea", "orange", 190);

        for (int i = 0; i < car.length; i++) {
            System.out.println(car[i]);

        }

        Bus bus [] = new Bus[3];

        bus [0] = new Bus("ГАЗ", "03-30", 1946, "СССР", "желтый", 40);
        bus [1] = new Bus("Камаз", "Электробус", 2020, "Россия", "синий", 70);
        bus [2] = new Bus("?", "School bus", 1999, "USA", "yellow", 50);

        for (int i = 0; i < bus.length; i++) {
            System.out.println(bus[i]);
        }
    }
}

