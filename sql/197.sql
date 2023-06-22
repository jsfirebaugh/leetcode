with Weather as (
    select 1 as id, cast('2015-01-01' as date) as recordDate, 10 as temperature
    union select 2, cast('2015-01-02' as date), 25
    union select 3, cast('2015-01-03' as date), 20
    union select 4, cast('2015-01-04' as date), 30
)

select w1.id
from Weather w1
inner join Weather w2 on w2.recordDate = DATEADD(DAY, -1, w1.recordDate)
where w2.temperature < w1.temperature