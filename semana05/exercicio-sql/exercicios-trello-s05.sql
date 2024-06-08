-- ex 02
-- Criação das tabelas
CREATE TABLE Nutricionista (
    ID_Nutricionista SERIAL PRIMARY KEY,
    CRN VARCHAR(20) NOT NULL,
    Especialidade VARCHAR(50),
    Tempo_experiencia INT
);

CREATE TABLE Paciente (
    ID_Paciente SERIAL PRIMARY KEY,
    Nome VARCHAR(50) NOT NULL,
    Data_Nascimento DATE,
    CPF VARCHAR(11) UNIQUE NOT NULL,
    Telefone VARCHAR(15),
    Email VARCHAR(30)
);

CREATE TABLE Consulta (
    ID_Consulta SERIAL PRIMARY KEY,
    ID_Nutricionista SERIAL REFERENCES Nutricionista(ID_Nutricionista),
    ID_Paciente SERIAL REFERENCES Paciente(ID_Paciente),
    Data_Consulta DATE NOT NULL,
    Observacoes TEXT
);

-- Deleção das tabelas
DROP TABLE IF EXISTS Consulta;
DROP TABLE IF EXISTS Nutricionista;
DROP TABLE IF EXISTS Paciente;

-- ex03
-- Inserção de dados na tabela Nutricionista
INSERT INTO Nutricionista (CRN, Especialidade, Tempo_experiencia)
VALUES ('123456', 'Nutrição Clínica', 10),
       ('654321', 'Nutrição Esportiva', 5),
       ('112233', 'Nutrição Infantil', 8);

-- Inserção de dados na tabela Paciente
INSERT INTO Paciente (Nome, Data_Nascimento, CPF, Telefone, Email)
VALUES ('Camila Reimann', '1990-05-15', '12345678901', '1111-2222', 'joao@gmail.com'),
       ('Jessica Pereira', '1985-11-23', '98765432100', '3333-4444', 'maria@gmail.com'),
       ('Ana Paula Padrão', '2000-03-10', '55566677788', '5555-6666', 'pedro@gmail.com');

-- Inserção de dados na tabela Consulta
INSERT INTO Consulta (Data_Consulta, Observacoes)
VALUES ('2024-06-01', 'Consulta inicial, paciente deseja perder peso.'),
       ('2024-06-02', 'Consulta de retorno, dieta ajustada.'),
       ('2024-06-03', 'Primeira consulta, avaliação nutricional.');

-- ex04 - já foi feito quando criamos a tabela, segue exemplo que não será executado:
-- FOREIGN KEY (ID_Nutricionista) REFERENCES Nutricionista (ID_Nutricionista),
-- FOREIGN KEY (ID_Paciente) REFERENCES Paciente (ID_Paciente)

-- ex05 criar diagrama

-- ex06
-- Atualização de dados relacionados
UPDATE Consulta SET ID_Paciente = 3 WHERE ID_Consulta = 15;
UPDATE Consulta SET ID_Paciente = 1 WHERE ID_Consulta = 12;
UPDATE Consulta SET ID_Paciente = 2 WHERE ID_Consulta = 10;

-- ex07
-- Comandos UPDATE
UPDATE Nutricionista SET Especialidade = 'Nutrição Geral' WHERE ID_Nutricionista = 1;
UPDATE Paciente SET Telefone = '9999-8888' WHERE ID_Paciente = 2;
UPDATE Consulta SET Observacoes = 'Consulta de acompanhamento.' WHERE ID_Consulta = 15;

-- Comandos DELETE
DELETE FROM Consulta WHERE ID_Consulta = 10;

select * from nutricionista
select * from paciente
select * from consulta



