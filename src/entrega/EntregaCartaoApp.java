package entrega;

import poo.model.Cliente;
import poo.model.Endereco;

import java.sql.Array;
import java.util.ArrayList;

public class EntregaCartaoApp {
    public static void main(String[] args) {

        Endereco endereco = new Endereco();
        endereco.cep = "0000000";
        //dados do endereço

        Cliente cliente = new Cliente();
        //dados do cliente

       /* if (cliente.enderecos == null){
            cliente.enderecos = new ArrayList<Endereco>();

        }

        cliente.enderecos.add(endereco);
        System.out.println("Endereço adicionado com sucesso!");

        Para não dar erro na hora de compilar o programa*/

        /*foi adicionado um privite no endereço e para acessar novamente, somente
        * pelo getEndereços - não tem o stter para não adicionar uma lista de endereços*/

        /*cliente.getEnderecos().add(endereco);
        System.out.println("Endereço adicionado com sucesso!");*/

        try {
            cliente.adicionaEndereco(endereco);
            System.out.println("Endereço adicionado com sucesso!");
        } catch (Exception e){
            System.err.println("Houve um erro ao adicionar o endereço: " + e.getMessage());
        }

    }
}
