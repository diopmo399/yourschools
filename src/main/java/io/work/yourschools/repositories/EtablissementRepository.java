package io.work.yourschools.repositories;

import io.work.yourschools.entity.Etablissement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EtablissementRepository extends JpaRepository<Etablissement , Long > {
}
