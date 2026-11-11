package collectionTest;

public class Dog {
    private int id;
    private String name;
    private int age;

    public int getId() {
        return id;
    }

    public Dog(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
