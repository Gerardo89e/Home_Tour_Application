package fixtures;

public class Room extends FixtureAbstract{
	//Array to hold the rooms with a size 4(indexes of 3)
	//public String[] Room= new String[] {"North","South","West","East"};
	//Room[] exits= new Room[3];
	public String name;
	public int leftDistance;
	public int rightDistance;
	public String item;
	public String help;
	
	public Room(String name, String shortDescription, String longDescription,int left, int right, String str,String help) {
		
		super(name, shortDescription, longDescription);
		// TODO Auto-geneated constructor stub
		//this.exits= new Room[3];
		this.leftDistance=left;
		this.rightDistance=right;
		this.item=str;
		this.help=help;
		
	}
/*
	public Room[] getExits() {
		
		return this.exits;
		
	}

	public Room getExit(String direction) {
		direction= direction.toUpperCase();
		int index=0;
		
		switch(direction){
			case "NORTH":
				index=0;
				break;
			case "SOUTH":
				index=1;
				break;
			case "WEST":
				index=2;
				break;
			case "EAST":
				index=3;
				break;
		}
		 return exits[index];
		}
	*/
}


