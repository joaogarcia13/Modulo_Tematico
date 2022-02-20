import random
from sqlite3 import connect
import string
from time import strftime
import mysql.connector
from random import randint
from random import randrange
from datetime import timedelta, datetime
from datetime import date

#funcao que gera um numero com n digitos
def random_com_N_digitos(n):
    range_ini = 10**(n-1)
    range_end = (10**n)-1
    return str(randint(range_ini, range_end))

#funcao que gera uma data entre duas datas dadas como parametros
def random_data(inicio, fim):
    delta = fim - inicio
    int_delta = (delta.days * 24 * 60 * 60) + delta.seconds
    random_segundos = randrange(int_delta)
    dataFinal = inicio + timedelta(seconds=random_segundos)
    return dataFinal.strftime('%Y-%m-%d')

#funcao que adiciona anos
def addYears(d, years):
    try:   
        return d.replace(year = d.year + years)
    except ValueError:      
        return d + (date(d.year + years, 1, 1) - date(d.year, 1, 1))

#estabelece conecao a base de dados
conecao = mysql.connector.connect(host="estga-dev.clients.ua.pt", user="PTDA_1", password="uhtin_45")
#objecto cursor é chamado para mexer na base de dados
cursor = conecao.cursor()


#arrays marcas
marcas = ["Alfa Romeo","Audi","Bentley","BMW","Cadillac","Chevrolet","Chrysler","Citroen","Corvette","Dodge","Ferrari","Fiat","Ford","Honda","Hyundai","Jaguar","Jeep","Kia","Lamborghini",
    "LandRover","Lexus","Lotus","Maserati","Mazda","Mercedes-Benz","Mini","Mitsubishi","Nissan","Opel","Peugeot","Porsche","Renault","Rolls-Royce","Seat","Skoda","Smart","Subaru",
    "Suzuki","Tesla","Toyota","Volkswagen","Volvo"]

#insert das marcas
sql = "INSERT INTO `PTDA_BD_1`.`marcas` (`marca`) VALUES (%s)"
vals = [(val,) for val in marcas]
cursor.executemany(sql,vals)

#pusha o codigo para a base de dados
conecao.commit()


