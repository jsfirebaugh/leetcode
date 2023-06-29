with Users as (
    select 6 as user_id, 'alice' as user_name
    union select 2, 'bob'
    union select 7, 'alex'
), Register as (
    select 215 as contest_id, 6 as user_id
    union select 209, 2
    union select 208, 2
    union select 210, 6
    union select 208, 6
    union select 209, 7
    union select 209, 6
    union select 215, 7
    union select 208, 7
    union select 210, 2
    union select 207, 2
    union select 210, 7
)
select 
    contest_id, 
    cast(100.0 * count(Register.user_id) / (select count(user_id) from Users) as decimal(7,2)) as percentage
from Register
group by contest_id
order by [percentage] desc, contest_id asc
