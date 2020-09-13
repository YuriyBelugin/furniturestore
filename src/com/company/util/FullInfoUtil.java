package com.company.util;

import com.company.dto.FullInfoDto;
import com.company.reader.ReaderConstants;

import java.sql.ResultSet;
import java.sql.SQLException;

import static com.company.reader.ReaderConstants.CSV_DELIMITER;

public class FullInfoUtil {

    public static FullInfoDto toDto(ResultSet resultSet) throws SQLException {
        int id = resultSet.getInt("id");
        int weight = resultSet.getInt("weight");
        int quantity_store = resultSet.getInt("quantity_store");
        int height = resultSet.getInt("height");
        int width = resultSet.getInt("width");
        String type_furniture = resultSet.getString("type_furniture");
        int purchase_date = resultSet.getInt("purchase_date");
        String name_brand = resultSet.getString("name_brand");
        String country = resultSet.getString("country");
        String name_furniture = resultSet.getString("name_furniture");
        String room = resultSet.getString("room");

        return new FullInfoDto(id, weight, quantity_store, height, width, type_furniture, purchase_date, name_brand, country, name_furniture, room);
    }
    public static String toCsvString(FullInfoDto dto) {
        return dto.getId() + CSV_DELIMITER +
                 dto.getWeight() + CSV_DELIMITER +
                 dto.getQuantity_store() + CSV_DELIMITER +
                 dto.getHeight() + CSV_DELIMITER +
                 dto.getWidth() + CSV_DELIMITER +
                 dto.getType_furniture() + CSV_DELIMITER +
                 dto.getPurchase_date() + CSV_DELIMITER +
                 dto.getName_brand() + CSV_DELIMITER +
                 dto.getCountry() + CSV_DELIMITER +
                 dto.getName_furniture() + CSV_DELIMITER +
                 dto.getRoom() + "\n";
    }
}
