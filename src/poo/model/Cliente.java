package poo.model;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Pessoa {

    public String numCartao;
    private List<Endereco> enderecos;
    /*public Endereco endereco;
    public Endereco enderecoEntrega;
    public Endereco enderecoTrabalho;
    assim funciona mas não é uma boa prática, chama o List e coloca um enum na classe
    o enum pra diferenciar os endereços*/

    public void adicionaEndereco (Endereco endereco){
        if (endereco == null){
            throw new NullPointerException("Endereço não pode ser nulo");
        }
        if (endereco.cep == null){
            throw new NullPointerException("CEP não pode ser nulo");
        }

        getEnderecos().add(endereco); /*para adicionar na lista endereco*/
    }
    /*para validar que não tenha um endereço vazio e coloca um private no método List*/

    private List<Endereco> getEnderecos() {
        if (enderecos == null) {
            enderecos = new ArrayList<Endereco>();
        }
        return enderecos;
    }

}
