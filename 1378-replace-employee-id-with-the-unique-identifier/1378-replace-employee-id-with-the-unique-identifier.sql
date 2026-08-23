# Write your MySQL query statement below
Select E.name,Eu.unique_id
From Employees E
LEFT JOIN EmployeeUNI Eu
On E.id=Eu.id;
