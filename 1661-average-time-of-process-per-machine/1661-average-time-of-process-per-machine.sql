# Write your MySQL query statement below
select a.machine_id,ROUND(AVG(b.timestamp - a.timestamp),3) AS processing_time


from Activity a Join Activity b 
on a.machine_id = b.machine_id 

and a.process_id = b.process_id

where a.activity_type = 'start' and b.activity_type = 'end'
Group by a.machine_id