
with Employee as (
    select 3 as empId, 'Brad' as name, null as supervisor, 4000 as salary
    union select 1, 'john', 3, 1000
    union select 2, 'dan', 3, 2000
    union select 4, 'thomas', 3, 4000
), Bonus as (
    select 2 as empId, 500 as bonus
    union select 4, 2000
)

select employee.name, bonus.bonus
from Employee
left join bonus on bonus.empId = employee.empId
where 
    bonus.empId is null 
    or bonus.bonus < 1000;

with Employee as (
    select 3 as empId, 'Brad' as name, null as supervisor, 4000 as salary
    union select 1, 'john', 3, 1000
    union select 2, 'dan', 3, 2000
    union select 4, 'thomas', 3, 4000
), Bonus as (
    select 2 as empId, 500 as bonus
    union select 4, 2000
)

select employee.name, bonus.bonus
from Employee
left join bonus on bonus.empId = employee.empId
where coalesce(bonus.bonus, 0) < 1000