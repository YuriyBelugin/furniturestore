package com.company;

import com.company.db.ProductConnector;
import com.company.db.TypeFurnitureConnector;
import com.company.entity.Product;
import com.company.reader.ProductReader;

import java.sql.SQLException;
import java.util.List;

import static com.company.reader.ReaderConstants.*;

public class Main {

    public static void main(String[] args) {
//        TypeFurnitureReader typeFurnitureReader = new TypeFurnitureReader(FURNITURE_IMPORT_FILE);
//        List<TypeFurniture>  typeFurniture = typeFurnitureReader.readTypeFurniture();

//        System.out.println(typeFurniture);

//        BrandReader brandReader = new BrandReader(BRAND_IMPORT_FILE);
//        List<Brand>  brand =brandReader.readBrands();
//
//        System.out.println(brand);

        ProductReader productReader = new ProductReader(PRODUCT_IMPORT_FILE);
        List<Product>  products =productReader.readProducts();

        System.out.println(products);

//        for (TypeFurniture typeFurniture1 : typeFurniture){
//            try {
//                TypeFurnitureConnector.add(typeFurniture1);
//            }catch (SQLException e) {
//                e.printStackTrace();
//            }
//        }
//
//        for (Brand brand1 : brand){
//            try {
//               BrandConnector.add(brand1);
//            }catch (SQLException e) {
//                e.printStackTrace();
//            }
//        }
        for (Product product : products){
            try {
                ProductConnector.add(product);
            }catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }
}
