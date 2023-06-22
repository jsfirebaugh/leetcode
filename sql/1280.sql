
With Students as (
    Select 1 as student_id, 'Alice' as student_name
    union select 2, 'Bob'
    union select 13, 'john'
    union select 6, 'alex' 
), Subjects as (
    select 'math' as subject_name
    union select 'Physics'
    union select 'Programming'
), Examinations as (
    select 1 as recId, 1 as student_id, 'math' as subject_name
    union select 2, 1, 'physics'
    union select 3, 1, 'programming'
    union select 4, 2, 'programming'
    union select 5, 1, 'physics'
    union select 6, 1, 'math'
    union select 7, 13, 'math'
    union select 8, 13, 'programming'
    union select 9, 13, 'physics'
    union select 10, 2, 'math'
    union select 11, 1, 'math'
)
select
    Students.student_id,
    Students.student_name,
    Subjects.subject_name,
    count(Examinations.student_id) as attended_exams
from Students
cross join Subjects
left join Examinations 
    on Examinations.student_id = Students.student_id 
    and Examinations.subject_name = Subjects.subject_name
group by 
    Students.student_id, 
    students.student_name, 
    subjects.subject_name
order by 
    Students.student_id, 
    Subjects.subject_name