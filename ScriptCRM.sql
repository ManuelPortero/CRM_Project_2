
create table Roles(
Id VARCHAR(64) PRIMARY KEY,
NameRole VARCHAR(20) not null
);

create table Employees(
Id VARCHAR(10) PRIMARY KEY,
Name varchar(20) not null,
Surname varchar(100) not null,
Position varchar(50) not null,
 UserLogin varchar (50) not null,
 Pass varchar(8) not null
);

create table Customers(
Id varchar(64) PRIMARY KEY,
IdCustomer int not null,
Name varchar(100) not null,
Surname varchar (100) not null,
Company varchar (100) not null,
Adress varchar (300) not null,
City varchar (100) not null
);

create table RelaRolesEmployees(
Id VARCHAR(64) PRIMARY KEY,
IdRole varchar(64) not null,
IdEmployee varchar(10) not null,
FOREIGN KEY (IdRole) REFERENCES Roles(Id) ON UPDATE CASCADE ON DELETE CASCADE,
FOREIGN KEY (IdEmployee) REFERENCES Employees(Id) ON UPDATE CASCADE ON DELETE CASCADE

);

create table Tasks(
Id varchar(64) PRIMARY KEY,
Name varchar (50),
Description varchar (200)

);

create table RelaCustomersEmployees(
Id varchar(64) PRIMARY KEY,
IdEmployee varchar(10) not null,
IdCustomer varchar(64) not null,
FOREIGN KEY (IdEmployee) REFERENCES Employees(Id) ON UPDATE CASCADE ON DELETE CASCADE,
FOREIGN KEY (IdCustomer) REFERENCES Customers(Id) ON UPDATE CASCADE ON DELETE CASCADE
);

create table RelaTasksEmployees(
Id varchar(64),
IdEmployee varchar(10) not null,
IdTask varchar(64) not null,
FOREIGN KEY (IdEmployee) REFERENCES Employees(Id) ON UPDATE CASCADE ON DELETE CASCADE,
FOREIGN KEY (IdTask) REFERENCES Tasks(Id) ON UPDATE CASCADE ON DELETE CASCADE
);

create table RelaCustomerTasksEmployees(
Id varchar(64) PRIMARY KEY,
IdEmployee varchar(10) not null,
IdCustomer varchar(64) not null,
IdTask varchar(64) not null,
Date timestamp  not null,
Description text not null,
ValueHours float not null,
FOREIGN KEY (IdEmployee) REFERENCES Employees(Id) ON UPDATE CASCADE ON DELETE CASCADE,
FOREIGN KEY (IdCustomer) REFERENCES Customers(Id) ON UPDATE CASCADE ON DELETE CASCADE,
FOREIGN KEY (IdTask) REFERENCES Tasks(Id) ON UPDATE CASCADE ON DELETE CASCADE


);


