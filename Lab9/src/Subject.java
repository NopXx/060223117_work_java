public class Subject {
    private String SubjectCode;
    private String SubjectName;
    private int SubjectCredit;

    /** Creates a new instance of Subject */
    public Subject() {
        setSubjectCode("");
        setSubjectName("");
        setSubjectCredit(0);
    }

    public Subject(String Code, String Name, int Credit) {
        setSubjectCode(Code);
        setSubjectName(Name);
        setSubjectCredit(Credit);
    }

    public void setSubjectCode(String Code) {
        SubjectCode = Code;
    }

    public void setSubjectName(String Name) {
        SubjectName = Name;
    }

    public void setSubjectCredit(int Credit) {
        SubjectCredit = Credit;
    }

    public String getSubjectCode() {
        return (SubjectCode);
    }

    public String getSubjectName() {
        return (SubjectName);
    }

    public int getSubjectCredit() {
        return (SubjectCredit);
    }

    public String toString() {
        String str = "";
        str = getSubjectCode() + " " + getSubjectName() + " ";
        str += getSubjectCredit();
        return (str);
    }
}