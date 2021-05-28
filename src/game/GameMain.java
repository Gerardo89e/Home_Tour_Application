package game;
/*
 * Source credited:Houstan,Belle, and Yuna, and Sea_J_Small
 * 
 * 
 */
import java.util.Scanner;
import fixtures.Room;
public class GameMain extends GameRoomManager {

	public static void main(String[] args) throws InterruptedException {
	    GamePlayer userPlayer= new GamePlayer();

		Room[] houseRooms=GameRoomManager.init();
		userPlayer.setCurrentRoom(houseRooms[0]);
	
		if(userPlayer.getIndex()==0) {
			System.out.println(userPlayer.getCurrentRoom().longDescription);
		}
		while(true) {
			if(userPlayer.getIndex()==0) {
				Scanner sc = new Scanner(System.in);
				String str=sc.nextLine();
				String[] tokReq=str.split("\\s+");
				
				if(userPlayer.getIndex()==2) {
					System.out.println(houseRooms[userPlayer.getIndex()+userPlayer.getCurrentRoom().rightDistance].name + houseRooms[userPlayer.getIndex()+userPlayer.getCurrentRoom().rightDistance].shortDescription );
				}else if(userPlayer.getIndex() != 16) {
					System.out.println(houseRooms[userPlayer.getIndex()+userPlayer.getCurrentRoom().leftDistance].name + houseRooms[userPlayer.getIndex()+userPlayer.getCurrentRoom().leftDistance].shortDescription );
					//Thread.sleep(300);
					System.out.println(houseRooms[userPlayer.getIndex()+userPlayer.getCurrentRoom().rightDistance].name + houseRooms[userPlayer.getIndex()+userPlayer.getCurrentRoom().rightDistance].shortDescription );
				}else{
					System.out.println(houseRooms[userPlayer.getIndex()+userPlayer.getCurrentRoom().rightDistance].name + houseRooms[userPlayer.getIndex()+userPlayer.getCurrentRoom().rightDistance].shortDescription );
				}	
			}
			Scanner s=new Scanner(System.in);
			String st = s.nextLine();
			
			String[] tokReq=st.split("\\s+");
			System.out.println(tokReq[0].equals("go"));
			System.out.println(tokReq[1].equals("right"));

			 
			
			if(tokReq[0].equals("Help") || tokReq[0].equals("help")){
				System.out.println(userPlayer.getCurrentRoom().help);
			}else if(tokReq[0].equals("Options") || tokReq[0].equals("options")) {
				System.out.println(houseRooms[userPlayer.getIndex()+userPlayer.getCurrentRoom().leftDistance].name + houseRooms[userPlayer.getIndex()+userPlayer.getCurrentRoom().leftDistance].shortDescription );	
				System.out.println(houseRooms[userPlayer.getIndex()+userPlayer.getCurrentRoom().rightDistance].name + houseRooms[userPlayer.getIndex()+userPlayer.getCurrentRoom().rightDistance].shortDescription );
				//User Choices
			}else if(tokReq[0].equals("Go") || tokReq[0].equals("go")) {
				if(tokReq[1].equals("Left") || tokReq[1].equals("left")) {
					goLeft(userPlayer,houseRooms);
				}else if(tokReq[1].equals("Right") || tokReq[1].equals("right")) {
					goRight(userPlayer,houseRooms);
				}else if((tokReq[1].equals("nothingness") || tokReq[1].equals("Nothingness")) && (userPlayer.getIndex() > 5)){
					goToVoid(userPlayer,houseRooms);
				}else {
					System.out.println("I dont think I can go that way");
				}
			}else if(tokReq[0].equals("Left") || tokReq[0].equals("left")) {
				goLeft(userPlayer,houseRooms);
			}else if(tokReq[0].equals("Right") || tokReq[0].equals("right")) {
				goRight(userPlayer,houseRooms);
			}
			
				/*
				else {
				System.out.println("You suck");
				}
				*/
			
		
		}

	}
	public static void goRight(GamePlayer userPlayer, Room[] houseRooms) throws InterruptedException {
		userPlayer.setIndex(userPlayer.getIndex() +userPlayer.getCurrentRoom().rightDistance );
		userPlayer.setCurrentRoom(houseRooms[userPlayer.getIndex()]);
		System.out.println(".");
		Thread.sleep(450);
		System.out.println("..");
		Thread.sleep(450);
		System.out.println("...");
		Thread.sleep(450);
		System.out.println(userPlayer.getCurrentRoom().longDescription);
		Thread.sleep(1500);
		
		if(userPlayer.getIndex() == 15) {
			userPlayer.setIndex(userPlayer.getIndex() +userPlayer.getCurrentRoom().rightDistance );
			userPlayer.setCurrentRoom(houseRooms[userPlayer.getIndex()]);
			System.out.println("...");
			Thread.sleep(450);
			System.out.println("..");
			Thread.sleep(450);
			System.out.println(".");
			Thread.sleep(450);
			System.out.println(houseRooms[userPlayer.getIndex()].name);
			Thread.sleep(1500);
			System.out.println(houseRooms[userPlayer.getIndex()].shortDescription +"\n");
			Thread.sleep(1500);
			System.out.println(userPlayer.getCurrentRoom().longDescription);
		}
	}
	
