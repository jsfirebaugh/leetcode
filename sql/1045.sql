with Customer as (
    select 1 as customer_id, 5 as product_key
    union select 2, 6
    union select 3, 5
    union select 3, 6
    union select 1, 6
), Product as (
    select 5 as product_key
    union select 6
)

select customer_id
from Customer
group by customer_id
having count(distinct product_key) = ( 
    select count(product_key) 
    from Product 
)