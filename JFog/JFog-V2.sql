DROP SCHEMA IF EXISTS JFog;
CREATE SCHEMA JFog;
USE JFog;

CREATE TABLE detail(
did INT(5) PRIMARY KEY AUTO_INCREMENT,
length INT(5) NOT NULL,
heigth INT(5) NOT NULL,
width INT(5) NOT NULL,
roof VARCHAR(45)
);

CREATE TABLE carport(
id INT(5) PRIMARY KEY,
carname VARCHAR(45),
measure VARCHAR(45),
price DOUBLE NOT NULL
);

CREATE TABLE product(
pid INT(5) PRIMARY KEY AUTO_INCREMENT,
name VARCHAR(50),
measure DOUBLE NOT NULL
);

CREATE TABLE carportpart(
id INT(5) PRIMARY KEY AUTO_INCREMENT,
FK_product INT(5),
FOREIGN KEY product(FK_product) REFERENCES product(pid),
amount INT(5),
FK_carportid INT(5),
FOREIGN KEY carport(FK_carportid) REFERENCES carport(id)
);

CREATE TABLE carportmaterial(
id INT(5) PRIMARY KEY,
wood_qty INT(10),
screw_qty INT(5),
roof VARCHAR(45),
bracket INT(10),
FK_detailid INT(5),
FOREIGN KEY detail(FK_detailid) REFERENCES detail(did)
);

CREATE TABLE orders(
ono INT(5) PRIMARY KEY AUTO_INCREMENT,
checkout_time DATETIME(6),
delivery_time DATETIME(6),
shipping_price DOUBLE,
carportmaterial_id INT(5),
FOREIGN KEY(carportmaterial_id) REFERENCES carportmaterial(id)
);

CREATE TABLE employee(
id INT(5) PRIMARY KEY AUTO_INCREMENT,
ename VARCHAR(45),
ephone INT(8),
password VARCHAR(50)
);

CREATE TABLE customer(
id INT(5) PRIMARY KEY AUTO_INCREMENT,
fname VARCHAR(45),
lname VARCHAR(45),
adress VARCHAR(100),
cphone INT(8),
mail VARCHAR(50),
FK_ono INT(5),
FOREIGN KEY(FK_ono) REFERENCES orders(ono)
);

INSERT INTO employee(id, ename, ephone, password) Values(1, 'Ali', 12345678, '1234');

INSERT INTO carport(id, carname, measure, price) VALUES(1, 'CP01 DUR', '600x780', 0.0);
INSERT INTO carport(id, carname, measure, price) VALUES(2, 'CAR01 HR', '360x730', 0.0);

-- Carport CP01 DUR
INSERT INTO product(name, measure) VALUES('25x200 mm. trykimp. Brædt', 360);
INSERT INTO product(name, measure) VALUES('25x200 mm. trykimp. Brædt', 540);
INSERT INTO product(name, measure) VALUES('25x125mm. trykimp. Brædt', 360);
INSERT INTO product(name, measure) VALUES('25x125mm. trykimp. Brædt', 540);
INSERT INTO product(name, measure) VALUES('38x73 mm. Lægte ubh.', 420);
INSERT INTO product(name, measure) VALUES('45x95 mm. Reglar ub.', 270);
INSERT INTO product(name, measure) VALUES('45x95 mm. Reglar ub.', 240);
INSERT INTO product(name, measure) VALUES('45x195 mm. spærtræ ubh.', 600);
INSERT INTO product(name, measure) VALUES('45x195 mm. spærtræ ubh.', 480);
INSERT INTO product(name, measure) VALUES('45x195 mm. spærtræ ubh.', 600);
INSERT INTO product(name, measure) VALUES('97x97 mm. trykimp. Stolpe', 300);
INSERT INTO product(name, measure) VALUES('19x100 mm. trykimp. Brædt', 210);
INSERT INTO product(name, measure) VALUES('19x100 mm. trykimp. Brædt', 540);
INSERT INTO product(name, measure) VALUES('19x100 mm. trykimp. Brædt', 360);
INSERT INTO product(name, measure) VALUES('Plastmo Ecolite blåtonet', 600);
INSERT INTO product(name, measure) VALUES('Plastmo Ecolite blåtonet', 360);
INSERT INTO product(name, measure) VALUES('plastmo bundskruer 200 stk.', 0);
INSERT INTO product(name, measure) VALUES('hulbånd 1x20 mm. 10 mtr.', 0);
INSERT INTO product(name, measure) VALUES('universal 190 mm højre', 0);
INSERT INTO product(name, measure) VALUES('universal 190 mm venstre', 0);
INSERT INTO product(name, measure) VALUES('4,5 x 60 mm. skruer 200 stk.', 0);
INSERT INTO product(name, measure) VALUES('4,0 x 50 mm. beslagskruer 250 stk.', 0);
INSERT INTO product(name, measure) VALUES('bræddebolt 10 x 120 mm.', 0);
INSERT INTO product(name, measure) VALUES('firkantskiver 40x40x11mm', 0);
INSERT INTO product(name, measure) VALUES('4,5 x 70 mm. Skruer 400 stk.', 0);
INSERT INTO product(name, measure) VALUES('4,5 x 50 mm. Skruer 300 stk.', 0);
INSERT INTO product(name, measure) VALUES('stalddørsgreb 50x75', 0);
INSERT INTO product(name, measure) VALUES('t hængsel 390 mm', 0);
INSERT INTO product(name, measure) VALUES('vinkelbeslag 35', 0);

