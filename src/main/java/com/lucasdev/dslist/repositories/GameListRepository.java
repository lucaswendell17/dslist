package com.lucasdev.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucasdev.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
