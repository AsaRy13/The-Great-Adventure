public class RoomDescriptions {
    public void The_Grand_Stand(boolean less) {
        if(!less){
            System.out.println("\033[3mYou realize that you are standing in front of a grand stand with an announcer on it.\033[0m");
            System.out.println();
            System.out.println("Out of all of the contestants, you have been selected to go on this amazing quest! Now go! Your journey awaits to the north, beyond the Gates of Destiny!");
        } else {
            System.out.println("Announcer: Don't be shy! Go north, to the Gates of Destiny!");
        }
    }
}
