with Signups as (
    select 3 as user_id, '2020-03-21 10:16:13' as time_stamp
    union select 7, '2020-01-04 13:57:59'
    union select 2, '2020-07-29 23:09:44'
    union select 6, '2020-12-09 10:39:37'
), Confirmations as (
    select 3 as user_id, '2021-01-06 03:30:46' as time_stamp, 'timeout' as [action]
    union select 3, '2021-07-14 14:00:00', 'timeout'
    union select 7, '2021-06-12 11:57:29', 'confirmed'
    union select 7, '2021-06-13 12:58:28', 'confirmed'
    union select 7, '2021-06-14 13:59:27', 'confirmed'
    union select 2, '2021-01-22 00:00:00', 'confirmed'
    union select 2, '2021-02-28 23:59:59', 'timeout'
), ConfirmationActions as (
    select user_id , count(user_id) as ConfirmationCount
    from Confirmations
    where [action] = 'confirmed'
    group by user_id
)

select 
    Signups.user_id, 
    coalesce(
        cast(1.0 * ConfirmationActions.ConfirmationCount / count(Confirmations.user_id) as decimal(7,2)),
        0.00
     ) as confirmation_rate
from Signups
left join Confirmations on Confirmations.user_id = Signups.user_id
left join ConfirmationActions on ConfirmationActions.user_id = Signups.user_id
group by Signups.user_id, ConfirmationActions.ConfirmationCount