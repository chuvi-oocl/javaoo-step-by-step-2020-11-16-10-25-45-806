package practice07;

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
        this.leader = student;
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
