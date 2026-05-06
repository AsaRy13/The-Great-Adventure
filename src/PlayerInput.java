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

    public int north(){
        if(this.northRoom == -1){
            System.out.println("I can't go that way.");
            return this.roomNum;
        } else {
            return this.northRoom;
        }
    }
    public int north(int set){
        this.northRoom = set;
        return this.northRoom;
    }

    public void inspect(){
        //Logic for inspect command will go here.
    }
}
