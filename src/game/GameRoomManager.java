package game;

import fixtures.Room;

public class GameRoomManager{

	public static Room[] init() {
		Room[] houseRooms=new Room[16];//changing the name rooms to houseRooms
		
		Room startRoom = new Room(
				"As you walk in front of the house you see it in ruins\n",
				"You thought to yourself that it had seen better days",
				"As you enter the house from the front door, you feel unease, as if someone was watching you the whole time.\n"
				+ "Inside the house,everything seems normal in the foyer,you see only one entrences to go.\n"
				+ "The garage\n"
				+ "For some odd reason the hallway is blocked by furniture and living room is caved in from the roof, with little choice in the matter you decide to go to the garge on your left side\n",
				1,
				2,
				"",
				"As time goes on you question yourself if you made the right choice of entering alone in a worn down building.\n");
		houseRooms[0] = startRoom;
		
		Room garageRoom = new Room(
				"Left - ",
				"You choose to go the garage, seeing that it is closer to the foyer if you needed to bail from certain danger\n",
				"The room is dark, but luckly you prepared for this and turn on a flashlight to see\n"
				+ "From the looks of it most of the valuables in the garage was taken long ago, but a rusted old car is placed in the middle of the garage.\n"
				+ "But you are able to see another door leading to the kitchen. A choice must be made to go back or to head forward to the kitchen\n",
				3,
				2,
				"Suddely you feel the urge to choose",
				"as you hear a scrathing on the walls\n");
		houseRooms[1] = garageRoom;
		
		Room kitchenRoom = new Room(
				"Right - ",
				"You open the door to the kitchen and heading inside you see that it completly in ruins.\n",
				"Dishes broken on the floor, tiles from the floor are cracked, and some holes on the walls that look like someone smashed with a big mallet. \n"
				+ "The longer you spend in this room the more you swear you can start hearing footsteps that aren't your own.\n",
				3,
				4,
				""
				,"I feel like I shouldn't stay here... too late");
		houseRooms[2] = kitchenRoom;
		
		Room dreadRoom = new Room(
				"Left - ",
				"While in the kitchen you saw a shadowly figure head hide from the corner of your eyes.\n",
				"This time you panic but calmed down thinking it was a homeless person or maybe an animal. \n"
				+ "You think in your head on what to do to either go back inside the garage or find another way out throught the back yard.\n",
				4,
				5,
				"",
				"Having dread build up you feel that this choice would either be worse or good.\n");
		houseRooms[3] = dreadRoom;
		
		Room surviveRoom2 = new Room(
				"Right - ",
				"You went back and saw a what looked like a disfugered person, he looks at you with those dead eyes and start charing at you.\n",
				"You saw he charge at you with what looked like a pipe and you knew that you had to act fast. \n"
				+ "The way to the foyer is blocked by the disfiguered person. \n"
				+ "with little choice you either go past him or go through the kitchen to the yard.. \n"
				+ "Time slowed down to you as you though in your head and pondering on your chance of living.\n",
				9,
				9,
				"",
				"It is now or never!.\n");
		houseRooms[7] = surviveRoom2;
		Room surviveRoom = new Room(
				"Left - ",
				"You went back and saw a what looked like a disfugered person, he looks at you with those dead eyes and start charing at you.\n",
				"You saw he charge at you with what looked like a pipe and you knew that you had to act fast. \n"
				+ "The way to the foyer is blocked by the disfiguered person. \n"
				+ "with little choice you either go past him or go through the kitchen to the yard.. \n"
				+ "Time slowed down to you as you though in your head and pondering on your chance of living.\n",
				5,
				6,
				"",
				"It is now or never!.\n");
		houseRooms[4] = surviveRoom;
		
		Room kitchenRunRoom = new Room(
				"Right - ",
				"You went back to the kitchen and ran to the front yard.\n",
				"You saw him behind you with murder in his eyes. \n"
				+ "It was more than enough to get your legs moving faster than ever \n"
				+ "The yard was filled with useless objects and trash you decided to move toward the shortest fench and climb\n"
				+ "The man was right behind and decide to take a hit at your leg, but he missed\n",
				6,
				7,
				"As you climbed to the other side the man tried to climb as well, but seeing that the fence was old and not stable,his weight made the fench fall to his side ",
				"He down and injured, but you dont care and just leave the place. You made it home somehow, let this be a lesson to not go into abanddoned houses at night!.\n");
		houseRooms[5] = kitchenRunRoom;
		
		Room Ending1 = new Room(
				"left- ",
				"You somehow passed the man with your reflexes as he tried to take a swing at you.\n",
				"The door was already open and you ran to the door. \n"
				+ "the door was open and you were able to leave \n"
				+ "the man stood at the front of the door house and both you and him had a stare off \n"
				+ "He threw his pipe at you and missed but surprisenly he went back in the house leting you .\n",
				7,
				8,
				"",
				"You decided it is best to leave the place before he changes his mind to take another wack at you. The End!.\n");
		houseRooms[6] = Ending1;
	
	/*	Room darkRoom = new Room( 
				"Left/Right - ",
				"There's nothing but darkness down this way.\n","You step into the darkness and wait.",-15,-15,"","Too late for help");
		houseRooms[16]=darkRoom;*/
		return houseRooms;
	}
}
