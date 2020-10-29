package com.nc.autumn2020.solutions.lesson3;

/**
 * Class for store product descriptions
 *
 * @author Ilya Nemolyaev
 * @version 1.0
 */
public class Product {

    //required fields
    private int id;
    private String name;
    private double price;

    //optional fields
    private String description;
    private String manufacturer;
    private String equipment;

    public Product(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.price = builder.price;
        this.description = builder.description;
        this.manufacturer = builder.manufacturer;
        this.equipment = builder.equipment;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getEquipment() {
        return equipment;
    }

    public void setEquipment(String equipment) {
        this.equipment = equipment;
    }

    public static class Builder {
        //required fields
        private int id;
        private String name;
        private double price;

        //optional fields
        private String description = "unknown";
        private String manufacturer = "unknown";
        private String equipment = "not indicated";

        /**
         * Constructor for Builder of Product
         * @param id starts from 1
         * @param name include type and model
         * @param price in US currency
         */
        public Builder(int id, String name, double price) {
            this.id = id;
            this.name = name;
            this.price = price;
        }

        public Builder description(String description) {
            this.description = description;
            return this;
        }

        public Builder manufacturer(String manufacturer) {
            this.manufacturer = manufacturer;
            return this;
        }

        public Builder equipment(String equipment) {
            this.equipment = equipment;
            return this;
        }

        public Product build() {
            return new Product(this);
        }
    }

    @Override
    public String toString() {
        return  id + ".\t" +
                name + "\n" +
                description + "\t\t\t" +
                price + "$\n" +
                "manufacturer: " + manufacturer + "\n" +
                "equipment: " + equipment;
    }
}
