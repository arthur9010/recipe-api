package br.com.arthur.recipeapi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import br.com.arthur.recipeapi.model.Recipe;
import br.com.arthur.recipeapi.repository.RecipeRepository;
import lombok.RequiredArgsConstructor;

@Service
public class RecipeService {
    private final RecipeRepository recipeRepository;
    
    public RecipeService(RecipeRepository recipeRepository) {
    	this.recipeRepository = recipeRepository;
    }

    public List<Recipe> findAll() {
        return recipeRepository.findAll();
    }

    public Optional<Recipe> findById(Long id) {
        return recipeRepository.findById(id);
    }

    public Recipe save(Recipe recipe) {
        return recipeRepository.saveAndFlush(recipe);
    }

    public void deleteById(Long id) {
        recipeRepository.deleteById(id);
    }
}