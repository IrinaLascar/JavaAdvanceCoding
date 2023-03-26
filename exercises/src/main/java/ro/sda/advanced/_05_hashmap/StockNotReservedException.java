package ro.sda.advanced._05_hashmap;
public class StockNotReservedException extends RuntimeException{
    public StockNotReservedException(String message) {
        super(message);
    }
}