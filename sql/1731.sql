with Employees as (
    select 9 as employee_id, 'hercy' as name, null as reports_to, 43 as age
    union select 6, 'alice', 9, 41
    union select 4, 'bob', 9, 36
    union select 2, 'winston', null, 37
)

select
    manager.employee_id,
    manager.name,
    count(Employee.employee_id) as reports_count,
    round(avg(cast(Employee.age as float)),0) as average_age
from Employees manager
inner join Employees Employee on Employee.reports_to = manager.employee_id
group by 
    Manager.employee_id, 
    Manager.name
order by Manager.employee_id