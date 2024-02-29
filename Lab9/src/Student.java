public class Student {
    String StudentCode;
    String StudentName;
    String StudentSurName;

    /** Creates a new instance of Student */
    public Student() {
        setStudentCode("");
        setStudentName("");
        setStudentSurName("");
    }

    public Student(String Code, String Name, String SurName) {
        setStudentCode(Code);
        setStudentName(Name);
        setStudentSurName(SurName);
    }

    public void setStudentCode(String Code) {
        StudentCode = Code;
    }

    public void setStudentName(String Name) {
        StudentName = Name;
    }

    public void setStudentSurName(String SurName) {
        StudentSurName = SurName;
    }

    public String getStudentCode() {
        return (StudentCode);
    }

    public String getStudentName() {
        return (StudentName);
    }

    public String getStudentSurName() {
        return (StudentSurName);
    }

    public String toString() {
        String str = "";
        str = getStudentCode() + " " + getStudentName() + " ";
        str += getStudentSurName();
        return (str);
    }
}
