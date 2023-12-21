package HW_1.shop;

public class Product {
    public Integer getCost() {
        return cost;
    }

    private Integer cost; // Стоимость продукта
    private String title; // Название

    // Геттеры, сеттеры:
//    public int getCost() {
//        return cost;
//    }

    @Override
    public boolean equals(Object obj) {
        Product product = (Product) obj;
        return getTitle().equals(product.title) && getCost() == product.cost;
    }

    @Override
    public String toString() {
        return "Product{" +
                "cost=" + cost +
                ", title='" + title + '\'' +
                '}';
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
