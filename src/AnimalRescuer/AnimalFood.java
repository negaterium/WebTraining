package AnimalRescuer;

public class AnimalFood {

    private String foodname;
    private int price;
    private float qty;
    private String expirationdate;
    private boolean stoc;

    public boolean isStoc() {
        return stoc;
    }

    public void setStoc(boolean stoc) {
        this.stoc = stoc;
    }

    public String getExpirationdate() {
        return expirationdate;
    }

    public void setExpirationdate(String expirationdate) {
        this.expirationdate = expirationdate;
    }

    public float getQty() {
        return qty;
    }

    public void setQty(float qty) {
        this.qty = qty;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getFoodname() {
        return foodname;
    }

    public void setFoodname(String foodname) {
        this.foodname = foodname;
    }
}
