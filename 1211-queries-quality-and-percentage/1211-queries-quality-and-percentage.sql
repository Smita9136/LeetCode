# Write your MySQL query statement below

select query_name,round(sum( rating/position)/count(*),2)  as quality ,Round((
        SUM(CASE WHEN rating < 3 THEN 1 ELSE 0 END) * 100.0 / COUNT(*)),2) as poor_query_percentage from Queries where query_name is not null group by query_name;