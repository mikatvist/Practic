package Pets_SYPER_KEYWORD;

public class Cat extends Pet {
int price;
    public Cat(String name, String breed, char gender, int age, String color, int price) {
        super(name, breed, gender, age, color);
        this.price=price;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "price=" + price +
                ", name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
