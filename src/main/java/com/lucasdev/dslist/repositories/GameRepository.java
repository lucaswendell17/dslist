package com.lucasdev.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucasdev.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
