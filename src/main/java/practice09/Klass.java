package practice09;

public class Klass {
    private Integer klass;
    private Student leader;

    public Klass(int klass) {
        this.klass = klass;
    }

    public Integer getNumber() {
        return klass;
    }

    public Student getLeader() {
        return this.leader;
    }

    public void assignLeader(Student student) {
        if (student.getKlass() != this) {
            System.out.print("It is not one of us.\n");
        } else {
            this.leader = student;
        }
    }

    public void appendMember(Student student) {
        student.setKlass(this);
    }

    public String getDisplayName() {
        String result = "";
        if (klass == null) {
            result += "No Class";
        } else {
            result += "Class " + klass;
        }
        return result;
    }
}