-- Carport CAR01 HR
INSERT INTO product(name, measure) VALUES('25x150 mm. trykimp. Bræt', 480);
INSERT INTO product(name, measure) VALUES('25x150 mm. trykimp. Bræt', 600);
INSERT INTO product(name, measure) VALUES('25x150 mm. trykimp. Bræt', 540);
INSERT INTO product(name, measure) VALUES('fædigskåret (byg-selv spær)', 300);
INSERT INTO product(name, measure) VALUES('97x97 mm. trykimp. Stolpe.', 480);
INSERT INTO product(name, measure) VALUES('45x195 spærtræ ubh.', 480);
INSERT INTO product(name, measure) VALUES('45x195 spærtræ ubh.', 240);
INSERT INTO product(name, measure) VALUES('45x95 Reglar ubh.', 360);
INSERT INTO product(name, measure) VALUES('45x95 Reglar ubh.', 480);
INSERT INTO product(name, measure) VALUES('19x100 mm. trykimp. Bræt.', 240);
INSERT INTO product(name, measure) VALUES('19x100 mm. trykimp. Bræt', 210);
INSERT INTO product(name, measure) VALUES('19x100 mm. trykimp. Bræt', 540);
INSERT INTO product(name, measure) VALUES('25x50 mm. trykimp. Bræt', 540);
INSERT INTO product(name, measure) VALUES('38x73 mm. taglægte T1', 540);
INSERT INTO product(name, measure) VALUES('38x73 mm. taglægte T1', 420);
INSERT INTO product(name, measure) VALUES('38x73 mm. taglægte T1', 0);
INSERT INTO product(name, measure) VALUES('B & C Dobbelt -s sort', 0);
INSERT INTO product(name, measure) VALUES('B & C Rygsten sort', 0);
INSERT INTO product(name, measure) VALUES('B & C Toplægte holder', 0);
INSERT INTO product(name, measure) VALUES('B & C rygstensbeslag', 0);
INSERT INTO product(name, measure) VALUES('B & C tagstens bindere & nakkekroge', 0);
INSERT INTO product(name, measure) VALUES('universal 190 mm højre', 0);
INSERT INTO product(name, measure) VALUES('universal 190 mm venstre', 0);
INSERT INTO product(name, measure) VALUES('Stalddørsgreb 50x75', 0);
INSERT INTO product(name, measure) VALUES('T-hængsel 390 mm.', 0);
INSERT INTO product(name, measure) VALUES('Vinkelbeslag', 0);
INSERT INTO product(name, measure) VALUES('4,5 x 60 mm. Skruer 200 stk.', 0);
INSERT INTO product(name, measure) VALUES('5,0 x 40 mm. beslagskruer 250 stk.', 0);
INSERT INTO product(name, measure) VALUES('5,0 x 100 mm. skruer 100 stk.', 0);
INSERT INTO product(name, measure) VALUES('bræddebolt 10 x 120 mm.', 0);
INSERT INTO product(name, measure) VALUES('firkantskiver 40x40x11mm', 0);
INSERT INTO product(name, measure) VALUES('4,5 x 70 mm. Skruer 200 stk.', 0);
INSERT INTO product(name, measure) VALUES('4,5 x 50 mm. Skruer 350 stk.', 0);

