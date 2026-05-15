CREATE DATABASE Catalogo;
USE Catalogo;

CREATE TABLE Marca(
    ID_Marca INT AUTO_INCREMENT PRIMARY KEY,
    Nombre VARCHAR(20) NOT NULL,
    Pais_Origen VARCHAR(20) NOT NULL
);

CREATE TABLE Movil(
    ID_Movil INT AUTO_INCREMENT PRIMARY KEY,
    Modelo VARCHAR(50) NOT NULL,
    Precio DECIMAL(10,2),
    Almacenamiento INT NOT NULL,
    RAM INT NOT NULL,
    Stock INT NOT NULL,
    ID_Marca INT NOT NULL,
    
    FOREIGN KEY (ID_Marca) REFERENCES Marca(ID_Marca)
);

CREATE TABLE Cliente(
    ID_Cliente INT AUTO_INCREMENT PRIMARY KEY,
    DNI VARCHAR(9) UNIQUE NOT NULL,
    Nombre VARCHAR(20) NOT NULL,
    PrApellido VARCHAR(30) NOT NULL,
    SgApellido VARCHAR(30) NOT NULL,
    Contrasena VARCHAR(255) NOT NULL,
    Telefono VARCHAR(15) NOT NULL,
    Email VARCHAR(100) UNIQUE NOT NULL,
    Direccion VARCHAR(100) NOT NULL
);

CREATE TABLE Pedido(
    ID_Pedido INT AUTO_INCREMENT PRIMARY KEY,
    Fecha DATE,
    Estado VARCHAR(20) NOT NULL,
    ID_Cliente INT NOT NULL,
    
    FOREIGN KEY (ID_Cliente) REFERENCES Cliente(ID_Cliente)
);

CREATE TABLE Envio(
    ID_Envio INT AUTO_INCREMENT PRIMARY KEY,
    Empresa_Envio VARCHAR(50),
    Estado_Envio VARCHAR(20) NOT NULL,
    Fecha_Envio DATE,
    ID_Pedido INT NOT NULL,
    
    FOREIGN KEY (ID_Pedido) REFERENCES Pedido(ID_Pedido)
);

CREATE TABLE Pago(
    ID_Pago INT AUTO_INCREMENT PRIMARY KEY,
    ID_Pedido INT NOT NULL,
    Metodo_Pago VARCHAR(20) NOT NULL,
    Fecha_Pago DATE,
    Importe DECIMAL(10,2),
    
    FOREIGN KEY (ID_Pedido) REFERENCES Pedido(ID_Pedido)
);

CREATE TABLE IBAN(
    CodIban INT AUTO_INCREMENT PRIMARY KEY,
    CodPais VARCHAR(2) NOT NULL,
    DC VARCHAR(2) NOT NULL,
    Entidad VARCHAR(4) NOT NULL,
    CSucursal VARCHAR(4) NOT NULL,
    CDCCta VARCHAR(10) NOT NULL,
    CNumCuenta VARCHAR(20) NOT NULL,
    ID_Cliente INT NOT NULL,
    
    FOREIGN KEY(ID_Cliente) REFERENCES Cliente(ID_Cliente)
);

CREATE TABLE Detalle_Pedido(
    ID_DetallePedido INT AUTO_INCREMENT PRIMARY KEY,
    Cantidad INT NOT NULL,
    Precio DECIMAL(10,2) NOT NULL,
    ID_Movil INT NOT NULL,
    ID_Pedido INT NOT NULL,
    
    FOREIGN KEY (ID_Pedido) REFERENCES Pedido(ID_Pedido),
    FOREIGN KEY (ID_Movil) REFERENCES Movil(ID_Movil)
);