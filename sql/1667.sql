with Users AS ( 
    SELECT 1 AS user_id, 'aLice' AS [name]
    UNION SELECT 2 AS user_id, 'bOB' AS [name]
)

SELECT
    user_id,
    UPPER(LEFT(name,1)) + LOWER(SUBSTRING(name, 2 , LEN(name) - 1 )) AS [name]
FROM Users
ORDER BY user_id