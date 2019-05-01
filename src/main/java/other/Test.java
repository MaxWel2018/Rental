package other;

import other.goods.Car;
import other.goods.Goods;
import other.goods.House;
import other.goods.Moto;

import static other.goods.Car.kindsCars.*;
import static other.goods.House.kindHouses.*;
import static other.goods.Moto.kindMoto.*;

public class Test {
    public static void main(String[] args) {
        Rental rental = new Rental();
        Customer customer1 = new Customer("Max");

        Goods home1 = new House(ONE_BEDROOM, "Washington Ave", 20055.6);
        Goods home2 = new House(TWO_BEDROOM, "South Arizona dr", 25125.6);
        Goods home3 = new House(TWO_BEDROOM, "East Idaho pl", 24555.6);
        Goods home4 = new House(SMART_HOUSE, "Elkhart way", 21005.6);

        Goods moto1 = new Moto(Moto.kindMoto.BMW, "I323", 5000.2);
        Goods moto2 = new Moto(SUZUKI, "G2P3", 4087.2);

        Goods Car1 = new Car(Car.kindsCars.BMW, "I8", 8596.2);
        Goods Car2 = new Car(AUDI, "I8", 8596.2);

        rental.rentPrice(home1, 5);
        rental.getADiscount("affafa");
        customer1.setDueForRent(rental.getPrice());
        System.out.printf("%2.2f",customer1.getDueForRent());

    }
}
