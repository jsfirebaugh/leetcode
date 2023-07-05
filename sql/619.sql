Declare @MyNumbers TABLE(num INT)

insert into @MyNumbers (num) 
values (8), (8), (7), (7), (3), (3), (3), (3)

select coalesce(
    (
        select top 1 max(num) as num
        from @MyNumbers
        group by num
        having count(num) = 1
        order by num desc
    ), NULL
) as num