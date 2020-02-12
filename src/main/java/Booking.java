public class Booking {

    private Bedroom bedroom;
    private Guest guest;
    private int nights;

    public Booking(Bedroom bedroom, Guest guest, int nights){
        this.bedroom = bedroom;
        this.guest = guest;
        this.nights = nights;
    }


    public Bedroom getBedroom() {
        return this.bedroom;
    }

    public int getBill() {
        return this.nights * this.bedroom.getNightlyRate();
    }
}
