# Write your MySQL query statement below

select x.name from Employee x inner join
(select e.managerId,count(e.managerId) as repCount
from Employee e
where e.managerId is not null
group by managerId) as c on 
x.id = c.managerId
where c.repCount >4;

