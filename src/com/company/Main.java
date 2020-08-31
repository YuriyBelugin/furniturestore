package com.company;

import com.company.entity.TypeFurniture;
import com.company.reader.TypeFurnitureReader;

import java.util.List;

import static com.company.reader.ReaderConstants.FURNITURE_IMPORT_FILE;

public class Main {

    public static void main(String[] args) {
        TypeFurnitureReader typeFurnitureReader = new TypeFurnitureReader(FURNITURE_IMPORT_FILE);
        List<TypeFurniture>  typeFurniture = typeFurnitureReader.readTypeFurniture();

        System.out.println(typeFurniture);
    }
}
