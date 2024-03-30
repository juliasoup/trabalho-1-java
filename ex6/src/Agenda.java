import java.util.ArrayList;

    public class Agenda{
    private ArrayList<Contato> contatos;

    public Agenda() {
        contatos = new ArrayList<>();
    }

    public void addCnt(Contato contato) {
        contatos.add(contato);
    }

    public Contato buscarnome(String nome) {
        for (Contato contato : contatos) {
            if (contato.getNome().equalsIgnoreCase(nome))
                return contato;
            }

        return null;
    }          
    
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Agenda:\n");
        for (Contato contato : contatos) {
            sb.append(contato).append("\n");
        }
        return sb.toString();
    }

    }

