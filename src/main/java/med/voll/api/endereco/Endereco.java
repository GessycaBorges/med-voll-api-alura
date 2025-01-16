package med.voll.api.endereco;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Endereco {

    private String logradouro;
    private String bairro;
    private String cep;
    private String cidade;
    private String uf;
    private String complemento;
    private String numero;

    public Endereco(DadosEndereco endereco) {
        this.logradouro = endereco.logradouro();
        this.bairro = endereco.bairro();
        this.cep = endereco.cep();
        this.cidade = endereco.cidade();
        this.uf = endereco.uf();
        this.complemento = endereco.complemento();
        this.numero = endereco.numero();
    }

    public void atualizarInformacoes(DadosEndereco endereco) {
        if (this.logradouro != null) {
            this.logradouro = endereco.logradouro();
        }
        if (this.bairro != null) {
            this.bairro = endereco.bairro();
        }
        if (this.cep != null) {
            this.cep = endereco.cep();
        }
        if (this.cidade != null) {
            this.cidade = endereco.cidade();
        }
        if (this.uf != null) {
            this.uf = endereco.uf();
        }
        if (this.complemento != null) {
            this.complemento = endereco.complemento();
        }
        if (this.numero != null) {
            this.numero = endereco.numero();
        }
    }
}
