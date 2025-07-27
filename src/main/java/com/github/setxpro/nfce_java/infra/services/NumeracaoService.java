package com.github.setxpro.nfce_java.infra.services;

import com.github.setxpro.nfce_java.infra.configs.NfceConfiguration;
import com.github.setxpro.nfce_java.infra.persistences.repositories.NfceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class NumeracaoService {

    private final NfceRepository nfceRepository;
    private final NfceConfiguration nfceConfiguration;

    public Integer obterProximoNumero(Integer serie) {
        return nfceRepository.findMaxNumeroBySerieNfce(serie)
                .map(maxNumero -> maxNumero + 1)
                .orElse(nfceConfiguration.getNumeroInicial());
    }

    public boolean isNumeroDisponivel(Integer numero, Integer serie) {
        return !nfceRepository.existsByNumeroAndSerie(numero, serie);
    }
}
