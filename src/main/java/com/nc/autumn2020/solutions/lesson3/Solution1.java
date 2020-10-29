package com.nc.autumn2020.solutions.lesson3;

public class Solution1 {

    public void run(String[] args){
        System.out.println("some solution implementation example");
        Product product = new Product.Builder(1, "Laptop Dell X30D", 249.99).
                description("New generation of high technology's").
                manufacturer("Dell").
                equipment("laptop, charger, battery, adapter").
                build();
        System.out.println(product);
    }
}
