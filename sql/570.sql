with reportsTable as (
    select count(managerId) as ReportCount , managerId
    from Employee
    group by managerID
    having count(managerId) >= 5
)

select Employee.name
from Employee 
inner join reportsTable on reportsTable.managerID = Employee.id