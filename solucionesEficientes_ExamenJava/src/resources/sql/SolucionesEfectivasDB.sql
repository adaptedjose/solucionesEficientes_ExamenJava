// Creación de la base de datos

create database SolucionesEfectivasDB;

use SolucionesEfectivasDB;

show tables;

create table cliente {
	id int primary key,
	nombre varchar(50),
	representante varchar(50),
	correo varchar(50),
	telefono varchar(50),
	direccion varchar(50),
	sector enum("Tecnologia", "Salud", "Educacion", "Comercio", "Manufactura") default 'Tecnologia';
};

create table servicio {
	id int primary key,
	nombre varchar(50),
	descripcion varchar(100),
	precioPorHora varchar(10),
	categoria enum("TI", "Administracion", "Limpieza", "Seguridad") default 'TI';
};

create table proyecto {
	id int primary key,
	nombre varchar(50),
	fechaInicio date,
	fechaFin date,
	estado enum("En curso", "Completado", "Cancelado") default 'En curso', 
	idCliente int,
	foreign key idCliente references cliente(id)
};

create table contrato {
	id int primary key,
	fechaInicio date,
	fechaFin date,
	costoTotal varchar(10),
	estado enum("Activo", "En espera", "Finalizado") default 'Activo',
	idCliente int,
	idServicio int,
	foreign key idCliente references cliente(id),
	foreign key idServicio references servicio(id)
};

create table empleado {
	id int primary key,
	nombre varchar(50),
	cargo varchar(50),
	salario varchar(50),
	especialidad enum("TI", "Administracion", "Limpieza", "Seguridad") default 'TI',
	idProyecto int,
	foreign key idProyecto references proyecto(id)
};

create table asignacion {
	idEmpleado int,
	idProyecto int,
	horasTrabajadas varchar(10),
	fechaAsignacion date,
	foreign key idEmpleado references empleado(id),
	foreign key idProyecto references proyecto(id),
	primary key(idEmpleado, idProyecto)
};
