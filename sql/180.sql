DECLARE @Logs AS TABLE ( id INT, num INT);

INSERT INTO @Logs (id, num) 
VALUES
    (1, 1),
    (2, 1),
    (3, 1),
    (4, 2),
    (5, 1),
    (6, 2),
    (7, 2);

WITH PreppedData AS (
    SELECT
        num,
        LAG( num ) OVER ( ORDER BY id ) AS PreviousNumber,
        LEAD( num ) OVER ( ORDER BY id ) AS NextNumber
    FROM @Logs
)
SELECT DISTINCT num AS ConsecutiveNums
FROM PreppedData
WHERE
    num = PreviousNumber
    AND num = NextNumber;