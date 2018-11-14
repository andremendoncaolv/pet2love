package br.com.pet2love.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.pet2love.model.Pet;
import br.com.pet2love.repository.PetsRepository;
import br.com.pet2love.servicePet.PetService;

@Service("petService")
public class PetServiceImpl implements PetService{

	@Autowired
	private PetsRepository petsRepository;
	
	@Override
	public Pet findId(Long id) {
		return petsRepository.findOne(id);
	}

	@Override
	public void save(Pet pets) {
		petsRepository.save(pets);
	}

	@Override
	public void delete(Long id) {
		petsRepository.delete(id);
	}

	@Override
	public List<Pet> findAll() {
		return petsRepository.findAll();
	}
}
