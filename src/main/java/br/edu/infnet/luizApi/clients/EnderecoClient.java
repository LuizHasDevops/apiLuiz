package br.edu.infnet.luizApi.clients;

import br.edu.infnet.luizApi.model.domain.Endereco;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(url = "https://viacep.com.br/ws", name = "viaCep")
public interface EnderecoClient {

    @GetMapping(value = "/{cep}/json/")
    Endereco obterPorCep(@PathVariable String cep);
}
