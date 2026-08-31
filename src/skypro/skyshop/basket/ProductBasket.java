package skypro.skyshop.basket;

import org.skypro.skyshop.product.Product;
import java.util.ArrayList;
import java.util.List;

public class ProductBasket {
    // Лучше использовать List вместо массива фиксированной длины.
    // Это гибче и современнее, плюс в предыдущих шагах мы уже использовали List в примерах.
    private final List<Product> items;

    public ProductBasket() {
        this.items = new ArrayList<>();
    }

    public void addProduct(Product product) {
        items.add(product);
    }

    public int getTotalCost() {
        int total = 0;
        for (Product item : items) {
            total += item.getPrice();
        }
        return total;
    }

    public void print() {
        int totalPrice = 0;
        int specialCount = 0;

        // Проходимся по всем товарам в корзине
        for (Product product : items) {
            // 1. Выводим товар через его собственный toString().
            // Именно здесь сработает магия: обычный товар выведется просто именем,
            // а товар со скидкой или фикс-ценой добавит свой уникальный хвост.
            System.out.println(product.toString());

            // 2. Считаем общую сумму
            totalPrice += product.getPrice();

            // 3. Считаем специальные товары через полиморфный метод isSpecial()
            if (product.isSpecial()) {
                specialCount++;
            }
        }

        // Выводим итоги строго по формату задания
        System.out.println("Итого: " + totalPrice);
        System.out.println("Специальных товаров: " + specialCount);
    }

    public boolean containsProductByName(String name) {
        for (Product item : items) {
            if (item != null && item.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    public void clear() {
        items.clear();
    }
}
