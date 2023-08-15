# Write your MySQL query statement below
#  select name from the employee 
#  where id in
#  (select managerId from employee
#  group by managerId 
#  having count((managerId) >= 5))
 
 select name from employee 
where id in 
(select managerId from employee
group by managerId
having count(managerId)>=5)