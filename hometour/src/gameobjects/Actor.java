package gameobjects;

public class Actor extends Thing {

    private Room location; // room where person is present

    public Actor(String aName, String aDescription, Room aRoom) {
        super(aName, aDescription); //super class
        location = aRoom;
    }

    public void setLocation(Room aRoom) {
        location = aRoom;
    }

    public Room getLocation() {
        return location;
    }
}

