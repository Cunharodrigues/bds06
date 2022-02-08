package com.devsuperior.movieflix.reposritories;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.devsuperior.movieflix.entities.Genre;
import com.devsuperior.movieflix.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long>{

	@Query("SELECT obj FROM Movie obj WHERE :genre IS NOT NULL OR obj.genre = ORDER BY obj.title")
	Page<Movie> findByGenre(Genre genre, org.springframework.data.domain.Pageable pageable);
	
	@Query("SELECT obj FROM Movie obj JOIN FETCH obj.genre WHERE obj IN : movies")
	List<Movie> findMoviesAndGenres(List<Movie> movies);
}
