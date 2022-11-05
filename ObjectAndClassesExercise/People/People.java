package OrderbyAge;

public class People {
    private String name;
    private  String ID;
    private int age;

    public People(String name, String ID, int age) {
        this.name = name;
        this.ID = ID;
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    @Override
    public String toString() {
        return String.format("%s with ID: %s is %d years old.",name,ID,age);
    }
}
