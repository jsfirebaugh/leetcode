DECLARE @Transactions TABLE (
    id INT,
    country VARCHAR(50),
    state VARCHAR(50),
    amount INT,
    trans_date DATE
)

INSERT INTO @Transactions 
    (id, country, [state], amount, trans_date)
VALUES 
    (121, 'US', 'approved', 1000, '2018-12-18'),
    (122, 'US', 'declined', 2000, '2018-12-19'),
    (123, 'US', 'approved', 2000, '2019-01-01'),
    (124, 'DE', 'approved', 2000, '2019-01-07');

SELECT 
    LEFT(trans_date, 7) AS [month], 
    country,
    COUNT(id) AS trans_count,
    SUM( 
        CASE [state] 
            WHEN 'approved' THEN 1 
            ELSE 0 
        END
    ) AS approved_count,
    SUM(amount) AS trans_total_amount,
    SUM(
        CASE [state]
            WHEN 'approved' THEN amount
            ELSE 0
        END
    ) AS approved_total_amount
FROM @Transactions
GROUP BY 
    LEFT(trans_date, 7), 
    country