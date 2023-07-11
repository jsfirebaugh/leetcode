with Employee as (
    select 1 as employee_id, 1 as department_id, 'N' as primary_flag
    union select 2, 1, 'Y'
    union select 2, 2, 'N'
    union select 3, 3, 'N'
    union select 4, 2, 'N'
    union select 4, 3, 'Y'
    union select 4, 4, 'N'
)

select 
    employee_id, 
    department_id
from Employee
where primary_flag = 'Y'

UNION

select
    employee_id,
    department_id
from Employee
where employee_id in ( 
        select employee_id 
        from Employee 
        group by employee_id 
        having count(employee_id) = 1 
    ) 