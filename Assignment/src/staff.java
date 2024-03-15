public class staff {
    private int s_id;
    private String s_user;
    private String s_pw;
    private String s_fname;
    private String s_lname;
    private String s_tel;
    private String role;

    public staff() {
    }

    public void setSId(int id) {
        s_id = id;
    }
    public void setSUser(String user) {
        s_user = user;
    }
    public void setSPw(String pw) {
        s_pw = pw;
    }
    public void setSFname(String fname) {
        s_fname = fname;
    }
    public void setSLname(String lname) {
        s_lname = lname;
    }
    public void setSTel(String tel) {
        s_tel = tel;
    }
    public void setRole(String role) {
        this.role = role;
    }
    public int getSId() {
        return s_id;
    }
    public String getSUser() {
        return s_user;
    }
    public String getSPw() {
        return s_pw;
    }
    public String getSFname() {
        return s_fname;
    }
    public String getSLname() {
        return s_lname;
    }
    public String getSTel() {
        return s_tel;
    }
    public String getRole() {
        return role;
    }

    public String toString() {
        return "Staff Id = " + s_id + "; Username = " + s_user + "; Password = " + s_pw + "; First Name = " + s_fname + "; Last Name = " + s_lname + "; Phone Number = " + s_tel + "; Role = " + role;
    }
}
