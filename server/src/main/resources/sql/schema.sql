CREATE TABLE category
(
    id   INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
    name VARCHAR(150) NOT NULL
);

CREATE TABLE product
(
    id          INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
    name        VARCHAR(150)  NOT NULL,
    price       DECIMAL(6, 2) NOT NULL,
    weight      VARCHAR(20)   NOT NULL,
    category_id INT           NOT NULL
);

CREATE TABLE menu_name
(
    id   INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
    name VARCHAR(150) NOT NULL,
    logo BLOB         NOT NULL
);

CREATE TABLE menu_header
(
    id INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
    name VARCHAR(150) NOT NULL,
    menu_name_id INT      NOT NULL,
    created_date DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);

CREATE TABLE menu_lines
(
    id             INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
    menu_header_id INT NOT NULL,
    product_id     INT NOT NULL
);

ALTER TABLE product
    ADD CONSTRAINT product_category_id_category_id FOREIGN KEY (category_id) REFERENCES category (id);
ALTER TABLE menu_header
    ADD CONSTRAINT menu_header_menu_name_id_menu_name_id FOREIGN KEY (menu_name_id) REFERENCES menu_name (id);
ALTER TABLE menu_lines
    ADD CONSTRAINT menu_lines_menu_header_id_menu_header_id FOREIGN KEY (menu_header_id) REFERENCES menu_header (id);
ALTER TABLE menu_lines
    ADD CONSTRAINT menu_lines_product_id_product_id FOREIGN KEY (product_id) REFERENCES product (id);
