with Sales as (
    select 1 as sale_id, 100 as product_id, 2008 as year, 10 as quantity, 5000 as price
    union select 2, 100, 2009, 12, 5000
    union select 7, 200, 2011, 15, 9000
), Product as (
    select 100 as product_id, 'Nokia' as product_name
    union select 200, 'apple'
    union select 300, 'samsung'
)

select
    Product.product_name,
    Sales.[year],
    Sales.price
from Sales
inner join Product on Product.product_id = Sales.product_id