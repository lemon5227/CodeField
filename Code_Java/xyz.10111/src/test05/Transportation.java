package test05;

/**
 * @author ãÆÎÄ²©
 */
abstract class Transportation {
    private String No;
    private String model;
    private String admin;

    public Transportation(String no, String model, String admin) {
        No = no;
        this.model = model;
        this.admin = admin;
    }

    public Transportation() {

    }

    void transport(){

    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getNo() {
        return No;
    }

    public void setNo(String no) {
        No = no;
    }

    public String getAdmin() {
        return admin;
    }

    public void setAdmin(String admin) {
        this.admin = admin;
    }
}
