with Queries as (
    select 'dog' as query_name, 'golden retriever' as result, 1 as position, 5 as rating
    union select 'dog', 'german shepherd', 2, 5
    union select 'dog', 'mule', 200, 1
    union select 'cat', 'shirazi', 5, 2
    union select 'cat', 'siamese', 3, 3
    union select 'cat', 'sphynx', 7, 4
)

select 
    query_name,
    cast(round(avg(1.0 * [rating] / [position]),2) as decimal(7,2)) as quality,
    cast(100 * avg(case when rating < 3 then 1.0 else 0.0 end) as decimal(7,2)) as poor_query_percentage
from Queries
group by query_name