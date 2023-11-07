package Tests;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import seminars.first.Shop.*;

import java.util.List;

public class ShopTest {
    // тест для проверки корректности работы метода getMostExpensiveProduct
    @Test
    public void testGetMostExpensiveProduct() {
        Shop shop = new Shop();
        Product product1 = new Product(10, "Product 1");
        Product product2 = new Product(30, "Product 2");
        Product product3 = new Product(20, "Product 3");
        shop.addProduct(product1);
        shop.addProduct(product2);
        shop.addProduct(product3);
        Product mostExpensiveProduct = shop.getMostExpensiveProduct();
        Assertions.assertThat(mostExpensiveProduct.getTitle()).isEqualTo("Product 2");
    }

    // тест для проверки корректности работы метода sortProductsByPrice
    @Test
    public void testSortProductsByPrice() {
        Shop shop = new Shop();
        Product product1 = new Product(10, "Product 1");
        Product product2 = new Product(30, "Product 2");
        Product product3 = new Product(20, "Product 3");
        shop.addProduct(product1);
        shop.addProduct(product2);
        shop.addProduct(product3);
        List<Product> sortedProducts = shop.sortProductsByPrice();
        Assertions.assertThat(sortedProducts.get(0).getTitle()).isEqualTo("Product 1");
        Assertions.assertThat(sortedProducts.get(1).getTitle()).isEqualTo("Product 3");
        Assertions.assertThat(sortedProducts.get(2).getTitle()).isEqualTo("Product 2");
    }
}