-- Carport CP01 DUR
INSERT INTO carportpart(FK_product, amount, FK_carportid) VALUES(1, 4, 1);
INSERT INTO carportpart(FK_product, amount, FK_carportid) VALUES(2, 4, 1);
INSERT INTO carportpart(FK_product, amount, FK_carportid) VALUES(3, 2, 1);
INSERT INTO carportpart(FK_product, amount, FK_carportid) VALUES(4, 4, 1);
INSERT INTO carportpart(FK_product, amount, FK_carportid) VALUES(5, 1, 1);
INSERT INTO carportpart(FK_product, amount, FK_carportid) VALUES(6, 12, 1);
INSERT INTO carportpart(FK_product, amount, FK_carportid) VALUES(7, 4, 1);
INSERT INTO carportpart(FK_product, amount, FK_carportid) VALUES(8, 2, 1);
INSERT INTO carportpart(FK_product, amount, FK_carportid) VALUES(9, 1, 1);
INSERT INTO carportpart(FK_product, amount, FK_carportid) VALUES(10, 15, 1);
INSERT INTO carportpart(FK_product, amount, FK_carportid) VALUES(11, 11, 1);
INSERT INTO carportpart(FK_product, amount, FK_carportid) VALUES(12, 200, 1);
INSERT INTO carportpart(FK_product, amount, FK_carportid) VALUES(13, 4, 1);
INSERT INTO carportpart(FK_product, amount, FK_carportid) VALUES(14, 2, 1);
INSERT INTO carportpart(FK_product, amount, FK_carportid) VALUES(15, 6, 1);
INSERT INTO carportpart(FK_product, amount, FK_carportid) VALUES(16, 6, 1);
INSERT INTO carportpart(FK_product, amount, FK_carportid) VALUES(17, 3, 1);
INSERT INTO carportpart(FK_product, amount, FK_carportid) VALUES(18, 2, 1);
INSERT INTO carportpart(FK_product, amount, FK_carportid) VALUES(19, 15, 1);
INSERT INTO carportpart(FK_product, amount, FK_carportid) VALUES(20, 15, 1);
INSERT INTO carportpart(FK_product, amount, FK_carportid) VALUES(21, 1, 1);
INSERT INTO carportpart(FK_product, amount, FK_carportid) VALUES(22, 3, 1);
INSERT INTO carportpart(FK_product, amount, FK_carportid) VALUES(23, 18, 1);
INSERT INTO carportpart(FK_product, amount, FK_carportid) VALUES(24, 12, 1);
INSERT INTO carportpart(FK_product, amount, FK_carportid) VALUES(25, 2, 1);
INSERT INTO carportpart(FK_product, amount, FK_carportid) VALUES(26, 2, 1);
INSERT INTO carportpart(FK_product, amount, FK_carportid) VALUES(27, 1, 1);
INSERT INTO carportpart(FK_product, amount, FK_carportid) VALUES(28, 2, 1);
INSERT INTO carportpart(FK_product, amount, FK_carportid) VALUES(29, 32, 1);

-- Carport CAR01 HR
INSERT INTO carportpart(FK_product, amount, FK_carportid) VALUES(30, 2, 2);
INSERT INTO carportpart(FK_product, amount, FK_carportid) VALUES(31, 2, 2);
INSERT INTO carportpart(FK_product, amount, FK_carportid) VALUES(32, 1, 2);
INSERT INTO carportpart(FK_product, amount, FK_carportid) VALUES(33, 1, 2);
INSERT INTO carportpart(FK_product, amount, FK_carportid) VALUES(34, 9, 2);
INSERT INTO carportpart(FK_product, amount, FK_carportid) VALUES(35, 2, 2);
INSERT INTO carportpart(FK_product, amount, FK_carportid) VALUES(36, 1, 2);
INSERT INTO carportpart(FK_product, amount, FK_carportid) VALUES(37, 4, 2);
INSERT INTO carportpart(FK_product, amount, FK_carportid) VALUES(38, 6, 2);
INSERT INTO carportpart(FK_product, amount, FK_carportid) VALUES(39, 2, 2);
INSERT INTO carportpart(FK_product, amount, FK_carportid) VALUES(40, 38, 2);
INSERT INTO carportpart(FK_product, amount, FK_carportid) VALUES(41, 148, 2);
INSERT INTO carportpart(FK_product, amount, FK_carportid) VALUES(42, 3, 2);
INSERT INTO carportpart(FK_product, amount, FK_carportid) VALUES(43, 1, 2);
INSERT INTO carportpart(FK_product, amount, FK_carportid) VALUES(44, 21, 2);
INSERT INTO carportpart(FK_product, amount, FK_carportid) VALUES(45, 2, 2);
INSERT INTO carportpart(FK_product, amount, FK_carportid) VALUES(46, 300, 2);
INSERT INTO carportpart(FK_product, amount, FK_carportid) VALUES(47, 21, 2);
INSERT INTO carportpart(FK_product, amount, FK_carportid) VALUES(48, 8, 2);
INSERT INTO carportpart(FK_product, amount, FK_carportid) VALUES(49, 21, 2);
INSERT INTO carportpart(FK_product, amount, FK_carportid) VALUES(50, 2, 2);
INSERT INTO carportpart(FK_product, amount, FK_carportid) VALUES(51, 8, 2);
INSERT INTO carportpart(FK_product, amount, FK_carportid) VALUES(52, 8, 2);
INSERT INTO carportpart(FK_product, amount, FK_carportid) VALUES(53, 1, 2);
INSERT INTO carportpart(FK_product, amount, FK_carportid) VALUES(54, 2, 2);
INSERT INTO carportpart(FK_product, amount, FK_carportid) VALUES(55, 20, 2);
INSERT INTO carportpart(FK_product, amount, FK_carportid) VALUES(56, 1, 2);
INSERT INTO carportpart(FK_product, amount, FK_carportid) VALUES(57, 1, 2);
INSERT INTO carportpart(FK_product, amount, FK_carportid) VALUES(58, 2, 2);
INSERT INTO carportpart(FK_product, amount, FK_carportid) VALUES(59, 20, 2);
INSERT INTO carportpart(FK_product, amount, FK_carportid) VALUES(60, 20, 2);
INSERT INTO carportpart(FK_product, amount, FK_carportid) VALUES(61, 3, 2);
INSERT INTO carportpart(FK_product, amount, FK_carportid) VALUES(62, 2, 2);