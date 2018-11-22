package br.com.pet2love.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.pet2love.model.EspecieAnimal;
import br.com.pet2love.model.Pet;
import br.com.pet2love.model.Raca;
import br.com.pet2love.model.RacaGato;
import br.com.pet2love.model.SexoAnimal;
import br.com.pet2love.repository.PetsRepository;

@Controller
//@RequestMapping("/pets")
public class PetController {

	@Autowired
	private PetsRepository pets;
	
	@GetMapping("/")
	public String home() {
		return "redirect:/novo";
	}
	
	@GetMapping("/novo")
	public ModelAndView novo(Pet pet) {
		ModelAndView modelAndView = new ModelAndView("pets/cadastro-pet");
		
		modelAndView.addObject(pet);
		modelAndView.addObject("especie", EspecieAnimal.values());
		modelAndView.addObject("sexo", SexoAnimal.values());
		
		return modelAndView ;
	}
	

	/*@GetMapping("/{id}")
	public ModelAndView editar(@PathVariable Long id) {
		return novo(pets.findOne(id)); 
	}*/
	
	@PostMapping("/novo")
	public ModelAndView salvar(@Valid Pet pet, BindingResult result, RedirectAttributes attributes) {
		if(result.hasErrors()) {
			return novo(pet);
		}
		
		pets.save(pet);
		
		attributes.addFlashAttribute("mensagem", "Pet salvo com sucesso!");
		
		return new ModelAndView("redirect:/novo");
	}
	
	@ModelAttribute("sexo")
	public SexoAnimal[] getSexoAnimal(){
		return SexoAnimal.values();
		
	}
	
	@ModelAttribute("especie")
	public EspecieAnimal[] getEspcieAnimal() {
		return EspecieAnimal.values();
	}
	
	@ModelAttribute("racas")
	public Raca[] getRaca() {
		return Raca.values();
	}
	
	@ModelAttribute("racasGato")
	public RacaGato[] getRacaGato() {
		return RacaGato.values();
	}
	
	public void funcao(String especie) {
		System.out.println(especie);
	}
	
	/*@GetMapping
	public ModelAndView listarPets() {
		ModelAndView modelAndView =  new ModelAndView("pets/lista-pets");
		modelAndView.addObject("pets", pets.findAll());
		return modelAndView;
	}
	
	@DeleteMapping("/{id}")
	public String remover(@PathVariable Long id, RedirectAttributes attributes) {
		pets.delete(id);
		
		attributes.addFlashAttribute("mensagem", "Pet removido com sucesso!");
		
		return "redirect:/pets";
		
	}*/
}
