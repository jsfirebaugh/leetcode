with RequestAccepted as (
    select 1 as requestor_id, 2 as accepter_id , '2016-06-03' as accept_date
    union select 1, 3, '2016-06-08'
    union select 2, 3, '2016-06-08'
    union select 3, 4, '2016-06-09'
), roll as (
    select requestor_id as id
    from RequestAccepted
    union all
    select accepter_id as id
    from RequestAccepted
)
select top 1 id, count(id) as num
from roll
group by id
order by count(id) desc