
with Employees as (
    select 1 as id, 'Alice' as name
    union select 7, 'Bob'
    union select 11, 'Meir'
    union select 90, 'Winston'
    union select 3, 'Jonathan'
), EmployeeUNI as (
    select 3 as id, 1 as unique_id
    union select 11, 2
    union select 90, 3
)

select
    uni.unique_id,
    e.name
from Employees e
left join EmployeeUNI uni on uni.id = e.id
order by e.name