public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private String cor;
    private int velocidadeAtual;
    private boolean ligado;
    private double combustivel;


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(int velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public double getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(double combustivel) {
        this.combustivel = combustivel;
    }

    public void ligar(){
        this.ligado = true;
    }

    public void desligar(){
        this.ligado = false;
    }

    public void acelerar(){
        if (ligado == true){
            this.velocidadeAtual ++;
        } else {
            this.velocidadeAtual = 0;
        }
    }

    public void frear(){
        if (ligado == true){
            this.velocidadeAtual --;
        } else {
            this.velocidadeAtual = 0;
        }
    }

    public void abastecer(double combustivel){
        this.combustivel = combustivel + this.combustivel;
    }

    public void exibirInformacoes() {
        System.out.println("******************************");
        System.out.println("Marca : " + this.marca);
        System.out.println("Modelo : " + this.modelo);
        System.out.println("Ano : " + this.ano);
        System.out.println("Cor : " + this.cor);
        System.out.println("Velocidade Atual : " + this.velocidadeAtual);
        System.out.println("Ligado : " + this.ligado);
        System.out.println("Combustivel : " + this.combustivel + "L");
        System.out.println("******************************");
    }

    public void preencherDados(){
        this.marca = "Jeep";
        this.modelo = "Compass";
        this.ano = 2024;
        this.cor = "Preto";
        this.velocidadeAtual = 0;
        this.ligado = false;
        this.combustivel = 25.0;
    }

}
