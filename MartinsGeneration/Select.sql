INSERT INTO mydb.funcionarios (nome, email, telefone, funcao, salario)
VALUES
('Pamela', 'pamela@email.com', '279879646', 'Operador', 1800),
('Matheus', 'Matheus@email.com', '797646463', 'diretor', 15000),
('Pedro', 'Pedro@email.com', '798964644', 'Gerente', 2100),
('Gabi', 'Gabi@email.com', '279464634', 'ADM', 1800),
('Kaio', 'Kaio@email.com', '25464897', 'Lider', 2300);


SELECT salario
FROM mydb.funcionarios
WHERE (salario > 2000);

SELECT salario
FROM mydb.funcionarios
WHERE (salario < 2000)