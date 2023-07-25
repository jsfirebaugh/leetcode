with Activity as (
    select 1 as player_id, 2 as device_id, '2016-03-01' as event_date, 5 as games_played
    union select 1, 2, '2016-03-02', 6
    union select 2, 3, '2017-06-25', 1
    union select 3, 1, '2016-03-02', 0
    union select 3, 4, '2018-07-03', 5
), 

firstLogins as (
    select 
        player_id, 
        min(event_date) as day1,
        dateadd(DAY, 1, MIN(event_date)) as next_day 
    from Activity a 
    group by player_id
)

select round(cast(count(distinct a2.player_id) as float) / ( select count(distinct firstLogins.player_id) from firstLogins), 2) as fraction
from firstLogins
inner join Activity a2 
    on a2.player_id = firstLogins.player_id
    and a2.event_date = firstLogins.next_day