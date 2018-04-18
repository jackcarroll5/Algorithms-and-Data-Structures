public class ClassDetails {

    private String name;
    private String roomNo;

    public ClassDetails()
    {
        setName("");
        setRoomNo("");
    }

    public ClassDetails(String name, String roomNo)
    {
        setName(name);
        setRoomNo(roomNo);
    }

    public String getName() {
        return name;
    }

    public String getRoomNo() {
        return roomNo;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setRoomNo(String roomNo) {
        this.roomNo = roomNo;
    }

}
