public class RoomDescriptions {
    //The Grand Stand
    public void The_Grand_Stand(String descriptionType) {
        if(descriptionType.equalsIgnoreCase("first")){
            //First time the room is entered
            System.out.println("\033[3mYou realize that you are standing in front of a grand stand with an announcer on it.\033[0m");
            System.out.println();
            System.out.println("Out of all of the contestants, you have been selected to go on this amazing quest! Now go! Your journey awaits to the north, beyond the Gates of Destiny!");
        } else if(descriptionType.equalsIgnoreCase("subsequent")) {
            //Subsequent times the room is entered
            System.out.println("Announcer: Don't be shy! Go north, to the Gates of Destiny!");
        } else if(descriptionType.equalsIgnoreCase("inspect_general")){
            //When the inspect command is used
            System.out.println("\033[3mYou are standing in front of a grand stand with an announcer on it, he is wearing a red and white striped suitcoat with a black tophat.\nTo the north you can make out a set of giant golden gates.\033[0m");
        } else if(descriptionType.equalsIgnoreCase("inspect_announcer")){
            //When the 'inspect announcer' command is used
            System.out.println("\033[3mHe is wearing a red and white striped suitcoat with a black tophat.\033[0m");
        } else if(descriptionType.equalsIgnoreCase("inspect_grand_stand")){
            //When the 'inspect grand stand' command is used
            System.out.println("\033[3mThe grand stand is made of wood.\033[0m");
        } else {
            System.out.println("I didn't understand that.");
        }
    }

    //The Gates of Destiny
    public void The_Gates_of_Destiny(String descriptionType) {
        if(descriptionType.equalsIgnoreCase("first")){
            //First time the room is entered
            System.out.println("\033[3mYou stand before the Gates of Destiny, and a fanfair of trumpets blow. Then the gates open and on the otherside there appears to be a maze.\033[0m");
        } else if(descriptionType.equalsIgnoreCase("subsequent")) {
            //Subsequent times the room is entered
            System.out.println("\033[3mThe gates are standing wide open waiting for you to enter.\033[0m");
        } else if(descriptionType.equalsIgnoreCase("inspect_general")){
            //When the inspect command is used
            System.out.println("\033[3mYou see the Gates of Destiny ahead (to the north) of you, standing wide open, waiting for you to enter. On the otherside of them appears to be a maze.\033[0m");
        } else if(descriptionType.equalsIgnoreCase("inspect_gate")){
            System.out.println("\033[3mThe Gates of Destiny are beautifully crafted golden ornate gates that are waiting for you to enter them.\033[0m");
        } else {
            System.out.println("I didn't understand that.");
        }
    }

    public void Maze_Enterance(String descriptionType) {
        if(descriptionType.equalsIgnoreCase("first")){
            //First time the room is entered
            System.out.println("\033[3mYou enter the maze and the gates close behind you. You can't go back now.\nThere is a path to the east and a path to the west.\033[0m");
        } else if(descriptionType.equalsIgnoreCase("subsequent")) {
            //Subsequent times the room is entered
            System.out.println("\033[3mYou have found your way back to the maze enterance.\nThere is a path to the east and a path to the west.\033[0m");
        } else if(descriptionType.equalsIgnoreCase("inspect_general")){
            //When the inspect command is used
            System.out.println("\033[3mYou are in the maze at the entrance. To the south are the Gates of Destiny.\nThey are closed so you can't go through them. To the east there is a path and to the west there is a path.\033[0m");
        } else if(descriptionType.equalsIgnoreCase("inspect_gate")){
            System.out.println("\033[3mThe Gates of Destiny are beautifully crafted golden ornate gates.\033[0m");
        } else {
            System.out.println("I didn't understand that.");
        }
    }
}
