package com.company;

import com.company.db.TypeFurnitureConnector;
import com.company.entity.Brand;
import com.company.entity.TypeFurniture;
import com.company.reader.BrandReader;
import com.company.reader.TypeFurnitureReader;

import java.sql.SQLException;
import java.util.List;

import static com.company.reader.ReaderConstants.BRAND_IMPORT_FILE;
import static com.company.reader.ReaderConstants.FURNITURE_IMPORT_FILE;

public class Main {

    public static void main(String[] args) {
//        TypeFurnitureReader typeFurnitureReader = new TypeFurnitureReader(FURNITURE_IMPORT_FILE);
//        List<TypeFurniture>  typeFurniture = typeFurnitureReader.readTypeFurniture();

//        System.out.println(typeFurniture);

        BrandReader brandReader = new BrandReader(BRAND_IMPORT_FILE);
        List<Brand>  brand =brandReader.readBrands();

        System.out.println(brand);

//        for (TypeFurniture typeFurniture1 : typeFurniture){
//            try {
//                TypeFurnitureConnector.add(typeFurniture1);
//            }catch (SQLException e) {
//                e.printStackTrace();
//            }
//        }

        for (Brand brand1 : brand){
            try {
                TypeFurnitureConnector.add(brand1);
            }catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }
}
