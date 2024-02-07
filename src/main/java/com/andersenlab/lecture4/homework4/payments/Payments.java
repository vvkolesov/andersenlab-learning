package com.andersenlab.lecture4.homework4.payments;

public class Payments {

    //6. Создать класс Payment с внутренним классом, с помощью объектов которого можно сформировать
    // покупку из нескольких товаров.

    public Product getProduct(Product product){
        return product;
    }

    public static class Product {

        private String productName;
        private int productPrice;
        private int productQuantity;

        public Product(String productName, int productPrice, int productQuantity) {
            this.productName = productName;
            this.productPrice = productPrice;
            this.productQuantity = productQuantity;
        }

        public String getProductName() {
            return productName;
        }

        public void setProductName(String productName) {
            this.productName = productName;
        }

        public int getProductPrice() {
            return productPrice;
        }

        public void setProductPrice(int productPrice) {
            this.productPrice = productPrice;
        }

        public int getProductQuantity() {
            return productQuantity;
        }

        public void setProductQuantity(int productQuantity) {
            this.productQuantity = productQuantity;
        }
    }
}
