public class Cat {
    private String name;
    private int age;

    // Конструктор
    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Геттеры и сеттеры
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    @Override
public String toString() {
        return "cat [name=" + name + ", age=" + age + "]";
    }
}