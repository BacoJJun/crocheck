<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
System
SELECT EXTRACT(EPOCH FROM date_trunc('hour',hhmmss))*1000 as created_at, max(cpu_total_pct) as cpu_total_pct, max(mem_use_pct) as mem_use_pct, max(disk_vol1_usage_pct) as disk_vol1_usage_pct, date_trunc('hour', hhmmss) as hhmmss  FROM tb_usage_system_1min WHERE hhmmss >= date '2018-9-2' AND hhmmss <= date '2018-9-3' + interval '1 day' GROUP BY date_trunc('hour', hhmmss) ORDER BY hhmmss ASC
SELECT EXTRACT(EPOCH FROM max(hhmmss)) * 1000 as created_at, max(cpu_total_pct) as cpu_total_pct, max(mem_use_pct) as mem_use_pct, max(disk_vol1_usage_pct) as disk_vol1_usage_pct, EXTRACT('week' FROM hhmmss) as week  FROM tb_usage_system_1day WHERE hhmmss >= '2018-8-26' AND hhmmss <= date '2018-9-1' + interval '1 day' GROUP BY week order by week asc
SELECT *, EXTRACT(EPOCH FROM hhmmss)*1000 as created_at FROM tb_usage_system_1day WHERE hhmmss >= '2018-8-1' AND hhmmss <= date '2018-8-31' + interval '1 day' ORDER BY hhmmss ASC

packet -dns
SELECT count, EXTRACT(EPOCH FROM cr_at)*1000 AS created_at FROM (SELECT SUM(count) AS count, DATE_TRUNC('hour', created_at) AS cr_at  FROM dns_stat_10sec_all  WHERE created_at >= '2018-9-2' AND created_at <= DATE '2018-9-3' + INTERVAL '1 day'  GROUP BY cr_at  ORDER BY cr_at ASC) AS dns
SELECT COALESCE(SUM(count),0) AS count, EXTRACT(EPOCH FROM max(days))*1000 AS created_at, EXTRACT('week' FROM days) AS week FROM GENERATE_SERIES('2018-8-26', DATE '2018-9-1' + INTERVAL '0 day','1 day'::INTERVAL) AS days LEFT JOIN ( SELECT DATE_TRUNC('day',created_at) AS cr_at, SUM(count) AS count  FROM dns_stat_1day_distinct  WHERE created_at >= '2018-8-26' AND created_at <= DATE '2018-9-1'  GROUP BY cr_at ) AS dns_stat ON DATE_TRUNC('day',cr_at) = days GROUP BY week ORDER BY week ASC
SELECT COALESCE(count,0) AS count, EXTRACT(EPOCH FROM days)*1000 AS created_at FROM GENERATE_SERIES('2018-8-1', DATE '2018-8-31' + INTERVAL '0 day','1 day'::INTERVAL) AS days LEFT JOIN ( SELECT DATE_TRUNC('day',created_at) AS cr_at, SUM(count) AS count  FROM dns_stat_1day_distinct  WHERE created_at >= '2018-8-1' AND created_at <= DATE '2018-8-31'  GROUP BY cr_at ) AS dns_stat ON DATE_TRUNC('day',cr_at) = days ORDER BY days ASC

