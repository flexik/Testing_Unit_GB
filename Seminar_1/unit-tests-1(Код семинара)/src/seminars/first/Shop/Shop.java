package seminars.first.Shop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Shop {
    private List<Product> products;

    public Shop() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        this.products.add(product);
    }
    // Геттеры, сеттеры:
    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    // Метод должен вернуть отсортированный по возрастанию по цене список продуктов
    public List<Product> sortProductsByPrice() {
    // Допишите реализацию метода самостоятельно
        Collections.sort(products, Comparator.comparingDouble(Product::getCost));
        return products;
    }

    // Метод должен вернуть самый дорогой продукт
//// Допишите реализацию метода самостоятельно
    public Product getMostExpensiveProduct() {
        Product mostExpensiveProduct = products.get(0);
        for (Product product : products) {
            if (product.getCost() > mostExpensiveProduct.getCost()) {
                mostExpensiveProduct = product;
            }
        }
        return mostExpensiveProduct;
    }
}