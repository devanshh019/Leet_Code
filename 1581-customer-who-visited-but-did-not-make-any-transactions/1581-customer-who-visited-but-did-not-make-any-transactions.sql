# Write your MySQL query statement below
SELECT customer_id,count(*) as count_no_trans
FROM VISITS V
LEFT JOIN TRANSACTIONS T
USING(visit_id)
WHERE transaction_id is NULL
GROUP BY customer_id