packet-ddos
SELECT count, EXTRACT(EPOCH FROM cr_at)*1000 AS created_at FROM (SELECT SUM(count) AS count, DATE_TRUNC('hour', created_at) AS cr_at  FROM ddos_stat_10sec_all  WHERE created_at >= '2018-9-2' AND created_at <= DATE '2018-9-3' + INTERVAL '1 day'  GROUP BY cr_at  ORDER BY cr_at ASC) AS ddos
SELECT COALESCE(SUM(count),0) AS count, EXTRACT(EPOCH FROM max(days))*1000 AS created_at, EXTRACT('week' FROM days) AS week FROM GENERATE_SERIES('2018-8-26', DATE '2018-9-1' + INTERVAL '0 day','1 day'::INTERVAL) AS days LEFT JOIN ( SELECT DATE_TRUNC('day',created_at) AS cr_at, SUM(count) AS count  FROM ddos_stat_1day_distinct  WHERE created_at >= '2018-8-26' AND created_at <= DATE '2018-9-1'  GROUP BY cr_at ) AS ddos_stat ON DATE_TRUNC('day',cr_at) = days GROUP BY week ORDER BY week ASC
SELECT COALESCE(count,0) AS count, EXTRACT(EPOCH FROM days)*1000 AS created_at FROM GENERATE_SERIES('2018-8-1', DATE '2018-8-31' + INTERVAL '0 day','1 day'::INTERVAL) AS days LEFT JOIN ( SELECT DATE_TRUNC('day',created_at) AS cr_at, SUM(count) AS count  FROM ddos_stat_1day_distinct  WHERE created_at >= '2018-8-1' AND created_at <= DATE '2018-8-31'  GROUP BY cr_at ) AS ddos_stat ON DATE_TRUNC('day',cr_at) = days ORDER BY days ASC



SELECT (S1.COUNT - S2.COUNT) AS count, COALESCE(TRUNC(((S1.COUNT - S2.COUNT) * 100 / S1.COUNT + 0.05), 1),'0.0') AS percentage  FROM (SELECT sum(count) as count FROM dns_stat_1day_distinct WHERE ( created_at BETWEEN '2018-9-2' AND '2018-9-3')  ) AS S1,  (SELECT SUM(SS.COUNT) AS COUNT  FROM (SELECT sum(count) as count FROM dns_stat_1day_distinct WHERE ( created_at BETWEEN '2018-9-2' AND '2018-9-3') GROUP BY src_ip ORDER BY count DESC LIMIT 100)AS SS) AS S2
SELECT (S1.COUNT - S2.COUNT) AS count, COALESCE(TRUNC(((S1.COUNT - S2.COUNT) * 100 / S1.COUNT + 0.05), 1),'0.0') AS percentage  FROM (SELECT sum(count) as count FROM dns_stat_1week_distinct WHERE ( created_at BETWEEN '2018-8-26' AND '2018-9-1')  ) AS S1,  (SELECT SUM(SS.COUNT) AS COUNT  FROM (SELECT sum(count) as count FROM dns_stat_1week_distinct WHERE ( created_at BETWEEN '2018-8-26' AND '2018-9-1') GROUP BY src_ip ORDER BY count DESC LIMIT 100)AS SS) AS S2
SELECT (S1.COUNT - S2.COUNT) AS count, COALESCE(TRUNC(((S1.COUNT - S2.COUNT) * 100 / S1.COUNT + 0.05), 1),'0.0') AS percentage  FROM (SELECT sum(count) as count FROM dns_stat_1month_distinct WHERE ( created_at BETWEEN '2018-8-1' AND '2018-8-31')  ) AS S1,  (SELECT SUM(SS.COUNT) AS COUNT  FROM (SELECT sum(count) as count FROM dns_stat_1month_distinct WHERE ( created_at BETWEEN '2018-8-1' AND '2018-8-31') GROUP BY src_ip ORDER BY count DESC LIMIT 100)AS SS) AS S2

