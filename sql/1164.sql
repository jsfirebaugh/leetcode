
with Products as (
    select 1 as product_id, 20 as new_price, '2019-08-14' as change_date
    union select 2, 50, '2019-08-14'
    union select 1, 30, '2019-08-15'
    union select 1, 35, '2019-08-16'
    union select 2, 65, '2019-08-17'
    union select 3, 20, '2019-08-18'
), p0 as (
    select 
        p1.product_id, 
        max(p2.change_date) as max_date
    from Products p1
    left join Products p2 
        on p2.product_id = p1.product_id 
        and p2.change_date <= '2019-08-16'
    group by p1.product_id
)
select 
    p0.product_id, 
    isnull(p3.new_price, 10) as price
from p0
left join Products p3 
    on p3.product_id = p0.product_id 
    and p3.change_date = p0.max_date