#array pessoas: nome - numeroCC - morada - dataregisto - data nascimento - telefone - email - user - pass
pessoas = [ "","","","","","","","","",
    "Fernanda Gomes", random_com_N_digitos(7), "Rua do Vieira, 3750-463 Fermentelos", random_data(datetime(2005,1,1), datetime(2022,2,19)), random_data(datetime(1960,1,1), datetime(2003,3,1)), random_com_N_digitos(9), "fernando.gomes@gmail.com", "admin", "8c6976e5b5410415bde908bd4dee15dfb167a9c873fc4bb8a81f6f2ab448a918", #admin
    "Jerônimo Gonsalves", random_com_N_digitos(7), "Lomba, 3750-017 Agadão", random_data(datetime(2005,1,1), datetime(2022,2,19)), random_data(datetime(1960,1,1), datetime(2003,3,1)), random_com_N_digitos(9), "jeronimo@gmail.pt", "jeronimo", "00040f820205a3fb5c1905ec2ec67b231280fb95da86680659443d4e57a603c6", #jerom123
    "Calisto Almeida", random_com_N_digitos(7), "Barrosinhas, 3750-000 Águeda", random_data(datetime(2005,1,1), datetime(2022,2,19)), random_data(datetime(1960,1,1), datetime(2003,3,1)), random_com_N_digitos(9), "calisto.a@gmail.pt", "calisto", "4873bfd3efc25341257ad2c71217e4df3c89540111828a46c2f80a8dceb0755a", #caucau
    "Zeferino Dias", random_com_N_digitos(7), "Barro, 3750-351 Barrô Agd", random_data(datetime(2005,1,1), datetime(2022,2,19)), random_data(datetime(1960,1,1), datetime(2003,3,1)), random_com_N_digitos(9), "zeferino.what@gmail.pt", "zeferino", "6e43246ea6ff80e02c724c92a2188d29b8f679287f46f63196ac0464939014c0", #nomeMaisEstranho
    "Isac Barboza", random_com_N_digitos(7), "Barrosinhas, 3750-000 Águeda", random_data(datetime(2005,1,1), datetime(2022,2,19)), random_data(datetime(1960,1,1), datetime(2003,3,1)), random_com_N_digitos(9), "isac@gmail.pt", "", "",
    "Erasmo Freitas", random_com_N_digitos(7), "Rua do Alagoa, 3750-301 Águeda", random_data(datetime(2005,1,1), datetime(2022,2,19)), random_data(datetime(1960,1,1), datetime(2003,3,1)), random_com_N_digitos(9), "erasmus@gmail.pt", "", "",
    "Gualberto Araújo",random_com_N_digitos(7), "Rua do Vieira, 3750-463 Fermentelos", random_data(datetime(2005,1,1), datetime(2022,2,19)), random_data(datetime(1960,1,1), datetime(2003,3,1)), random_com_N_digitos(9), "gilberto.ou.nao@gmail.pt", "", "",
    "Aurélia Menezes", random_com_N_digitos(7), "Rua do Vieira, 3750-463 Fermentelos", random_data(datetime(2005,1,1), datetime(2022,2,19)), random_data(datetime(1960,1,1), datetime(2003,3,1)), random_com_N_digitos(9), "aurelio@gmail.pt", "", "",
    "Zé Baptista", random_com_N_digitos(7), "Raso de Paredes, 3750-316 Águeda", random_data(datetime(2005,1,1), datetime(2022,2,19)), random_data(datetime(1960,1,1), datetime(2003,3,1)), random_com_N_digitos(9), "zezote@gmail.pt", "", "",
    "Dário Guerra",random_com_N_digitos(7), "Raso de Paredes, 3750-316 Águeda", random_data(datetime(2005,1,1), datetime(2022,2,19)), random_data(datetime(1960,1,1), datetime(2003,3,1)), random_com_N_digitos(9), "dariao@gmail.pt", "", "",
    "Moisés Mata", random_com_N_digitos(7), "Raso de Paredes, 3750-316 Águeda", random_data(datetime(2005,1,1), datetime(2022,2,19)), random_data(datetime(1960,1,1), datetime(2003,3,1)), random_com_N_digitos(9), "moses@gmail.pt", "", "",
    "Ramiro Moniz", random_com_N_digitos(7), "Rua Luís de Camões, 3750-159 Águeda", random_data(datetime(2005,1,1), datetime(2022,2,19)), random_data(datetime(1960,1,1), datetime(2003,3,1)), random_com_N_digitos(9), "ramiro@gmail.pt", "", "",
    "Alcides Gama", random_com_N_digitos(7), "Rua Luís de Camões, 3750-159 Águeda", random_data(datetime(2005,1,1), datetime(2022,2,19)), random_data(datetime(1960,1,1), datetime(2003,3,1)), random_com_N_digitos(9), "acidez.da.gama@gmail.pt", "", "",
    "Joaquim do Rosário", random_com_N_digitos(7), "Rua Luís de Camões, 3750-159 Águeda", random_data(datetime(2005,1,1), datetime(2022,2,19)), random_data(datetime(1960,1,1), datetime(2003,3,1)), random_com_N_digitos(9), "rosarito@gmail.pt", "", "",
    "Virgílio Brito", random_com_N_digitos(7), "Rua Engenheiro José Bastos Xavier, 3750-144 Águeda", random_data(datetime(2005,1,1), datetime(2022,2,19)), random_data(datetime(1960,1,1), datetime(2003,3,1)), random_com_N_digitos(9), "viriginio@gmail.pt", "", "",
    "Roldão Vasconcelos", random_com_N_digitos(7), "Rua Engenheiro José Bastos Xavier, 3750-144 Águeda", random_data(datetime(2005,1,1), datetime(2022,2,19)), random_data(datetime(1960,1,1), datetime(2003,3,1)), random_com_N_digitos(9), "rolao@gmail.pt", "", "",
    "Osvaldo Salgado", random_com_N_digitos(7), "Rua Engenheiro José Bastos Xavier, 3750-144 Águeda", random_data(datetime(2005,1,1), datetime(2022,2,19)), random_data(datetime(1960,1,1), datetime(2003,3,1)), random_com_N_digitos(9), "Osvaldo.V.Salgado@gmail.pt", "", "",
    "Diego Teixeira", random_com_N_digitos(7), "Rua Engenheiro José Bastos Xavier, 3750-144 Águeda", random_data(datetime(2005,1,1), datetime(2022,2,19)), random_data(datetime(1960,1,1), datetime(2003,3,1)), random_com_N_digitos(9), "couvesmolhadas@gmail.pt", "", "",
    "Raul Leitão", random_com_N_digitos(7), "Rua do Afurado, 3750-303 Águeda", random_data(datetime(2005,1,1), datetime(2022,2,19)), random_data(datetime(1960,1,1), datetime(2003,3,1)), random_com_N_digitos(9), "Leitao_R@gmail.pt", "", "",
    "Victorino Mata",  random_com_N_digitos(7), "Rua do Afurado, 3750-303 Águeda", random_data(datetime(2005,1,1), datetime(2022,2,19)), random_data(datetime(1960,1,1), datetime(2003,3,1)), random_com_N_digitos(9), "Mata_Vitorino@gmail.pt", "", "",
    "Florencia Mendez",  random_com_N_digitos(7), "Rua do Afurado, 3750-303 Águeda", random_data(datetime(2005,1,1), datetime(2022,2,19)), random_data(datetime(1960,1,1), datetime(2003,3,1)), random_com_N_digitos(9), "Flor.Mendes@gmail.pt", "florencio", "c289dc116a8399297d894c1eeaabcceabcd0317186f00b5d2c12799090afd615", #flor13
    "Egídio Correia",  random_com_N_digitos(7), "Rua do Afurado, 3750-303 Águeda", random_data(datetime(2005,1,1), datetime(2022,2,19)), random_data(datetime(1960,1,1), datetime(2003,3,1)), random_com_N_digitos(9), "E.Correia@gmail.pt", "edigio", "388471a048a1b8cf23536ea4a632a556e9a1b4bd2395e113894fea561d313896", #egipto
    "Vasco Carriço",  random_com_N_digitos(7), "Rua da Azenha, 3750-303 Águeda", random_data(datetime(2005,1,1), datetime(2022,2,19)), random_data(datetime(1960,1,1), datetime(2003,3,1)), random_com_N_digitos(9), "Vasquito@gmail.pt", "", "",
    "Xandinho Cabral",random_com_N_digitos(7), "Rua da Azenha, 3750-303 Águeda", random_data(datetime(2005,1,1), datetime(2022,2,19)), random_data(datetime(1960,1,1), datetime(2003,3,1)), random_com_N_digitos(9), "Cabral_X@gmail.pt", "", "",
    "Gaspar Monteiro", random_com_N_digitos(7), "Rua Doutor Teixeira Guedes, 2000-000 Santarém", random_data(datetime(2005,1,1), datetime(2022,2,19)), random_data(datetime(1960,1,1), datetime(2003,3,1)), random_com_N_digitos(9), "Gaspacho_Monteiro@gmail.pt", "gaspar", "026f4258e758497562a6200aed442afa67809c7061b95ab9dbc14b7251c8ea23", #gaspacho26
    "Edgar Mata", random_com_N_digitos(7), "Rua Doutor Teixeira Guedes, 2000-000 Santarém", random_data(datetime(2005,1,1), datetime(2022,2,19)), random_data(datetime(1960,1,1), datetime(2003,3,1)), random_com_N_digitos(9), "Mata_Edgar@gmail.pt", "edgar", "2c5bf27b377eef1c2005625e70d9c49a59412e6a3ce0aeb3e60fc8e6e660fa78", #matador32
    "Celia Batista", random_com_N_digitos(7), "Rua Doutor Teixeira Guedes, 2000-000 Santarém", random_data(datetime(2005,1,1), datetime(2022,2,19)), random_data(datetime(1960,1,1), datetime(2003,3,1)), random_com_N_digitos(9), "celia@gmail.pt", "", "",
    "Natalia Dantas",  random_com_N_digitos(7), "Rua Doutor Teixeira Guedes, 2000-000 Santarém", random_data(datetime(2005,1,1), datetime(2022,2,19)), random_data(datetime(1960,1,1), datetime(2003,3,1)), random_com_N_digitos(9), "natalia_lia@gmail.pt", "", "",
    "Márcia de Lima",  random_com_N_digitos(7), "Rua Doutor Teixeira Guedes, 2000-000 Santarém", random_data(datetime(2005,1,1), datetime(2022,2,19)), random_data(datetime(1960,1,1), datetime(2003,3,1)), random_com_N_digitos(9), "Lima_limonada@gmail.pt", "", "",
    "Eva Salgado", random_com_N_digitos(7), "Rua Doutor Teixeira Guedes, 2000-000 Santarém", random_data(datetime(2005,1,1), datetime(2022,2,19)), random_data(datetime(1960,1,1), datetime(2003,3,1)), random_com_N_digitos(9), "eva@gmail.pt", "", "",
    "Anacleta Varejão", random_com_N_digitos(7), "Beco do Isaac, 2000-096 Santarém", random_data(datetime(2005,1,1), datetime(2022,2,19)), random_data(datetime(1960,1,1), datetime(2003,3,1)), random_com_N_digitos(9), "anacleta@gmail.pt", "", "",
    "Filipa Correia", random_com_N_digitos(7), "Beco do Isaac, 2000-096 Santarém", random_data(datetime(2005,1,1), datetime(2022,2,19)), random_data(datetime(1960,1,1), datetime(2003,3,1)), random_com_N_digitos(9), "filipa_f@gmail.pt", "filipa", "43a252bed4d67d1586ccdccbe6e72b7444cf84b065560ba49c83e124575338ed", #filipao3
    "Sérgio Moura",  random_com_N_digitos(7), "Beco do Isaac, 2000-096 Santarém", random_data(datetime(2005,1,1), datetime(2022,2,19)), random_data(datetime(1960,1,1), datetime(2003,3,1)), random_com_N_digitos(9), "sergio.moura@gmail.pt", "", "",
    "Kévim Dantas",  random_com_N_digitos(7), "Beco do Isaac, 2000-096 Santarém", random_data(datetime(2005,1,1), datetime(2022,2,19)), random_data(datetime(1960,1,1), datetime(2003,3,1)), random_com_N_digitos(9), "kevim@gmail.pt", "", "",
    "Bento Ávila",  random_com_N_digitos(7), "Beco do Isaac, 2000-096 Santarém", random_data(datetime(2005,1,1), datetime(2022,2,19)), random_data(datetime(1960,1,1), datetime(2003,3,1)), random_com_N_digitos(9), "bento@gmail.pt", "", "",
    "Diogo Antunes", random_com_N_digitos(7), "Avenida do Brasil, 2005-136 Santarém", random_data(datetime(2005,1,1), datetime(2022,2,19)), random_data(datetime(1960,1,1), datetime(2003,3,1)), random_com_N_digitos(9), "digo.f@gmail.pt", "", "",
    "Aleixo Gusmão", random_com_N_digitos(7), "Avenida do Brasil, 2005-136 Santarém", random_data(datetime(2005,1,1), datetime(2022,2,19)), random_data(datetime(1960,1,1), datetime(2003,3,1)), random_com_N_digitos(9), "aleixo@gmail.pt", "", "",
    "Ian Rocha", random_com_N_digitos(7), "Avenida do Brasil, 2005-136 Santarém", random_data(datetime(2005,1,1), datetime(2022,2,19)), random_data(datetime(1960,1,1), datetime(2003,3,1)), random_com_N_digitos(9), "rocha_ian@gmail.pt", "ian", "d8afa0305bc090e028a252089ee2f124bec6368f3afa30dace6cf05369212a07", #indoFora
    "Mariana Rego", random_com_N_digitos(7), "Avenida do Brasil, 2005-136 Santarém", random_data(datetime(2005,1,1), datetime(2022,2,19)), random_data(datetime(1960,1,1), datetime(2003,3,1)), random_com_N_digitos(9), "rego_m@gmail.pt", "rego", "0e94e408f393d7eddefebfc2d900714643ebea78a6ebf4ef503c490df6cecc81", #olhodoc
    "Fábia Tavares", random_com_N_digitos(7), "Avenida do Brasil, 2005-136 Santarém", random_data(datetime(2005,1,1), datetime(2022,2,19)), random_data(datetime(1960,1,1), datetime(2003,3,1)), random_com_N_digitos(9), "f.tavares@gmail.pt", "", "",
    "Carlitos Rego",random_com_N_digitos(7), "Avenida do Brasil, 2005-136 Santarém", random_data(datetime(2005,1,1), datetime(2022,2,19)), random_data(datetime(1960,1,1), datetime(2003,3,1)), random_com_N_digitos(9), "rego.c@gmail.pt", "", "",
    "Rafaela Abril", random_com_N_digitos(7), "Rua dos Combatentes da Grande Guerra, 3810-000 Aveiro", random_data(datetime(2005,1,1), datetime(2022,2,19)), random_data(datetime(1960,1,1), datetime(2003,3,1)), random_com_N_digitos(9), "rafaela@gmail.pt", "rafaela", "54b79489428d3ae5d18bff5939990e8dc0b27011d52f88b90e7ebc1ab2bafad2", #rafastrapas
    "Carmo Peres", random_com_N_digitos(7), "Rua dos Combatentes da Grande Guerra, 3810-000 Aveiro", random_data(datetime(2005,1,1), datetime(2022,2,19)), random_data(datetime(1960,1,1), datetime(2003,3,1)), random_com_N_digitos(9), "carmo.a@gmail.pt", "", "",
    "Ismael Cerqueira", random_com_N_digitos(7), "Rua dos Combatentes da Grande Guerra, 3810-000 Aveiro", random_data(datetime(2005,1,1), datetime(2022,2,19)), random_data(datetime(1960,1,1), datetime(2003,3,1)), random_com_N_digitos(9), "ismael@gmail.pt", "ismael", "d3cb43e798e27483e8834ed8d5b33aff0c9292b070655f20adbd35a69e1f7ebc", #12345654321
    "Salomão Alves", random_com_N_digitos(7), "Rua dos Combatentes da Grande Guerra, 3810-000 Aveiro", random_data(datetime(2005,1,1), datetime(2022,2,19)), random_data(datetime(1960,1,1), datetime(2003,3,1)), random_com_N_digitos(9), "salomao@gmail.pt", "salomao", "75681bca41f65e4cb0181e60460a01aee20c7d15cad3d7ab5829d11c50810886", #arcaPreciosa
    "Ângela Queiroz",random_com_N_digitos(7), "Rua dos Combatentes da Grande Guerra, 3810-000 Aveiro", random_data(datetime(2005,1,1), datetime(2022,2,19)), random_data(datetime(1960,1,1), datetime(2003,3,1)), random_com_N_digitos(9), "angela@gmail.pt", "", "",
    "Aleixo Lopes", random_com_N_digitos(7), "Rua dos Combatentes da Grande Guerra, 3810-000 Aveiro", random_data(datetime(2005,1,1), datetime(2022,2,19)), random_data(datetime(1960,1,1), datetime(2003,3,1)), random_com_N_digitos(9), "aleixo.f@gmail.pt", "", "",
    "Martim Borges", random_com_N_digitos(7), "Praça Marquês de Pombal, 3810-133 Aveiro", random_data(datetime(2005,1,1), datetime(2022,2,19)), random_data(datetime(1960,1,1), datetime(2003,3,1)), random_com_N_digitos(9), "martim.f@gmail.pt", "martim ", "45ae8a1cbdffcad4055b6f9aeb5dcbc65c8c07795aea1c69cafd9dc2f8fa1bd1", #Martinez97
    "Adão Torres", random_com_N_digitos(7), "Praça Marquês de Pombal, 3810-133 Aveiro", random_data(datetime(2005,1,1), datetime(2022,2,19)), random_data(datetime(1960,1,1), datetime(2003,3,1)), random_com_N_digitos(9), "adao@gmail.pt", "", "",
    "Dudu Queiroz", random_com_N_digitos(7), "Praça Marquês de Pombal, 3810-133 Aveiro", random_data(datetime(2005,1,1), datetime(2022,2,19)), random_data(datetime(1960,1,1), datetime(2003,3,1)), random_com_N_digitos(9), "dudu@gmail.pt", "", "",
    "Lídia Freire", random_com_N_digitos(7), "Praça Marquês de Pombal, 3810-133 Aveiro", random_data(datetime(2005,1,1), datetime(2022,2,19)), random_data(datetime(1960,1,1), datetime(2003,3,1)), random_com_N_digitos(9), "lidia@gmail.pt", "", "",
    "Graciana Seixas", random_com_N_digitos(7), "Praça Marquês de Pombal, 3810-133 Aveiro", random_data(datetime(2005,1,1), datetime(2022,2,19)), random_data(datetime(1960,1,1), datetime(2003,3,1)), random_com_N_digitos(9), "graciana.s@gmail.pt", "", ""
]

