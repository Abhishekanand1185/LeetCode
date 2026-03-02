# Write your MySQL query statement below
SELECT p.product_name, s.year, s.price
FROM Product p 
inner join Sales s
on p.product_id = s.product_id;