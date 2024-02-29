public class Register {
    private Student std;
    private Subject sub[];
    private int max, count = -1;

    /** Creates a new instance of Register */
    public Register() {
        std = new Student();
        max = 0;
    }

    public Register(Student std, int n) {
        this.std = std;
        max = n;
        createSubject(max);
    }

    private void createSubject(int n) {
        sub = new Subject[n];
    }

    public void setStudent(Student std) {
        this.std = std;
    }

    public void setSubject(Subject sub) {
        this.sub[++count] = sub;
    }

    public void setSubject(Subject sub, int n) {
        this.sub[n] = sub;
    }

    public String getStudent() {
        return (std.toString());
    }

    public String getSubject(int n) {
        return (sub[n].toString());
    }
}
