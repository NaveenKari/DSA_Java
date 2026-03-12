# Write your MySQL query statement below
-- select s.student_id,s.student_name,e.subject_name,count(e.subject_name) as attended_exams
-- from Students s
-- left join Examinations e
-- on s.student_id = e.student_id
-- group by e.subject_name;

select x.student_id,x.student_name,x.subject_name, count(e.subject_name) as attended_exams
from
(select * from Students s
cross join Subjects t) as x
left join Examinations e
on x.student_id = e.student_id
and x.subject_name = e.subject_name
group by x.student_id,x.student_name,x.subject_name
order by x.student_id,x.subject_name;

