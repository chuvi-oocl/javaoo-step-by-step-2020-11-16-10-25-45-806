package practice05;

public class Teacher extends Person {
    private int klass;

    public Teacher(String name, int age) {
        super(name, age);
        this.klass = -1;
    }

    public Teacher(String name, int age, int klass) {
        super(name, age);
        this.klass = klass;
    }

    public int getKlass() {
        return klass;
    }

    public String introduce() {
        String result = super.introduce() + " I am a Teacher. I teach ";
        if (getKlass() == -1) {
            result += "No Class";
        } else {
            result += "Class " + getKlass();
        }
        result += ".";
        return result;
    }
}
