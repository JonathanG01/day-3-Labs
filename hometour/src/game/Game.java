package game;

import java.util.*;     // required for ArrayList
import gameobjects.Actor;
import gameobjects.Room;
import globals.Direction;

public class Game {

    private ArrayList <Room>map; //map, arraylist 
    private Actor player;  

    List<String> commands = new ArrayList<>(Arrays.asList(
                    "n", "s", "w", "e"));
    
    public Game() {
        map = new ArrayList<Room>(); 
             //    Room( name,   description)
        map.add(new Room("the living room", "There's only a small T.V and a white old sofa\n, looks like this person lives a minimalist style", Direction.NOEXIT, 2, Direction.NOEXIT, 1));
        map.add(new Room("the gaming room", "such a big room resides in this house?\n this room must be at least half the size bigger"
        		+ " from the previous one,"+ "there's everything a gamer would ever need\n, a 65 inch TV, king size bed, mini fridge, a gaming computer and even a projector to watch movies!", Direction.NOEXIT, Direction.NOEXIT, 0, Direction.NOEXIT));
        map.add(new Room("the bathroom", "it seems the bathroom has not been cleaned in a while\n, his toothbrush is just laying there on the sink," +
        		"you can't even see your reflection on the mirror due to how dirty it is\n! Even mold is growing on the walls, yuck! ", 0, Direction.NOEXIT, Direction.NOEXIT, 3));
        map.add(new Room("the kitchen", "to your surpise this is quite clean\n, not a single dirty dish on the sink," +
        		"his fridge is full with fresh fruits and vegetables, not to mention his floor is squeaky clean, what a more odd individual.", Direction.NOEXIT, Direction.NOEXIT, 2, Direction.NOEXIT));
        
        //player
        player = new Actor("player", "a loveable game-player", map.get(0));
    }

    // map
    private ArrayList getMap() {
        return map;
    }

    private void setMap(ArrayList<Room> aMap) {
        map = aMap;
    }

    // player
    public Actor getPlayer() {
        return player;
    }

    public void setPlayer(Actor aPlayer) {
        player = aPlayer;
    }

    // move person to room
    private void moveActorTo(Actor p, Room aRoom) {
        p.setLocation(aRoom);
    }

    
    private int moveTo(Actor anActor, Direction dir) {
         Room r = anActor.getLocation();
        int exit;

        switch (dir) {
            case NORTH:
                exit = r.getN();
                break;
            case SOUTH:
                exit = r.getS();
                break;
            case EAST:
                exit = r.getE();
                break;
            case WEST:
                exit = r.getW();
                break;
            default:
                exit = Direction.NOEXIT; 
                break;
        }
        if (exit != Direction.NOEXIT) {
            moveActorTo(anActor, map.get(exit));
        }
        return exit;
    }

    public int movePlayerTo(Direction dir) {
            
        return moveTo(player, dir);
    }

    private void goN() {
        updateOutput(movePlayerTo(Direction.NORTH));
    }

    private void goS() {
        updateOutput(movePlayerTo(Direction.SOUTH));
    }

    private void goW() {
        updateOutput(movePlayerTo(Direction.WEST));
    }

    private void goE() {
        updateOutput(movePlayerTo(Direction.EAST));
    }

    private void updateOutput(int roomNumber) {
            
        String s;
        if (roomNumber == Direction.NOEXIT) {
            s = "there is no door there, try something else!";
        } else {
            Room r = getPlayer().getLocation();
            s = "You have reached "
                    + r.getName() + ". " + r.getDescription();
        }
        System.out.println(s);
    }

    public String processVerb(List<String> o) {
        String v;
        String msg = "";
        
        v = o.get(0);
        if (!commands.contains(v)) {
            msg = v + " is unkown ";
        } else {
            switch (v) {
                case "n":
                    goN();
                    break;
                case "s":
                    goS();
                    break;
                case "w":
                    goW();
                    break;
                case "e":
                    goE();
                    break;
                default:
                    msg = v + " is unkown";
                    break;
            }
        }
        return msg;
    }

    public String processVerbNoun(List<String> z) {
        String x;
        String l;
        String msg = "";
        
        x = z.get(0);
        l = z.get(1);
        if (!commands.contains(x)) {
            msg = x + " is unkown ";
        }
        else
        msg += " still working on it! try again";
        return msg;
    }

    public String parseCommand(List<String> y) {
        String msg;
        if (y.size() == 1) {
            msg = processVerb(y);
        } else if (y.size() == 2) {
            msg = processVerbNoun(y);
        } else {
            msg = "is unknown";
        }
        return msg;}
    

    public static List<String> wordList(String input) {        
        String delims = "[ \t,.:;?!\"']+"; //not allowed
        List<String> strlist = new ArrayList<>();      
        String[] words = input.split(delims);
    
        for (String word : words) {
            strlist.add(word);
        }        
        return strlist;
    }

    public void showIntro(){
        String s;
        s = "Welcome to my home\n"+
                "it's located in Texas and it's quite hot here!\n" +
                "you can only go foward, back and side to side, n = north, s = south, w = west, and e = east [Enter n, s, w or e]?\n" +
                "(or type q to quit)";
        System.out.println(s);
    }
    
    public String runCommand(String x) {
        List<String> wordlist;
        String s = "thank you for playing";
        String lowstr = x.trim();        
        if (!lowstr.equals("q")) {
            if (lowstr.equals("")) {
                s = "You must enter a command";
            } else {
                wordlist = wordList(lowstr);                
                s = parseCommand(wordlist);
            }
        }
        return s;
    }

}
