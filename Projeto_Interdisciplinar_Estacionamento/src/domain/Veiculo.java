package domain;


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class Veiculo {
    
    private Integer codVeiculo;
    private String placa;
    private Cliente cliente;
    private List<Locacao> locacoes;

    public Veiculo() {
        this. locacoes = new ArrayList<Locacao>();
    }

    public Veiculo(Integer codVeiculo, Cliente cliente,String placa) {
        this.codVeiculo = codVeiculo;
        this.cliente = cliente;
        this.placa = placa;
        this. locacoes = new ArrayList<Locacao>();
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
    

    public Integer getCodVeiculo() {
        return codVeiculo;
    }

    public void setCodVeiculo(Integer codVeiculo) {
        this.codVeiculo = codVeiculo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
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
        return "Veiculo{" + "codVeiculo=" + codVeiculo + ", cliente=" + cliente + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + Objects.hashCode(this.codVeiculo);
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
        final Veiculo other = (Veiculo) obj;
        if (!Objects.equals(this.codVeiculo, other.codVeiculo)) {
            return false;
        }
        return true;
    }
    
    
    
    
    
}
