with Activity as (
    select 0 as machine_id, 0 as process_id, 'start' as activity_type, 0.712 as timestamp
    union select 0, 0, 'end', 1.520
    union select 0, 1, 'start', 3.140
    union select 0, 1, 'end', 4.120
    union select 1, 0, 'start', 0.550
    union select 1, 0, 'end', 1.550
    union select 1, 1, 'start', 0.430
    union select 1, 1, 'end', 1.420
    union select 2, 0, 'start', 4.1
    union select 2, 0, 'end', 4.512
    union select 2, 1, 'start', 2.5
    union select 2, 1, 'end', 5
)
select 
    a1.machine_id, 
    cast(avg(a2.timestamp - a1.timestamp) as decimal(7,3)) as processing_time 
from Activity a1
inner join Activity a2 on a2.machine_id = a1.machine_id and a2.process_id = a2.process_id
where a1.activity_type = 'start' and a2.activity_type = 'end'
group by a1.machine_id