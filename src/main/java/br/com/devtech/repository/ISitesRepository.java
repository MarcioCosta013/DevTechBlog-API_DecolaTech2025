package br.com.devtech.repository;

import br.com.devtech.entity.SitesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISitesRepository extends JpaRepository<SitesEntity, Long> {

}
