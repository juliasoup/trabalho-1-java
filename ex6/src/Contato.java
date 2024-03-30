public class Contato {
    private String nome;
    private float telefone;

    public Contato(String nome, float telefone){
        this.nome=nome;
        this.telefone=telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getTelefone() {
        return telefone;
    }

    public void setTelefone(float telefone) {
        this.telefone = telefone;
    }

    public String toString() {
        return "Nome: " + nome + ", Telefone: " + telefone;
    }
}
