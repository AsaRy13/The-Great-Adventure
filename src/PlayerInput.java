import java.util.Scanner;
public class PlayerInput {
    //vars
    private boolean quit = false;
    private int roomNum;
    private int northRoom = -1;
    private int southRoom = -1;
    private int westRoom = -1;
    private int eastRoom = -1;
    private int northEastRoom = -1;
    private int southEastRoom = -1;
    private int northWestRoom = -1;
    private int southWestRoom = -1;
    private int upRoom = -1;
    private int downRoom = -1;

    public void roomNum(int roomNum){
        this.roomNum = roomNum;
    }

    public void test(){
        System.out.println("Testing");
    }

    public void help(){
        System.out.println("List of commands:\nhelp: Shows this list.\ntest: Says Testing.\nquit: Quits the game.\necho <on/off>: Echos input.\ninspect [object]: Does a general inspect or inspects specified object.\nDirectional Inputs: north, south, east, west, northwest, southwest, northeast, southeast, up, down");
    }

    public boolean quit(){
        return this.quit;
    }
    public boolean quit(boolean quit, Scanner inputScanner){
        this.quit = quit;
        if(quit){
            inputScanner.close();
        }
        return this.quit;
    }

    public void echo(Scanner inputScanner){
        boolean leaveEcho = false;
        System.out.println("echo on");
        do{
            System.out.print("> ");
            String userInput = inputScanner.nextLine();
            
            if(userInput.equalsIgnoreCase("echo off")) {
                System.out.println("The echo is now off.");
                leaveEcho = true;
            } else if(userInput.equalsIgnoreCase("quit")){
                this.quit(true, inputScanner);
                leaveEcho = true;
            } else{
                System.out.println();
                System.out.println(userInput);
                System.out.println();
            }
        }
        while(!leaveEcho);
    }

    //This is a softlock for any room with an endless echo if some puzzle involving this isn't solved.
    public void endlessEcho(Scanner inputScanner){
        boolean leaveEcho = false;
        System.out.println("The sound echos throughout the room so loudly that it is now impossible to think.");
        do{
            System.out.print("> ");
            String userInput = inputScanner.nextLine();
            
            if(userInput.equalsIgnoreCase("quit")){
                this.quit(true, inputScanner);
                leaveEcho = true;
            } else{
                System.out.println();
                System.out.println(userInput);
                System.out.println();
            }
        }
        while(!leaveEcho);
    }

    public void direction_set(int north_room, int south_room, int east_room, int west_room, int northwest_room, int southwest_room, int northeast_room, int southeast_room, int up_room, int down_room){
        this.northRoom = north_room;
        this.southRoom = south_room;
        this.eastRoom = east_room;
        this.westRoom = west_room;
        this.northWestRoom = northwest_room;
        this.southWestRoom = southwest_room;
        this.northEastRoom = northeast_room;
        this.southEastRoom = southeast_room;
        this.upRoom = up_room;
        this.downRoom = down_room;
    }

    public int north(){
        if(this.northRoom == -1){
            System.out.println("I can't go that way.");
            return this.roomNum;
        } else {
            return this.northRoom;
        }
    }

    public int south(){
        if(this.southRoom == -1){
            System.out.println("I can't go that way.");
            return this.roomNum;
        } else {
            return this.southRoom;
        }
    }

    public int east(){
        if(this.eastRoom == -1){
            System.out.println("I can't go that way.");
            return this.roomNum;
        } else {
            return this.eastRoom;
        }
    }

    public int west(){
        if(this.westRoom == -1){
            System.out.println("I can't go that way.");
            return this.roomNum;
        } else {
            return this.westRoom;
        }
    }

    public int northwest(){
        if(this.northWestRoom == -1){
            System.out.println("I can't go that way.");
            return this.roomNum;
        } else {
            return this.northWestRoom;
        }
    }

    public int southeast(){
        if(this.southEastRoom == -1){
            System.out.println("I can't go that way.");
            return this.roomNum;
        } else {
            return this.southEastRoom;
        }
    }

    public int northeast(){
        if(this.northEastRoom == -1){
            System.out.println("I can't go that way.");
            return this.roomNum;
        } else {
            return this.northEastRoom;
        }
    }

    public int southwest(){
        if(this.southWestRoom == -1){
            System.out.println("I can't go that way.");
            return this.roomNum;
        } else {
            return this.southWestRoom;
        }
    }

    public int up(){
        if(this.upRoom == -1){
            System.out.println("I can't go that way.");
            return this.roomNum;
        } else {
            return this.upRoom;
        }
    }

    public int down(){
        if(this.downRoom == -1){
            System.out.println("I can't go that way.");
            return this.roomNum;
        } else {
            return this.downRoom;
        }
    }

    public void inspect(){
        //Logic for inspect command will go here.
    }
}
