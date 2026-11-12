package stream;

public class Customer {
    private String name;
    private int age;
    private int price;

    public Customer(String name, int age, int price) {
        this.name = name;
        this.price = price;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "이름 : " + name + ", 나이 : " + age + ",  비용 : " + price;
    }
    }

