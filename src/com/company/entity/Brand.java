package com.company.entity;

public class Brand {

    private int id;
    private String name_brand;
    private String country;

    public Brand(int id, String name_brand, String country) {
        this.id = id;
        this.name_brand = name_brand;
        this.country = country;
    }

    public int getId() {
        return id;
    }

    public String getName_brand() {
        return name_brand;
    }

    public String getCountry() {
        return country;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName_brand(String name_brand) {
        this.name_brand = name_brand;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Brand{" +
                "id=" + id +
                ", name_brand='" + name_brand + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
