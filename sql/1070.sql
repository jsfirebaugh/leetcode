with Sales as (
    select 1 as sale_id, 100 as product_id, 2008 as year, 10 as quantity, 5000 as price
    union select 2, 100, 2009, 12, 5000
    union select 7, 200, 2011, 15, 9000
), FirstSales as (
    select
        s1.product_id,
        min(s1.year) as first_year
    from sales s1
    group by s1.product_id
)
select
    Sales.product_id,
    FirstSales.first_year,
    Sales.quantity,
    Sales.price
from Sales
inner join FirstSales on FirstSales.product_id = Sales.product_id and FirstSales.first_year = Sales.[year]