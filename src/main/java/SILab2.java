import java.util.List;

class Item {
    String name;
    int quantity; //numerical
    int price;
    double discount;

    public Item(String name, int quantity, int price, double discount) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.discount = discount;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getPrice() {
        return price;
    }

    public double getDiscount() {
        return discount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}


public class SILab2 {
    public static double checkCart(List<Item> allItems, String cardNumber){
        if (allItems == null){                              //1
            throw new RuntimeException("allItems list can't be null!"); //2
        }

        double sum = 0;

        for (int i = 0; i < allItems.size(); i++){ //3
            Item item = allItems.get(i);
            if (item.getName() == null || item.getName().length() == 0){ //4
                throw new RuntimeException("Invalid item!"); //5
            }

            if (item.getPrice() > 300 || item.getDiscount() > 0 || item.getQuantity() > 10){ //6
                sum -= 30;    //7
            }

            if (item.getDiscount() > 0){  //8
                sum += item.getPrice()*(1-item.getDiscount())*item.getQuantity();  //9
            }
            else {
                sum += item.getPrice()*item.getQuantity(); //10
            }

        }
        if (cardNumber != null && cardNumber.length() == 16) { //11
            String allowed = "0123456789";
            char[] chars = cardNumber.toCharArray();
            for (int j = 0; j < cardNumber.length(); j++) { //12
                char c = cardNumber.charAt(j);
                if (allowed.indexOf(c) == -1) { //13
                    throw new RuntimeException("Invalid character in card number!"); //14
                }
            }
        }
        else{
            throw new RuntimeException("Invalid card number!"); //15
        }

        return sum; //16

    }
}