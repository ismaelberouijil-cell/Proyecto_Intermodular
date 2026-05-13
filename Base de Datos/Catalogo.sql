Create database Catalogo;

Use Catalogo;

Create table Marca(
    ID_Marca int auto_increment primary key,
    nombre varchar(20) not null,
    Pais_Origen varchar(20) not null
);

Create table Movil(
    ID_Movil INT AUTO_INCREMENT PRIMARY KEY,
    Primary key (ID_Movil),
    Modelo varchar(20)not null,
    Precio decimal (10,2),
    almacenamiento int not null,
    RAM int not null,
    Stock int not null,
    ID_Marca varchar(50) not null,
    foreign key (ID_Marca) references Marca(ID_Marca)
);

Create table Cliente(
    ID_Cliente INT AUTO_INCREMENT PRIMARY KEY,
    Primary key (ID_Cliente),
    DNI varchar(9) unique not null,
    Nombre varchar(20) not null,
    PrApellido varchar(30) not null,
    SgApellido varchar(30) not null,
    contraseña varchar(255) not null,
    telefono varchar (15) not null,
    email varchar(100) unique not null,
    direccion varchar(30) not null
    
);

Create table Pedido(
    ID_Pedido INT AUTO_INCREMENT PRIMARY KEY,
    Fecha Date,
    Estado varchar(20) not null,
    ID_Cliente varchar(50) not null,
    Foreign key  (ID_Cliente) references Cliente(ID_Cliente)
);

Create table Envio(
    ID_ENVIO INT AUTO_INCREMENT PRIMARY KEY,
    Empresa_Envio varchar(50),
    Estado_Envio varchar(20) not null,
    Fecha_Envio Date,
    ID_Pedido varchar(50) not null,
    foreign key (ID_Pedido) references Pedido(ID_Pedido)
);

Create table Pago(
    ID_Pago INT AUTO_INCREMENT PRIMARY KEY,
    ID_Pedido varchar(50) not null,
    Metodo_Pago varchar(20) not null,
    Fecha_Pago Date,
    Importe decimal(10,2),
    foreign key (ID_Pedido) references Pedido(ID_Pedido)
);

Create table IBAN(
    
    codIban int Primary Key,
    CodPais varchar(2) not null,
    DC varchar(2) not null,
    Entidad varchar(4) not null,
    cSucursal varchar(4) not null,
    cDCCta varchar(10)not null,
    cnumcuenta varchar(20) not null,
    ID_Cliente varchar(50) not null,
    Foreign Key(ID_Cliente) references Cliente(ID_Cliente)
);

Create table Detalle_Pedido(
    ID_DetallePedido INT AUTO_INCREMENT PRIMARY KEY,
    Cantidad int not null,
    Precio decimal(10,2) not null,
    ID_Movil varchar(50) not null,
    ID_Pedido varchar(50) not null,
    foreign key (ID_Pedido) references Pedido(ID_Pedido),
    foreign key (ID_Movil) references Movil(ID_Movil)
);