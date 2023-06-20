
with Users as (
    select 1 as user_id, 'Winston' as name, 'winston@leetcode.com' as mail
    union select 2, 'Jonathan', 'jonathanisgreat'
    union select 3, 'Annabelle', 'belle-@leetcode.com'
    union select 4, 'Sally', 'sally.come@leetcode.com'
    union select 5, 'Marwan', 'quarz#2020@leetcode.com'
    union select 6, 'David', 'david69@gmail.mil'
    union select 7, 'Shapiro', '.shapo@leetcode.com'
)

select user_id, name, mail
from Users
where 
    mail like '[a-zA-Z]%@leetcode.com' 
    and left(mail, len(mail) - 13) not like '%[^0-9a-zA-Z_.-]%'