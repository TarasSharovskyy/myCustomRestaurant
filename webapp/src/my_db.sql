drop database restaurant;
CREATE DATABASE restaurant;

use restaurant;

CREATE TABLE User(
UserID int AUTO_INCREMENT,
login VARCHAR (255) NOT NULL,
pass VARCHAR (255) NOT NULL,
amountOfMoney int NOT NULL,
PRIMARY KEY (UserID)
);

CREATE TABLE Orders(
OrderID int AUTO_INCREMENT,
summ int ,
quantity int,
UserID int,
isPayed TINYINT(0),
isChecked TINYINT(0),
PRIMARY KEY (OrderID),
FOREIGN KEY (UserID) REFERENCES User(UserID)
);

CREATE TABLE Dish(
DishID int AUTO_INCREMENT,
price int NOT NULL ,
name VARCHAR (255),
PRIMARY KEY (DishID)
);

CREATE TABLE OrderDish(
OrderID int NOT NULL ,
DishID int NOT NULL ,
PRIMARY KEY (OrderID, DishID),
FOREIGN KEY (OrderID) REFERENCES Orders(OrderID),
FOREIGN KEY (DishID) REFERENCES Dish(DishID)
);

