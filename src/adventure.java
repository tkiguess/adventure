import java.util.Scanner;

public class adventure {
    public static void main(String[] angs) {

        Scanner keyboard = new Scanner(System.in);
        String response;


        System.out.println("Welcome to willy wonkas house (not factory)");
        System.out.println("you just entered the house. Go upstairs or downstairs: ");
        response = keyboard.nextLine();


        while (!response.equalsIgnoreCase("q")) {

            if (response.contains("upstairs")) {
                System.out.println("you just ran upstairs. Go in Bathroom, Bedroom, or closet");
                response = keyboard.next();

                if (response.contains("bathroom")) {
                    System.out.println("your'e in the bathroom, there is a spider do you kill it? y or n:");
                    response = keyboard.next();
                    if (response.contains("y")) {
                        System.out.println("you died. the end");
                        break;
                    } else if (response.contains("n")) {
                        System.out.println("dope.");
                        break;
                    }
                }


                if (response.contains("bedroom")) {
                    System.out.println("you just found a giant magical marshmallow. do you scoopty woop? y or n");
                    response = keyboard.next();
                    if (response.contains("y")) {
                        System.out.println("you died. the end");
                        break;
                    } else if (response.contains("n")) {
                        System.out.println("dope.");
                        break;
                    }
                }

                if (response.contains("closet")) {
                    System.out.println("you open the closet door, you see NARNIA do you go in? y or n");
                    response = keyboard.next();
                    if (response.contains("y")) {
                        System.out.println("you died. the end");
                        break;
                    } else if (response.contains("n")) {
                        System.out.println("dope.");
                        break;
                    }
                } else {
                    System.out.println("try again");
                    response = keyboard.next();
                }
            } else if (response.contains("downstairs")) {
                System.out.println("you just ran downstairs. Go in the patio, the wormhole, or the dungeon: ");
                response = keyboard.next();

                if (response.contains("patio")) {
                    System.out.println("your'e in the patio, and theres a cow. Do you teach it spanish? y or n:");
                    response = keyboard.next();
                    if (response.contains("y")) {
                        System.out.println("the cow over powered you with its vast knowledge of underwater jellyfish. the end");
                        break;
                    } else if (response.contains("n")) {
                        System.out.println("dope.");
                        break;
                    }
                }


                if (response.contains("wormhole")) {
                    System.out.println("you stepped in the wormhole, and you cease to exist, Do you scoopty woop? y or n");
                    response = keyboard.next();
                    if (response.contains("y")) {
                        System.out.println("you died. the end");
                        break;
                    } else if (response.contains("n")) {
                        System.out.println("dope.");
                        break;
                    }
                }

                if (response.contains("dungeon")) {
                    System.out.println("You go in the dungeon, and see an infinite headed nuclear blasting hydra. Do you clip its toenails? y or n");
                    response = keyboard.next();
                    if (response.contains("y")) {
                        System.out.println("Trick question, you just wokeup from a dream. welcome to reality");
                        break;
                    } else if (response.contains("n")) {
                        System.out.println("you died big boi.");
                        break;
                    }
                } else {
                    System.out.println("try again");
                    response = keyboard.next();
                }
            }
            System.out.println("didnt get that big boi, try again");
            response = keyboard.next();
        }

    }

}
