package practice07;

public class Klass {
    private int klass;
    private Student leader;

    public Klass(int klass) {
        this.klass = klass;
        this.leader = null;
    }

    public int getNumber() {
        return klass;
    }

    public Student getLeader(){
        return this.leader;
    }

    public void assignLeader(Student student){
        this.leader = student;
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
