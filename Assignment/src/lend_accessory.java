public class lend_accessory {
    private String username;
    private int accessoryId;
    private String accessoryName;
    private int lend_number;
    private String lend_date;

    public lend_accessory() {}

    public void setUserName(String name) {
        username = name;
    }
    public void setAccessoryName(String name) {
        accessoryName = name;
    }
    public void setAccessoryId(int id) {
        accessoryId = id;
    }
    public void setLendNumber(int number) {
        lend_number = number;
    }
    public void setLendDate(String date) {
        lend_date = date;
    }
    public String getUserName() {
        return username;
    }
    public String getAccessoryName() {
        return accessoryName;
    }
    public int getAccessoryId() {
        return accessoryId;
    }
    public int getLendNumber() {
        return lend_number;
    }
    public String getLendDate() {
        return lend_date;
    }
    public String toString() {
        return "Username: " + username + ", " + accessoryName + ", " + accessoryId + ", " + lend_number + ", " + lend_date;
    }
}
