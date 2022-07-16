package poo.model;

public class Pessoa {

    private static final int TAMANHO_CPF = 11;
    private static final int TAMANHO_CNPJ = 14;
    public enum TipoPessoa {FISICA, JURIDICA}

    public Integer codigo;
    public String nome;
    private String documento;
    public TipoPessoa tipo;

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        if (documento == null || documento.isEmpty()){
            throw new RuntimeException("documento não pode ser nulo ou vazio");
        }

        if (documento.length() == TAMANHO_CPF){
            setDocumento(documento,tipo = TipoPessoa.FISICA);
            /*tipo = TipoPessoa.FISICA; antes de add o outro setDocumento*/
        } else if (documento.length() == TAMANHO_CNPJ) {
            setDocumento(documento, tipo = TipoPessoa.JURIDICA);
            /*tipo = TipoPessoa.JURIDICA; antes de add o outro setDocumento*/
        } else {
            throw new RuntimeException("Documento inválido para PF ou PJ");
        }
    }

    private void setDocumento (String documento, TipoPessoa tipo){
        this.documento = documento;
        this.tipo = tipo;
    }

    public TipoPessoa getTipo() {
        return tipo;
    }
}
