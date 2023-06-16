with Employees as ( 
    select 1 as emp_id, '2020-11-28' as event_day, 4 as in_time, 32 as out_time
    union select 1 as emp_id, '2020-11-28' as event_day, 55 as in_time, 200 as out_time
    union select 1 as emp_id, '2020-12-03' as event_day, 1 as in_time, 42 as out_time
    union select 2 as emp_id, '2020-11-28' as event_day, 3 as in_time, 33 as out_time
    union select 2 as emp_id, '2020-12-09' as event_day, 47 as in_time, 74 as out_time
)

select
    event_day as day,
    emp_id,
    sum(out_time) - sum(in_time) as total_time
from Employees 
group by emp_id, event_day
