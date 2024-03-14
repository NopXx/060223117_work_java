public class accessory {
    private int accessoryId;
    private String accessoryName;
    private int accessoryCount;

    public accessory() {}

    public void setAccessoryId(int Id) {
        accessoryId = Id;
    }
    public void setAccessoryName(String Name) {
        accessoryName = Name;
    }
    public void setAccessoryCount(int Count) {
        accessoryCount = Count;
    }
    public int getAccessoryId() {
        return accessoryId;
    }
    public String getAccessoryName() {
        return accessoryName;
    }
    public int getAccessoryCount() {
        return accessoryCount;
    }

    public String toString() {
        return "Accessory Id = " + accessoryId + "; Name = " + accessoryName + "; Count = " + accessoryCount;
    }
}
