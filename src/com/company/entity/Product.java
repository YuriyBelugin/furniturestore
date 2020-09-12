package com.company.entity;

public class Product {
    private int id;
    private int name_furniture_id;
    private int weight;
    private int quantity_store;
    private int height;
    private int width;
    private String type_furniture;
    private int name_brand_id;
    private int purchase_date;

    public Product(int id, int name_furniture_id, int weight, int quantity_store, int height, int width, String type_furniture, int name_brand_id, int purchase_date) {
        this.id = id;
        this.name_furniture_id = name_furniture_id;
        this.weight = weight;
        this.quantity_store = quantity_store;
        this.height = height;
        this.width = width;
        this.type_furniture = type_furniture;
        this.name_brand_id = name_brand_id;
        this.purchase_date = purchase_date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getName_furniture_id() {
        return name_furniture_id;
    }

    public void setName_furniture_id(int name_furniture_id) {
        this.name_furniture_id = name_furniture_id;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getQuantity_store() {
        return quantity_store;
    }

    public void setQuantity_store(int quantity_store) {
        this.quantity_store = quantity_store;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public String getType_furniture() {
        return type_furniture;
    }

    public void setType_furniture(String type_furniture) {
        this.type_furniture = type_furniture;
    }

    public int getName_brand_id() {
        return name_brand_id;
    }

    public void setName_brand_id(int name_brand_id) {
        this.name_brand_id = name_brand_id;
    }

    public int getPurchase_date() {
        return purchase_date;
    }

    public void setPurchase_date(int purchase_date) {
        this.purchase_date = purchase_date;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name_furniture_id=" + name_furniture_id +
                ", weight=" + weight +
                ", quantity_store=" + quantity_store +
                ", height=" + height +
                ", width=" + width +
                ", type_furniture='" + type_furniture + '\'' +
                ", name_brand_id=" + name_brand_id +
                ", purchase_date=" + purchase_date +
                '}';
    }
}
