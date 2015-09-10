package domain;


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class Locacao {
    
    private Integer codLocacao;
    private Integer tempo;
    private Funcionario funcionario;
    private Veiculo veiculo;
    private Vaga vaga;
    private Cliente cliente;
    private TipoLocacao tipolocacao;

    public Locacao() {
    }

    public Locacao(Integer codLocacao, Integer tempo, Funcionario funcionario, Veiculo veiculo, Vaga vaga, Cliente cliente, TipoLocacao tipolocacao) {
        this.codLocacao = codLocacao;
        this.tempo = tempo;
        this.funcionario = funcionario;
        this.veiculo = veiculo;
        this.vaga = vaga;
        this.cliente = cliente;
        this.tipolocacao = tipolocacao;
    }

    public Integer getCodLocacao() {
        return codLocacao;
    }

    public void setCodLocacao(Integer codLocacao) {
        this.codLocacao = codLocacao;
    }

    public Integer getTempo() {
        return tempo;
    }

    public void setTempo(Integer tempo) {
        this.tempo = tempo;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public Vaga getVaga() {
        return vaga;
    }

    public void setVaga(Vaga vaga) {
        this.vaga = vaga;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public TipoLocacao getTipolocacao() {
        return tipolocacao;
    }

    public void setTipolocacao(TipoLocacao tipolocacao) {
        this.tipolocacao = tipolocacao;
    }

    @Override
    public String toString() {
        return "Locacao{" + "codLocacao=" + codLocacao + ", tempo=" + tempo + ", funcionario=" + funcionario + ", veiculo=" + veiculo + ", vaga=" + vaga + ", cliente=" + cliente + ", tipolocacao=" + tipolocacao + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.codLocacao);
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
        final Locacao other = (Locacao) obj;
        if (!Objects.equals(this.codLocacao, other.codLocacao)) {
            return false;
        }
        return true;
    }
    
    public void realizarLocacao(Cliente cli, Veiculo v, Vaga vaga,Funcionario f, TipoLocacao tipo){
        
        if(vaga.disponivel()){
            this.cliente = cli;
            this.veiculo = v;
            this.vaga = vaga;
            this.funcionario = f;
            this.tipolocacao = tipo;
            System.out.println("Locação realizada com sucesso!");
        }else{
        System.out.println("Essa Vagajáestá ocupada");
        }
    }
    
    public BigDecimal consultaValorPagar(){
       return  this.tipolocacao.getPreco().multiply(new BigDecimal(this.tempo));
    }
    public void finalizarLocacao(){
        
        System.out.println("\n"
                + "Locação finalizada\n\n"
                + "Cliente: "+this.cliente.getNome()
                + "\nQuantidade horas: "+this.tempo
                + "\nValor a ser pago:"+this.tipolocacao.getPreco().multiply(new BigDecimal(this.tempo))
                + "");
        
    }
    
    
}
