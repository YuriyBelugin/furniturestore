package com.company.util;

import com.company.entity.TypeFurniture;

import static com.company.reader.ReaderConstants.CSV_DELIMITER;

public class TypeFurnitureUtil {

    public static TypeFurniture toObject(String line){
        String[] typeFurnitureFields = line.split(CSV_DELIMITER);

        int id = Integer.parseInt(typeFurnitureFields[0]);
        String name = typeFurnitureFields[1];
        String room = typeFurnitureFields[2];

        return new TypeFurniture(id, name, room);

    }
}
