package org.skypro.skyshop;

import org.skypro.skyshop.product.SimpleProduct;
import org.skypro.skyshop.product.DiscountedProduct;
import org.skypro.skyshop.product.FixPriceProduct;
import skypro.skyshop.basket.ProductBasket;

public class App {
    public static void main(String[] args) {
        ProductBasket basket = new ProductBasket();

        // 1. Добавляем обычный товар (НЕ специальный)
        // Ожидается вывод просто имени в корзине
        basket.addProduct(new SimpleProduct("Яблоко", 100));
        basket.addProduct(new SimpleProduct("Банан", 150));

        // 2. Добавляем товар со скидкой (СПЕЦИАЛЬНЫЙ)
        // Цена: 1000 - 20% = 800.
        // Ожидается вывод: "Ноутбук: 800 (20%)"
        basket.addProduct(new DiscountedProduct("Ноутбук", 1000, 20));

        // 3. Добавляем товар с фиксированной ценой (СПЕЦИАЛЬНЫЙ)
        // Цена: 999 (из константы).
        // Ожидается вывод: "Мышка: Фиксированная цена 999"
        basket.addProduct(new FixPriceProduct("Мышка"));

        // 4. Вызываем новый метод печати
        // Он должен вывести список товаров в нужном формате,
        // общую сумму и количество специальных товаров.
        basket.print();
    }
}
