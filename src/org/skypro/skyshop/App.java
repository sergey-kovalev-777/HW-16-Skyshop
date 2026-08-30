package org.skypro.skyshop;

import org.skypro.skyshop.product.Product;
import org.skypro.skyshop.basket.ProductBasket;

public class App {
    public static void main(String[] args) {
        Product p1 = new Product("Ноутбук", 50000);
        Product p2 = new Product("Мышь", 1500);
        Product p3 = new Product("Клавиатура", 3000);
        Product p4 = new Product("Монитор", 20000);
        Product p5 = new Product("Наушники", 2500);
        Product p6 = new Product("Веб-камера", 4000); // лишний, чтобы проверить переполнение

        ProductBasket basket = new ProductBasket();

        // 1. Добавление продукта в корзину
        basket.addProduct(p1);

        // 2. Добавление нескольких продуктов (чтобы занять почти всё)
        basket.addProduct(p2);
        basket.addProduct(p3);
        basket.addProduct(p4);
        basket.addProduct(p5);

        // 3. Добавление продукта в заполненную корзину
        basket.addProduct(p6); // должно вывести: «Невозможно добавить продукт»

        // 4. Печать содержимого корзины с несколькими товарами
        basket.printBasket();

        // 5. Получение стоимости корзины с несколькими товарами
        System.out.println("Общая стоимость: " + basket.getTotalCost());

        // 6. Поиск товара, который есть в корзине
        System.out.println("Есть ли 'Клавиатура': " + basket.containsProductByName("Клавиатура"));

        // 7. Поиск товара, которого нет в корзине
        System.out.println("Есть ли 'Принтер': " + basket.containsProductByName("Принтер"));

        // 8. Очистка корзины
        basket.clear();

        // 9. Печать содержимого пустой корзины
        basket.printBasket();

        // 10. Получение стоимости пустой корзины
        System.out.println("Стоимость пустой корзины: " + basket.getTotalCost());

        // 11. Поиск товара по имени в пустой корзине
        System.out.println("Есть ли 'Ноутбук' в пустой корзине: " + basket.containsProductByName("Ноутбук"));
    }
}
