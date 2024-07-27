# Write your MySQL query statement below
SELECT t1.id
FROM Weather t1
WHERE t1.temperature > (
    SELECT t2.temperature
    FROM Weather t2
    WHERE t2.recordDate = DATE_SUB(t1.recordDate, INTERVAL 1 DAY)
);