#insert de pessoas
for i in range(0,51):

    sql = "INSERT INTO `PTDA_BD_1`.`pessoas` (`nome`, `numeroCC`, `morada`, `dataRegistoSistema`, `dataNascimento`, `numTelefone`, `email`, `username`, `password`) VALUES (%s,%s,%s,%s,%s,%s,%s,%s,%s)"
    cursor.execute(sql,(pessoas[((i+1)*8)+i+1],pessoas[((i+1)*8)+i+2],pessoas[((i+1)*8)+i+3],pessoas[((i+1)*8)+i+4],pessoas[((i+1)*8)+i+5],pessoas[((i+1)*8)+i+6],pessoas[((i+1)*8)+i+7],pessoas[((i+1)*8)+i+8],pessoas[((i+1)*8)+i+8+1]))

#pusha o codigo para a base de dados
conecao.commit()


#funcionario id e funcao
funcID = [1,2,3,4,21,22,25,26,32,38,39,42,44,45,48]
funCargo = ["admin","admin","funcionario","funcionario","funcionario","funcionario","funcionario","funcionario","admin","funcionario","funcionario","funcionario","funcionario","admin","funcionario"]
sql = "INSERT INTO `PTDA_BD_1`.`funcionarios` (`idPessoa`, `cargo`) VALUES (%s,%s)"

