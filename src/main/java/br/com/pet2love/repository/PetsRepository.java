package br.com.pet2love.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.pet2love.model.Pet;

@Repository("petRepository")
public interface PetsRepository extends JpaRepository<Pet, Long> {
	Pet findById(Long id);
}
