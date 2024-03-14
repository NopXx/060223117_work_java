public class list {
    private int listId;
    private int accessoryId;
    private String Username;
    private int staffId;

    public list() {}

    public void setListId(int listId) {
        this.listId = listId;
    }
    public void setAccessoryId(int accessoryId) {
        this.accessoryId = accessoryId;
    }
    public void setUsername(String Username) {
        this.Username = Username;
    }
    public void setStaffId(int staffId) {
        this.staffId = staffId;
    }
    public int getListId() {
        return listId;
    }
    public int getAccessoryId() {
        return accessoryId;
    }
    public String getUsername() {
        return Username;
    }
    public int getStaffId() {
        return staffId;
    }
    public String toString() {
        String str = "";
        str += "List Id: " + listId + "\n";
        str += "Accessory Id: " + accessoryId + "\n";
        str += "Username: " + Username + "\n";
        str += "Staff Id: " + staffId + "\n";
        return str;
    }
}
