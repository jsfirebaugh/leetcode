
with Queue as (
    select 5 as person_id, 'alice' as person_name, 250 as weight, 1 as turn
    union select 4, 'bob', 175, 5
    union select 3, 'alex', 350, 2
    union select 6, 'john cena', 400, 3
    union select 1, 'winston', 500, 6
    union select 2, 'marie', 200, 4
), SortedData as (
    select 
        person_name, 
        sum( weight ) over ( order by turn ) as running_total
    from Queue
)
select top 1 person_name
from SortedData
where running_total <= 1000
order by running_total desc
