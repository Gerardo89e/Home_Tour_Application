package game;

import fixtures.Room;

public class GameRoomManager{
	//private Room startingRoom;
	
	/*public GamePlayer(String name, String shortDescription, String longDescription) {
		super(name, shortDescription, longDescription);
		// TODO Auto-generated constructor stub
	}*/

	public static Room[] init() {
		Room[] houseRooms=new Room[16];//changing the name rooms to houseRooms
/*
		Room startRoom = new Room(
				"You wake up here again\n",
				"In a vaguely familiar place",
				"You look around the room, it's a round room with rough, worn walls.\n"
				+ "There appears to be a fireplace in the middle filled with wood.\n"
				+ "You can taste the damp air as you breath,\n"
				+ "looking up you can see a glistening crystal illuminating the room softly.\n",
				1,
				2,
				"",
				"Seems like I might be able to light a fire if I had a lighter, \notherwise I guess I have to go left or right.\n");
		houseRooms[0] = startRoom;
		
		Room fireRoom = new Room(
				"Left - ",
				"Looking down the walk way it looks dark, but you can smell smoke in the air\n",
				"It's very dim in this room, but with the little light that reaches this room you can make out the details.\n"
				+ "In the center of the room appears to be the remains of a campfire,\n"
				+ "next to the campfire is a small lighter.\n",
				2,
				3,
				"lighter",
				"I could grab the lighter.\n");
		houseRooms[1] = fireRoom;
		
		Room echoRoom = new Room(
				"Right - ",
				"You can hear your voice echo back to you whenever you try to speak.\n",
				"You enter a small room and your steps echo back to you with every step. \n"
				+ "The longer you spend in this room the more you swear you can start hearing footsteps that aren't your own.\n",
				0,
				4,
				""
				,"I feel like I shouldn't stay here... too late");
		houseRooms[2] = echoRoom;
		Room wetRoom = new Room(
				"Left - ",
				"You can hear water dripping from this room.\n",
				"As you walk into the room you notice that there's a decent amount of standing water in the room. \n"
				+ "The smell of mildew hits you and you can see a thin white coating of mold on some of the stones.\n",
				4,
				5,
				"",
				"I guess there's nothing here, I should go left or go right.\n");
		houseRooms[3] = wetRoom;
		
		Room skullRoom = new Room(
				"Right - ",
				"You can hear flames crackling from this pathway.\n",
				"You gaze into the room and hundreds of skulls gaze coldly back at you. \n"
				+ "They're set in niches in the walls in a checkerboard pattern, they all appear the same. \n"
				+ "Each skull bears a half-melted candle on its head. \n"
				+ "The grinning bones stare vacantly into the room, which otherwise seems empty.\n",
				5,
				6,
				"",
				"Something doesn't feel right... I should go left or go right.\n");
		houseRooms[4] = skullRoom;
		
		Room chestRoom = new Room(
				"Right - ",
				"This seems like a normal pathway.\n",
				"This small bare chamber holds nothing but a large ironbound chest, \n"
				+ "which is big enough for a man to fit in and bears a heavy iron lock. \n"
				+ "The floor has a layer of undisturbed dust upon it.\n",
				9,
				9,
				"oldkey",
				"If I had a key I could use it on that chest,\nI guess I have to go left or right...\n");
		houseRooms[6] = chestRoom;
		
		Room floodedRoom = new Room(
				"Left - ",
				"There's a stream of water coming from this hallway.\n",
				"You open the door to the room and you're hit with a small wave of water the floods out of the room.\n"
				+ "As you regain composure you see the source of the water is coming from a hole in the wall.\n"
				+ "You can see something glinting inside the hole.\n",
				8,
				8,
				"key",
				"Let's look at hole, otherwise I guess I have to go left or right...\n");
		houseRooms[7] = floodedRoom;
		
		Room marbleRoom = new Room(
				"Right - ",
				"There's an elagent white light coming from this hallway\n",
				"Unlike the cobblestone common throughout the houseRooms, \n"
				+ "this room is walled and floored with black marble veined with white. \n"
				+ "The ceiling is similarly marbled, but the thick pillars that hold it up are white. \n"
				+ "A brown stain drips down one side of a nearby pillar.\n",
				7,
				7,
				"",
				"Doesn't look like anything is here I guess I have to go left or right...\n");
		houseRooms[8] = marbleRoom;
		
		Room rockfallRoom = new Room(
				"Left - ",
				"There's a pile of rocks blocking this pathway\n",
				"You attempt to move rocks out of the pathway.\n "
				+ "One by one\n"
				+ "Another rock hits the ground, you swear you can see progress being made.\n"
				+ "...\n"
				+ "..\n"
				+ ".\n",
				6,
				6,
				"",
				"whoops");
		houseRooms[9] = rockfallRoom;
		
		Room fingernailRoom = new Room(
				"Right - ",
				"You can't tell if that's the smell of blood or iron coming from here\n",
				"This room has eerily smooth walls excluding the one side of the room that has a slight crack.\n"
				+ "As you look closer at the crack you can see scratches and a pile of what appears to be\n"
				+ "fingernails...",
				5,
				5,
				"",
				"I could inspect fingernails, but I feel like I should to go left or right...\n");
		houseRooms[10] = fingernailRoom;
		
		
		Room darkRoom = new Room( 
			"Left/Right - ",
			"There's nothing but darkness down this way.\n","You step into the darkness and wait.",-15,-15,"","Too late for help");
		houseRooms[15] = darkRoom;
*/		
		
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
		
		Room garageRoom = new Room(//fireRoom
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
		
		Room kitchenRoom = new Room(//echoRoom
				"Right - ",
				"You open the door to the kitchen and heading inside you see that it completly in ruins.\n",
				"Dishes broken on the floor, tiles from the floor are cracked, and some holes on the walls that look like someone smashed with a big mallet. \n"
				+ "The longer you spend in this room the more you swear you can start hearing footsteps that aren't your own.\n",
				3,
				4,
				""
				,"I feel like I shouldn't stay here... too late");
		houseRooms[2] = kitchenRoom;
		
		Room dreadRoom = new Room(//wetRoom
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
				5,
				6,
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
	    /*Room mainRoom = new Room(
			"The Foyer",
			"a small foyer",
			"The small entryway of a neo-colonial house. A dining room is open to the south, where a large table can be seen." + "\n"
			+ "The hardwood floor leads west into doorway, next to a staircase that leads up to a second floor." + "\n"
			+ "To the north is a small room, where you can see a piano.");
			this.rooms[0] = foyer;
	        this.startingRoom = foyer;*/
	}
}
