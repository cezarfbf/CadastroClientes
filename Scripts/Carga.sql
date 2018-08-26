USE `Cadastro_Cliente` ;

INSERT INTO `cadastro_cliente`.`tb_endereco`
(`rua_endereco`,
`bairro_endereco`,
`cidade_endereco`,
`numero_endereco`,
`cep_endereco`,
`complemento_endereco`)
VALUES
('Alfredo lisboa',
'Guimarães',
'T3eaojaef',
'123453423248424',
43283749,
'Apto 304, bloco 23445'),
('José Böèê%#$',
'!@##$#@%$%',
'São josé dos milagres',
'12',
43283748,
'Lado C');

select * from tb_endereco;


INSERT INTO `cadastro_cliente`.`tb_cliente`
(`nome_cliente`,
`cnpj_cliente`,
`uf_cliente`,
`cod_endereco`)
VALUES
('GOOGLE LTDA',
'30653085000154',
'CE',
2),
('EMPRESA TESTE2 LTDA',
'19643085000154',
'AC',
2);

select * from tb_cliente;

INSERT INTO `cadastro_cliente`.`tb_email`
(`endereco_email`,
`cod_cliente`)
VALUES
('empresateste2ltda@empresateste.com',1),
('empresatesteltda@empresateste.com',1234),
('financeiro@empresateste.com',1234),
('google@google.com',1239)
;

select * from tb_email;

INSERT INTO `cadastro_cliente`.`tb_telefone`
(`numero_telefone`,
`cod_cliente`)
VALUES
('81987874343',1),
('1123434344',1234),
('84943287378',1234),
('092983784987',1239);

select * from tb_telefone;

INSERT INTO `cadastro_cliente`.`tb_responsavel`
(`nome_responsavel`,
`cpf_responsavel`,
`cod_cliente`)
VALUES
('Jóse Afonso de Oliveira','98743454323',1),
('Maria Lima Duarte','18543454323',1234),
('Fábio Fagundes Farías Frasano Ferreira Feitosa Fidalgo Filho','58547654323',1239),
('Luiz Gonzaga','58547654323',1239);

select * from tb_responsavel;

delete from tb_endereco;
delete from tb_cliente;
delete from tb_email;
delete from tb_telefone;
delete from tb_responsavel where cod_cliente = 1; 