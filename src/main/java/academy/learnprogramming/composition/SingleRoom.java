package academy.learnprogramming.composition;

public class SingleRoom {

    private String roomName;
    private Decour decour;
    private Furniture furniture;

    public SingleRoom(String roomName, Decour decour, Furniture furniture) {
        this.roomName = roomName;
        this.decour = decour;
        this.furniture = furniture;
    }
}
