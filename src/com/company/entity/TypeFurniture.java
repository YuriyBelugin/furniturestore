package com.company.entity;

public class TypeFurniture {
    private int id;
    private String name_furniture;
    private String room;

    public TypeFurniture(int id, String name_furniture, String room) {
        this.id = id;
        this.name_furniture = name_furniture;
        this.room = room;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
        return "typeFurniture{" +
                "id=" + id +
                ", name_furniture='" + name_furniture + '\'' +
                ", room='" + room + '\'' +
                '}';
    }
}
