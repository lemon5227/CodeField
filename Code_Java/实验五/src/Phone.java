/**
 * @author ãÆÎÄ²©
 */
public class Phone {
    String band;
    int price;
    String color;


    @Override
    public String toString() {
        return "Phone{" +
                "band='" + band + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }

    public String getBand() {
        return band;
    }

    public int getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public void setBand(String band) {
        this.band = band;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
