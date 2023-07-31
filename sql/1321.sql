WITH Customer AS (

    SELECT 1 AS customr_id , 'jhon' as name, '2019-01-01' as visited_on, 100 as amount
    UNION SELECT 2, 'daniel', '2019-01-02 ', 110
    UNION SELECT 3, 'jade', '2019-01-03 ', 120
    UNION SELECT 4, 'khaled', '2019-01-04 ', 130
    UNION SELECT 5, 'winston', '2019-01-05 ', 110
    UNION SELECT 6, 'elvis', '2019-01-06 ', 140
    UNION SELECT 7, 'anna', '2019-01-07 ', 150
    UNION SELECT 8, 'maria', '2019-01-08 ', 80
    UNION SELECT 9, 'jaze', '2019-01-09 ', 110
    UNION SELECT 1, 'jhon', '2019-01-10 ', 130
    UNION SELECT 3, 'jade', '2019-01-10 ', 150

)

SELECT 
    visited_on, 
    SUM(SUM(amount)) OVER (ORDER BY visited_on ROWS BETWEEN 6 PRECEDING AND CURRENT ROW) as amount,
    ROUND(CAST(SUM(SUM(amount)) OVER(ORDER BY visited_on ROWS BETWEEN 6 PRECEDING AND CURRENT ROW) AS FLOAT)/7.0 ,2) AS 'average_amount'
FROM Customer
GROUP BY visited_on
ORDER BY visited_on
OFFSET 6 ROWS