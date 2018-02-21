import java.util.Scanner ;
public class Adventure
{
    public static Scanner sc;
    public static void main(String[] arge) {
        String playerName;
        
        sc = new Scanner(System.in);
        
        System.out.println("greetings adventurer! Please enter your credit card information:");
        
        playerName = sc.nextLine();
        
        System.out.println("Ah, don't worry i'll treat this information " + playerName + " , with care.");
        StartRoom();
    }

    public static void StartRoom() {
        System.out.println("You Find yourself in a dark room.");
        System.out.println("All you can see is two glowing red buttons on the wall.");
        System.out.println("Will you press the right one, the left one or will you wait [ENTER: right or left or wait]" );
        
        String buttonChoice = sc.nextLine();
        
        if (buttonChoice.equals("right")) {    
        System.out.println("A trap door opened up below you and you begin to fall");
        System.out.println("You land on lava and start to sizzle and pop at the surface");
        System.out.println("You died");
    }
    
        if (buttonChoice.equals("left")) {
        System.out.println("The ceiling opens up to reveal a Wii U falling at several hundred Km per Hr" );
        System.out.println("You don't realize whats happening since it's dark, and the Wii U hits you staight on the head." );
        System.out.println("You die");
    }
    
        if (buttonChoice.equals("wait")) {
        System.out.println("You wait for what seems like hours");
        System.out.println("After a while the police show up to rescue you");
        System.out.println("After a few question a nice police officer brings you home");
        System.out.println("You live happily ever after");
        System.out.println("Just kidding, none of that happened. The door to the next room opens though.");
        System.out.println("You advance to the next room, your journey continues!");
    }
}
}

    