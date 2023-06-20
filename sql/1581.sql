
with Visits as (
    select 1 as visit_id, 23 as customer_id
    union select 2, 9
    union select 4, 30
    union select 5, 54
    union select 6, 96
    union select 7, 54
    union select 8, 54
), Transactions as (
    select 2 as trasaction_id, 5 as visit_id, 310 as amount
    union select 3, 5, 300
    union select 9, 5, 200
    union select 12, 1, 910
    union select 13, 2, 970
)

select
    v.customer_id,
    count(v.visit_id) as count_no_trans
from Visits v
left join Transactions t on t.visit_id = v.visit_id
where t.visit_id is null
group by v.customer_id