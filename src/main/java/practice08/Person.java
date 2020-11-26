package practice08;

public class Person {
    private int id;
    private String name;
    private int age;

    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }


    public String introduce() {
        return "My name is " + getName() + ". I am " + getAge() + " years old.";
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof Person) {
            return ((Person) object).getId() == this.id;
        }
        return super.equals(object);
    }

}
