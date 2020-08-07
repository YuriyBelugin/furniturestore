USE furniturestore;

CREATE TABLE product(
id INT NOT NULL AUTO_INCREMENT,
name_furniture_id INT NOT NULL,
weight VARCHAR(255) NOT NULL,
quantity_store INT NOT NULL,
heigt INT NOT NULL,
width INT NOT NULL,
type_furniture VARCHAR(255) NOT NULL,
name_brand_id INT NOT NULL,
purchase_date INT NOT NULL,
PRIMARY KEY (id),
FOREIGN KEY (name_furniture_id) REFERENCES typefurniture(id),
FOREIGN KEY (name_brand_id) REFERENCES brand(id)
)