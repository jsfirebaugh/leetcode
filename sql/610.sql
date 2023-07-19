with Triangle as (
    select 13 as x, 15 as y, 30 as z
    union select 10, 20, 15
)

select 
    x,
    y,
    z,
    iif( x + y > z and x + z > y and y + z > x, 'Yes', 'No' ) as Triangle,
    case
        when  x + y > z and x + z > y and y + z > x then 'Yes'
        else 'No'
    end as Triangle2
from Triangle