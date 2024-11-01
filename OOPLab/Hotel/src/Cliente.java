public class Cliente {

    private String nome;
    private int idade;
    private String sexo;
    private String telefone;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }


    public void cadastrarCliente(String nome, int idade, String sexo, String telefone){
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.telefone = telefone;
    }

    public void preencherDados(){
        this.nome = "Paulo Henrique Moreira Maia";
        this.idade = 22;
        this.sexo = "M";
        this.telefone = "11960120747";
    }

    public String verificaSexo(String sexo) {
        if (sexo.toUpperCase().equals("M" || "F")){

        }
    }
}

