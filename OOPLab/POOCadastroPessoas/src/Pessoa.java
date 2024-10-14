public class Pessoa {
    private String nome;
    private int idade;
    private String sexo;
    private String signo;
    private double altura;
    private String instagram;
    private String profissao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSigno() {
        return signo;
    }

    public void setSigno(String signo) {
        this.signo = signo;
    }

    public String getInstagram() {
        return instagram;
    }

    public void setInstagram(String instagram) {
        this.instagram = instagram;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public void imprimirDados(){
        System.out.println("Nome : " + this.nome);
        System.out.println("Idade : " + this.idade);
        System.out.println("Sexo : " + this.sexo);
        System.out.println("Signo : " + this.signo);
        System.out.println("Altura : " + this.altura);
        System.out.println("Instagram : " + this.instagram);
        System.out.println("Profissão : " + this.profissao);
    }

    public void preencherDados(){
        this.nome = "Paulo Henrique";
        this.idade = 22;
        this.sexo = "M";
        this.signo = "Aries";
        this.altura = 1.71;
        this.instagram = "@henri_mmaia";
        this.profissao = "Programador";
    }
    public boolean verificaSexo(String sexo){
        if (sexo.equals("M") || sexo.equals("F")){
            this.sexo = sexo;
            return true;
        } else {
            System.out.println("Sexo invalido, tente novamente!");
            return false;
        }
    }

}
