package com.company.db;

import com.company.dto.FullInfoDto;
import com.company.util.FullInfoUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FullInfoConnector {
    private static final String SELECT_ALL = "SELECT p.id id, p.weight weight, p.quantity_store quantity_store, p.height height, p.width width, p.type_furniture type_furniture, p.purchase_date purchase_date, b.name_brand name_brand, b.country country, t.name_furniture name_furniture, t.room room FROM product p LEFT JOIN brand b ON  p.name_brand_id=b.id LEFT JOIN typefurniture t ON p.name_furniture_id=t.id";

    public static List<FullInfoDto> getAll() throws SQLException {
        List<FullInfoDto> result = new ArrayList<>();

        Connection connection = DbConnector.getConnection();

        try (
                PreparedStatement statement = connection.prepareStatement(SELECT_ALL);
                ResultSet resultSet = statement.executeQuery()
                ){
            while (resultSet.next()) {
                FullInfoDto dto = FullInfoUtil.toDto(resultSet);
                result.add(dto);
            }
        }

        return  result;
    }
}
