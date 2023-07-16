with Activities as (
    select '2020-05-30' as sell_date, 'Headphones' as product
    union select '2020-06-01', 'Pencil'
    union select '2020-06-02', 'mask'
    union select '2020-05-30', 'basketball'
    union select '2020-06-01', 'bible'
    union select '2020-06-02', 'mask'
    union select '2020-05-30', 't-shirt'
)

select
    a.sell_date,
    count(a.product) as num_sold,
    string_agg(a.product, ',') within group (order by product) as products
from ( select distinct sell_date, product from Activities ) a
group by a.sell_date
order by a.sell_date