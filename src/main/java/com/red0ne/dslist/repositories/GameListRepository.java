package com.red0ne.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.red0ne.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
