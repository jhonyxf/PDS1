
package domain;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class Funcionario {
    
    private Integer codFuncionario;
    private String nome,cargo;
    private List<Locacao> locacoes;

    public Funcionario() {
        this.locacoes = new ArrayList<Locacao>();
    }

    public Funcionario(Integer codFuncionario, String nome, String cargo) {
        this.codFuncionario = codFuncionario;
        this.nome = nome;
        this.cargo = cargo;
        this.locacoes = new ArrayList<Locacao>();
    }

    public Integer getCodFuncionario() {
        return codFuncionario;
    }

    public void setCodFuncionario(Integer codFuncionario) {
        this.codFuncionario = codFuncionario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public List<Locacao> getLocacoes() {
        return locacoes;
    }

    public void setLocacoes(List<Locacao> locacoes) {
        this.locacoes = locacoes;
    }
    
    public void addLocacao(Locacao l){
        this.locacoes.add(l);
    }
    public void removeLocacao(Locacao l){
        this.locacoes.remove(l);
    }

    @Override
    public String toString() {
        return "Funcionario{" + "codFuncionario=" + codFuncionario + ", nome=" + nome + ", cargo=" + cargo + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + Objects.hashCode(this.codFuncionario);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Funcionario other = (Funcionario) obj;
        if (!Objects.equals(this.codFuncionario, other.codFuncionario)) {
            return false;
        }
        return true;
    }
    
    
    public ArrayList<Locacao> gerarRelatorio(){
        System.out.println("\nLOCAÇÕES REALIZADAS\n");
        for (int i = 0;i< this.locacoes.size();i++){
            System.out.println("Cliente: "+this.locacoes.get(i).getCliente().getNome()
                    + "\nPlaca do Veiculo: " + this.locacoes.get(i).getVeiculo().getPlaca()
                    + "\nTipo de Locação: " + this.locacoes.get(i).getTipolocacao().getNome()
                    + "\nValor a ser pago:"+this.locacoes.get(i).consultaValorPagar());
        }
            return null;
    }
    
}
