with Delivery as (

    select 1 as delivery_id, 1 as customer_id, '2019-08-01' as order_date, '2019-08-02' as customer_pref_delivery_date
    union select 2, 2, '2019-08-02', '2019-08-02'
    union select 3, 1, '2019-08-11', '2019-08-12'
    union select 4, 3, '2019-08-24', '2019-08-24'
    union select 5, 3, '2019-08-21', '2019-08-22'
    union select 6, 2, '2019-08-11', '2019-08-13'
    union select 7, 4, '2019-08-09', '2019-08-09'

), FirstOrders as (
    select d1.customer_id, min( d1.order_date ) as FirstOrderDate
    from Delivery d1
    group by d1.customer_id
)

select round(100.00 * count(d2.customer_id) / ( select count(*) from FirstOrders ), 2) as immediate_percentage
From Delivery d2 
inner join FirstOrders fo 
    on fo.customer_id = d2.customer_id 
    and fo.FirstOrderDate = d2.customer_pref_delivery_date