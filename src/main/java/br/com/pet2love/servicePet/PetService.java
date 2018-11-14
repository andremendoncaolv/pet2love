package br.com.pet2love.servicePet;

import java.util.List;

import br.com.pet2love.model.Pet;

public interface PetService {
	public Pet findId(Long id);
	public void save (Pet pets);
	public void delete(Long id);
	public List<Pet> findAll();
}
