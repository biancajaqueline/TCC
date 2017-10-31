package tcc;

public class UsuarioDTO {

    private String nome, sobrenome, login, senha, sexo;
    private int id_usuario, pontuacaoSessao, pontuacaoGeral, pontuacaoA1, pontuacaoA2, pontuacaoA3, pontuacaoA4, pontuacaoA5, pontuacaoA6, pontuacaoA7, pontuacaoA8, pontuacaoA9;

    public int getId_usuario() {
        return id_usuario;
    }

    public int getPontuacaoSessao() {
        return pontuacaoSessao;
    }

    public void setPontuacaoSessao(int pontuacaoSessao) {
        this.pontuacaoSessao = pontuacaoSessao;
    }

    public int getPontuacaoGeral() {
        return pontuacaoGeral;
    }

    public void setPontuacaoGeral(int pontuacaoGeral) {
        this.pontuacaoGeral = pontuacaoGeral;
    }

    public int getPontuacaoA1() {
        return pontuacaoA1;
    }

    public void setPontuacaoA1(int pontuacaoA1) {
        this.pontuacaoA1 = pontuacaoA1;
    }

    public int getPontuacaoA2() {
        return pontuacaoA2;
    }

    public void setPontuacaoA2(int pontuacaoA2) {
        this.pontuacaoA2 = pontuacaoA2;
    }

    public int getPontuacaoA3() {
        return pontuacaoA3;
    }

    public void setPontuacaoA3(int pontuacaoA3) {
        this.pontuacaoA3 = pontuacaoA3;
    }

    public int getPontuacaoA4() {
        return pontuacaoA4;
    }

    public void setPontuacaoA4(int pontuacaoA4) {
        this.pontuacaoA4 = pontuacaoA4;
    }

    public int getPontuacaoA5() {
        return pontuacaoA5;
    }

    public void setPontuacaoA5(int pontuacaoA5) {
        this.pontuacaoA5 = pontuacaoA5;
    }

    public int getPontuacaoA6() {
        return pontuacaoA6;
    }

    public void setPontuacaoA6(int pontuacaoA6) {
        this.pontuacaoA6 = pontuacaoA6;
    }

    public int getPontuacaoA7() {
        return pontuacaoA7;
    }

    public void setPontuacaoA7(int pontuacaoA7) {
        this.pontuacaoA7 = pontuacaoA7;
    }

    public int getPontuacaoA8() {
        return pontuacaoA8;
    }

    public void setPontuacaoA8(int pontuacaoA8) {
        this.pontuacaoA8 = pontuacaoA8;
    }

    public int getPontuacaoA9() {
        return pontuacaoA9;
    }

    public void setPontuacaoA9(int pontuacaoA9) {
        this.pontuacaoA9 = pontuacaoA9;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

}
