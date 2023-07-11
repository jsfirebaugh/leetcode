with Accounts as (
    select 3 as account_id, 108939 as income
    union select 2, 12747
    union select 8, 87709
    union select 6, 91796
)

select 
    'Low Salary' as category,
    count(account_id) as accounts_count
from Accounts
where income < 20000

union

select
    'High Salary' as category,
    count(account_id) as accounts_count
from Accounts
where income > 50000

union

select
    'Average Salary',
    count(account_id)
from Accounts
where income between 20000 and 50000