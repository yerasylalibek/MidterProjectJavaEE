package kz.edu.iitu.model;

public class Ticket {

    int id;
    String from;
    String to;
    int price;

    public Ticket() {
    }

    public Ticket(int id, String from, String to, int price) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.price = price;
    }

    public Ticket(String from, String to, int price) {
        this.from = from;
        this.to = to;
        this.price = price;
    }

    public Ticket(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "id=" + id +
                ", from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", price=" + price +
                '}';
    }
}