SELECT (S1.COUNT - S2.COUNT) AS count, COALESCE(TRUNC(((S1.COUNT - S2.COUNT) * 100 / S1.COUNT + 0.05), 1),'0.0') AS percentage  FROM (SELECT sum(count) as count FROM dns_stat_1day_distinct WHERE ( created_at BETWEEN '2018-9-2' AND '2018-9-3')  ) AS S1,  (SELECT SUM(SS.COUNT) AS COUNT  FROM (SELECT sum(count) as count FROM dns_stat_1day_distinct WHERE ( created_at BETWEEN '2018-9-2' AND '2018-9-3') GROUP BY domain ORDER BY count DESC LIMIT 100)AS SS) AS S2
SELECT (S1.COUNT - S2.COUNT) AS count, COALESCE(TRUNC(((S1.COUNT - S2.COUNT) * 100 / S1.COUNT + 0.05), 1),'0.0') AS percentage  FROM (SELECT sum(count) as count FROM dns_stat_1week_distinct WHERE ( created_at BETWEEN '2018-8-26' AND '2018-9-1')  ) AS S1,  (SELECT SUM(SS.COUNT) AS COUNT  FROM (SELECT sum(count) as count FROM dns_stat_1week_distinct WHERE ( created_at BETWEEN '2018-8-26' AND '2018-9-1') GROUP BY domain ORDER BY count DESC LIMIT 100)AS SS) AS S2
SELECT (S1.COUNT - S2.COUNT) AS count, COALESCE(TRUNC(((S1.COUNT - S2.COUNT) * 100 / S1.COUNT + 0.05), 1),'0.0') AS percentage  FROM (SELECT sum(count) as count FROM dns_stat_1month_distinct WHERE ( created_at BETWEEN '2018-8-1' AND '2018-8-31')  ) AS S1,  (SELECT SUM(SS.COUNT) AS COUNT  FROM (SELECT sum(count) as count FROM dns_stat_1month_distinct WHERE ( created_at BETWEEN '2018-8-1' AND '2018-8-31') GROUP BY domain ORDER BY count DESC LIMIT 100)AS SS) AS S2

SELECT (S1.COUNT - S2.COUNT) AS count, COALESCE(TRUNC(((S1.COUNT - S2.COUNT) * 100 / S1.COUNT + 0.05), 1),'0.0') AS percentage  FROM (SELECT sum(count) as count FROM ddos_stat_1day_distinct WHERE ( created_at BETWEEN '2018-9-2' AND '2018-9-3')  ) AS S1,  (SELECT SUM(SS.COUNT) AS COUNT  FROM (SELECT sum(count) as count FROM ddos_stat_1day_distinct WHERE ( created_at BETWEEN '2018-9-2' AND '2018-9-3') GROUP BY domain ORDER BY count DESC LIMIT 100)AS SS) AS S2
SELECT (S1.COUNT - S2.COUNT) AS count, COALESCE(TRUNC(((S1.COUNT - S2.COUNT) * 100 / S1.COUNT + 0.05), 1),'0.0') AS percentage  FROM (SELECT sum(count) as count FROM ddos_stat_1week_distinct WHERE ( created_at BETWEEN '2018-8-26' AND '2018-9-1')  ) AS S1,  (SELECT SUM(SS.COUNT) AS COUNT  FROM (SELECT sum(count) as count FROM ddos_stat_1week_distinct WHERE ( created_at BETWEEN '2018-8-26' AND '2018-9-1') GROUP BY domain ORDER BY count DESC LIMIT 100)AS SS) AS S2
SELECT (S1.COUNT - S2.COUNT) AS count, COALESCE(TRUNC(((S1.COUNT - S2.COUNT) * 100 / S1.COUNT + 0.05), 1),'0.0') AS percentage  FROM (SELECT sum(count) as count FROM ddos_stat_1month_distinct WHERE ( created_at BETWEEN '2018-8-1' AND '2018-8-31')  ) AS S1,  (SELECT SUM(SS.COUNT) AS COUNT  FROM (SELECT sum(count) as count FROM ddos_stat_1month_distinct WHERE ( created_at BETWEEN '2018-8-1' AND '2018-8-31') GROUP BY domain ORDER BY count DESC LIMIT 100)AS SS) AS S2