#insert funcionario
for i in range(0,14):
    cursor.execute(sql,(funcID[i], funCargo[i]))

#pusha o codigo para a base de dados
conecao.commit()


#array cartasconducao
cartasIDPessoa=[5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,23,24,27,28,29,30,31,33,34,35,36,37,40,41,43,46,47,49,50,51]
Loc = ["AV","L","SA","P","VC"]
categoria = ["A1","A2","A","B1","B","C1","C","D1","D","BE","C1E","CE","D1E","DE"]
sql = "INSERT INTO `PTDA_BD_1`.`cartasconducao` (`idPessoa`,`numeroCartaConducao`, `dataEmissao`,`dataValidade`,`categoria`) VALUES (%s,%s,%s,%s,%s)"

for i in range(0,35):
    numeroCarta = Loc[random.randint(0,4)] + "-" + random_com_N_digitos(7)
    dataEmissao = random_data(datetime(1993,1,1), datetime(2004,1,1))
    dataVal = addYears(datetime.fromisoformat(dataEmissao),11).strftime('%Y-%m-%d')
    
    cursor.execute(sql,(cartasIDPessoa[i], numeroCarta, dataEmissao, dataVal, categoria[random.randint(0,13)]))

#pusha o codigo para a base de dados
conecao.commit()


