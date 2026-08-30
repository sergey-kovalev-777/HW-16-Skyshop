package org.skypro.skyshop.basket;

import org.skypro.skyshop.product.Product;

public class ProductBasket {
    private final Product[] items = new Product[5];

    public void addProduct(Product product) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = product;
                return;
            }
        }
        System.out.println("Невозможно добавить продукт");
    }

    public int getTotalCost() {
        int total = 0;
        for (Product item : items) {
            if (item != null) {
                total += item.getPrice();
            }
        }
        return total;
    }

    public void printBasket() {
        boolean isEmpty = true;
        for (Product item : items) {
            if (item != null) {
                isEmpty = false;
                System.out.println(item.getName() + ": " + item.getPrice());
            }
        }

        if (isEmpty) {
            System.out.println("в корзине пусто");
        } else {
            System.out.println("Итого: " + getTotalCost());
        }
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
        for (int i = 0; i < items.length; i++) {
            items[i] = null;
        }
    }
}
