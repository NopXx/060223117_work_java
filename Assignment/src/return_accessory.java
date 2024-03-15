public class return_accessory {
    private String Username;
    private int accessoryId;
    private String accessoryName;
    private int return_number;
    private String return_date;
    private int return_sId;
    private double fine;
    private String accessoryStatus;

    public return_accessory() {
    }

    public void setUsername(String username) {
        Username = username;
    }
    public String getUsername() {
        return Username;
    }
    public void setAccessoryId(int accessoryId) {
        this.accessoryId = accessoryId;
    }
    public int getAccessoryId() {
        return accessoryId;
    }
    public void setAccessoryName(String accessoryName) {
        this.accessoryName = accessoryName;
    }
    public String getAccessoryName() {
        return accessoryName;
    }
    public void setReturn_number(int return_number) {
        this.return_number = return_number;
    }
    public int getReturn_number() {
        return return_number;
    }
    public void setReturn_date(String return_date) {
        this.return_date = return_date;
    }
    public String getReturn_date() {
        return return_date;
    }
    public void setFine(double fine) {
        this.fine = fine;
    }
    public double getFine() {
        return fine;
    }
    public void setAccessoryStatus(String accessoryStatus) {
        this.accessoryStatus = accessoryStatus;
    }
    public String getAccessoryStatus() {
        return accessoryStatus;
    }
    public int getReturn_sId() {
        return return_sId;
    }
    public void setReturn_sId(int return_sId) {
        this.return_sId = return_sId;
    }
    public String toString() {
        return "Username : " + Username + ", AccessoryId : " + accessoryId + ", AccessoryName : " + accessoryName + ", ReturnNumber : " + return_number + ", ReturnDate : " + return_date + ", RuturnSId : " + return_sId + ", Fine : " + fine + ", AccessoryStatus : " + accessoryStatus;
    }
}
