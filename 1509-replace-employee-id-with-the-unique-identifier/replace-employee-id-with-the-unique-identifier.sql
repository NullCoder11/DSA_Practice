# Write your MySQL query statement below
SELECT EmployeeUni.unique_id ,name FROM Employees left Join EmployeeUni
on Employees.id = EmployeeUni.id;

