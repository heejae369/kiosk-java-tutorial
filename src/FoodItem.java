public class FoodItem {

    private String name;
    private Integer price;

    public String getName() {
        return name;
    }

    public Integer getPrice() {
        return price;
    }

    public FoodItem(String name, Integer price) {
        this.name = name;
        this.price = price;
    }

    public void setPrice(Integer newPrice) {
        this.price = newPrice;
    }

}
