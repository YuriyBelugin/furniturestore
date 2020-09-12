package com.company.db;

import com.company.entity.Brand;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class TypeFurnitureConnector {
    private static final String ADD = "INSERT INTO brand (id, name_brand, country) VALUES(?, ?, ?)";

    public static void add(Brand brand) throws SQLException {
        Connection connection = DbConnector.getConnection();

        try (
            PreparedStatement statement = connection.prepareStatement(ADD)
        ) {


            statement.setInt(1, brand.getId());
            statement.setString(2, brand.getName_brand());
            statement.setString(3, brand.getCountry());

            statement.executeUpdate();
        }
    }
}
