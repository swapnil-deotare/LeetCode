SELECT
    w1.id AS 'Id'
FROM
    weather as w1
        JOIN
    weather as w2 ON DATEDIFF(w1.recordDate, w2.recordDate) = 1
        AND w1.Temperature > w2.Temperature
;