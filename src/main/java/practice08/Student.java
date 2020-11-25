package practice08;

public class Student extends Person {
    private Klass klass;

    public Student(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }
    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    public String introduce() {
        String result = super.introduce() + " I am a Student. I am ";
        if(klass.getLeader() == this){
            result += "Leader of ";
        }
        else{
            result += "at ";
        }
        result += klass.getDisplayName()+'.';
        return result;
    }
}
