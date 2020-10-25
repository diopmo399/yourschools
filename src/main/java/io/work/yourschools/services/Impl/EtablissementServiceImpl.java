package io.work.yourschools.services.Impl;

import io.work.yourschools.entity.Etablissement;
import io.work.yourschools.repositories.EtablissementRepository;
import io.work.yourschools.services.EtablissementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EtablissementServiceImpl implements EtablissementService {

    @Autowired
    private EtablissementRepository etablissementRepository;

    @Override
    public List<Etablissement> getAllEtablissement() {
        return etablissementRepository.findAll();
    }

    @Override
    public Etablissement saveEtablisement(Etablissement etablissement) {
        return etablissementRepository.save(etablissement);
    }

    @Override
    public Etablissement updateEtablissement(Etablissement etablissement) {
        return etablissementRepository.findById(etablissement.getId())
                .orElseThrow();
    }

    @Override
    public void deleteEtablissement(Long id) {

    }

    @Override
    public Etablissement findEtablissementByNom(String nom) {
        return null;
    }

    @Override
    public Etablissement findEtablissementByAdresse(String adresse) {
        return null;
    }

    @Override
    public List<Etablissement> findEtablissementByFiliere(String nomFiliere) {
        return null;
    }
}
