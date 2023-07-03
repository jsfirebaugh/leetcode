with Followers as (
    select 0 as user_id, 1 as follower_id
    union select 1, 0
    union select 2, 0
    union select 2, 1
)

select
    user_id,
    count(follower_id) as followers_count
from Followers
group by user_id
order by user_id