package practice10;

import java.util.LinkedList;
import java.util.stream.Collectors;

public class Teacher extends Person {
    private LinkedList<Klass> klasses;

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public Teacher(int id, String name, int age, Klass klass) {
        super(id, name, age);

        LinkedList<Klass> klasses = new LinkedList<>();
        klasses.add(klass);

        this.setKlasses(klasses);
    }

    public Teacher(int id, String name, int age, LinkedList<Klass> klasses) {
        super(id, name, age);
        this.setKlasses(klasses);
    }

    private void setKlasses(LinkedList<Klass> klasses){
        this.klasses = klasses;
        this.klasses.forEach(klass -> klass.setNotifyingTeacher(this));
    }

    public void notifyAssignLeader(String name, Integer klass) {
        System.out.format("I am %s. I know %s become Leader of Class %s.\n", this.getName(), name, klass);
    }


    public void notifyAppendMember(String name, Integer klass) {
        System.out.format("I am %s. I know %s has joined Class %s.\n", this.getName(), name, klass);
    }

    public LinkedList<Klass> getClasses() {
        return klasses;
    }

    public Boolean isTeaching(Student student) {
        return (klasses.stream().anyMatch(i -> i == student.getKlass()));
    }

    @Override
    public String introduce() {
        String result = super.introduce() + " I am a Teacher. I teach ";
        if (klasses != null && klasses.size() > 0) {
            result += "Class " + klasses.stream().map(Klass::getNumber).map(String::valueOf).collect(Collectors.joining(", ")) + ".";
        } else {
            result += "No Class.";
        }
        return result;
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
