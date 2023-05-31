package com.jspclass;

import java.io.Serializable;

public class ProductBean implements Serializable{
        private String productId;
        private String productName;
        private double price;
        
        public void setProductId(String value) {
                this.productId = value;
        }
        public void setProductName(String value) {
                this.productName = value;
        }
        public void setPrice(double value) {
                this.price = value;
        }
        
        public String getProductId() {
                return this.productId;
        }
        public String getProductName() {
                return this.productName;
        }
        public double getPrice() {
                return this.price;
        }
        

}