#array condutores
condutoreIDPessoa=[5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,23,24,27,28,29,30,31,33,34,35,36,37,40,41,43,46,47,49,50,51]
sql = "INSERT INTO `PTDA_BD_1`.`condutores` (`numeroCartaConducao`,`classificacao`,`idPessoa`) VALUES (%s,%s,%s)"

for i in range(0,35):
    classificaçao = random.randint(0,10)
    classificacao = random.randint(0,10)
    cursor.execute("select numeroCartaConducao from `PTDA_BD_1`.`cartasconducao` where idPessoa =" + str(condutoreIDPessoa[i]))
    id = cursor.fetchone()
    idPessoa = ('').join(id)
    cursor.execute(sql,(idPessoa, classificacao, condutoreIDPessoa[i]))

conecao.commit()


#carrinhas
marca = ["Alfa Romeo","Audi","Bentley","BMW","Cadillac","Chevrolet","Chrysler","Citroen","Corvette","Dodge","Ferrari","Fiat","Ford","Honda","Hyundai","Jaguar","Jeep","Kia","Lamborghini",
    "LandRover","Lexus","Lotus","Maserati","Mazda","Mercedes-Benz","Mini","Mitsubishi","Nissan","Opel","Peugeot","Porsche","Renault","Rolls-Royce","Seat","Skoda","Smart","Subaru",
    "Suzuki","Tesla","Toyota","Volkswagen","Volvo"]

