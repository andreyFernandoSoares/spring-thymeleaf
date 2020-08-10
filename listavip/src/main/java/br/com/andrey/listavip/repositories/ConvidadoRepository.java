package br.com.andrey.listavip.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.andrey.listavip.models.Convidado;

@Repository
public interface ConvidadoRepository extends CrudRepository<Convidado, Long> {
	
}