SELECT (S1.COUNT - S2.COUNT) AS count, COALESCE(TRUNC(((S1.COUNT - S2.COUNT) * 100 / S1.COUNT + 0.05), 1),'0.0') AS percentage  FROM (SELECT sum(count) as count FROM ddos_stat_1day_distinct WHERE ( created_at BETWEEN '2018-9-2' AND '2018-9-3')  ) AS S1,  (SELECT SUM(SS.COUNT) AS COUNT  FROM (SELECT sum(count) as count FROM ddos_stat_1day_distinct WHERE ( created_at BETWEEN '2018-9-2' AND '2018-9-3') GROUP BY src_ip ORDER BY count DESC LIMIT 100)AS SS) AS S2
SELECT (S1.COUNT - S2.COUNT) AS count, COALESCE(TRUNC(((S1.COUNT - S2.COUNT) * 100 / S1.COUNT + 0.05), 1),'0.0') AS percentage  FROM (SELECT sum(count) as count FROM ddos_stat_1week_distinct WHERE ( created_at BETWEEN '2018-8-26' AND '2018-9-1')  ) AS S1,  (SELECT SUM(SS.COUNT) AS COUNT  FROM (SELECT sum(count) as count FROM ddos_stat_1week_distinct WHERE ( created_at BETWEEN '2018-8-26' AND '2018-9-1') GROUP BY src_ip ORDER BY count DESC LIMIT 100)AS SS) AS S2
SELECT (S1.COUNT - S2.COUNT) AS count, COALESCE(TRUNC(((S1.COUNT - S2.COUNT) * 100 / S1.COUNT + 0.05), 1),'0.0') AS percentage  FROM (SELECT sum(count) as count FROM ddos_stat_1month_distinct WHERE ( created_at BETWEEN '2018-8-1' AND '2018-8-31')  ) AS S1,  (SELECT SUM(SS.COUNT) AS COUNT  FROM (SELECT sum(count) as count FROM ddos_stat_1month_distinct WHERE ( created_at BETWEEN '2018-8-1' AND '2018-8-31') GROUP BY src_ip ORDER BY count DESC LIMIT 100)AS SS) AS S2



SELECT  domain, sum(count) as count, TRUNC( sum(count) * 100.0 /   (  select sum(total.count) from (SELECT sum(count) as count FROM dns_stat_1day_distinct WHERE ( created_at BETWEEN '2018-9-2' AND '2018-9-3')  GROUP BY domain ORDER BY count DESC  ) total ) +0.05, 1) as percentage  FROM dns_stat_1day_distinct WHERE ( created_at BETWEEN '2018-9-2' AND '2018-9-3')  GROUP BY domain ORDER BY count DESC LIMIT 100
SELECT  domain, sum(count) as count, TRUNC( sum(count) * 100.0 /   (  select sum(total.count) from (SELECT sum(count) as count FROM dns_stat_1week_distinct WHERE ( created_at BETWEEN '2018-8-26' AND '2018-9-1')  GROUP BY domain ORDER BY count DESC  ) total ) +0.05, 1) as percentage  FROM dns_stat_1week_distinct WHERE ( created_at BETWEEN '2018-8-26' AND '2018-9-1')  GROUP BY domain ORDER BY count DESC LIMIT 100
SELECT  domain, sum(count) as count, TRUNC( sum(count) * 100.0 /   (  select sum(total.count) from (SELECT sum(count) as count FROM dns_stat_1month_distinct WHERE ( created_at BETWEEN '2018-8-1' AND '2018-8-31')  GROUP BY domain ORDER BY count DESC  ) total ) +0.05, 1) as percentage  FROM dns_stat_1month_distinct WHERE ( created_at BETWEEN '2018-8-1' AND '2018-8-31')  GROUP BY domain ORDER BY count DESC LIMIT 100

SELECT  domain, sum(count) as count, TRUNC( sum(count) * 100.0 /   (  select sum(total.count) from (SELECT sum(count) as count FROM ddos_stat_1day_distinct WHERE ( created_at BETWEEN '2018-9-2' AND '2018-9-3')  GROUP BY domain ORDER BY count DESC  ) total ) +0.05, 1) as percentage  FROM ddos_stat_1day_distinct WHERE ( created_at BETWEEN '2018-9-2' AND '2018-9-3')  GROUP BY domain ORDER BY count DESC LIMIT 100
SELECT  domain, sum(count) as count, TRUNC( sum(count) * 100.0 /   (  select sum(total.count) from (SELECT sum(count) as count FROM ddos_stat_1week_distinct WHERE ( created_at BETWEEN '2018-8-26' AND '2018-9-1')  GROUP BY domain ORDER BY count DESC  ) total ) +0.05, 1) as percentage  FROM ddos_stat_1week_distinct WHERE ( created_at BETWEEN '2018-8-26' AND '2018-9-1')  GROUP BY domain ORDER BY count DESC LIMIT 100
SELECT  domain, sum(count) as count, TRUNC( sum(count) * 100.0 /   (  select sum(total.count) from (SELECT sum(count) as count FROM ddos_stat_1month_distinct WHERE ( created_at BETWEEN '2018-8-1' AND '2018-8-31')  GROUP BY domain ORDER BY count DESC  ) total ) +0.05, 1) as percentage  FROM ddos_stat_1month_distinct WHERE ( created_at BETWEEN '2018-8-1' AND '2018-8-31')  GROUP BY domain ORDER BY count DESC LIMIT 100

