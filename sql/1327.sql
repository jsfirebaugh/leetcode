with Products as (
    select 1 as product_id, 'Leetcode Solutions' as product_name, 'book' as product_category
    union select 2, 'Jewels of stringology', 'book'
    union select 3, 'HP', 'laptop'
    union select 4, 'lenovo', 'laptop'
    union select 5, 'leetcode kit', 't-shirt'
), Orders as (
    select 1 as product_id, '2020-02-05' as order_date, 60 as unit
    union select 1, '2020-02-10', 70
    union select 2, '2020-01-18', 30
    union select 2, '2020-02-11', 80
    union select 3, '2020-02-17', 2
    union select 3, '2020-02-24', 3
    union select 4, '2020-03-01', 20
    union select 4, '2020-03-04', 30
    union select 4, '2020-03-04', 60
    union select 5, '2020-02-25', 50
    union select 5, '2020-02-27', 50
    union select 5, '2020-03-01', 50
)

select 
    product_name, 
    sum(unit) as unit
from Orders
inner join Products on Products.product_id = Orders.product_id
where order_date between '2020-02-01' and '2020-02-29'
group by product_name
having sum(unit) >= 100