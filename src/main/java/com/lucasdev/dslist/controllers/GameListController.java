package com.lucasdev.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lucasdev.dslist.dto.GameListDTO;
import com.lucasdev.dslist.dto.GameMinDTO;
import com.lucasdev.dslist.services.GameListService;
import com.lucasdev.dslist.services.GameService;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

	@Autowired
	private GameListService gameListService;
	@Autowired
	private GameService gameService;
	
	@GetMapping
	public List<GameListDTO> findAll(){
		return gameListService.findAll();
	}
	
	@GetMapping(value = "/{listId}/games")
	public List<GameMinDTO> findAll(@PathVariable Long listId){
		var results = gameService.findByList(listId);
		return results;
	}
}
