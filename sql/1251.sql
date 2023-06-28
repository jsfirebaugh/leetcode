with Prices as (
    select 1 as product_id, '2019-02-17' as start_date, '2019-02-28' as end_date, 5 as price
    union select 1, '2019-03-01', '2019-03-22', 20
    union select 2, '2019-02-01', '2019-02-20', 15
    union select 2, '2019-02-21', '2019-03-31', 30
), UnitsSold as (
    select 1 as product_id, '2019-02-25' as purchase_date, 100 as units
    union select 1, '2019-03-01', 14
    union select 2, '2019-02-10', 200
    union select 2, '2019-03-22', 30
)

select
    UnitsSold.product_id,
    cast(1.0 * sum(UnitsSold.units * Prices.price) / sum(UnitsSold.units) as decimal(7,2)) as average_price
from UnitsSold
inner join Prices on Prices.product_id = UnitsSold.product_id
where UnitsSold.purchase_date between Prices.start_date and Prices.end_date
group by UnitsSold.product_id