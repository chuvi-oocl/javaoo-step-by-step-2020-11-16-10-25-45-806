package practice05;

public class Teacher extends Person {
    private Integer klass;

    public Teacher(String name, int age) {
        super(name, age);
    }

    public Teacher(String name, int age, int klass) {
        super(name, age);
        this.klass = klass;
    }

    public Integer getKlass() {
        return klass;
    }

    @Override
    public String introduce() {
        String result = super.introduce() + " I am a Teacher. I teach ";
        if (getKlass() == null) {
            result += "No Class";
        } else {
            result += "Class " + getKlass();
        }
        result += ".";
        return result;
    }
}
