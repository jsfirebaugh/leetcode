
with Insurance as (
    select 1 as pid, 10 as tiv_2015, 5 as tiv_2016, 10 as lat, 10 as lon
    union select 2, 20, 20, 20, 20
    union select 3, 10, 30, 20, 20
    union select 4, 10, 40, 40, 40
)

SELECT CAST(SUM(i.tiv_2016) AS DECIMAL (7,2)) AS tiv_2016
FROM Insurance i
WHERE NOT EXISTS (
    SELECT * 
    FROM Insurance i2 
    WHERE 
        i2.pid != i.pid 
        AND i2.lat = i.lat 
        AND i2.lon = i.lon
) AND tiv_2015 IN (
    SELECT tiv_2015 
    FROM Insurance i3 
    WHERE i3.pid != i.pid
)