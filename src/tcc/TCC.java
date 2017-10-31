
package tcc;

import tcc.Telas.Menu;
public class TCC {


    public static void main(String[] args) {
        Menu inicio = new Menu();
        inicio.setVisible(true);
    }
    
//CREATE DATABASE TCC;
//
//USE TCC;
//
//CREATE TABLE CADASTRO(
//ID_USUARIO INT AUTO_INCREMENT PRIMARY KEY,
//NOME VARCHAR(60) NOT NULL,
//SOBRENOME VARCHAR(80) NOT NULL,
//SEXO ENUM('F','M') NOT NULL
//
//);
//
//CREATE TABLE USUARIO(
//LOGIN VARCHAR(60) PRIMARY KEY,
//SENHA VARCHAR(100) NOT NULL,
//ID_USUARIO INT AUTO_INCREMENT NOT NULL,
//PONTUACAO_SESSAO INT,
//PONTUACAO_GERAL INT,
//PONTUACAO_AREA1 INT,
//PONTUACAO_AREA2 INT,
//PONTUACAO_AREA3 INT,
//PONTUACAO_AREA4 INT,
//PONTUACAO_AREA5 INT,
//PONTUACAO_AREA6 INT,
//PONTUACAO_AREA7 INT,
//PONTUACAO_AREA8 INT,
//PONTUACAO_AREA9 INT,
//FOREIGN KEY (ID_USUARIO) REFERENCES CADASTRO (ID_USUARIO)
//);
//
//CREATE TABLE PROVA(
//NIVEL_PROVA INT NOT NULL,
//ID_PROVA INT PRIMARY KEY
//);
//
//CREATE TABLE QUESTAO(
//ID_QUESTAO INT AUTO_INCREMENT PRIMARY KEY,
//AREA INT NOT NULL,
//DESC_QUESTAO VARCHAR(1000) NOT NULL,
//DESC_ALTERNATIVA_1 VARCHAR(1000) NOT  NULL,
//DESC_ALTERNATIVA_2 VARCHAR(1000) NOT NULL,
//DESC_ALTERNATIVA_3 VARCHAR(1000) NOT NULL,
//DESC_ALTERNATIVA_4 VARCHAR(1000) NOT NULL,
//DESC_ALTERNATIVA_5 VARCHAR(1000) NOT NULL,
//IND_CORRETA INT NOT NULL
//);
//
//CREATE TABLE COMPOSICAO(
//ALTERNATIVA INT NOT NULL,
//ID_PROVA INT NOT NULL,
//ID_QUESTAO INT NOT NULL,
//FOREIGN KEY (ID_PROVA) REFERENCES PROVA (ID_PROVA),
//FOREIGN KEY (ID_QUESTAO) REFERENCES QUESTAO (ID_QUESTAO)
//);
//
//CREATE TABLE AREA_QUESTAO(
//ID_AREA INT PRIMARY KEY,
//NOME VARCHAR(60) NOT NULL
//);
//
//CREATE TABLE FORMULACAO(
//ID_AREA INT NOT NULL,
//ID_PROVA INT NOT NULL,
//FOREIGN KEY (ID_AREA) REFERENCES AREA_QUESTAO (ID_AREA),
//FOREIGN KEY (ID_PROVA) REFERENCES PROVA (ID_PROVA)
//);
    
    
//    INSERT INTO QUESTAO (AREA, DESC_QUESTAO, DESC_ALTERNATIVA_1, DESC_ALTERNATIVA_2, DESC_ALTERNATIVA_3, DESC_ALTERNATIVA_4, DESC_ALTERNATIVA_5, IND_CORRETA) VALUES 
//(1, "(PUC) Os elétrons que diferenciam o cálcio (Z = 20) de seu cátion bivalente estão situados no subnível:", "3sb", "3p", "4s", "3d", "4p", 3),
//(1,	"(UFRS) “Para a formação da ligação, duas condições são necessárias: um par de elétrons com spins opostos e um orbital estável em cada átomo. A força de ligação é qualitativamente proporcional à interpenetração das nuvens de carga dos dois átomos.”);
//O texto refere-se à ligação:", "iônica", "metálica", "covalente", "por forças de Van der Waals", "por pontes de hidrogênio", 3),
//(1,	"Um orbital que pertence a um só átomo denomina-se:", "orbital atômico", "orbital s", "orbital molecular", "orbital sigma", "orbital pi",1),
//(1,	"(OSEC) Em uma reação, o complexo ativado:","possui mais energia que os reagentes ou os produtos.", "age como catalisador.", "sempre forma produtos.", "é composto estável.", "possui  menos energia que os reagentes ou os produtos.", 1),
//(1,	"(PUC) Na pilha eletro-química sempre ocorre:", "oxidação do cátodo.", "movimento de elétrons no interior da solução eletrolítica.", "reação com diminuição de calor.", "passagem de elétrons, no circuito externo, do ânodo para o cátodo.","reação de neutralização.", 1),
//(1, "(ABC) Um recipiente de volume constante contém 2,0 moles de um gás à pressão de 1,0 atmosfera e temperatura T. Se nesse recipiente forem introduzidos mais 2,0 moles do mesmo gás à mesma temperatura, a pressão sofrerá um acréscimo de:", "0,5 atm", "1,0 atm", "1,5 atm", "2,0 atm", "2,5 atm", 2),
//(1,	"(OSEC) Analise as afirmativas abaixo:
//I.   Entalpia (H) pode ser conceituada como a energia global de um sistema.
//II.  Uma reação exotérmica apresenta D H positivo.
//III. O calor de reação de um processo químico será dado por D H.", "somente I é correta", "somente II é correta", "somente III é correta", "as afirmativas I e II são corretas", "as afirmativas I e III são corretas.", 5),
//(1,	"MED – ITAJUBÁ) A adição de brometo de hidrogênio ao 3,4-dimetil-2-penteno forma:", "2-bromo-4-metilhexano", "2-bromo-3-etilpentano", "3-bromo-2,3-dimetilpentano", "3-bromo-3-metilhexano", "2-bromo-3,4-dimetilpentano", 3),
//(1,	"O hélio, em sua configuração normal, apresenta orbitais ligantes em número de:", "0", "1", "2", "3", "4",1),
//(1, "No cloro, em sua configuração fundamental, o orbital ligante é do tipo:", "s", "p", "d", "f", "s ou p", 2);

}
