import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int room_num = 0;
        int current_room = -1; //If -1 the current room is actually 0, but current_room is set this way so the intro is read.
        boolean leave = false;
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Welcome to The Great Adventure!");
        System.out.println();
        System.out.println("\033[3mYou open your eyes and look around, trying to get your barings.\033[0m");
        System.out.println();
        boolean[] room_visited = {false, false, false, false, false, false, false, false};
        RoomDescriptions room_descriptions = new RoomDescriptions();
        PlayerInput player_input = new PlayerInput();

        do{
            //Rooms:
            if(current_room != room_num){
                switch (room_num) {
                    case 0:
                        //Starting room
                        System.out.println("\033[1mThe Grand Stand\033[0m");
                        if(!room_visited[0]){
                            room_descriptions.The_Grand_Stand("first");
                        }
                        current_room = 0;
                }
            }

            //Continuous events:
            if(room_num == 0 && room_visited[0]){
                room_descriptions.The_Grand_Stand("subsequent");
            }

            //Set rooms visited:
            if(!room_visited[room_num]){
                room_visited[room_num] = true;
            }

            //Player input:
            System.out.println();
            System.out.println("What would you like to do?:");
            System.out.print("> ");
            String userInput = inputScanner.nextLine();
            System.out.println();

            //Player actions:
            if (userInput.equalsIgnoreCase("test")) {
                player_input.test();
            } else if (userInput.equalsIgnoreCase("quit")) {
                player_input.quit(true, inputScanner);
            } else if (userInput.equalsIgnoreCase("echo")){
                System.out.println("Please state either 'echo on' or 'echo off.'");
            } else if (userInput.equalsIgnoreCase("echo off")) {
                System.out.println("The echo is already off.");
            } else if (userInput.equalsIgnoreCase("echo on")) {
                player_input.echo(inputScanner);
            }

            System.out.println();

            //quit logic
            leave = player_input.quit();
        }
        while (leave == false);  
    }
}
