package domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class Cliente {
    
    private Integer codCliente;
    private String nome;
    private String logradouro;
    private int numero;
    private String telefone;
    private List<Locacao> locacoes;
    private List<Veiculo> veiculos;

    public Cliente() {
        this.locacoes = new ArrayList<Locacao>();
        this.veiculos = new ArrayList<Veiculo>();
    }

    public Cliente(Integer codCliente, String nome, String logradouro, String telefone) {
        this.codCliente = codCliente;
        this.nome = nome;
        this.logradouro = logradouro;
        this.telefone = telefone;
        this.locacoes = new ArrayList<Locacao>();
        this.veiculos = new ArrayList<Veiculo>();
    }
    
    

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    

    public Integer getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(Integer codCliente) {
        this.codCliente = codCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Locacao> getLocacoes() {
        return locacoes;
    }

    public void setLocacoes(List<Locacao> locacoes) {
        this.locacoes = locacoes;
    }

   

    public List<Veiculo> getVeiculos() {
        return veiculos;
    }

    public void setVeiculos(ArrayList<Veiculo> veiculos) {
        this.veiculos = veiculos;
    }
    
    public void addLocacao(Locacao l){
        this.locacoes.add(l);
    }
    public void removeLocacao(Locacao l){
        this.locacoes.remove(l);
    }
    
    
    
    public void addVeiculo(Veiculo v){
        this.veiculos.add(v);
    }

    public void removeVeiculo(Veiculo v){
        this.veiculos.remove(v);
    }

    @Override
    public String toString() {
        return "Cliente{" + "codCliente=" + codCliente + ", nome=" + nome + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.codCliente);
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
        final Cliente other = (Cliente) obj;
        if (!Objects.equals(this.codCliente, other.codCliente)) {
            return false;
        }
        return true;
    }
    
    
        
    
    
    
    
}
