create database AssistenciaTecnicaTeste

use AssistenciaTecnicaTeste

drop database AssistenciaTecnicaTeste

SELECT email, senha from Cliente where email = 'joaoluiz@gmail.com' and senha = '12345'

Select * from Cliente

Select A.rg from Cliente as A inner join Equipamento as B on A.rg = B.rg

select * from Equipamento

delete from Equipamento where idEquipamento = 3

insert into Cliente values ('47.271.348-1', 'joao', 'joao@gmail.com', '12345', '02-05-1985', '21832-2810')

insert into Cliente values ('31.124.641-2', 'Guilherme', 'guilherme@gmail.com', '4312', '23/07/2004', '31821-8921') 

insert into Equipamento values ('Placa de Video', 'Não da video depois do raio cair na casa', 'Geforce GTX 1080', 'Sem Video', '18.584.281-1')

create table Cliente(
idCliente int not null identity,
rg varchar(12) not null,
nome varchar(100) not null,
usernome varchar(100) not null,
email varchar(100) not null,
senha varchar(50) not null,
data_nasc date not null,
telefone varchar(10) not null,
cep varchar(9) not null,
numero_casa varchar(5) not null,
constraint pk_rg primary key (rg)
)

create table Endereco(
cep varchar(9) not null,
rg varchar(12) not null,
numero_residencia int not null,
cidade varchar(50) not null,
constraint pk_cep primary key (cep),
constraint fk_idCliente foreign key(rg)
references Cliente (rg)
)

create table Equipamento(
idEquipamento int not null identity,
tipoEquipamento varchar(30) not null,
descricao_defeito varchar(200) not null,
nome varchar(50) not null,
tipoDefeito varchar(30) not null,
rg varchar(12) not null,
constraint pk_equipamento primary key (idEquipamento),
constraint fk_rg foreign key (rg)
references Cliente (rg)
)

create table Agendamento(
idAgendamento int not null identity,
tipoEquipamento varchar(30) not null,
nomeCliente varchar(100) not null,
dia date not null,
hora time not null,
tipoContato varchar(20) not null,
rg varchar(12) not null,
constraint pk_agendamento primary key(idAgendamento),
constraint fk_rg_agendamento foreign key (rg)
references Cliente (rg)
)

create table Servico(
idServico int not null identity,
rg varchar(12) not null,
valor float not null,
dataTermino date not null,
constraint pk_servico primary key(idServico),
constraint fk_rg_servico foreign key(rg)
references Cliente (rg)
)

create table Envio(
idEnvio int not null identity,
tipoEnvio varchar(20) not null,
idEquipamento int not null,
idServico int not null,
cep varchar(9) not null,
constraint pk_envio primary key (idEnvio),
constraint fk_equipamento foreign key (idEquipamento)
references Equipamento (idEquipamento),
constraint fk_servico foreign key (idServico)
references Servico (idServico),
constraint fk_cep foreign key (cep)
references Endereco (cep)
)

select * from Cliente

select * from Endereco

select * from Equipamento

select * from Agendamento

select * from Servico

select * from Envio

select A.idCliente, B.rg from Cliente A, Endereco B where A.rg = B.rg

insert into Cliente values ('29.384.321-0', 'Lucas de Santos Moura', 'lucasSantosMoura@gmail.com', 'lucasMoura567', '09/05/1992', '98421-5742')

insert into Agendamento values ('Placa de Video', 'Lucas de Santos Moura', '10/07/2022', '10:00', 'Email', '29.384.321-0')

insert into Servico values ('29.384.321-0', 190.00, '13/07/2022')

insert into Endereco values ('82719-291', '29.384.321-0', '291', 'Barueri')

insert into Envio values ('Delivery', 1 , 2 , '82719-291')
