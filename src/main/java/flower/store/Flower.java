package ua.edu.ucu.apps.flowers;

import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class Flower {
    private double sepalLength;
    private FlowerColor color;
    private double price;
    private FlowerType flowerType;

    public String getColor() {
        return color.toString();
    }

    public double getPrice() {
        return price;
    }

    public Flower(Flower flower) {
        flowerType = flower.flowerType;
        color = flower.color;
        price = flower.price;
        sepalLength = flower.sepalLength;
    }
}
