package com.company.dto;

public class FullInfoDto {
    private int id;
    private int weight;
    private int quantity_store;
    private int height;
    private int width;
    private String type_furniture;
    private int purchase_date;
    private String name_brand;
    private String country;
    private String name_furniture;
    private String room;

    public FullInfoDto(int id, int weight, int quantity_store, int height, int width, String type_furniture, int purchase_date, String name_brand, String country, String name_furniture, String room) {
        this.id = id;
        this.weight = weight;
        this.quantity_store = quantity_store;
        this.height = height;
        this.width = width;
        this.type_furniture = type_furniture;
        this.purchase_date = purchase_date;
        this.name_brand = name_brand;
        this.country = country;
        this.name_furniture = name_furniture;
        this.room = room;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getPurchase_date() {
        return purchase_date;
    }

    public void setPurchase_date(int purchase_date) {
        this.purchase_date = purchase_date;
    }

    public String getName_brand() {
        return name_brand;
    }

    public void setName_brand(String name_brand) {
        this.name_brand = name_brand;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getName_furniture() {
        return name_furniture;
    }

    public void setName_furniture(String name_furniture) {
        this.name_furniture = name_furniture;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    @Override
    public String toString() {
        return "FullInfoDto{" +
                "id=" + id +
                ", weight=" + weight +
                ", quantity_store=" + quantity_store +
                ", height=" + height +
                ", width=" + width +
                ", type_furniture='" + type_furniture + '\'' +
                ", purchase_date=" + purchase_date +
                ", name_brand='" + name_brand + '\'' +
                ", country='" + country + '\'' +
                ", name_furniture='" + name_furniture + '\'' +
                ", room='" + room + '\'' +
                "}\n";
    }
}
