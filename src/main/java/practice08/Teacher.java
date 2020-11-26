package practice08;

public class Teacher extends Person {
    private Klass klass;

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public Teacher(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    public String introduce() {
        return super.introduce() + " I am a Teacher. I teach " + klass.getDisplayName() + ".";
    }

    public String introduceWith(Student student) {
        String result = super.introduce() + " I am a Teacher. I ";
        if (student.getKlass() != klass) {
            result += "don't ";
        }
        result += "teach " + student.getName() + ".";
        return result;
    }
}

