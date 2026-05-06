public class RoomDescriptions {
    public void The_Grand_Stand(String descriptionType) {
        if(descriptionType.equalsIgnoreCase("first")){
            System.out.println("\033[3mYou realize that you are standing in front of a grand stand with an announcer on it.\033[0m");
            System.out.println();
            System.out.println("Out of all of the contestants, you have been selected to go on this amazing quest! Now go! Your journey awaits to the north, beyond the Gates of Destiny!");
        } else if(descriptionType.equalsIgnoreCase("subsequent")) {
            System.out.println("Announcer: Don't be shy! Go north, to the Gates of Destiny!");
        } else if(descriptionType.equalsIgnoreCase("inspect_general")){
            System.out.println("\033[3mYou are standing in front of a grand stand with an announcer on it, he is wearing a red and white striped suitcoat with a black tophat. To the north you can make out a set of giant golden gates.\033[0m");
            System.out.println();
            System.out.println("Announcer: Don't be shy! Go north, to the Gates of Destiny!");
        } else if(descriptionType.equalsIgnoreCase("inspect_announcer")){
            System.out.println("\033[3mHe is wearing a red and white striped suitcoat with a black tophat.\033[0m");
            System.out.println();
            System.out.println("Announcer: Don't be shy! Go north, to the Gates of Destiny!");
        }
    }
}