	public static void goLeft(GamePlayer userPlayer, Room[] houseRooms) throws InterruptedException {
		if(userPlayer.getIndex() == 6) {
			System.out.println("There's no door there");
		}
		userPlayer.setIndex(userPlayer.getIndex() +userPlayer.getCurrentRoom().leftDistance );
		userPlayer.setCurrentRoom(houseRooms[userPlayer.getIndex()]);
		System.out.println(".");
		Thread.sleep(450);
		System.out.println("..");
		Thread.sleep(450);
		
		System.out.println("...");
		Thread.sleep(450);
		//System.out.println(userPlayer.getCurrentRoom().shortDescription);
		System.out.println(userPlayer.getCurrentRoom().longDescription);
		Thread.sleep(1500);
		
		if(userPlayer.getIndex() == 15) {
			userPlayer.setIndex(userPlayer.getIndex() +userPlayer.getCurrentRoom().rightDistance );
			userPlayer.setCurrentRoom(houseRooms[userPlayer.getIndex()]);
			System.out.println("...");
			Thread.sleep(450);
			System.out.println("..");
			Thread.sleep(450);
			System.out.println(".");
			Thread.sleep(450);
			System.out.println(houseRooms[userPlayer.getIndex()].name);
			Thread.sleep(1500);
			System.out.println(houseRooms[userPlayer.getIndex()].shortDescription +"\n");
			Thread.sleep(1500);
			System.out.println(userPlayer.getCurrentRoom().longDescription);
		}
	}
	
	public static void goToVoid(GamePlayer userPlayer, Room[] houseRooms) throws InterruptedException {
		userPlayer.setIndex(userPlayer.getIndex() +userPlayer.getCurrentRoom().rightDistance );
		userPlayer.setCurrentRoom(houseRooms[userPlayer.getIndex()]);
		System.out.println(".");
		Thread.sleep(450);
		System.out.println("..");
		Thread.sleep(450);
		System.out.println("...");
		Thread.sleep(450);
		System.out.println(userPlayer.getCurrentRoom().longDescription);
		Thread.sleep(1500);
		
		userPlayer.setIndex(userPlayer.getIndex() +userPlayer.getCurrentRoom().rightDistance );
		userPlayer.setCurrentRoom(houseRooms[userPlayer.getIndex()]);
		System.out.println("...");
		Thread.sleep(450);
		System.out.println("..");
		Thread.sleep(450);
		System.out.println(".");
		Thread.sleep(450);
		System.out.println(houseRooms[userPlayer.getIndex()].name + houseRooms[userPlayer.getIndex()].shortDescription );
		Thread.sleep(1500);
		System.out.println(userPlayer.getCurrentRoom().longDescription);
	}
	
}
