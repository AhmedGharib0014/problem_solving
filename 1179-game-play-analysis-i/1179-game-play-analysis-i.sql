# Write your MySQL query statement below

select player_id, min(event_date) as first_login 
from  Activity a1
group by a1.player_id
