public class CinemaTicket
{
    static String cinemaName = "Multikino";
    String filmTitle;
    int row;
    int seat;
    double price;
    
    CinemaTicket(String filmTitle, int row, int seat){ //constructor!!!!!
        this.filmTitle = filmTitle;
        this.row = row;
        this.seat = seat;
        if(row <=2){
            this.price = 25;
        }else{
            this.price = 10;
        }
    }
    
    void displayInfo(){
        System.out.println("Nazwa kina: " +cinemaName);
        System.out.println("Tytuł filmu: " + filmTitle);
        System.out.println("Rząd: "+row);
        System.out.println("Siedzenie: "+seat);
        System.out.println("Cena: "+ price);
    }


    public static void main(String[] args){
        CinemaTicket ticket1 = new CinemaTicket("klasyczek", 8, 10);
        CinemaTicket ticket2 = new CinemaTicket("dfghjk", 1, 10);
        ticket1.displayInfo();
        ticket2.displayInfo();
    }
}