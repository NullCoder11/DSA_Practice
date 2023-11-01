# Write your MySQL query statement below
SELECT Product.product_name,year,price from Sales Join Product
on Sales.product_id = Product.product_id;