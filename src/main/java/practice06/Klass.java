package practice06;

public class Klass {
    private int klass;

    public Klass(int klass) {
        this.klass = klass;
    }

    public int getNumber() {
        return klass;
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
