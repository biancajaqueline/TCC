
package tcc;

import tcc.Telas.Menu;
public class TCC {


    public static void main(String[] args) {
        Menu inicio = new Menu();
        inicio.setVisible(true);
    }
    
//DROP DATABASE TCC;
//
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
//PONTUACAO_FACIL INT,
//PONTUACAO_MEDIO INT,
//PONTUACAO_DIFICIL INT,
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
//IND_CORRETA INT NOT NULL,
//IND_NIVEL ENUM('F', 'M', 'D') NOT NULL
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
//    
//INSERT INTO AREA_QUESTAO (ID_AREA, NOME) VALUES
//(1, "Química"), 
//(2, "Física"),
//(3, "História"),
//(4, "Geografia"),
//(5, "Biologia"),
//(6, "Sociologia"),
//(7, "Filosofia"),
//(8, "Matemática"),
//(9, "Português");
//    
//    
//INSERT INTO QUESTAO (AREA, DESC_QUESTAO, DESC_ALTERNATIVA_1, DESC_ALTERNATIVA_2, DESC_ALTERNATIVA_3, DESC_ALTERNATIVA_4, DESC_ALTERNATIVA_5, IND_CORRETA, IND_NIVEL) VALUES 
//(1, "(PUC) Os elétrons que diferenciam o cálcio (Z = 20) de seu cátion bivalente estão situados no subnível:", "3sb", "3p", "4s", "3d", "4p", 3, 1),
//(1,	"(UFRS) “Para a formação da ligação, duas condições são necessárias: um par de elétrons com spins opostos e um orbital estável em cada átomo. A força de ligação é qualitativamente proporcional à interpenetração das nuvens de carga dos dois átomos.”);
//O texto refere-se à ligação:", "iônica", "metálica", "covalente", "por forças de Van der Waals", "por pontes de hidrogênio", 3, 1),
//(1,	"Um orbital que pertence a um só átomo denomina-se:", "orbital atômico", "orbital s", "orbital molecular", "orbital sigma", "orbital pi", 1, 1),
//(1,	"(OSEC) Em uma reação, o complexo ativado:","possui mais energia que os reagentes ou os produtos.", "age como catalisador.", "sempre forma produtos.", "é composto estável.", "possui  menos energia que os reagentes ou os produtos.", 1, 1),
//(1,	"(PUC) Na pilha eletro-química sempre ocorre:", "oxidação do cátodo.", "movimento de elétrons no interior da solução eletrolítica.", "reação com diminuição de calor.", "passagem de elétrons, no circuito externo, do ânodo para o cátodo.","reação de neutralização.", 1, 1),
//(1, "(ABC) Um recipiente de volume constante contém 2,0 moles de um gás à pressão de 1,0 atmosfera e temperatura T. Se nesse recipiente forem introduzidos mais 2,0 moles do mesmo gás à mesma temperatura, a pressão sofrerá um acréscimo de:", "0,5 atm", "1,0 atm", "1,5 atm", "2,0 atm", "2,5 atm", 2, 1),
//(1,	"(OSEC) Analise as afirmativas abaixo:
//I.   Entalpia (H) pode ser conceituada como a energia global de um sistema.
//II.  Uma reação exotérmica apresenta D H positivo.
//III. O calor de reação de um processo químico será dado por D H.", "somente I é correta", "somente II é correta", "somente III é correta", "as afirmativas I e II são corretas", "as afirmativas I e III são corretas.", 5, 1),
//(1,	"MED – ITAJUBÁ) A adição de brometo de hidrogênio ao 3,4-dimetil-2-penteno forma:", "2-bromo-4-metilhexano", "2-bromo-3-etilpentano", "3-bromo-2,3-dimetilpentano", "3-bromo-3-metilhexano", "2-bromo-3,4-dimetilpentano", 3, 1),
//(1,	"O hélio, em sua configuração normal, apresenta orbitais ligantes em número de:", "0", "1", "2", "3", "4", 1, 1),
//(1, "No cloro, em sua configuração fundamental, o orbital ligante é do tipo:", "s", "p", "d", "f", "s ou p", 2, 1);
//
//INSERT INTO QUESTAO (AREA, DESC_QUESTAO, DESC_ALTERNATIVA_1, DESC_ALTERNATIVA_2, DESC_ALTERNATIVA_3, DESC_ALTERNATIVA_4, DESC_ALTERNATIVA_5, IND_CORRETA, IND_NIVEL) VALUES 
//(5, "O homem não é capaz de digerir a celulose ingerida na alimentação. No entanto, os ruminantes são capazes de digerir os vegetais ingeridos porque:", 
//"no rúmen existem glândulas capazes de produzir enzimas que hidrolisam a celulose", "a celulose é digerida exclusivamente por enzimas existentes na saliva desses animais, com as quais a celulose entra em contato durante os períodos prolongados de ruminação",
//"a digestão da celulose é consequência exclusiva da maceração das folhas, devido a sua permanência prolongada nas câmaras gástricas", "os alimentos são misturados com bactérias simbióticas produtoras de enzimas que hidrolisam a celulose",
//"a digestão é consequência, exclusivamente, da ação das enzimas produzidas por helmintos que parasitam geralmente o intestino dos ruminantes", 4, 1),
//(5, "(FUVEST) Um antibiótico que atua nos ribossomos mata:", "bactérias por interferir na síntese de proteínas", "bactérias por provocar plasmólise", "fungos por interferir na síntese de lipídeos",
//"vírus por afetar DNA", "vírus por impedir recombinação gênica", 1, 1), 
//(5, "Não é função dos músculos:", "fornecimento de calor ao organismo", "locomoção", "impulsionar o sangue", "realizar trabalho mecânico", "a filtração do sangue", 5, 1),
//(5, "(MED. CATANDUVA) As miofibrilas, responsáveis pela contração muscular, são constituídas de:", "fosfocreatina e glicogênio", "actina e miosina", "fosfolípide e creatina", "globulina e insulina", "queratina e ácido glutâmico", 2, 1),
//(5, "A zona de crescimento da raiz fica situada:", "entre a zona pilífera e a zona de ramificação", "entre a coifa e a zona pilífera",
// "entre a coifa e a zona de ramificação", "entre a zona de ramificação e a zona pilífera", "distribuída ao longo de toda a extensão do órgão", 2, 1),
// (5, ". Nas raízes, é comum observar-se:
//I. Floema e xilema formando feixes separados e alternados;
//II. Endoderma sempre com estria de Caspary.
//III. Epiderme produzindo pêlos absorventes.
//
//Responda:", "São corretas as afirmações I e II", "São corretas as afirmações I e III", "São corretas as afirmações II e III", "Todas as afirmativas são corretas", "Todas as afirmativas são erradas", 2, 1), 
//(5, ". (UEL) Há maior número de lactobacilos por unidade de volume de leite:", "pasteurizado cru", "pasteurizado fervido", "recém-ordenhado", "em pó", "coalhado", 5, 1),
//(5, "Diz-se que um vegetal apresenta metagênese quando:", "A meiose ocorrer na formação dos gametas", "Aparecem dois organismos adultos haplóides", "A meiose ocorrer no interior dos esporângios", "O vegetal diplóide produzir gametas, por meiose",
//"O vegetal haplóide produzir gametas, por meiose", 3, 1),
//(5, "(PUC) O sexo feminino, quanto aos cromossomos sexuais, é chamado", "homogamético", "heterogamético", "diplóide", "haplóide", "genoma", 1, 1),
//(5, "Numa série de alelos múltiplos, onde existem quatro alelos:", "os quatro alelos podem estar presentes num gameta", "os quatro alelos podem estar presentes num indivíduo normal", "apenas dois alelos podem estar presentes num gameta", "apenas dois alelos podem estar presentes num indivíduo normal",
//"o número de alelos presentes num indivíduo normal pode variar de um a quatro", 4, 1),
//(5, "(FUVEST) Enzimas que atuam em pH alcalino sobre gorduras, em pH neutro sobre carboidratos e em pH ácido sobre proteínas podem ser encontradas, respectivamente:",
// "no pâncreas, na boca e no estômago", "no pâncreas, na vesícula biliar e no estômago", "na vesícula biliar, na boca e no duodeno", "na boca, no pâncreas e no estômago", "no pâncreas, na boca e no duodeno", 1, 2),
//(5, "(CESGRANRIO) A energia imediata que supre o processo de contração muscular é derivada de ligações ricas em energia proveniente de:", "trifosfato de adenosina", "creatina fosfato", "ácido fosfoenolpirúvico", "difosfato de adenosina", "acilmercaptanas", 1, 2),
//(5, "(UECE) Nos mamíferos, incluindo o homem, o percurso do ar inspirado, nos pulmões é:", "bronquíolos, brônquios, alvéolos", "brônquios, bronquíolos, alvéolos", "alvéolos, brônquios, bronquíolos", "bronquíolos, alvéolos, brônquios", "n.d.a.", 2, 2),
//(5, "(UNESP) Nos testes de gravidez, a substância cuja presença é pesquisada na urina é:", "o hormônio folículo estimulante", "o hormônio luteinizante", "a gonadotrofina coriônica", "o estrógeno", "a progesterona", 3, 2),
//(5, "Qual das seguintes estruturas não está presente em uma célula de raiz de cebola que sofre mitose?", "parede celular", "centríolo", "centrômero", "mitocôndria", "fuso", 2, 2),
//(5, "Um casal de namorados, numa prática condenável, gravou os seus nomes a um metro do solo, em uma árvore de dois metros de altura. Anos depois, voltando ao local, verificaram que a mesma árvore media agora quatro metros de altura.
//É válido procurar a antiga inscrição:", "a 1 metro do solo", "a 2 metros do solo", "a 3 metros do solo", "a qualquer altura, pois nada se pode prever", "acima de 1 metro do solo", 1, 2),
//(5, "(UFGO) As bactérias são seres procariontes porque:", "podem apresentar “formas de resistência” que são os esporos", "possuem uma parede celular espessa, constituída de polissacarídeos, proteínas e lipídeos", "não possuem núcleo organizado envolto pela carioteca",
//"possuem estrutura locomotoras denominadas flagelos", "podem-se reproduzir sexuadamente por conjugação", 3, 2),
//(5, "A alternância de reproduções assexuada e sexuada chama-se:", "metameria", "pedogênese", "metagênese", "ciclomeria", "ontogenia", 3, 2),
//(5, "O corpúsculo de Barr, também chamado de cromatina sexual, é encontrado:", "nas células sexuais do homem", "nas células sexuais da mulher", "ligado ao nucléolo nas células somáticas da mulher",
//"junto à membrana nuclear nas células somáticas da mulher", "junto à membrana plasmática nas células somáticas da mulher", 4, 2),
//(5, "(FUVEST) Suponha que numa certa população exista um caráter relacionado com uma série de cinco alelos (alelos múltiplos). Nessa população, o número de genótipos possíveis, relacionados ao caráter em questão, será igual a:",
//"5", "10", "12", "14", "15", 5, 2),
//(5, "(PUCC) Em vertebrados, a musculatura lisa:", "não está em conexão com o esqueleto, não está sob o controle nervoso voluntário e contrai-se lentamente",
// "está em conexão com o esqueleto, não está sob o controle voluntário e contrai-se lentamente", "não está em conexão com o esqueleto, está sob o controle nervoso voluntário, contrai-se lentamente", "não está em conexão com o esqueleto, está sob o controle nervoso voluntário, contrai-se rapidamente",
// "não está em conexão com o esqueleto, está sob o controle nervoso voluntário, contrai-se rapidamente", 2, 3),
// (5, "O fato de que os neurônios não se reproduzem pode ser generalizado para outras células, explicando-se corretamente, neste caso, porque:",
// "as células eucarióticas não se reproduzem", "quanto mais diferenciada for uma célula, menor será sua capacidade reprodutiva",
// "somente as células gâmicas são capazes de reprodução", "as células lábeis são dotadas de alta capacidade de reprodução", "células alongadas nunca se reproduzem", 2, 3),
// (5, "No final da mitose, a reconstituição da carioteca (envoltório nuclear) está mais intimamente relacionada com:", "Retículo endoplasmático", 
// "Complexo de Golgi", "Mitocôndria", "Lisossomo", "Membrana citoplasmática", 1, 3),
// (5, "(FUVEST) A ramificação de caule origina-se de gemas axilares, cuja natureza histológica é:", "parênquima", "xilema", "colênquima",
// "meristema", "esclerênquima", 4, 3),
// (5, "(PUCC) A única organela citoplasmática da célula procarionte é:", "mitocôndria", "ribossomo", "lisossomo", "dictiossomo", "mesossomo", 2, 3),
// (5, "(UFPA) Organismos autótrofos, cujas células possuem clorofila, mas não possuem plastos, pertencem ao grupo:", "das bactérias decompositoras", "das cianofíceas", "das algas verdes", "dos protozoários", "dos fungos", 2, 3),
// (5, "(FUVEST) As marés vermelhas, fenômenos que podem trazer sérios problemas para organismos marinhos e mesmo para o homem, são devidas:", "à grande concentração de rodofíceas bentônicas na zona das marés", "ao vazamento de petróleo, o qual estimula a proliferação de diatomáceas marinhas",
// "à presença de poluentes químicos provenientes de esgotos industriais", "à reação de certos poluentes com o oxigênio produzido pelas algas marinhas", "à proliferação excessiva de certas algas planctônicas que liberam toxinas na água", 5, 3),
// (5, "(PUC – SP) Analise as seguintes frases:
// I. As diatomáceas são algas microscópicas constituintes do fitoplâncton.
//II. As diatomáceas são produtores primários de ecossistemas marinhos.
//III. As diatomáceas realizam fotossíntese liberando oxigênio para a atmosfera.
//Pode-se considerar:", "apenas I é verdadeira", "apenas II é verdadeira", "apenas III é verdadeira", "I, II e III são verdadeiras", "I, II e III são falsas", 4, 3),
//(5, "Para ocorrer metagênese basta a existência de:", "fecundação cruzada", "esporos", "reprodução sexuada", "autofecundação", "meiose espórica", 5, 3),
//(5, "As abelhas constituem exemplo de himenópteros sociais, cujas fêmeas monogaméticas põem, em “células” distintas dos favos, ovos não-fecundados (óvulos). Estes últimos:", "são estéreis, não se desenvolvendo",
// "desenvolvem-se em larvas estéreis, origem das operárias", "possuem o cromossomo sexual", "desenvolvem-se, por partenogênese, nos machos (zangões)", "dão origem às rainhas haplóides, novamente monogaméticas", 4, 3);
// 
//
// 
// INSERT INTO QUESTAO (AREA, DESC_QUESTAO, DESC_ALTERNATIVA_1, DESC_ALTERNATIVA_2, DESC_ALTERNATIVA_3, DESC_ALTERNATIVA_4, DESC_ALTERNATIVA_5, IND_CORRETA, IND_NIVEL) VALUES 
// (2, "(MACKENZIE) Sobre uma carga elétrica de 2,0.10-6C, colocada em certo ponto do espaço, age uma força de intensidade 0,80N. Despreze as ações gravitacionais. A intensidade do campo elétrico nesse ponto é:", 
// "1,6 . 10-6N/C", "1,3 . 10-5N/C", "2,0 . 103N/C", "1,6 . 105N/C", "4,0 . 105N/C", 5, 1),
// (2, "(UNISA) Um condutor de cobre apresenta 1,0km de comprimento por 10mm2 de secção e uma resistividade de 0,019ohm/mm2. Aplicando-se uma diferença de potencial de 38V, que intensidade de corrente elétrica irá percorrer o fio?", 
// "10A", "20A", "30A", "40A", "50A", 2, 1),
// (2, "(UFSCAR) Tendo somente dois resistores, usando-os um por vez, ou em série, ou em paralelo, podemos obter resistência de 3, 4, 12 e 16Ω. As resistências dos resistores são:", 
// "3Ω e 4Ω", "4Ω e 8Ω", "12Ω e 3Ω", "12Ω e 4Ω", "8Ω e 16Ω", 4, 1),
// (2, "(UFRS) No interior de um acelerador de partículas existe um campo magnético muito mais intenso que o campo magnético terrestre, orientado de tal maneira que um elétron lançado horizontalmente do sul para o norte, através do acelerador é desviado para o oeste. O campo magnético do acelerador aponta:", 
// "do norte para o sul", "do leste para o oeste", "do oeste para o leste", "de cima para baixo", "de baixo para cima", 5, 1),
// (2, "(FEEPA) Se na equação P = V2K, V é velocidade, então para que P seja pressão é necessário que K seja:", "massa", "massa específica", "vazão mássica", "peso", "peso específico", 2, 1),
// (2, "Um violinista deseja aumentar a frequência do som emitido por uma das cordas do seu instrumento. Isto poderá ser conseguido:",
// "aumentando-se o comprimento vibratório e tracionando-se mais intensamente a corda", "diminuindo-se o comprimento vibratório e tracionando-se menos intensamente a corda", 
// "diminuindo-se o comprimento vibratório e tracionando-se mais intensamente a corda", "aumentando-se o comprimento vibratório e tracionando-se menos intensamente a corda", "todas as sugestões são inadequadas para que o violinista consiga seu objetivo", 3, 1),
// (2, "(CESGRANRIO) Um objeto de altura O é colocado perpendicularmente ao eixo principal de um espelho esférico côncavo. Estando o objeto no infinito, a imagem desse objeto será:", "real, localizada no foco", 
// "real e de mesmo tamanho do objeto", "real, maior do que o tamanho do objeto", "virtual e de mesmo tamanho do objeto", "virtual, menor do que o tamanho do objeto", 1, 1),
// (2, "(UFES) Um objeto está sobre o eixo de um espelho esférico côncavo. A distância entre o objeto e o espelho é maior que o raio de curvatura do espelho. A imagem do objeto é:", 
// "real, não invertida, menor que o objeto", "real, invertida, maior que o objeto", "real, invertida, menor que o objeto", "virtual, não invertida, maior que o objeto", "virtual, invertida, menor que o objeto", 3, 1),
// (2, "(PUC) Um raio de luz, proveniente do vácuo, incide sobre a superfície de um bloco de material transparente com ângulo de incidência de 60°. Sendo o índice de refração absoluto do material de que é feito o bloco igual a , o ângulo formado entre os raios refletidos e refratado, vale:", 
// "120°", "45°", "75°", "60°", "90°", 5, 1),
// (2, "A respeito do conceito da inércia, assinale a frase correta:", "Um ponto material tende a manter sua aceleração por inércia", "Uma partícula pode ter movimento circular e uniforme, por inércia",
// "O único estado cinemático que pode ser mantido por inércia é o repouso", "Não pode existir movimento perpétuo, sem a presença de uma força", 
// "A velocidade vetorial de uma partícula tende a se manter por inércia; a força é usada para alterar a velocidade e não para mantê-la", 5, 1),
// (2, "(FCC) Uma carga pontual Q, positiva, gera no espaço um campo elétrico. Num ponto P, a 0,5m dela, o campo tem intensidade E=7,2.106N/C. Sendo o meio vácuo onde K0=9.109 unidades S. I., determine Q.", 
// "2,0 . 10-4C", "4,0 . 10-4C", "2,0 . 10-6C", "4,0 . 10-6C", "2,0 . 10-2C", 1, 2),
// (2, "(PUC) Dois fios condutores F1 e F2 têm comprimentos iguais e oferecem à passagem da corrente elétrica a mesma resistência. Tendo a secção transversal de F1 o dobro da área da de F2 e chamando p1 e p2, respectivamente, os coeficientes de resistividade de F1 e F2, a razão p1/p2 tem valor:", 
// "4", "2", "1", "½", "¼", 2, 2),
// (2, "(UFBA) O valor da resistência elétrica de um condutor ôhmico não varia, se mudarmos somente:", "o material de que ele é feito", "seu comprimento", 
// "a diferença de potencial a que ele é submetido", "a área de sua secção reta", "a sua resistividade", 3, 2),
// (2, "(F. E.  EDSON DE QUEIROZ – CE) Dispõe-se de três resistores de resistência 300 ohms cada um. Para se obter uma resistência de 450Ω, utilizando-se os três resistores, como devemos associá-los?", 
// "Dois em paralelo, ligados em série com o terceiro", "Os três em paralelo", "Dois em série, ligados em paralelo com o terceiro", "Os três em série", "n.d.a", 1, 2),
// (2, "(PUC) Um elétron num tubo de raios catódicos está se movendo paralelamente ao eixo do tubo com velocidade 107 m/s. Aplicando-se um campo de indução magnética de 2T, paralelo ao eixo do tubo, a força magnética que atua sobre o elétron vale:", 
// "3,2 . 10-12N", "nula", "1,6 . 10-12 N", "1,6 . 10-26 N", "3,2 . 10-26 N", 2, 2),
// (2, "(UF JUIZ DE FORA) Duas esferas igualmente carregadas, no vácuo, repelem-se mutuamente quando separadas a uma certa distância. Triplicando a distância entre as esferas, a força de repulsão entre elas torna-se:", 
// "3 vezes menor", "6 vezes menor", "9 vezes menor", "12 vezes menor", "9 vezes maior", 3, 2),
// (2, "(ITA) Uma gaivota pousada na superfície da água, cujo índice de refração em relação ao ar é n = 1,3, observa um peixe que está exatamente abaixo dela, a uma profundidade de 1,0m. Que distância, em linha reta, deverá nadar o peixinho para sair do campo visual da gaivota?", 
// "0,84m", "1,2m", "1,6m", "1,4m", "O peixinho não conseguirá fugir do campo de visão da gaivota", 5, 2),
// (2, "(PUC) Em um farol de automóvel tem-se um refletor constituído por um espelho esférico e um filamento de pequenas dimensões que pode emitir luz. O farol funciona bem quando o espelho é:", 
// "côncavo e o filamento está no centro do espelho", "côncavo e o filamento está no foco do espelho", "convexo e o filamento está no centro do espelho", 
// "convexo e o filamento está no foco do espelho", "convexo e o filamento está no ponto médio entre o foco e o centro do espelho", 2, 2),
// (2, "(FATEC) Um automóvel percorre 6,0km para o norte e, em seguida 8,0km para o leste. A intensidade do vetor posição, em relação ao ponto de partida é:", 
// "10 km", "14 km", "2,0 km", "12 km", "8,0 km", 1, 2), 
// (2, "Em um movimento com trajetória retilínea podemos afirmar:Em um movimento com trajetória retilínea podemos afirmar:", 
// "a aceleração tangencial será nula", "a aceleração tangencial será nula", "a aceleração tangencial terá sempre o mesmo sentido", "a aceleração tangencial, suposta não nula, terá sempre a mesma direção", "a aceleração tangencial será constante", 4, 2),
// (2, "(F. C. M. SANTA CASA) Em um ponto do espaço:
//I. Uma carga elétrica não sofre ação da força elétrica se o campo nesse local for nulo.
//II. Pode existir campo elétrico sem que aí exista força elétrica.
//III. Sempre que houver uma carga elétrica, esta sofrerá ação da força elétrica.
//Use: C (certo) ou E (errado).", "CCC", "CEE", "ECE", "CCE", "EEE", 4, 3),
//(2, "(MED. VIÇOSA) Se um resistor de cobre tiver o seu comprimento e o seu diâmetro duplicado, a resistência:", "é multiplicada por quatro", "permanece a mesma", "é dividida por dois", "é multiplicada por dois", "é dividida por quatro", 3, 3),
//(2, "(UNICAP – PE) Uma diferença de potencial de 12V é aplicada num conjunto de três resistores associados em paralelo com valores, em ohms, iguais a 2,0, 3,0 e 6,0. A corrente elétrica, em ampères, no resistor maior, será:", "2,0", "4,0", "6,0", "8,0", "12", 1, 3),
//(2, "(ITA) Pretende-se determinar a resistência de uma lâmpada, cuja tensão nominal é de 120 volts, com um circuito no qual se pode medir simultaneamente a tensão aplicada à lâmpada e a intensidade de corrente da mesma. Foram feitas duas medições: primeiro a 120 volts e depois a 40 volts. Calculou-se a resistência da lâmpada aplicando-se a lei de Ohm e obteve-se resistência sensivelmente maior para 120 volts. 
//Pode-se afirmar que:", "houve erro nas medidas, pois os resultados deveriam ser iguais", "houve um curto-circuito no filamento da lâmpada, diminuindo a resistência na 2ª medida", 
//"a diferença decorre da desigualdade de temperaturas do filamento nas duas tensões", "o processo não serve para medir resistência", "n.d.a.", 3, 3),
//(2, "(FUND. CARLOS CHAGAS) O quociente da unidade de força dividida pela unidade de velocidade pode ser utilizado para medir:",
// "potência", "trabalho", "vazão volumétrica de gás", "vazão volumétrica de líquidos", "vazão de massas", 5, 3),
//(2, "(FUVEST) Uma corda de violão tem 0,60m de comprimento. Os três maiores comprimentos de ondas estacionárias que se podem estabelecer nessa corda são (em metros):", 
//"1,2; 0,60; 0,40", "1,2; 0,60, 0,30", "0,60; 0,30; 0,20", "0,60; 0,30; 0,15", "0,60; 0,20; 0,12", 1, 3),
//(2, "Uma fonte de luz situada a 0,50m abaixo do nível da água (índice de refração absoluto 4/3) determina a superfície de um disco brilhante de raio aproximadamente igual a:", 
//"0,20m", "0,30m", "0,57m", "0,80m", "1,00m", 3, 3),
//(2, "(VUNESP) Um pequeno prego se encontra diante de um espelho côncavo, perpendicularmente ao eixo óptico principal, entre o foco e o espelho. A imagem do prego será:", 
//"real, invertida e menor que o objeto", "virtual, invertida e menor que o objeto", "real, direta e menor que o objeto", "virtual, direta e maior que o objeto", "real, invertida e maior que o objeto", 4, 3),
//(2, "(MACKENZIE) Um corpo é atirado verticalmente para cima a partir do solo com velocidade inicial de módulo 50 m/s. O módulo de sua velocidade vetorial média entre o instante de lançamento e o instante em que retorna ao solo é:", 
//"50 m/s", "25 m/s", "5,0 m/s", "2,5 m/s", "zero", 5, 3),
//(2, "Considere uma partícula em movimento.
//A respeito de sua velocidade vetorial (instantânea) assinale a opção falsa:", "tem direção sempre tangente à trajetória", "tem sentido sempre concordante com o sentido do movimento", "tem intensidade sempre igual ao valor absoluto da velocidade escalar (instantânea)", "somente é constante se o movimento for retilíneo e uniforme", "é constante no movimento circular e uniforme", 5, 3);
//
//INSERT INTO QUESTAO (AREA, DESC_QUESTAO, DESC_ALTERNATIVA_1, DESC_ALTERNATIVA_2, DESC_ALTERNATIVA_3, DESC_ALTERNATIVA_4, DESC_ALTERNATIVA_5, IND_CORRETA, IND_NIVEL) VALUES 
//(6, "(UFMA) Os principais fatos histórico-sociais que propiciaram o surgimento da sociologia foram:", "a Revolução dos cravos em Portugal e a Revolução Moçambicana", 
//"a Revolução Industrial e a Revolução Francesa", "a Revolução Russa e a Revolução Chinesa", "a Revolução Mexicana e a Revolução Nicaraguense", "a Revolução Cubana e a Revolução Chinesa", 2, 1),
//(6, "A sociologia, para Durkheim, deveria ocupar-se do estudo das sociedades no intuito de:", "conhecer a fundo o ser humano e suas diversas facetas perante a sua interação com o outro, priorizando sua individualidade", 
//"Entender a fundo os processos sociais que formam a realidade social do Homem, atentando principalmente aos aspectos gerais, e não aos individuais",
// "Descobrir e tratar todos os males humanos que afligem a sociedade, tendo como objetivo a formação de uma raça humana perfeita", "A criação de uma seita científica, com o objetivo de construir o verdadeiro conhecimento em busca da perfeição humana", 
// "Nenhumas das alternativas", 2, 1),
// (6, "(Unicentro) Max Weber, um dos fundadores da Sociologia, tinha amplo conhecimento em muitas áreas afins a essa ciência, tais como economia, direito e filosofia. Assim, ao analisar o desenvolvimento do capitalismo moderno, buscou entender a natureza e as causas da mudança social. Em sua obra, existem dois conceitos fundamentais, ou seja:", 
// "cultura e tipo Ideal", "classe e proletariado", "anomia e solidariedade", "fato social e burocracia", "ação social e racionalidade", 5, 1),
// (6, "Como Max Weber conceituou a ideia de “ação social”?", "Uma ação social é toda ação tomada de forma coordenada e com outros sujeitos", 
// "Uma ação social é toda ação voltada para a remediação de problemas sociais", "Uma ação social é toda ação que se configura em meio coletivo e sempre com um sentido político", "Uma ação social é qualquer ação realizada por um sujeito em um meio social que possua um sentido determinado por seu autor", 
// "Nenhuma das alternativas", 4, 1),
// (6, "Como Karl Marx determina o “valor de uso” ao falar sobre mais-valia?", "Valor de uso é o valor que o dono do capital estipula arbitrariamente para seus produtos", 
// "Valor de uso é o valor que é determinado pelas leis de mercado", "Valor de uso é o conceito que Karl Marx usa para explicar a forma utilitária pela qual o trabalho é visto pelo dono do capital",
// "Valor de uso é o valor de um produto determinado pela quantidade de trabalho aplicada em sua produção", "Nenhuma das alternativas", 4, 1),
// (6, "De acordo com Émile Durkheim, os fatos sociais são características que moldam o comportamento dos indivíduos em sociedade. Os fatos sociais são definidos pelo autor como sendo:", "Exteriores ao indivíduo, expressivos e generalizados", "Generalizados, expressivos e naturais", "Exteriores ao indivíduo, coercitivos e generalizados", "Coercitivos, naturais e expressivos", "Naturais, generalizados e exteriores ao indivíduo", 3, 2),
// (6, "Entre os fatores que influenciam a mobilidade social estão:", "A vontade de trabalhar, a preguiça e o nível educacional", "O nível econômico familiar, o nível educacional familiar e as políticas que asseguram igual acesso aos meios de formação educacional", 
// "A comodidade, o nível educacional e a vontade de trabalhar", "O nível econômico familiar, a comodidade e as políticas que asseguram igual acesso aos meios de formação educacional", "Nenhuma das opções", 2, 2),
// (6, "Max Weber alinhava-se à visão de Marx em relação ao tratamento do desenvolvimento do capitalismo no mundo moderno e às investigações sobre os sistemas anteriores de produção e as lógicas de relações sociais que se estabeleciam em volta deles. Entretanto, Weber discordava de Marx em alguns pontos cruciais. Quais são eles?", 
// "Enquanto Marx acreditava que a religião era o ópio do povo, Weber era um religioso convicto", "Enquanto Weber elaborou seus trabalhos sob a perspectiva do materialismo histórico, Marx foi lembrado por sua sociologia compreensiva", "Enquanto Marx construiu sua teoria sob a perspectiva do materialismo histórico, Weber foi lembrado por sua sociologia compreensiva", 
// "Marx e Weber não discordaram em nenhum ponto de suas teorias", "Nenhuma das alternativas", 3, 2),
// (6, "(Unicentro) Os novos movimentos sociais são diferentes das ações coletivas de antes por eles politizarem a esfera privada e tornarem públicas as problemáticas das minorias sociais. Assim, dentre esses movimentos, destacam-se aqueles que:", 
// "envolvem negros, indígenas, sem-terra e sem-teto", "determinam a opinião pública sobre as questões ecológicas", "produzem discussões locais e regionais, não abarcando questões globais", "desenvolvem-se a partir do controle do Estado e dos partidos políticos",
// "realizam pressão política, apoiando contestação da política econômica, e lutam por melhores salários", 3, 2),
// (6, "(UEL - 2008) O capitalismo vê a força de trabalho como mercadoria, mas é claro que não se trata de uma mercadoria qualquer. Ela é capaz de gerar valor. [...] O operário é o indivíduo que, nada possuindo, é obrigado a sobreviver da sua força de trabalho”
//(COSTA, 2005).
//Segundo Karl Marx, a força de trabalho é alugada ou comprada por meio", "da Mais-valia", "do Lucro", "do Salário", "da Alienação", "das Relações políticas", 3, 2),
//(6, "A estratificação social é uma realidade em todas as sociedades do mundo. Dentro do conceito de estratificação, a mobilidade social existe quando:", 
//"o indivíduo muda-se de um bairro ou região", "uma família ou indivíduo migra para outra região do país", "um grupo ou um indivíduo ascende ou descende na escala social", "um grupo social imigra para outro país", "uma grande quantidade de famílias desloca-se do campo para o meio urbano", 3, 3),
//(6, "(ENEM - 2013)
//A recuperação da herança cultural africana deve levar em conta o que é próprio do processo cultural: seu movimento, pluralidade e complexidade. Não se trata, portanto, do resgate ingênuo do passado nem do seu cultivo nostálgico, mas de procurar perceber o próprio rosto cultural brasileiro. O que se quer é captar seu movimento para melhor compreendê-lo historicamente.
//MINAS GERAIS. Cadernos do Arquivo 1: Escravidão em Minas Gerais. Belo Horizonte: Arquivo Público Mineiro, 1988.
//Com base no texto, a análise de manifestações culturais de origem africana, como a capoeira ou o candomblé, deve considerar que elas:", 
//"permanecem como reprodução dos valores e costumes africanos", "perderam a relação com o seu passado histórico", "derivam da interação entre valores africanos e a experiência histórica brasileira",
// "contribuem para o distanciamento cultural entre negros e brancos no Brasil atual", "demonstram a maior complexidade cultural dos africanos em relação aos europeus", 3, 3),
// (6, "O positivismo é a linha de pensamento dominante no trabalho de Comte. Sobre essa corrente de pensamento, marque a alternativa correta:", 
// "o pensamento positivo baseia-se no bom humor e na felicidade, que devem comandar as ações do sujeito social moderno que busca entender os conflitos que se instauram no mundo pós-revolução industrial", "as classes sociais sempre estarão em conflito generalizado entre si, uma vez que o caráter positivo da realidade de uma sempre resultará em resultados negativos para as outras", 
// "o conhecimento verdadeiro só pode ser obtido por meio da experimentação e pelo aferimento científico", "o mundo palpável e observável insere-se dentro do conceito de conhecimento negativo, e a jornada espiritual voltada para Deus configura-se como o conhecimento positivo", "Todas as alternaivas estão incorretas", 3, 3),
// (6, "Entre os problemas sociais que afetam um grupo minoritário, o que pode ser entendido como de maior gravidade, ao nos voltarmos para o foco institucional, é:", 
// "a precária representação política, o que ocasiona negligência de direitos básicos que deveriam ser assegurados para todos os indivíduos em um Estado democrático", "a falta de leis rigorosas e explicitamente voltadas para atender as necessidades específicas de uma minoria", "a resistência em reconhecer a existência dos grupos minoritários por parte de nosso governo", 
// "a falta de ONGs que se voltem para a resolução dos problemas que os grupos minoritários possuem", "Nenhumas das opções", 1, 3),
// (6, "Sobre o conceito de mais-valia relativa, marque a afirmação correta:", "Mais-valia relativa configura-se quando o dono do capital consegue aumentar a capitação de excedente de produção mediante o avanço tecnológico", 
// "Mais-valia relativa é um conceito que faz referência à condição precária do trabalhador industrial", "Mais-valia relativa configura-se quando o dono dos meios de produção recolhe o excedente de produção", "Mais-valia relativa configura-se quando o capitalista aumenta o recolhimento dos excedentes produzidos por meio do aumento da jornada de trabalho", "Todas as alternativas estão incorretas", 1, 3);
// 
//INSERT INTO QUESTAO (AREA, DESC_QUESTAO, DESC_ALTERNATIVA_1, DESC_ALTERNATIVA_2, DESC_ALTERNATIVA_3, DESC_ALTERNATIVA_4, DESC_ALTERNATIVA_5, IND_CORRETA, IND_NIVEL) VALUES 
//(3, "(FUVEST) Entre os fatores citados abaixo, assinale aquele que não concorreu para a difusão da civilização bizantina na Europa Ocidental:", "Fuga dos sábios bizantinos para o Ocidente, após a queda de Constantinopla",
// "Expansão da Reforma Protestante, que marcou a quebra da unidade da Igreja Católica", "Divulgação e estudo da legislação de Justiniano, conhecida como Corpus Juris Civilis", "Intercâmbio cultural ligado ao movimento das Cruzadas", "Contatos comerciais das repúblicas marítimas italianas com os portos bizantinos nos mares Egeu e Negro", 2, 1),
//(3, "(PUC) Em relação ao Império Bizantino, é certo afirmar que:", "o governo era ao mesmo tempo teocrático e liberal", "o Estado não tinha influência na vida econômica", "o comércio era sobretudo marítimo", 
//"o Império Bizantino nunca conheceu crises sociais", "o imperialismo bizantino restringiu-se à Ásia Menor", 3, 1),
//(3, "Impossibilitados de defender o reino, os soberanos delegaram poder aos senhores feudais. Por isso, e com vistas a se auto protegerem, os senhores procuraram relacionarem diretamente.
//Sobre a citação é correto afirmar:", "A relação de suserania e vassalagem serviu para preservar a situação inferior do servo", "A descentralização política fez com que os reis desaparecessem", 
//"O rei tornou-se vassalo dos grandes barões, perdendo suas terras", "Retrata relações elitizadas, baseadas na fidelidade e em obrigações recíprocas", "Demonstra o poder da Igreja sobre o rei e a nobreza", 4, 1),
//(3, "Para defender-se das invasões, os senhores ligavam-se diretamente, através do juramento de fidelidade, feito sobre a bíblia e as relíquias sagradas, para evitar a ruptura dos dois contratantes.
//
//A partir do texto podemos afirmar:", "Teoricamente o poder pertence ao rei, mas de fato são os senhores feudais que o detêm, sendo, portanto localizado", "A instituição de relação de suserania e vassalagem aumentou a subordinação do servo em relação ao senhor", 
//"O objetivo dos senhores feudais era o de ligarem-se ao menor número possível de senhores, pois teriam menores obrigações", "Assim como os senhores feudais interferiam nas nomeações para os cargos eclesiásticos, a Igreja podia determinar o sucessor de cada feudo", "Como o vínculo de estabelecia contra as invasões externas, não havia hierarquização nessa relação", 1, 1),
//(3, "(FUVEST) Durante a Baixa Idade Média, as feitas constituíam:", "um instrumento de comércio local das cidades para o abastecimento cotidiano de seus habitantes", "áreas exclusivas de câmbio das diversas moedas europeias", 
//"locais de comércio de amplitude continental, que dinamizaram a economia da época", "locais fixos para comercialização da produção dos feudos", "instituições carolíngias para renascimento do comércio, abalado pelo domínio sarraceno no Mediterrâneo", 3, 1),
//(3, "(FUVEST) Politicamente, o feudalismo se caracterizava pela:", "atribuição apenas do Poder Executivo aos senhores de terras", "relação direta entre posse dos feudos e soberania, fragmentando-se o poder central", "relação entre a vassalagem e suserania entre mercadores e senhores feudais",
// "absoluta descentralização administrativa, com subordinação dos bispos aos senhores feudais", "existência de uma legislação específica a reger a vida de cada feudo", 2, 1),
//(3, "(USP) O assassinato do herdeiro do Império Austro-Húngaro em Sarajevo veio complicar a situação europeia e ocasionou a eclosão da I Guerra Mundial. O personagem em questão era:", "o Kaiser Guilherme", "Francisco Ferdinando", "Lloyd George", "Nicolau Romanov", "n.d.a.", 2, 1),
//(3, "(PUCC) Entre as guerras resultantes do fim da polarização do mundo entre duas grandes potências, pode-se citar a que envolve:", "católicos e protestantes", "sul-africanos e ingleses", "cubanos e americanos", "sérvios e bósnios", "árabes e judeus", 4, 1),
//(3, "(UFRN) Em relação à Segunda Guerra Mundial, é correto afirmar que:", "Hitler empreendeu uma implacável perseguição aos judeus, que resultou na morte de seis milhões de pessoas", "os norte-americanos permaneceram neutros na guerra até 1941, quando bombardearam Hiroshima e Nagasaki", "de Gaulle foi o chefe do governo de Vichy", "com o ataque alemão a Pearl Harbor, os norte-americanos resolveram entrar na guerra", "a Crise de 1929 nada teve a ver com a Segunda Guerra Mundial", 1, 1),
//(3, "(MACKENZIE) O governo Juscelino Kubitschek foi responsável:", "pela eliminação das disparidades regionais", "pela queda da inflação e da dívida externa", "por uma política nacionalista e de rejeição ao capital estrangeiro", "pela entrada maciça de capitais estrangeiros e a internacionalização de nossa economia", "por práticas antidemocráticas como a violenta repressão às rebeliões de Jacareacanga e Aragarças", 4, 1),
//(3, "Justiniano (527 – 565), no Império Romano do Oriente, enfrentou diferentes dificuldades internas, inclusive nas relações entre a Igreja e o Estado, devido a heresias como a dos monofisistas. Estes, entre outros princípios:", "pretendiam a destruição de todas as imagens", "negavam a natureza humana de Cristo", "defendiam o conhecimento de Deus inspirado no misticismo", "admitiam o dualismo de inspiração budista", "acreditavam na reencarnação das almas em corpos animais", 2, 2),
//(3, "(FUVEST) Com relação às Cruzadas, é correto afirmar que:", "representam, em última instância, a crise do sistema feudal", "a Primeira Cruzada foi convocada por Inocêncio III", "a Terceira Cruzada conquistou a cidade de Jerusalém", "a Quarta Cruzada foi conduzida por Ricardo Coração de Leão", "Dandolo, doge de Veneza, fez um acordo com o sultão Saladino durante a Sexta Cruzada", 1, 2),
//(3, "(UNIP) O feudalismo:", "deve ser definido como um regime político centralizado", "foi um sistema caracterizado pelo trabalho servil", "surgiu como consequência da crise do modo de produção asiático",
//"entrou em crise após o surgimento do comércio", "apresentava uma considerável mobilidade social", 2, 2),
//(3, "(OSEC) Um dos fatores da I Grande Guerra foi a rivalidade industrial entre a Alemanha e a Inglaterra, porque:", "os ingleses temiam a penetração alemã em suas colônias, como se estava verificando na Austrália", 
//"os alemães receavam o poderio econômico inglês, acreditando na eliminação da rivalidade por meio de uma guerra", "os alemães haviam obtido o controle comercial sobre o Império Otomano", "a Alemanha vinha dominando grande parte dos mercados de consumo até então pertencentes à Inglaterra", "n.d.a.", 4, 2),
//(3, "(PUC) O fim da I Guerra Mundial trouxe, entre outras consequências:", "a unificação política do Oriente Médio, sob a liderança do Egito", "o aparecimento de numerosos novos Estados, em virtude da desintegração dos Impérios Otomano, Austro- Húngaro e Russo", 
//"a ampliação do território alemão, em detrimento com a Polônia", "a simplificação do mapa político da Eurásia pelo desaparecimento de numerosos pequenos Estados", "a dominação da Alemanha pelas forças de ocupação aliadas", 2, 2),
//(3, "Qual dos fatores abaixo NÃO está ligado à I Guerra Mundial enquanto causa?", "O Tratado de Frankfurt", "A crescente procura de mercados e matérias-primas", "A política agressiva de Bismarck", "A Crise Balcânica", "A disputa colonial", 3, 2),
//(3, "(UEMT) A Segunda Grande Guerra (1939 – 1945) adquiriu caráter mundial a partir de 7 de dezembro de 1941, quando:", "os russos tomaram a iniciativa de anexar os Estados Bálticos", "os alemães invadiram o litoral mediterrâneo da África", 
//"os japoneses atacaram a base norte-americana de Pearl Harbor", "os franceses, por determinação do marechal Pétain, ocuparam o Sudeste da Ásia", "os chineses cederam a maior parte de seu território às tropas do Eixo", 3, 2),
//(3, "(PUC) O tenentismo constituiu um dos elementos básicos:", "Da revolução brasileira de 1930", "Da guerra contra Rosas e Oribe", "Da guerra do Paraguai", "Da Questão Militar do II Reinado", "n.d.a.", 1, 2),
//(3, "(FACULDADES OBJETIVO) A partir da Revolução de 1930, desenvolveu-se definitivamente um novo  setor na economia brasileira:", "café", "indústria urbana", "indústria do açúcar", "exportação", "n.d.a.", 2, 2),
//(3, "(UFS) No Governo de Juscelino Kubitschek, a base do seu programa administrativo era constituído do trinômio:", "saúde, habitação e educação", "estradas, energia e transporte", "indústria, exportação e importação", "agricultura, pecuária e reforma agrária", "comércio, sistema viário e poupança", 2, 2),
//(3, "O dirigismo era uma consequência natural da estrutura geográfica do país; de fato, o Estado era obrigado a intervir nos trabalhos para regularizar a utilização das águas do rio. A partir do texto, podemos considerar correto para a economia da região que:", 
//"Na verdade a terra não era controlada pelo Estado, e sim as águas, utilizadas para a irrigação", "Apesar controlar a produção, o Estado não era autoritário, pois havia se formado naturalmente", "O Estado controlava os meios de produção, monopolizava o conhecimento técnico e explorava o camponês", "Os camponeses exigiam que o Estado arbitrasse as disputas pelos recursos naturais", "O controle dos rios permitiu o desenvolvimento do comércio local, de desenvolvimento da Antiguidade", 3, 3),
//(3, "(PUC) Não pode ser considerado(a) como fator gerador do Renascimento Comercial ocorrido na Europa a partir do século XI:", "A crise do modo de produção feudal, provocada pela superexploração da mão-de-obra através das relações servis de produção", "A disponibilidade de mão-de-obra provocada, entre outros fatores, pelo crescimento demográfico a partir do século X",
//"A predominância cultural e ideológica da Igreja, com a valorização da vida extraterrena, a condenação da usura e sua posição em relação ao “justo preço” das mercadorias", "A aquisição das “cartas de franquia”, que fortalecia e libertava a nascente burguesia das obrigações tributárias para com os senhores feudais", "O movimento cruzadista que, retratando a estrutura mental e religiosa do homem medieval, se estendeu entre os séculos XI e XII", 3, 3),
//(3, "(USP) A preocupação em isolar a França e obter o maior número possível de aliados caracterizou a política de um chefe de governo europeu no período de 1871 e 1890. Estamos no referindo a:", "Lloyd George", "Bismarck", "Guilherme II", "Cavour", "Guilherme I", 2, 3),
//(3, "(UFRN) Em 1914, a crise balcânica atingiu um momento de grande tensão, quando a Áustria e a Sérvia entraram em atrito devido ao (à):", "patrocínio da independência da Albânia pela Áustria, privando a Sérvia de uma saída para o mar", 
//"anexação da Bósnia e Herzegovina pela Áustria", "tentativa da Áustria de anexar a Sérvia", "tentativa da Rússia de anexar a Sérvia", "n.d.a.", 2, 3),
//(3, "(OSEC) Presidente dos Estados Unidos durante a Guerra de 1914 – 1918:", "Franklin Roosevelt", "Churchill", "Wilson", "Theodore Roosevelt", "n.d.a.", 3, 3),
//(3, "Qual o acontecimento que em 1871 veio alterar o equilíbrio europeu?", "A unificação da Alemanha", "A derrota da França na Guerra Franco-Prussiana", "O início da industrialização da Rússia", 
//"A dissolução da Liga dos Três Imperadores", "O fim do Império de Napoleão III", 1, 3),
//(3, "(PUC) A Revolta de Canudos foi fruto:", "Do fanatismo religioso de populares sem condições econômicas de subsistência", "Do desejo de restaurar a monarquia portuguesa no Brasil", "Da conspiração de grupos conservadores", 
//"Da organização de grupos de jagunços no sertão", "n.d.a.", 1, 3),
//(3, "(FMU) Rui Barbosa teve atuação destacada como ministro da Fazenda do Governo Provisório. Entre as medidas que implantou salienta-se:", "Ampliação do crédito à lavoura, com indenização aos donos de escravos, em consequência da abolição", "Reforma do sistema de crédito, com incentivo ao setor industrial", "Política tarifária, estimulando a importação de bens de consumo interno", "Organização da legislação de sociedades anônimas, visando atrair investimentos estrangeiros no setor industrial", "Nenhuma das alternativas", 2, 3),
//(3, "Quais os partidos políticos que dominaram a vida parlamentar brasileira durante o período democrático de 1946 e 1964?", "PTB, UDN e PCB", "PL, UDN e PSD", "PDS, MDB e PCB", "PSB, UDN e PTB", "PSD, UDN e PTB", 5, 3),
//(3, "(UFPA) A crise gerada pela renúncia do presidente Jânio Quadros foi temporariamente controlada em 1961 através:", "das reformas de base com vistas à modernização do País", "do Ato Institucional número 5 e o fechamento total do regime", "da emenda parlamentarista, que possibilitou a posse do presidente João Goulart, conciliando setores em confronto", "do Golpe Militar, provocando a queda do governo Goulart", "da convocação de novas eleições, desfazendo o clima de acirramento da oposição entre esquerda e direita", 3, 3);
//
//INSERT INTO QUESTAO (AREA, DESC_QUESTAO, DESC_ALTERNATIVA_1, DESC_ALTERNATIVA_2, DESC_ALTERNATIVA_3, DESC_ALTERNATIVA_4, DESC_ALTERNATIVA_5, IND_CORRETA, IND_NIVEL) VALUES 
//(1, "(ITA) São definidas quatro espécies de átomos neutros em termos de partículas nucleares:
//Átomo I   – possui 18 prótons e 21 nêutrons
//Átomo II  – possui 19 prótons e 20 nêutrons
//Átomo III – possui 20 prótons e 19 nêutrons
//Átomo IV – possui 20 prótons e 20 nêutrons
//Pode-se concluir que:", "os átomos III e IV são isóbaros", "os átomos II e III são isoeletrônicos", "os átomos II e IV são isótopos", "os átomos I e II pertencem ao mesmo período da Classificação Periódica", "os átomos II e III possuem o mesmo número de massa", 5, 2),
//(1, "(ABC) O deutério é um:", "Isóbaro de hidrogênio", "Isótopo de hidrogênio", "Radioisótono do hidrogênio", "Isômero do hidrogênio", "Alótropo do hidrogênio", 2, 2),
//(1, "(MACK) Em uma pilha com eletrodos de zinco e de cobre, com circuito fechado, ocorre:", "o potencial do eletrodo de zinco diminui e o do cobre aumenta", "o potencial dos dois eletrodos diminui", "o potencial do eletrodo de zinco aumenta e o do cobre diminui", "o potencial dos dois eletrodos aumenta", "o potencial dos dois eletrodos não se altera", 1, 2),
//(1, "Sabendo-se que a massa molar do lítio é 7,0 g/mol, a massa de lítio contida em 250 ml de uma solução aquosa de concentração 0,160 mol/L de carbonato de lítio é: ",
//"0,560 g.", "0,400 g.", "0,280 g.", "0,160 g.", "0,080 g.", 1, 2),
//(1, "São colocadas para reagir entre si, as massas de 1,00 g de sódio metálico e 1,00 g de cloro gasoso. Considere que o rendimento da reação é 100%. São dadas as massas molares, em g/mol: Na = 23,0 e Cl = 35,5. A afirmação correta é:",
//"Há excesso de 0,153 g de sódio metálico", "Há excesso de 0,352 g de sódio metálico", "Há excesso de 0,282 g de cloro gasoso", "Há excesso de 0,153 g de cloro gasoso", "Nenhum dos dois elementos está em excesso", 2, 2),
//(1, "(UNIVALI-SC)  O comportamento de um gás real aproxima-se do comportamento de gás ideal quando submetido a:", "baixas temperaturas e baixas pressões", "altas temperaturas e altas pressões", "baixas temperaturas independentemente da pressão", "altas temperaturas e baixas pressões", "baixas temperaturas e altas pressões", 4, 2),
//(1, "(MACKENZIE) Se a pressão de um gás confinado é duplicada à temperatura constante, a grandeza do gás que duplicara será:", "a massa", "a massa específica", "o volume", "o peso", "a energia cinética", 2, 2),
//(1, "(USP) a reação de um composto de Grignard com formaldeído, seguida de hidrólise, produz:", "um álcool primário", "um álcool secundário", "um álcool terciário", "aldeído homólogo de formaldeído", "acetona", 1, 2),
//(1, "(PUC-SP) Os dois compostos H3C – O – CH3 e H3C – C – OH demonstram que caso de Isomeria?", "cadeia", "posição", "composição", "função", "tautomeria", 4, 2),
//(1, "O pH de uma solução é 6. Se reduzirmos o valor do pH da mesma solução para 2, a concentração de íons hidrogênio será:", "10.000 vezes maior do que a inicial", "1.000 vezes maior do que a inicial", "1.000 vezes menor do que a inicial", "4 vezes menor do que a inicial", "3 vezes maior do que a inicial", 1, 2),
//(1, "(MACK) A reação que ocorre em uma pilha é representada pela seguinte equação: Mn + Cu++ ® Mn++ + Cu Sabendo-se que o potencial de óxido-redução do manganês é igual a +1,05 volts e o do cobre é igual a –0,35 volts, e admitindo-se que a concentração dos íons é unitária, a voltagem da pilha será:", 
//"0,70 volts", "–1,40 volts", "1,40 volts", "–0,70 volts", "n.d.a.", 3, 3),
//(1, "(MED – ABC) A reação de 1 bromo propano com sódio metálico produz:", "propano", "hexano", "pentano", "2,2 dimetil butano", "2,3 dimetil butano", 2, 3),
//(1, "(UFF – RJ) O etanol é o álcool industrial mais importante, sendo utilizado como ingrediente em bebidas fermentadas, solvente, antisséptico tópico etc.
//A desidratação intermolecular do etanol realizada a 130°C produz um importante produto orgânico:", "eteno", "etanal", "éter etílico", "ácido etanóico", "etanonitrila", 3, 3),
//(1, "(SANTOS) Uma mistura de etileno e gás hidrogênio, que contém mais hidrogênio que etileno, tem pressão de 53 mmHg em determinado volume. Após a mistura ter passado por um catalisador de Platina, sua pressão é de 34 mmHg, à mesma temperatura e volume. Qual a fração de etileno na mistura original?", "34,6%", "41,5%", "23,8%", "49,0%", "n.d.a.", 1, 3),
//(1, "(USP) Obtém-se um hidrocarboneto insaturado pela reação entre o composto R – CH = CH – CH2 – MgBr e:", "oxigênio", "ozônio", "cloro", "hidrogênio", "água", 2, 3),
//(1, "(MED ABC) Os produtos da oxidação de um dado alceno são: ácido metil propanóico e acetona. O alceno em questão é:", "2 – metil – 3 – hexeno", "3 – metil – 3 – hexeno", "2, 3 – dimetil – 2 – penteno", "2, 4 – dimetil – 2 – penteno", "2, 3, 3 – trimetil – 1 – buteno", 4, 3),
//(1, "(USP) Uma substância orgânica reagiu com iodeto de etil – magnésio dando um composto que, depois de hidrolisado, formou metil – etilcetona. A substância original é:", "Formiato de etila", "Acetona", "Acetaldeído", "Ácido acético", "Cianeto de metila", 3, 3),
//(1, "(PUC-RIO) Os isótopos 16-8, 17-8, 18-8 possuem respectivamente os seguintes números de nêutrons:", "8, 8, 8", "8, 9, 10", "16, 17, 18", "24, 25, 26", "18, 17, 16", 2, 3),
//(1, "9.	Numa reação temos x moles / l de H2 e y moles / l de O2. A velocidade da reação é V1. Se dobrarmos a concentração de hidrogênio e triplicarmos a de oxigênio, a velocidade passa a V2.
//Qual a relação V1 / V2?
//Dado: 2H2 + O2 ® 2H2O", "V2 = 2 V1", "V2 = 4 V1", "V2 = 12 V1", "V2 = 24 V1", "V2 = 6 V1", 3, 3),
//(1, "(FIT – MG) Em determinada experiência, a reação de formação de água está ocorrendo com o consumo de 4 mols de oxigênio por minuto. Consequentemente, a velocidade de consumo de hidrogênio é de:", 
//"8 mols/minuto", "4 mols/minuto", "12 mols/minuto", "2 mols/minuto", "n.d.a.", 1, 3);
//
//INSERT INTO QUESTAO (AREA, DESC_QUESTAO, DESC_ALTERNATIVA_1, DESC_ALTERNATIVA_2, DESC_ALTERNATIVA_3, DESC_ALTERNATIVA_4, DESC_ALTERNATIVA_5, IND_CORRETA, IND_NIVEL) VALUES 
//(4, "As jazidas brasileiras de carvão mineral localizam-se em terrenos, datando geologicamente:", "do proterozóico", "do triássico", "do plioceno", "do cambriano", "do permocarbonífero", 5, 1),
//(4, "(ESCCAI) “No mundo capitalista a preocupação primordial é obtenção de lucros cada vez maiores. É dessa busca incessante de lucros máximos que resultam as estratégias de localização geográfica das empresas industriais, que em inúmeros fatores têm de ser considerados isoladamente e em conjunto.”
//A partir do texto acima conclui-se que os fatores mais importantes são, exceto:", "Mercado consumidor", "Energia", "Matéria-prima", "Legislação ambiental", "Mão-de-obra", 4, 1),
//(4, "(PUC) As porções orientais do território brasileiro, em termos de clima, sofrem maior intervenção da massa de ar:", "Equatorial Continental (Ec)", "Equatorial Atlântica (Ea)", "Tropical Continental (Tc)", "Tropical Atlântica (Ta)", "Polar Atlântica (Pa)", 4, 1),
//(4, "(FUVEST) O Brasil dominou o mercado mundial de borracha natural no período compreendido pelos anos:", "1860 a 1912", "1900 a 1940", "1910 a 1950", "1870 a 1930", "1890 a 1950", 1, 1),
//(4, "(UNOPAR) A expressão “Bacia Hidrográfica” pode ser entendida como:", "o conjunto das terras drenadas ou percorridas por um rio principal e seus afluentes", "a área ocupada pelas águas de um rio principal e seus afluentes no período normal de chuvas", "o conjunto de lagoas isoladas que se formam no leito dos rios quando o nível de água da água baixa", 
//"o aumento exagerado do volume de água de um rio principal e seus afluentes quando chove acima do normal", "o lago formado pelo represamento das águas de um rio principal e seus afluentes", 1, 1),
//(4, "(UNIFENAS) Podemos considerar agentes internos e externos do Globo Terrestre respectivamente:", "Tectonismo e intemperismo", "Vento e vulcanismo", "Águas correntes e intemperismo", "Vento e águas correntes", "N.d.a.", 1, 1),
//(4, "(PUCC) Os recifes de arenito resultam da:", "acumulação de esqueletos de minúsculos animais marinhos", "consolidação de dunas e restingas", "acumulação de restos calcários de celenterados", "consolidação das areias de antigas praias", "n.d.a.", 4, 1),
//(4, "(FMTM) No litoral  brasileiro, os costões abruptos recebem o nome de:", "barcanas", "restingas", "tombolis", "falésias", "mamelões", 4, 1),
//(4, "(UNOPAR) Dos imigrantes que vieram para o Brasil, a maior contribuição populacional foi dada pelos:", "portugueses e japoneses", "italianos e alemães", "alemães e espanhóis", "japoneses e espanhóis", "portugueses e italianos", 5, 1),
//(4, "(VUNESP) Segundo a hierarquia urbana, as cidades mais importantes de um país, que comandam a rede urbana nacional, estabelecendo áreas de influência, correspondem aos (às):", "centros regionais", "cidades-dormitórios", "metrópoles nacionais", "capitais regionais", "metrópoles regionais", 3, 1),
//(4, "(UNIFOR) Ao processo contemporâneo de produção de bens industriais, simultaneamente em vários países, através da padronização de modelos tecnológicos e de consumo, suplantando as fronteiras nacionais pela escala mundial, dá-se o nome de:", "internacionalização do capital", "globalização", "terceirização", "monopólio transnacional", "neoliberalismo", 2, 3),
//(4, "(UNIFENAS) São características do comércio exterior brasileiro na década de 80, exceto:", "Aumento das exportações e diminuição das importações", "Grande aumento nas exportações de produtos industrializados", "Saldos comerciais positivos a partir de 83", "Diversificação dos mercados compradores", "Diminuição significativa do comércio com a Argentina", 1, 2),
//(4, "(PUCC) Em Geologia, o movimento tectônico responsável pela formação de montanhas é:", "epirogênese", "diagênese", "epigênese", "morfogênese", "orogênese", 5, 2),
//(4, "(FUVEST) Mandacaru, xiquexique e facheiro são algumas das espécies vegetais que aparecem:", "no cerrado", "na caatinga", "no manguezal", "na floresta tropical", "na amazônia", 2, 2),
//(4, "(UFRJ) A bacia hidrográfica brasileira com maior possibilidade de navegação é:", "Bacia do São Francisco", "Bacia do Paraná", "Bacia do Uruguai", "Bacia Amazônica", "Bacia do Paraíba do Sul", 4, 2),
//(4, "Geomorfologicamente a Serra do Mar é classificada como:", "uma escarpa de planalto", "um altiplano", "uma sucessão de montanhas", "uma bacia de sedimentação", "um dobramento terciário", 1, 2),
//(4, "Sobre o domínio amazônico, assinale a alternativa falsa:", "Compõe-se em sua maior parte por baixos planaltos e planícies", "A hidrografia é riquíssima, com furos, igarapés, paranás-mirins e lagos da várzea", "Devido a riqueza mineral orgânica das águas dos rios é grande a piscosidade", 
//"Devido à exportação de peixes a matança tem-se descontrolado, colocando em risco várias espécies", "O solo amazônico tem-se mostrado fertilíssimo, prestando-se a grande monocultura exportadora", 5, 2),
//(4, "(FEI) Migrações pendulares são:", "movimentos ligados a atividades pastoris", "movimentos da população rural em direção aos grandes centros urbanos", "troca de imigrantes entre as grandes regiões", "deslocamento maciço de populações urbanas em direção ao campo", "movimentos diários de trabalhadores entre o local de residência e o local de trabalho", 5, 2),
//(4, "(PUC) O conceito de “hábitat” em Geografia compreende:", "as formas de moradia nas diferentes regiões do globo", "as relações que se estabelecem entre as coletividades humanas e o meio natural", "os tipos de habitações nas faixas intertropicais",
//"as relações entre os seres vivos e o meio ambiente", "a organização do espaço urbano", 2, 2),
//(4, "Caracterizam os países subdesenvolvidos, exceto:", "baixo consumo de energia elétrica", "elevadas taxas de natalidade", "grande crescimento populacional", "predominância da população economicamente ativa no setor secundário e terciário", "predomínio de matérias-primas nas exportações", 4, 2),
//(4, "(FGV) Sobre o consumo de energia no Brasil é correto afirmar que:", "a Região Sudeste não consegue consumir toda a energia que produz", "o setor residencial e de comércio representam 80% do consumo total de energia", "mais da metade da energia consumida no país provém de fontes renováveis, como a hidráulica e a biomassa", 
//"nesta década, devido às sucessivas crises econômicas, não tem havido aumento do consumo de energia", "o petróleo e o carvão mineral representam mais de 70% de energia produzida para consumo no país", 3, 3),
//(4, "(UNIFENAS) A organização do espaço geográfico brasileiro após a industrialização sofreu mudanças profundas. Seria errado afirmar:", "grande concentração de atividades e decisões no Sudeste, tendo São Paulo como centro polarizador", "orientação da economia nacional com aplicação do modelo econômico centro-periferia", 
//"maior integração do espaço brasileiro com desenvolvimento da rede de transporte e comunicações interligando o Sudeste ao resto do país", "maior interdependência entre as regiões com a divisão inter-regional do trabalho", "produção industrial se desenvolve em função das exportações, devido à inexistência de mercado interno", 5, 3),
//(4, "(PUC) A Região Sul se destaca em termos de atividade criatória e entre as regiões brasileiras é a que dispõe do maior rebanho de:", "bovinos e equinos", "equinos e asininos", "asininos e muares", "suínos e ovinos", "ovinos e caprinos", 4, 3),
//(4, "(SANTA CASA) Para apoiar a regra de que “a temperatura diminui com o aumento da latitude”, deveríamos tomar como exemplo os dados referentes às cidades de:", "Manaus, Cuiabá e Porto Alegre", "Recife, Cuiabá e Rio de Janeiro", "Recife, Rio de Janeiro e Porto Alegre", "Manaus, Recife e Cuiabá", "Manaus, Rio de Janeiro e Porto Alegre", 5, 3),
//(4, "(OSEC) A “friagem” consiste na queda brusca da temperatura, na região amazônica. Sobre ela pode-se afirmar que:
//I. O relevo baixo, de planície, facilita a incursão de massas de ar frio que atingem a Amazônia.
//II. A massa de ar responsável pela ocorrência de friagem é a Tropical Atlântica.
//III. A friagem ocorre no inverno.
//De acordo com as afirmativas acima, assinale:", "se apenas I estiver correta", "se I e II estiverem corretas", "se II e III estiverem corretas", "se I e III estiverem corretas", "se todas as afirmativas estiverem corretas", 4, 3),
//(4, "(UNISA) A capacidade de crescimento da população é infinitamente maior do que a capacidade de produção de alimentos na Terra. Esse é o enunciado básico da doutrina de Malthus, que consiste no seguinte princípio:", "progressão geométrica da população e progressão aritmética dos alimentos", 
//"progressão geométrica da população e baixa taxa de natalidade", "progressão aritmética da população e baixa taxa de mortalidade", "progressão aritmética da população e progressão geométrica dos alimentos", "progressão geométrica da população e alta taxa de natalidade", 1, 3),
//(4, "A bipolarização das nações do globo, após a Segunda Grande Guerra, sob o ponto de vista político e principalmente militar, deu origem ao fenômeno denominado:", "Mercado Comum Europeu e Conselho de Assistência Econômica Mútua", "Guerra Fria", "Detente", "Guerra de Posição", "Nova Política Econômica (NEP)", 2, 3),
//(4, "(VUNESP) A ordem geopolítica bipolar, que se desagregou quase que totalmente nos últimos anos, cede lugar a uma nova ordem:", "multipolar", "sem pólos ou centros de decisão", "monopolar", "neonazista", "apolítica", 1, 3),
//(4, "(CESGRANRIO) Algumas empresas de países capitalistas buscam acordo entre si visando a controlar a produção e, principalmente, os preços no mercado. A esse tipo de integração denominamos:", 
//"truste", "cartel", "“holding”", "“pool”", "conglomerados", 2, 3);
//
//
//INSERT INTO QUESTAO (AREA, DESC_QUESTAO, DESC_ALTERNATIVA_1, DESC_ALTERNATIVA_2, DESC_ALTERNATIVA_3, DESC_ALTERNATIVA_4, DESC_ALTERNATIVA_5, IND_CORRETA, IND_NIVEL) VALUES 
//(9, "(CESBRANRIO) “Noites pesadas de cheiros e calores amontoados…”
//Aponte a opção em que, substituídos os substantivos destacados acima, fica incorreta a concordância de “amontoado”.", "nuvens e brisas amontoadas", "odores e brisas amontoadas", "nuvens e morros amontoados", "morros e nuvens amontoados", "brisas e odores amontoadas", 5, 1),
//(9, "(UNEB – BA) Assinale a alternativa em que, pluralizando-se a frase, as palavras destacadas permanecem invariáveis:", "Este é o meio mais exato para você resolver o problema: estude só", "Meia palavra, meio tom – índice de sua sensatez", "Estava só naquela ocasião; acreditei, pois em sua meia promessa", "Passei muito inverno só", "Só estudei o elementar, o que me deixa meio apreensivo", 5, 1),
//(9, "(CESCEM) Sentou-se ___ máquina e pôs-se ___ reescrever uma ___ uma as páginas do relatório.", "a / a / à", "a / à / à", "à / a / a", "à / à / à", "à / à / a", 3, 1),
//(9, "(SANTA CASA) A preocupação com a brevidade da vida induz o poeta barroco a assumir uma atitude que:", "descrê da misericórdia divina e contesta os valores da religião", 
//"desiste de lutar contra o tempo, menosprezando a mocidade e a beleza", "se deixa subjugar pelo desânimo e pela apatia dos céticos", "se revolta contra os insondáveis desígnios de Deus", "quer gozar ao máximo seus dias, enquanto a mocidade dura", 5, 1),
//(9, "Só não notamos a presença do Impressionismo quando o autor:", "retrata a verdade de um dado momento, justapondo ideias várias", "dá mais ênfase às emoções sentimentos e atitudes individuais do que aos fatos em si", "usa uma linguagem expressiva, suprimindo conjunções e liberando as frases", "procura retratar fielmente a realidade, detendo-se em minuciosa descrição", "inventa e interpreta uma paisagem imprecisa", 4, 1),
//(9, "(FUND. UNIV. RIOGRANDE) Marque a afirmativa correta:", "O Parnasianismo caracterizou-se, no Brasil, pela busca da perfeição formal na poesia", "O Parnasianismo determinou o surgimento de obras de tom marcadamente coloquial", "O Parnasianismo, por seus poetas, preconizava o uso do verso livre", "O Parnasianismo brasileiro deu ênfase ao experimentalismo formal", "O Parnasianismo foi o responsável pela afirmação de uma poesia de caráter sugestivo e musical", 1, 1),
//(9, "Assinale a associação incorreta:", "Lobato – narrativa oral", "Lima Barreto – simplicidade, oposição ao preciosismo", "Graça Aranha – sincretismo entre Realismo, Simbolismo e Impressionismo", "Euclides da Cunha – “barroco cientifico”", "Coelho Neto – simplicidade, apontado pelos modernistas como exemplo", 5, 1),
//(9, "O realismo foi um movimento de:", "volta ao passado", "exacerbação ultra-romântica", "maior preocupação com a objetividade", "irracionalismo", "moralismo", 3, 1),
//(9, "O simbolismo caracterizou-se por ser:", "positivista, naturalista, cientificista", "antipositivista, antinaturalista, anticientificista", "objetivo – racional", "uma volta aos modelos greco-latinos", "subjetivista – materialista", 2, 1),
//(9, "A língua portuguesa não é falada:", "no arquipélago dos Açores e na Ilha da Madeira", "em Gibraltar e nas Ilhas Canárias", "no arquipélago de Cabo Verde, nas ilhas de São Tomé e Porto Príncipe, na Guiné-Bissau em Angola e em Moçambique", "em Macau e em dialetos crioulos de Goa, Damão, Sri Lanka (ex-Ceilao), Java e Málaca", "no Timor Leste, parte oriental da ilha de Timor, próxima da Oceania, mas que os mapas geopolíticos atuais incorporam ao Sudeste Asiático", 2, 1),
//(9, "(STA. CASA) Quando chamar tem sentido de qualificar, pode-se construir o período, por exemplo, com objeto direto mais predicativo. Tudo se observa na alternativa:", "João é alto, mas treinador nenhum chamou-o para jogar", "Era a viúva a chamar pelo falecido", "Os inimigos chamam-lhe de traidor do povo", "Chamei pelo colega em voz alta", "Alguns chamavam-no de fiscal", 2, 2),
//(9, "(UFAC) Assinale a alternativa em que há um grave erro de colocação pronominal.", "Não sei porque te hei de seguir os passos", "Os exames, traga-lhos agora mesmo", "Ela não se conteve", "Direi-lhe tudo o que sei", "O que se não deve fazer", 1, 2),
//(9, "(PUC-PR) Assinale o período em que a colocação do pronome átono pode ser alterada.", "Passe-me o livro, por favor!", "Foi este o artigo que vocês leram e me recomendaram?", "A criancinha veio, mal se equilibrando nos pezinhos", "Ter-se-ão retirado, quando você chegar", "Não lhe quero falar sobre o caso", 2, 2),
//(9, "(FASP) Assinale a alternativa com erro de crase:", "Você já esteve em Roma? Eu irei à Roma logo", "Refiro-me à Roma antiga, na qual viveu César", "Fui à Lisboa de meus avós, pois gosto da Lisboa de meus avós", "Já não agrada ir a Brasília. A gasolina…", "nenhuma das alternativas está errada.", 1, 2),
//(9, "(FAC. RUI BARBOSA) Assinale a alternativa em que ocorre combinação de uma preposição com um pronome demonstrativo:", "Estou na mesma situação", "Neste momento, encerramos nossas transmissões", "Daqui não saio", "Ando só pela vida", "Acordei num lugar estranho", 2, 2),
//(9, "(UFPR) A formação do vocábulo sublinhado na expressão “o canto das sereias” é:", "composição por justaposição", "derivação regressiva", "derivação prefixal", "derivação sufixal", "palavra primitiva", 2, 2),
//(9, "Não corresponde ao simbolismo:", "Uso frequente de aliterações e assonâncias", "Musicalidade dos versos", "Uso de rimas pobres", "Presença de assonâncias", "Apreensão dos modelos greco-romanos", 5, 2),
//(9, "Os vocabulários passarinho e querida possuem:", "6 e 8 fonemas respectivamente", "10 e 7 fonemas respectivamente", "9 e 6 fonemas respectivamente", "8 e 6 fonemas respectivamente", "7 e 6 fonemas respectivamente", 4, 2),
//(9, "(FUVEST) A respeito de Clarice Lispector, nos contos de Laços de Família, seria correto afirmar que:", "Para frequentemente de acontecimentos surpreendentes para banalizá-los", "Elabora o cotidiano em busca de seu significado oculto", "É altamente intimista, vasculhando o âmago das personagens com rara argúcia", "É regionalista hermética", "Opera na área da memória, da autoanálise e do devaneio.", 3, 2),
//(9, "As primeiras manifestações literárias que se registram na Literatura Brasileira referem-se a:", "Literatura informativa sobre o Brasil (crônica) e literatura didática, catequética (obra dos jesuítas)", "Romances e contos dos primeiros colonizadores", "Poesia épica e prosa de ficção", "Obras de estilo clássico, renascentista", "Poemas românticos indianistas", 1, 2),
//(9, "(INATEL) Assinale a alternativa em que a norma culta não aceita a contração da preposição de:", "Aos prantos, despedi-me dela", "Está na hora da criança dormir", "Falava das colegas em público", "Retirei os livros das prateleiras para limpá-los", "O local da chacina estava interditado", 2, 3),
//(9, "(UFPA) No trecho: “(O Rio) não se industrializou, deixou explodir a questão social, fermentada por mais de dois milhões de favelados, e inchou, à exaustão, uma máquina administrativa que não funciona…”, a preposição a (que está contraída com o artigo a) traduz uma relação de:", "fim", "causa", "concessão", "limite", "modo", 5, 3),
//(9, "Assinale o que não se refere ao Arcadismo:", "Época do Iluminismo (século XVIII) – Racionalismo, clareza, simplicidade", "Volta aos princípios clássicos greco-romanos e renascentistas (o belo, o bem, a verdade, a perfeição, a imitação da natureza)", 
//"Ornamentação estilística, predomínio da ordem inversa, excesso de figuras", "Pastoralismo, bucolismo suaves idílios campestres", "Apoia-se em temas clássicos e tem como lema: inutilia truncat (“corta o que é inútil”).", 3, 3),
//(9, "Qual a alternativa que apresenta uma associação errada?", "Barroco / Contra-Reforma", "Arcadismo / Iluminismo", "Romantismo / Revolução Industrial", "Arcadismo / Anti-Classicismo", "Arcadismo / Racionalismo", 4, 3),
//(9, "(MACKENZIE)  “Chamado de rapsódia por Mário de Andrade, o livro é construído a partir de uma série de lendas a que se misturam superstições, provérbios e anedotas. O tempo e o espaço não obedecem a regras de verossimilhança, e o fantástico se confunde com o real durante toda a narrativa.
//A afirmação faz referência à obra:", "O rei da vela", "Calunga", "Macunaíma", "Memórias sentimentais de João Miramar", "Martim Cererê", 3, 3),
//(9, "(MACKENZIE) Não caracteriza a estética parnasiana:", "A oposição aos românticos e distanciamento das preocupações sociais dos realistas", "A objetividade, advinda do espírito cientificista, e o culto da forma", 
//"A obsessão pelo adorno e contenção lírica", "A perfeição formal na rima, no ritmo, no metro e volta aos motivos clássicos", "A exaltação do “eu” e fuga da realidade presente", 5, 3),
//(9, "(FUVEST) No romance Triste Fim de Policarpo Quaresma, o nacionalismo exaltado e delirante da personagem principal motiva seu engajamento em três diferentes projetos, que objetivam “reformar” o país. Esses projetos visam, sucessivamente, aos seguintes setores da vida nacional:", "escolar, agrícola e militar", "linguístico, industrial, e militar", "cultural, agrícola e político", "linguístico, político e militar", "cultura, industrial e político", 3, 3),
//(9, "Considerando-se iniciado o movimento realista no Brasil quando:", "Aluísio de Azevedo publica O Homem", "José de Alencar publica Lucíola", "Machado de Assis publica Memória Póstumas de Brás Cubas", "As alternativas a e c são válidas", "As alternativas a e b são válidas", 3, 3),
//(9, "(FUVEST) Refere-se corretamente a Alguma poesia, de Drummond, a seguinte afirmação:", "A imagem do poeta como gauche revela a sua militância na poesia engajada e participante, de esquerda", "As oposições sujeito-mundo e província-metrópole são fundamentais em vários poemas", "A filiação modernista do livro liberou o poeta das preocupações com a elaboração formal dos poemas", 
//"O livro não contém textos metalinguísticos, o que caracteriza a primeira fase do autor", "A ironia e o humor evitam que o eu-lírico se distancie ou se isole, proporcionando-lhe a comunhão com o mundo exterior", 2, 3),
//(9, "(FUVEST) É correto afirmar que, em Morte e Vida Severina:", "A alternância das falas de ricos e de pobres, em contraste, imprime à dinâmica geral do poema o ritmo da luta de classes", "A visão do mar aberto, quando Severino finalmente chega ao Recife, representa para o retirante a primeira afirmação da vida contra a morte", "O caráter de afirmação da vida, apesar de toda a miséria, comprova-se pela ausência da ideia de suicídio", 
//"As falas finais do retirante, após o nascimento de seu filho, configuram o “momento afirmativo”, por excelência, do poema", "A viagem do retirante, que atravessa ambientes menos e mais hostis, mostra-lhe que a miséria é a mesma, apesar dessas variações do meio físico", 5, 3);
//
//INSERT INTO QUESTAO (AREA, DESC_QUESTAO, DESC_ALTERNATIVA_1, DESC_ALTERNATIVA_2, DESC_ALTERNATIVA_3, DESC_ALTERNATIVA_4, DESC_ALTERNATIVA_5, IND_CORRETA, IND_NIVEL) VALUES 
//(7, "Os juízos morais podem ser diferentes a depender do código moral no qual se baseiam. No entanto, qualquer juízo moral tem em comum com outros dois aspectos:", "Aspecto formal e aspecto físico", "Aspecto formal e aspecto relativo", "Aspecto formal e aspecto de conteúdo", "Aspecto de conteúdo e aspecto físico", "Nenhuma das alternativas", 3, 1),
//(7, "A diferença que existe entre as diversas concepções de Ética possibilitou o estabelecimento de alguns aspectos sobre o que é a Moralidade. Assinale a alternativa que não corresponde a um dos aspectos da Moralidade:", "A moralidade como aquisição de virtudes para alcançar a felicidade", "A moralidade como aquisição de meios para alcançar a riqueza", "A moralidade como aptidão para resolver conflitos", 
//"A moralidade como prática solidária das virtudes comunitárias", "Nenhuma das alternativas", 2, 1),
//(7, "Há diferentes formas de se periodizar a Filosofia Grega. Há autores que consideram que ela pode ser dividida em três períodos, outros que ela pode ser dividida em até seis períodos. Compreendendo a Filosofia Grega a partir da divisão em quatro períodos, escolha a alternativa que corresponde a eles.", 
//"Período Pré-Socrático, Socrático, Escolástico e Patrístico", "Período Sofista, Pré-Socrático, Socrático e Pós-Socrático", "Período Pré-Socrático, Socrático, Platônico e Aristotélico", "Período Pré-Socrático, Socrático, Pós-Socrático e Greco-Romano (ou helenístico)", "n.d.a.", 4, 2),
//(7, "A Filosofia, como conhecemos hoje, ou seja, no sentido de um conhecimento racional e sistemático, foi uma atividade que, segundo se defende na história da filosofia, iniciou na Grécia Antiga. Defende-se isso a partir do entendimento de que a sociedade grega reunia características favoráveis a essa forma de expressão pautada por uma investigação racional. Essas características eram:", 
//"poesia grega, religião grega e condições sociopolíticas", "poesia grega, tragédia grega e mitologia grega", "poesia grega, matemática grega e condições sociopolíticas", "poesia grega, matemática grega e cristianismo", "Nenhuma das alternativas anteriores", 1, 2),
//(7, "A moralidade é um fenômeno complexo que pode ser entendido de formas diferentes e estudado por abordagens distintas. Qual é a área da Filosofia que estuda a moralidade e qual é a sua função?", 
//"Filosofia Estética. Tem apenas uma função, que é a de estudar o motivo pelo qual determinada ação é considerada bela", "Filosofia Política. Tem duas funções: estudar o motivo pelo qual determinada ação é considerada bela e estudar quais são as implicações dessa ação para a sociedade", "Filosofia Moral. Tem uma tríplice função: estudar quais são os traços distintivos da moral, investigar as razões da moralidade e buscar o desenvolvimento de uma “moral crítica”", 
//"Filosofia da Religião. Tem quatro funções: estudar quais são os traços distintivos da moral, estudar o motivo pelo qual uma ação é considerada justa, investigar as razões da moralidade e buscar o desenvolvimento de uma moral religiosa", "Nenhuma das alternativas", 3, 3),
//(7, "“As normas morais variam a depender da cultura e do período histórico. Também podem ser questionadas e destituídas”. Isso significa que:", "Nós não podemos pensar sobre as normas morais que são impostas", "Nós temos que concordar com as normas morais porque são as normas da nossa cultura", "A moral é um conjunto de valores pelos quais as pessoas guiam seus comportamentos e, por isso, está sujeita a mudanças a depender do país e do momento histórico em que as pessoas estão inseridas", 
//"Não agimos de forma “moral” se obedecermos às regras que a sociedade estabelece", "Nenhuma das alternativas", 3, 3);

//    INSERT INTO QUESTAO (AREA, DESC_QUESTAO, DESC_ALTERNATIVA_1, DESC_ALTERNATIVA_2, DESC_ALTERNATIVA_3, DESC_ALTERNATIVA_4, DESC_ALTERNATIVA_5, IND_CORRETA, IND_NIVEL) VALUES 
//  (8, "(VUNESP) Assinale a alternativa que indica o polinômio que possui os números 0 e 1 como raízes, sendo 0 uma raiz de multiplicidade 3:", "p(x) = x (x3 – 1)", "p(x) = x (x – 1)3", "p(x) = x3 (x – 1)", "p(x) = (x3 – x) (x – 1)", "p(x) = x (x3 + x2 – 2)", 3, 1),
//  (8, "(PUCCAMP) Sabe-se que a equação 2x3 + x2 – 6x – 3 = 0 admite uma única raiz racional e não inteira. As demais raízes dessa equação são:", "inteiras e positivas", "inteiras e de sinais contrários", "não reais", "irracionais e positivas", "irracionais e de sinais contrários", 5, 1),
//  (8, "Sabe-se que o número complexo i é solução da equação x4 – 3x2 – 4 = 0. Então:", "essa equação tem uma solução de multiplicidade 2", "as soluções dessa equação formam uma progressão", "a equação tem duas soluções reais irracionais", "a equação tem 2 soluções reais racionais", "a equação não tem soluções reais",  4, 1),
//  (8, "(MACK) Em R, o produto das soluções da inequação 2x – 3 £ 3 é:", "maior que 8", "6", "2", "1", "0", 5, 2),
//  (8, "(PUC) Para os conjuntos A = {a} e B = {a, {A}} podemos afirmar:", "B Ì A", "A = B", "A ÎB", "a = A", "{A}ÎB", 5, 2),
//  (8, "(FUVEST) Sendo i a unidade imaginária (i2 = -1) pergunta-se: quantos números reais a existem para os quais (a + i)4 é um número real?", "1", "2", "3", "4", "infinitos", 3, 3),
//  (8, "(PUCCAMP) Considere a sentença a2x + 3 > a8, na qual x é uma variável real e a é uma constante real positiva. Essa sentença é verdadeira se, por exemplo:", "x = 3 e a = 1", "x = -3 e a > 1", "x = 3 e a < 1", "x = -2 e a < 1", "x = 2 e a > 1", 4, 3),
//  (8, "(UNI- RIO) As probabilidades de três jogadores marcarem um gol cobrando pênalti são, respectivamente, 1/2, 2/5, e 5/6. Se cada um bater um único pênalti, a probabilidade de todos errarem é igual a:", "3%", "5%", "17%", "20%", "25%", 2, 3);


}
