with baseData as (
    select distinct
        salary, 
        departmentId
    from Employee
), topSalaries as (
    select
        salary, 
        departmentId,
        ROW_NUMBER() OVER (
            PARTITION BY departmentId
            ORDER BY salary DESC
        ) as salaryRank
    from baseData
)
select
    department.name as Department,
    employee.name as Employee,
    employee.salary
from topSalaries
inner join Employee on 
    Employee.departmentId = topSalaries.departmentId
    AND employee.salary = topSalaries.salary
inner join department on department.id = employee.departmentId
where topSalaries.salaryRank <= 3