package practice09;


import java.util.LinkedList;
import java.util.stream.Collectors;

public class Teacher extends Person {
    private Klass klass;
    private LinkedList<Klass> klasses;

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public Teacher(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
        this.klasses = null;
    }

    public Teacher(int id, String name, int age, LinkedList<Klass> klasses) {
        super(id, name, age);
        this.klass = null;
        this.klasses = klasses;
    }

    public Klass getKlass() {
        return klass;
    }

    public LinkedList<Klass> getClasses() {
        return klasses;
    }

    public Boolean isTeaching(Student student) {
        return (student.getKlass() == this.klass || (klasses.stream().anyMatch(i -> i == student.getKlass())));
    }

    public String introduce() {
        if (klass != null) {
            return super.introduce() + " I am a Teacher. I teach " + klass.getDisplayName() + ".";
        }
        if (klasses != null && klasses.size() > 0) {
            return super.introduce() + " I am a Teacher. I teach " + "Class " + klasses.stream().map(Klass::getNumber).map(String::valueOf).collect(Collectors.joining(", ")) + ".";
        }
        return super.introduce() + " I am a Teacher. I teach " + "No Class.";
    }

    public String introduceWith(Student student) {
        String result = super.introduce() + " I am a Teacher. I ";
        if (!isTeaching(student)) {
            result += "don't ";
        }
        result += "teach " + student.getName() + ".";
        return result;
    }
}
