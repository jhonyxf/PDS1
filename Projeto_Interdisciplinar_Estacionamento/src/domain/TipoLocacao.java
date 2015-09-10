package domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class TipoLocacao {
    private Integer codTipoLocacao;
    private String nome;
    private BigDecimal preco;
    private List<Locacao> locacoes;

    public TipoLocacao() {
        this.locacoes = new ArrayList<Locacao>();
    }

    public TipoLocacao(Integer codTipoLocacao, String nome, BigDecimal preco) {
        this.codTipoLocacao = codTipoLocacao;
        this.nome = nome;
        this.preco = preco;
        this.locacoes = new ArrayList<Locacao>();
    }

    public Integer getCodTipoLocacao() {
        return codTipoLocacao;
    }

    public void setCodTipoLocacao(Integer codTipoLocacao) {
        this.codTipoLocacao = codTipoLocacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
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
        return "TipoLocacao{" + "codTipoLocacao=" + codTipoLocacao + ", nome=" + nome + ", preco=" + preco + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.codTipoLocacao);
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
        final TipoLocacao other = (TipoLocacao) obj;
        if (!Objects.equals(this.codTipoLocacao, other.codTipoLocacao)) {
            return false;
        }
        return true;
    }
    
    
    
}