estado = ["Disponivél", "Indisponivél"]

potencia = [ "70 - 80 cv", "81 - 90 cv", "91 - 100 cv", "101 - 110 cv", "111 - 120 cv", "121 - 130 cv", "131 - 140 cv", "141 - 150 cv", "151 - 160 cv",
     "161 - 170 cv", "171 - 180 cv", "181 - 190 cv", "191 - 200 cv", "201 - 210 cv", "211 - 220 cv", "221 - 230 cv", "231 - 240 cv", "241 - 250 cv", "251 - 260 cv",
      "261 - 270 cv", "271 - 280 cv", "281 - 290 cv", "291 - 300 cv", "301 - 310 cv", "311 - 320 cv", "321 - 330 cv", "331 - 340 cv", "341 - 350 cv"]

combustivel = ["Diesel","Gasolina","GPL"]
preco = 30
precoExtra = 0.05

sql = "INSERT INTO `PTDA_BD_1`.`carrinhas` (`matricula`,`dataRegistoSistema`,`estado`,`numeroSeguro`,`dataValidadeSeguro`,`proprietario`,`marca`,`modelo`,`cilindrada`,`potencia`,`combustivel`,`dataInicioDisponibilidade`,`dataFimDisponibilidade`,`nrKm`,`precoDia`,`precoKmExtra`,`ano` ) VALUES (%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s)"

