import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int room_num = 0;
        boolean leave = false;
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Welcome to The Great Adventure!");
        boolean[] room_visited = {false, false, false, false, false, false, false, false};

        do{
            //Rooms
            switch (room_num) {
                case 0:
                    //Starting room
                    
            }

            if(!room_visited[room_num]){
                room_visited[room_num] = true;
            }

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
