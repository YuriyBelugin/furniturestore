package com.company.reader;

import com.company.entity.TypeFurniture;
import com.company.util.TypeFurnitureUtil;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TypeFurnitureReader {
    private String filepath;

    public TypeFurnitureReader(String filepath) {
        this.filepath = filepath;
    }

    public List<TypeFurniture> readTypeFurniture() {
        List<TypeFurniture> furniture = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filepath))) {
            String line = reader.readLine();

            while ((line = reader.readLine()) != null) {


                TypeFurniture typeFurniture = TypeFurnitureUtil.toObject(line);

                furniture.add(typeFurniture);
            }
        } catch (IOException e) {
            e.printStackTrace();

        }
        return furniture;

    }
}
