public class Room
{
    int number;
    int beds;
    boolean occupied;
    String guestName;
    
    public Room(int number){
        this.number = number;
    }
    
    public Room(int number, int beds){
        this.number = number;
        this.beds = beds;
    }
    
    public void checkIn(String guestName){
        this.guestName = guestName;
        this.occupied = true;
    }
    
    public void checkOut(){
        this.guestName = "";
        this.occupied = false;
    }
    
    public void isOccupied(){
        System.out.println((this.occupied) ? "The room is occupied." : "The room is free.");
    }

    public void displayStatus(){
        System.out.println("Room " + this.number);
        System.out.println("No of beds: " + this.beds);
        System.out.println((this.occupied) ? "The room is occupied." : "The room is free.");
        System.out.println((this.occupied) ? ("Guest name" + this.guestName) : ("Guest name: None"));
    }    
    
    public static void displayRoom(Room room){
        System.out.println("Room " + room.number + ", No of beds: " + room.beds + ((room.occupied) ? (" The room is occupied by " + room.guestName + ".") : " The room is free."));
    }
    
    public static void displayRoomWithBeds(Room[] rooms, int noOfBeds){
        
        for (int i=0;i<rooms.length;i++){
            if(rooms[i].beds == noOfBeds){
                displayRoom(rooms[i]);
            }
        }
    }
    
    public static void countVacantAndOccupiedRooms(Room[] rooms){
        int occupied = 0;
        int vacant = 0;
        
        for (int i=0;i<rooms.length;i++){
            if(rooms[i].occupied){
                occupied++;
            }
            else{
                vacant++;
            }
        }
        
        System.out.println(occupied + " rooms are occupied. " + vacant + " rooms are vacant.");
    }
    
    public static void countVacantAndOccupiedBeds(Room[] rooms){
        int beds = 0;
        
        for (int i=0;i<rooms.length;i++){
            if(!rooms[i].occupied){
                beds += rooms[i].beds;
            }
            
        }
        
        System.out.println(beds + " beds are available. ");
    }
    
    public static void main(String[] args){
        Room[] rooms = new Room[6];
        rooms[0] = new Room(1, 2);
        rooms[1] = new Room(2, 2);
        rooms[2] = new Room(3, 2);
        rooms[3] = new Room(4, 3);
        rooms[4] = new Room(5, 3);
        rooms[5] = new Room(6, 1);
        
        displayRoom(rooms[0]);
        displayRoomWithBeds(rooms, 2);
        countVacantAndOccupiedRooms(rooms);
        countVacantAndOccupiedBeds(rooms);
        
    }
}
