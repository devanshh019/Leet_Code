# Write your MySQL query statement below
SELECT machine_id,round(((END_SUM-Start_SUM)/count_total),3) as processing_time
FROM (SELECT machine_id,SUM(timestamp) as Start_SUM,Count(*) as count_total
FROM Activity 
WHERE activity_type='start'
GROUP BY machine_id) a
JOIN
(SELECT machine_id,SUM(timestamp) as END_SUM
FROM Activity 
WHERE activity_type='end'
GROUP BY machine_id) b
USING(machine_id)

