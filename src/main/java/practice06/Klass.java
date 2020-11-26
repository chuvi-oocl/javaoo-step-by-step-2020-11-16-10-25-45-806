package practice06;

public class Klass {
    private Integer klass;

    public Klass(int klass) {
        this.klass = klass;
    }

    public Integer getNumber() {
        return klass;
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