for i in range (0,100):
    matricula = random_com_N_digitos(2) + "-" + random.choice(string.ascii_uppercase) + random.choice(string.ascii_uppercase) + "-" + random_com_N_digitos(2)
    registo = random_data(datetime(2010,1,1), datetime(2022,1,1))
    seguro = random_com_N_digitos(8)
    valSeguro = random_data(datetime(2023,1,1), datetime(2035,1,1))
    proprietario = random.randint(1,50)
    modelo = "modelo exemplo"
    cilindrada = random.randint(3000,150000)
    dataInicio = random_data(datetime(2010,1,1), datetime(2100,1,1))
    dataFim = addYears(datetime.fromisoformat(dataInicio),random.randint(1,20)).strftime('%Y-%m-%d')
    Km = random.randint(3000,500000)
    ano = random.randint(1990,2022)
    #print (matricula,registo,estado[random.randint(0,1)],seguro,valSeguro,proprietario,marca[random.randint(0,41)],modelo, cilindrada, potencia[random.randint(0,27)], combustivel[random.randint(0,2)], dataInicio, dataFim, Km, preco, precoExtra, ano)
    cursor.execute(sql,(matricula,registo,estado[random.randint(0,1)],seguro,valSeguro,proprietario,marca[random.randint(0,41)],modelo, cilindrada, potencia[random.randint(0,27)], combustivel[random.randint(0,2)], dataInicio, dataFim, Km, preco, precoExtra, ano))

conecao.commit()

