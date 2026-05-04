import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int room_num = 0;
        boolean leave = false;
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Welcome to The Great Adventure!");
        System.out.println();
        System.out.println("\033[3mYou open your eyes and look around, trying to get your barings.\033[0m");
        System.out.println();
        boolean[] room_visited = {false, false, false, false, false, false, false, false};
        RoomDescriptions room_descriptions = new RoomDescriptions();

        do{
            //Rooms:
            switch (room_num) {
                case 0:
                    //Starting room
                    System.out.println("\033[1mThe Grand Stand\033[0m");
                    if(!room_visited[0]){
                        room_descriptions.The_Grand_Stand(false);
                    }
                    else{
                        room_descriptions.The_Grand_Stand(true);
                    }
            }

            //Set rooms visited:
            if(!room_visited[room_num]){
                room_visited[room_num] = true;
            }

            //Player input:
            System.out.println("What would you like to do?:");
            String userInput = inputScanner.nextLine();

            //Player actions:
            if (userInput.equalsIgnoreCase("test")) {
                System.out.println("Testing");
            } else if (userInput.equalsIgnoreCase("quit")) {
                inputScanner.close();
                leave = true;
            }
        }
        while (leave == false);  
    }
}
