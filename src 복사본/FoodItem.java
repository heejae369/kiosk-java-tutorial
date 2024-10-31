
public class FoodItem {
    private String name;
    private Integer price;

    public String getName(){
        return name;
    }

    public Integer getPrice(){
        return price;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setPrice(Integer price){
        this.price = price;
    }

    public  FoodItem(String name, Integer price){
        this.name = name;
        this.price = price;
    }

}
