package com.devsuperior.movieflix.reposritories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.movieflix.entities.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

}
