-- Mostrar todos los móviles
SELECT * FROM Movil;

-- Mostrar móviles con precio mayor a 500€
SELECT * FROM Movil
WHERE Precio > 500;

-- Mostrar clientes registrados
SELECT Nombre, email
FROM Cliente;

-- Mostrar pedidos y estado
SELECT ID_Pedido, Estado
FROM Pedido;

-- Mostrar móviles y marca
SELECT Movil.Modelo, Marca.nombre
FROM Movil
INNER JOIN Marca
ON Movil.ID_Marca = Marca.ID_Marca;

-- Mostrar pedidos de cada cliente
SELECT Cliente.Nombre, Pedido.Estado
FROM Cliente
INNER JOIN Pedido
ON Cliente.ID_Cliente = Pedido.ID_Cliente;

-- Mostrar pagos realizados
SELECT Metodo_Pago, Importe
FROM Pago;

-- Mostrar móviles con poco stock
SELECT Modelo, Stock
FROM Movil
WHERE Stock < 10;



-- =========================
-- CONSULTAS UPDATE
-- =========================

-- Actualizar stock
UPDATE Movil
SET Stock = 15
WHERE ID_Movil = 1;

-- Cambiar estado pedido
UPDATE Pedido
SET Estado = 'Entregado'
WHERE ID_Pedido = 1;



-- =========================
-- CONSULTAS DELETE
-- =========================

-- Eliminar un móvil
DELETE FROM Movil
WHERE ID_Movil = 4;

-- Eliminar un cliente
DELETE FROM Cliente
WHERE ID_Cliente = 2;