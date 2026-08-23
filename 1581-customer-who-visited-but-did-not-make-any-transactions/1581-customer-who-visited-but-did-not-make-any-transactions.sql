SELECT customer_id ,count(*) as count_no_trans
From Visits v
LEFT JOIN Transactions t
USING(visit_id)
WHERE transaction_id is NULL
GROUP BY customer_id;