package com.company.db;

import com.company.entity.TypeFurniture;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BrandConnector {
    private static final String ADD = "INSERT INTO typefurniture (id, name_furniture, room) VALUES(?, ?, ?)";

    public static void add(TypeFurniture typeFurniture) throws SQLException {
        Connection connection = DbConnector.getConnection();

        try (
                PreparedStatement statement = connection.prepareStatement(ADD)
        ) {


            statement.setInt(1, typeFurniture.getId());
            statement.setString(2, typeFurniture.getName_furniture());
            statement.setString(3, typeFurniture.getRoom());

            statement.executeUpdate();
        }
    }
}
