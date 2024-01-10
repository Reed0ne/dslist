package com.red0ne.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.red0ne.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {
	
}
