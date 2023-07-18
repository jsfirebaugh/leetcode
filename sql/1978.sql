with Employees as (
    select 3 as employee_id, 'Mila' as name, 9 as manager_id, 60301 as salary
    union select 12, 'antonella', null, 31000
    union select 12, 'emery', null, 67084
    union select 1, 'kalel', 11, 21241
    union select 9, 'mikaela', null, 50937
    union select 11, 'joziah', 6, 28485
)

select employee_id
from Employees
where
    salary < 30000 
    and manager_id not in ( 
        select distinct employee_id 
        from Employees 
    )
order by employee_id