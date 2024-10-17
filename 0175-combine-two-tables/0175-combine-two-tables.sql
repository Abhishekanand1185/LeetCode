# Write your MySQL query statement below
# here in this line we are selecting all 4 column we need but with table name
# so here i define p for person table in line number 4 so so insted of person.lastName
# I can write p.lastName and same for addredd table
select p.lastName, p.firstName, a.city, a.state 
# Here we define person table as p and use from(in that table we will do left join)
from person p 
# Left join we use to Join two table's so here we use left join means we are join 2nd table in 
# 1st table
left join 
# Here we define address table as a and also we use this table to join in first table
address a 
# Here we are telling that personId is same in both table so you can match that and give me output
on p.personId = a.personId;
