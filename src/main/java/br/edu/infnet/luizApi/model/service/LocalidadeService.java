package br.edu.infnet.luizApi.model.service;

import br.edu.infnet.luizApi.clients.LocalidadeClient;
import br.edu.infnet.luizApi.model.domain.Estado;
import br.edu.infnet.luizApi.model.domain.Municipio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
@Service
public class LocalidadeService {

    @Autowired
    private LocalidadeClient localidadeClient;

    public Collection<Estado> obterEstados(){
        return localidadeClient.obterEstados();
    }

    public Collection<Municipio> obterMunicipios(Integer uf){
        return localidadeClient.obterMunicipios(uf);
    }
}
