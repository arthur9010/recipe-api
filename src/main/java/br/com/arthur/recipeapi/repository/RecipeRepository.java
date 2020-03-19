package br.com.arthur.recipeapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.arthur.recipeapi.model.Recipe;

public interface RecipeRepository extends JpaRepository<Recipe, Long> {}
