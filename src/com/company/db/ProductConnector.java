package com.company.db;

import com.company.entity.Product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProductConnector {
    private static final String ADD = "INSERT INTO product (id, name_furniture_id, weight, quantity_store, height, width, type_furniture, name_brand_id, purchase_date) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)";

    public static void add(Product product) throws SQLException {
        Connection connection = DbConnector.getConnection();

        try (
                PreparedStatement statement = connection.prepareStatement(ADD)
        ) {
            statement.setInt(1, product.getId());
            statement.setInt(2, product.getName_furniture_id());
            statement.setInt(3, product.getWeight());
            statement.setInt(4, product.getQuantity_store());
            statement.setInt(5, product.getHeight());
            statement.setInt(6, product.getWidth());
            statement.setString(7, product.getType_furniture());
            statement.setInt(8, product.getName_brand_id());
            statement.setInt(9, product.getPurchase_date());

            statement.executeUpdate();
        }
    }
}
