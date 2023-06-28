with Project as (
    select 1 as project_id, 1 as employee_id
    union select 1, 2
    union select 1, 3
    union select 2, 1
    union select 2, 4
), Employee as (
    select 1 as employee_id, 'khaled' as name, 3 as experience_years
    union select 2, 'ali', 2
    union select 3, 'john', 1
    union select 4, 'doe', 2
)

select 
    Project.project_id, 
    cast(1.0 * sum(Employee.experience_years) / count(Employee.employee_id) as decimal(7,2)) as average_years
from Project
inner join Employee on Employee.employee_id = Project.employee_id
group by Project.project_id