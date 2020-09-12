package com.company.util;

import com.company.entity.Product;

import static com.company.reader.ReaderConstants.CSV_DELIMITER;

public class ProductUtil {
    public static Product toObject(String line){
        String[] productFields = line.split(CSV_DELIMITER);

        int id = Integer.parseInt(productFields[0]);
        int name_furniture_id =Integer.parseInt(productFields[1]);
        int weight =Integer.parseInt(productFields[2]);
        int quantity_store =Integer.parseInt(productFields[3]);
        int height =Integer.parseInt(productFields[4]);
        int width =Integer.parseInt(productFields[5]);
        String type_furniture =productFields[6];
        int name_brand_id =Integer.parseInt(productFields[7]);
        int purchase_date =Integer.parseInt(productFields[8]);
        return new Product(id, name_furniture_id, weight, quantity_store, height, width, type_furniture, name_brand_id, purchase_date);

    }
}