SELECT  src_ip, sum(count) as count, TRUNC( sum(count) * 100.0 /   (  select sum(total.count) from (SELECT sum(count) as count FROM dns_stat_1day_distinct WHERE ( created_at BETWEEN '2018-9-2' AND '2018-9-3')  GROUP BY src_ip ORDER BY count DESC  ) total ) +0.05, 1) as percentage  FROM dns_stat_1day_distinct WHERE ( created_at BETWEEN '2018-9-2' AND '2018-9-3')  GROUP BY src_ip ORDER BY count DESC LIMIT 100
SELECT  src_ip, sum(count) as count, TRUNC( sum(count) * 100.0 /   (  select sum(total.count) from (SELECT sum(count) as count FROM dns_stat_1week_distinct WHERE ( created_at BETWEEN '2018-8-26' AND '2018-9-1')  GROUP BY src_ip ORDER BY count DESC  ) total ) +0.05, 1) as percentage  FROM dns_stat_1week_distinct WHERE ( created_at BETWEEN '2018-8-26' AND '2018-9-1')  GROUP BY src_ip ORDER BY count DESC LIMIT 100
SELECT  src_ip, sum(count) as count, TRUNC( sum(count) * 100.0 /   (  select sum(total.count) from (SELECT sum(count) as count FROM dns_stat_1month_distinct WHERE ( created_at BETWEEN '2018-8-1' AND '2018-8-31')  GROUP BY src_ip ORDER BY count DESC  ) total ) +0.05, 1) as percentage  FROM dns_stat_1month_distinct WHERE ( created_at BETWEEN '2018-8-1' AND '2018-8-31')  GROUP BY src_ip ORDER BY count DESC LIMIT 100

SELECT  src_ip, sum(count) as count, TRUNC( sum(count) * 100.0 /   (  select sum(total.count) from (SELECT sum(count) as count FROM ddos_stat_1day_distinct WHERE ( created_at BETWEEN '2018-9-2' AND '2018-9-3')  GROUP BY src_ip ORDER BY count DESC  ) total ) +0.05, 1) as percentage  FROM ddos_stat_1day_distinct WHERE ( created_at BETWEEN '2018-9-2' AND '2018-9-3')  GROUP BY src_ip ORDER BY count DESC LIMIT 100
SELECT  src_ip, sum(count) as count, TRUNC( sum(count) * 100.0 /   (  select sum(total.count) from (SELECT sum(count) as count FROM ddos_stat_1week_distinct WHERE ( created_at BETWEEN '2018-8-26' AND '2018-9-1')  GROUP BY src_ip ORDER BY count DESC  ) total ) +0.05, 1) as percentage  FROM ddos_stat_1week_distinct WHERE ( created_at BETWEEN '2018-8-26' AND '2018-9-1')  GROUP BY src_ip ORDER BY count DESC LIMIT 100
SELECT  src_ip, sum(count) as count, TRUNC( sum(count) * 100.0 /   (  select sum(total.count) from (SELECT sum(count) as count FROM ddos_stat_1month_distinct WHERE ( created_at BETWEEN '2018-8-1' AND '2018-8-31')  GROUP BY src_ip ORDER BY count DESC  ) total ) +0.05, 1) as percentage  FROM ddos_stat_1month_distinct WHERE ( created_at BETWEEN '2018-8-1' AND '2018-8-31')  GROUP BY src_ip ORDER BY count DESC LIMIT 100

</body>
</html>