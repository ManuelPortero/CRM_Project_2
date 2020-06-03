CREATE DATABASE "CRM"
    WITH 
    OWNER = postgres
    ENCODING = 'UTF8'
    LC_COLLATE = 'Spanish_Spain.1252'
    LC_CTYPE = 'Spanish_Spain.1252'
    TABLESPACE = pg_default
    CONNECTION LIMIT = -1;

create table Roles(
Id bigint PRIMARY KEY,
NameRole VARCHAR(20) not null
);

create table Employees(
Id bigint PRIMARY KEY,
Dni varchar(9),
Name varchar(20) not null,
Surname varchar(100) not null,
Position varchar(50) not null,
 UserLogin varchar (50) not null,
 Pass varchar(8) not null
);

create table Customers(
Id bigint PRIMARY KEY,
IdCustomer int not null,
Name varchar(100) not null,
Surname varchar (100) not null,
Company varchar (100) not null,
Adress varchar (300) not null,
City varchar (100) not null
);

create table RelaRolesEmployees(
Id bigint PRIMARY KEY,
IdRole bigint not null,
IdEmployee bigint not null,
FOREIGN KEY (IdRole) REFERENCES Roles(Id) ON UPDATE CASCADE ON DELETE CASCADE,
FOREIGN KEY (IdEmployee) REFERENCES Employees(Id) ON UPDATE CASCADE ON DELETE CASCADE

);

create table Tasks(
Id bigint PRIMARY KEY,
Name varchar (50),
Description varchar (200)

);

create table RelaCustomersEmployees(
Id bigint PRIMARY KEY,
IdEmployee bigint not null,
IdCustomer bigint not null,
FOREIGN KEY (IdEmployee) REFERENCES Employees(Id) ON UPDATE CASCADE ON DELETE CASCADE,
FOREIGN KEY (IdCustomer) REFERENCES Customers(Id) ON UPDATE CASCADE ON DELETE CASCADE
);

create table RelaTasksEmployees(
Id bigint PRIMARY KEY,
IdEmployee bigint not null,
IdTask bigint not null,
FOREIGN KEY (IdEmployee) REFERENCES Employees(Id) ON UPDATE CASCADE ON DELETE CASCADE,
FOREIGN KEY (IdTask) REFERENCES Tasks(Id) ON UPDATE CASCADE ON DELETE CASCADE
);

create table RelaCustomerTasksEmployees(
Id bigint PRIMARY KEY,
IdEmployee bigint not null,
IdCustomer bigint not null,
IdTask bigint not null,
Date timestamp  not null,
Description text not null,
ValueHours float not null,
FOREIGN KEY (IdEmployee) REFERENCES Employees(Id) ON UPDATE CASCADE ON DELETE CASCADE,
FOREIGN KEY (IdCustomer) REFERENCES Customers(Id) ON UPDATE CASCADE ON DELETE CASCADE,
FOREIGN KEY (IdTask) REFERENCES Tasks(Id) ON UPDATE CASCADE ON DELETE CASCADE


);


