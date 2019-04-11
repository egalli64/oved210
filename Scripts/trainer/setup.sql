drop table employees;

create table employees(
    employee_id number(6, 0) constraint employees_pk primary key,
    first_name varchar2(20), 
    last_name varchar2(25) constraint employees_last_name_nn not null,
    email varchar2(25) constraint employees_email_emp_email_uq unique, 
    hire_date date constraint employees_hire_date_nn not null, 
    job_id varchar2(10) constraint employees_job_nn not null,

    constraint employees_name_uq unique (first_name, last_name)
);

insert into employees (
    select employee_id, first_name, last_name, email, hire_date, job_id
    from hr.employees
);
