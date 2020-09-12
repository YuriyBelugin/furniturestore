package com.company.reader;

import com.company.entity.Brand;
import com.company.entity.Product;
import com.company.util.BrandUtil;
import com.company.util.ProductUtil;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ProductReader {
    private String filepath;

    public ProductReader(String filepath) {
        this.filepath = filepath;
    }

    public List<Product> readProducts() {
        List<Product> products = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filepath))){
            String line = reader.readLine();

            while ((line = reader.readLine()) !=null){
                Product product = ProductUtil.toObject(line);

                products.add(product);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return products;
    }
}
