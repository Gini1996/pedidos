CREATE TABLE IF NOT EXISTS Pedidos
( 
    id SERIAL,
	pedido INTEGER,
	item VARCHAR(255) NOT NULL,
    quantidade INTEGER,
	PRIMARY KEY (id)
);