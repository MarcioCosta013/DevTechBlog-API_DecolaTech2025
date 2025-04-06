package br.com.devtech.repository;

import br.com.devtech.entity.ContribuidorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IContribuidorRepository extends JpaRepository<ContribuidorEntity, Long> {

}
