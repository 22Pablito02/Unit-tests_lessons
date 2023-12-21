package HW_1.shop;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;


public class ShopTest {

    private List<Product> productList;
    private Shop shop;
    private Product product1;
    private Product product2;
    private Product product3;



    @BeforeEach
    void setup() {
        shop = new Shop();
        productList = new ArrayList<>();

        product1 = new Product();
        product1.setTitle("apple");
        product1.setCost(20);

        product2 = new Product();
        product2.setTitle("pear");
        product2.setCost(40);

        product3 = new Product();
        product3.setTitle("carrot");
        product3.setCost(10);

        productList.add(product1);
        productList.add(product2);
        productList.add(product3);

        shop.setProducts(productList);
    }

    @Test

        // Метод проверяет, что список продуктов сформирован и действительно содержит 3 продукта, которые были добавлены
        // при инициализации

    void getProducts() {
        assertThat(productList).hasSize(3).contains(product1, product2, product3);
    }

    @Test
// Метод позволяет взять из нашего списка продуктов их заголовки (поле title) - .extracting(Product::getTitle)
// а затем сравнить с сопоставлением, которое мы ожидаем после сортировки .containsExactly("carrot", "apple", "pear")

    void sortProductsByPrice() {
        shop.setProducts(productList);
        List<Product> sortProductList = new ArrayList<>();
        sortProductList = shop.sortProductsByPrice();

           // Вариант преподавателя
        assertThat(sortProductList)
                .extracting(Product::getTitle)
                .containsExactly("carrot", "apple", "pear");
    }

    @Test
        // Метод проверяет действительно ли самым дорогим продуктом в нашем списке является груша
    void getMostExpensiveProduct() {
        shop.setProducts(productList);
        assertTrue(product2.equals(shop.getMostExpensiveProduct()));
    }
}
