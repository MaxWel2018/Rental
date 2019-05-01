package other;

import other.goods.Car;
import other.goods.Goods;
import other.goods.House;
import other.goods.Moto;

import static other.goods.Car.kindsCars.*;
import static other.goods.Car.kindsCars.HONDA;
import static other.goods.House.kindHouses.ONE_BEDROOM;
import static other.goods.House.kindHouses.SMART_HOUSE;
import static other.goods.House.kindHouses.TWO_BEDROOM;
import static other.goods.Moto.kindMoto.*;

class Rental {
    double price;



    public void rentPrice(Goods goods, int days) {
        double result;
        result = days * goods.getBasePrice();
        if (goods instanceof House) {

            if (goods.getKind().equals(ONE_BEDROOM)) {
                result *= 1.2;
            } else if (goods.getKind().equals(TWO_BEDROOM)) {
                result *= 2;
            } else if (goods.getKind().equals(SMART_HOUSE)) {
                result *= 1.5;
            }

        }
        if (goods instanceof Car) {
            if (goods.getKind().equals(Car.kindsCars.BMW)) {
                result *= 2.3;
            } else if (goods.getKind().equals(AUDI)) {
                result *= 2.1;
            } else if (goods.getKind().equals(MERSEDES)) {
                result *= 2.2;
            } else if (goods.getKind().equals(WOLKSVAGEN)) {
                result *= 2.0;
            } else if (goods.getKind().equals(PORSHE)) {
                result *= 2.5;
            } else if (goods.getKind().equals(HONDA)) {
                result *= 1.9;
            }
        }
        if (goods instanceof Moto) {

            if (goods.getKind().equals(SUZUKI)) {
                result *= 2.3;
            } else if (goods.getKind().equals(Moto.kindMoto.BMW)) {
                result *= 2.1;
            } else if (goods.getKind().equals(KAWASAKI)) {
                result *= 2.2;
            } else if (goods.getKind().equals(YAMAHA)) {
                result *= 2.0;
            } else if (goods.getKind().equals(HARLEY_DAVIDSON)) {
                result *= 2.5;
            }
        }
        price = result;
    }

    public void getADiscount(String promokod) {
        if (promokod.equals("Abra-Kadabra")) {
            price -= price * 0.1;
            System.out.println("Вы получили 10% Cкидку");
        }else {
            System.out.println("Увы вы ввели неправильный промокод!");
        }

    }
    public double getPrice() {
        return price;
    }
}
