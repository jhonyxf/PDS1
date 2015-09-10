package aplicacao;

import domain.Cliente;
import domain.Funcionario;
import domain.TipoLocacao;
import domain.Vaga;
import domain.Veiculo;
import domain.Locacao;
import java.math.BigDecimal;
import java.text.ParseException;


public class Estacionamento {

    public static void main(String[] args) throws ParseException {
                        
        Funcionario f1 = new Funcionario(1, "Pedro", "Porteiro");
              
        Cliente c1 = new Cliente(1, "João", "rua Amazonas", "3225448");
        Cliente c2 = new Cliente(2, "Maria", "rua Prudente de Morais", "96685421");
        Cliente c3 = new Cliente(3, "José", "rua Ipanema", "87787451");
        
        Veiculo v1 = new Veiculo(1,c1,"NGK9246");
        Veiculo v2 = new Veiculo(2,c2,"UTC1234");
        Veiculo v3 = new Veiculo(3,c3,"MMM6666");
        Veiculo v4 = new Veiculo(4,c1,"TNT4444");
        
        TipoLocacao tipo1 = new TipoLocacao(1, "Horista", new BigDecimal(5.00));
        TipoLocacao tipo2 = new TipoLocacao(2, "Semanal", new BigDecimal(3.00));
        TipoLocacao tipo3 = new TipoLocacao(3, "Mensal", new BigDecimal(2.00));
              
          
        Vaga vg1 = new Vaga(1, 1, true);
        Vaga vg2 = new Vaga(2, 2, true);
        Vaga vg3 = new Vaga(3, 3, false);
        

        Locacao loc1 = new Locacao(1, 5, f1, v4, vg2, c1, tipo1);
        Locacao loc2 = new Locacao(2, 144, f1, v3, vg1, c3, tipo3);
        
               
        // Adiciona o veículo ao cliente
        c1.addVeiculo(v4);
        c1.addVeiculo(v1);
        c2.addVeiculo(v2);
        c3.addVeiculo(v3);
      
        System.out.println("\nVeiculos de " + c1.getNome() + " " + c1.getVeiculos());
        System.out.println("\nVeiculos de " + c2.getNome() + " " + c2.getVeiculos());
        System.out.println("\nVeiculos de " + c3.getNome() + " " + c3.getVeiculos());

        // Adiciona o funcionario a locação
        f1.addLocacao(loc1);
        System.out.println("\nLocações realizadas por " + f1.getNome() + ": " + f1.getLocacoes().size());
        System.out.println("\nDados da Locação = " + loc1.getCliente().getNome() + " - Tempo " + loc1.getTempo() + " horas - "  + loc1.getTipolocacao().getNome());
       
        // Adicionando a locação na vaga
        vg2.addLocacao(loc1);
        
        
        // Remove
        c1.removeVeiculo(v4);
        System.out.println("Veiculos de " + c1.getNome() + " " + c1.getVeiculos());

        
        
                    //  Métodos
        
        // Realizar Locação
        loc1.realizarLocacao(c1, v1, vg2, f1, tipo1);
        //loc2.realizarLocacao(c3, v3, vg1, f1, tipo3);
        
        // Teste locar vaga ocupada
        loc2.realizarLocacao(c3, v3, vg2, f1, tipo3);
        
        
        // Finalizar Locação 
        loc1.finalizarLocacao();
        loc2.finalizarLocacao();
        
        // Consulta do valor a pagar
        loc1.consultaValorPagar();
        loc2.consultaValorPagar();
        
        // Consulta se a vaga está disponível
        System.out.println("\nA vaga " + vg1.getCodVaga() + "esta: " + vg1.disponivel());
        System.out.println("A vaga " + vg2.getCodVaga() + "esta: " +vg2.disponivel());
        System.out.println("A vaga " + vg3.getCodVaga() + "esta: " + vg3.disponivel());
        
         // Gerar Relatório
        f1.gerarRelatorio();
        
     
        
    }

}
