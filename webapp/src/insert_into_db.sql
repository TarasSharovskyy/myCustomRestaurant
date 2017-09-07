insert into user(login, pass, amountOfMoney) values
			('user_1', '12345', 500);

insert into orders (quantity, UserID, isPayed, isChecked) values
			(2, 1, 0,0);

insert into dish(price, name) values
				(50, 'Varenyky');

insert into orderdish(OrderID, DishID) values
				(1,1);