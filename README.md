# Java-Backend
Um pouco da pratica de Backend em Java.

-- Criação das Tabelas
USE benvinda;
CREATE TABLE Cliente (
    id_cliente INT AUTO_INCREMENT PRIMARY KEY,
    nome_cliente VARCHAR(100) NOT NULL,
    email_cliente VARCHAR(100) NOT NULL,
    telefone_cliente VARCHAR(15) NOT NULL,
    endereco_cliente VARCHAR(255) NOT NULL,
    cpf_cliente VARCHAR(11) NOT NULL
);

CREATE TABLE Servico (
    id_servico INT AUTO_INCREMENT PRIMARY KEY,
    nome_servico VARCHAR(100) NOT NULL,
    descricao_servico TEXT,
    preco_servico DECIMAL(10, 2) NOT NULL,
    duracao_servico TIME NOT NULL
);

CREATE TABLE Agendamento (
    id_agendamento INT AUTO_INCREMENT PRIMARY KEY,
    data_agendamento DATE NOT NULL,
    hora_agendamento TIME NOT NULL,
    id_cliente INT NOT NULL,
    id_servico INT NOT NULL
);

CREATE TABLE Produto (
    id_produto INT AUTO_INCREMENT PRIMARY KEY,
    nome_produto VARCHAR(100) NOT NULL,
    descricao_produto TEXT,
    preco_produto DECIMAL(10, 2) NOT NULL,
    quantidade_produto INT NOT NULL
);

CREATE TABLE Venda (
    id_venda INT AUTO_INCREMENT PRIMARY KEY,
    data_venda DATE NOT NULL,
    total_venda DECIMAL(10, 2) NOT NULL,
    id_cliente INT NOT NULL
);

CREATE TABLE Venda_Produto (
    id_venda INT NOT NULL,
    id_produto INT NOT NULL,
    PRIMARY KEY (id_venda, id_produto)
);

CREATE TABLE Pagamento (
    id_pagamento INT AUTO_INCREMENT PRIMARY KEY,
    data_pagamento DATE NOT NULL,
    hora_pagamento TIME NOT NULL,
    valor_pagamento DECIMAL(10, 2) NOT NULL,
    id_venda INT NOT NULL,
    id_cliente INT NOT NULL,
    id_status INT NOT NULL,
    id_metodo INT NOT NULL
);

CREATE TABLE Status (
    id_status INT AUTO_INCREMENT PRIMARY KEY,
    descricao_status VARCHAR(50) NOT NULL
);

CREATE TABLE Metodo (
    id_metodo INT AUTO_INCREMENT PRIMARY KEY,
    descricao_metodo VARCHAR(50) NOT NULL
);

-- Adição das Constraints
ALTER TABLE Agendamento ADD CONSTRAINT rl_cliente_agendamento FOREIGN KEY (id_cliente) REFERENCES Cliente(id_cliente);
ALTER TABLE Agendamento ADD CONSTRAINT rl_servico_agendamento FOREIGN KEY (id_servico) REFERENCES Servico(id_servico);
ALTER TABLE Pagamento ADD CONSTRAINT rl_venda_pagamento FOREIGN KEY (id_venda) REFERENCES Venda(id_venda);
ALTER TABLE Pagamento ADD CONSTRAINT rl_cliente_pagamento FOREIGN KEY (id_cliente) REFERENCES Cliente(id_cliente);
ALTER TABLE Pagamento ADD CONSTRAINT rl_status_pagamento FOREIGN KEY (id_status) REFERENCES Status(id_status);
ALTER TABLE Pagamento ADD CONSTRAINT rl_metodo_pagamento FOREIGN KEY (id_metodo) REFERENCES Metodo(id_metodo);
ALTER TABLE Venda_Produto ADD CONSTRAINT rl_venda_produto_venda FOREIGN KEY (id_venda) REFERENCES Venda(id_venda);
ALTER TABLE Venda_Produto ADD CONSTRAINT rl_venda_produto_produto FOREIGN KEY (id_produto) REFERENCES Produto(id_produto);

