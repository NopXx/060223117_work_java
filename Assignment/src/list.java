public class list {
    private int listId;
    private int accessoryId;
    private String Username;
    private int lend_sId;
    private int return_sId;

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
    public void setLendSId(int sId) {
        lend_sId = sId;
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
    public int getLendSId() {
        return lend_sId;
    }
    public int getReturn_sId() {
        return return_sId;
    }
    public void setReturn_sId(int return_sId) {
        this.return_sId = return_sId;
    }
    public String toString() {
        String str = "";
        str += "List Id: " + listId + "\n";
        str += "Accessory Id: " + accessoryId + "\n";
        str += "Username: " + Username + "\n";
        str += "Lend Staff Id: " + lend_sId + "\n";
        str += "Return Staff Id: " + return_sId + "\n";
        return str;
    }
}
