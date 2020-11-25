package practice10;

public class Klass {
    private int klass;
    private Student leader;
    private Teacher notifyingTeacher;


    public Klass(int klass) {
        this.klass = klass;
        this.notifyingTeacher = null;
    }

    public int getNumber() {
        return klass;
    }

    public Student getLeader() {
        return this.leader;
    }

    public void setNotifyingTeacher(Teacher notifyingTeacher) {
        this.notifyingTeacher = notifyingTeacher;
    }

    public void assignLeader(Student student) {
        if (student.getKlass() != this) {
            System.out.print("It is not one of us.\n");
        } else {
            this.leader = student;
            if (notifyingTeacher != null) {
                notifyingTeacher.notifyMe(student.getName() + " become Leader of Class " + klass + ".");
            }
        }
    }

    public void appendMember(Student student) {
        student.setKlass(this);
        if (notifyingTeacher != null) {
            notifyingTeacher.notifyMe(student.getName() + " has joined Class " + klass + ".");
        }
    }

    public String getDisplayName() {
        String result = "";
        if (klass == -1) {
            result += "No Class";
        } else {
            result += "Class " + klass;
        }
        return result;
    }
}
