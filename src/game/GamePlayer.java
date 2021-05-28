package game;
import fixtures.Room;
public class GamePlayer {
	
	private int index=0;
	
	public int getIndex() {
		return index;
	}
	
	public void setIndex(int index) {
		this.index=index;
	}
	
	private Room currentRoom;
	
//	private String[] inventory;
//	private boolean ligther=false;
	private boolean tool=false;
	
	public boolean isTool() {
		return tool;
	}
	
	public Room getCurrentRoom() {
		return currentRoom;
	}
	
	public void setCurrentRoom(Room currentRoom) {
		this.currentRoom = currentRoom;
	}

}
