package Domain;

public class NoteBook implements Equipment{

    private String model; //型号
    private String price; //价格

    public NoteBook() {
    }

    public NoteBook(String model, String price) {
        this.model = model;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String getDescription() {
        return model + "("+ price + ")";
    }
}
