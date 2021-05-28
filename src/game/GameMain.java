package game;

import java.util.Scanner;
import fixtures.Room;
public class GameMain extends GameRoomManager {
	  //public static Scanner sc = new Scanner(System.in);


	public static void main(String[] args) throws InterruptedException {
	    GamePlayer userPlayer= new GamePlayer();

		Room[] houseRooms=GameRoomManager.init();
		userPlayer.setCurrentRoom(houseRooms[0]);
	
		if(userPlayer.getIndex()==0) {
			System.out.println(userPlayer.getCurrentRoom().longDescription);
		}
		while(true) {
			if(userPlayer.getIndex()==0) {
				//System.out.println("As you enter the house from the front door, you unease, as if someone was watching you the whole time");
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
				//go ____ options
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
			
			//Here aret the items and actions the user takes
			/*	
			}else if(tokReq[0].equals("Look") || tokReq[0].equals("look") || tokReq[0].equals("inspect")|| tokReq[0].equals("Inspect")) {
				if(tokReq[0].equals("Look") || tokReq[0].equals("look")){
					if((tokReq[2].equals("hole") || tokReq[2].equals("Hole")) && userPlayer.getIndex() == 7  ) {
						//hole inspect
						System.out.println("You look at the hole and see a metal object glistening inside. Do you want to grab it?");
						st = s.nextLine();
						tokReq = st.split("\\s+");
						if(tokReq[0].equals("yes")) {
						userPlayer.setKey(true);
						System.out.println("You feel something prick your hand");
						Thread.sleep(800);
						System.out.println("Pulling out the item shows that it's a heavy iron key");
						Thread.sleep(800);
						}
						
					}else if((tokReq[2].equals("fingernail") || tokReq[2].equals("Fingernail")|| tokReq[2].equals("fingernails") || tokReq[2].equals("Fingernails") ) && userPlayer.getIndex() == 10  ){
						//fingernail inspect
						System.out.println("All of the fingernails look the exact same!");
						Thread.sleep(800);
						System.out.println("You gingerly pick one up to look at it.");
						Thread.sleep(800);
						System.out.println("As you pick it up you realize that it looks exactly like your fingernail.");
						Thread.sleep(800);
						System.out.println("A shiver gets sent down your spine thinking back to the skull room.\n");
						Thread.sleep(800);
					}
				}else if(tokReq[0].equals("inspect")|| tokReq[0].equals("Inspect")) {
					if((tokReq[1].equals("hole") || tokReq[1].equals("Hole")) && userPlayer.getIndex() == 7  ) {
						//hole inspect
						System.out.println("You look at the hole and see a metal object glistening inside. Do you want to grab it?");
						st = s.nextLine();
						tokReq = st.split("\\s+");
						if(tokReq[0].equals("yes")) {
						userPlayer.setKey(true);
						System.out.println("You feel something prick your hand");
						Thread.sleep(800);
						System.out.println("Pulling out the item shows that it's a heavy iron key");
						Thread.sleep(800);
						}
					}else if((tokReq[1].equals("fingernail") || tokReq[1].equals("Fingernail")|| tokReq[1].equals("fingernails") || tokReq[1].equals("Fingernails")) && userPlayer.getIndex() == 10  ){
						//fingernail inspect
						System.out.println("All of the fingernails look the exact same!");
						Thread.sleep(800);
						System.out.println("You gingerly pick one up to look at it.");
						Thread.sleep(800);
						System.out.println("As you pick it up you realize that it looks exactly like your fingernail.");
						Thread.sleep(800);
						System.out.println("A shiver gets sent down your spine thinking back to the skull room.\n");
						Thread.sleep(800);
					}
				}
				
				
			}else if((tokReq[0].equals("Grab") || tokReq[0].equals("grab") || tokReq[0].equals("pick") || tokReq[0].equals("Pick")) && userPlayer.getIndex() == 1){
				//pick up lighter event
				System.out.println("You pick up the old lighter");
				userPlayer.setLighter(true);
				Thread.sleep(1000);
			}else if((tokReq[0].equals("Use") || tokReq[0].equals("use")) && userPlayer.getIndex() == 6 && userPlayer.isKey() == true){
				System.out.println("You use the old key on the chest.\nYou can hear the old lock pop before it drops to the ground.");
				Thread.sleep(800);
				System.out.println("You open the chest and inside the chest is a strange tool.\nDo you want to pick it up? ");
				st = s.nextLine();
				tokReq = st.split("\\s+");
				if(tokReq[0].equals("yes")) {
				userPlayer.setTool(true);
				Thread.sleep(800);
				System.out.println("You grab the tool, it almost looks like an \"L\"");

				}
				Thread.sleep(800);
				
			}else if(tokReq[0].equals("Left") || tokReq[0].equals("left")) {
				goLeft(userPlayer,houseRooms);
			}else if(tokReq[0].equals("Right") || tokReq[0].equals("right")) {
				goRight(userPlayer,houseRooms);
				
				
			//}

			
				}
			}*/

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
	
	
	
		/*
	private static void printRoom(Player player) {
		
	}

	private static String[] collectInput() {
	    String input = "";

		//Scanner sc = new Scanner(System.in);
		System.out.println("Please Choose where to go: ");
		input = sc.nextLine();
		return input.split(input);

	}
		
	private static void parse(String[] command, Player player) {
		if (command.length < 2) {
		      System.out.println("Invalid command, please read the instruction");
		    }
		    CommandBase cmd = CommandBase.getCommand(command[0]);
		    cmd.action(player, command[1]);
	}*/
}
