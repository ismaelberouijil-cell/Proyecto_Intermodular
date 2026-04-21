Create eSINTERMINAR;

Use eSINTERMINAR;

Create table Marca(
    ID_Marca varchar(50) not null,
    Primary key (ID_Marca),
    nombre varchar(20) not null,
    Pais_Origen varchar(20) not null
);
Create table Movil(
    ID_Movil varchar(50) not null,
    Primary key (ID_Movil),
    Modelo varchar(20)not null,
    Precio decimal (10,2),
    almacenimiento varchar(20) not null,
    RAM varchar(20) not null,
    Stock varchar(20) not null,
    foreign key (ID_Movil) references Marca(ID_Movil)
);

Create table Cliente(
    ID_Cliente varchar(50) not null,
    Primary key (ID_Cliente),
    DNI varchar(8) not null,
    Nombre varchar(20) not null,
    PrApellido varchar(30) not null,
    SgApellido varchar(30) not null,
    telefono varchar (15) not null,
    email varchar(30) not null,
    Contrasena varchar(10) not null,
    direccion varchar(30) not null
    
);

Create table Envio(
    ID_ENVIO varchar(50) not null,
    primary key(ID_ENVIO),
    Empresa_Envio Date,
    Estado_Envio varchar(10) not null
    Fecha_Envio Date,
    ID_Pedido varchar(30) not null,
    foreign key (ID_Pedido) references Cliente(ID_Pedido)
);

Create table Pago(
    ID_Pago varchar(30) not null,
    ID_Pedido varchar(30) not null,
    Metodo_Pago varchar(10) not null,
    Fecha_Pago Date,
    Importe decimal(10,2)
    foreign key (ID_Pedido) references Cliente(ID_Pedido)
);

Create table IBAN(
    
    codIban int Primary Key,
    CodPais varchar(2) not null,
    DC varchar(2) not null,
    Entidad varchar(4) not null,
    cSucursal varchar(4) not null,
    cDCCta varchar(10)not null,
    cnumcuenta varchar(20) not null,
    dni varchar(20) not null,
    Foreign Key(dni) references Cliente(dni)
);
