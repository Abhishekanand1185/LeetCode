# Write your MySQL query statement below
select u.name, coalesce(sum(distance),0) as travelled_distance
from Users u 
left join Rides r 
on u.id = r.user_id
group by u.name, u.id
order by sum(r.distance) desc, u.name ;