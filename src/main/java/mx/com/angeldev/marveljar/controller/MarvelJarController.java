package mx.com.angeldev.marveljar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.com.angeldev.marveljar.app.MarvelJarService;
import mx.com.angeldev.marveljar.model.CharacterDataWrapper;

@RestController
@RequestMapping("/test/marvel/characters")
public class MarvelJarController {
	
	@Autowired
	private MarvelJarService marvelJarService;
	
	@GetMapping("/")
	public ResponseEntity<CharacterDataWrapper> getAllCharacters() {
		
		try {
            CharacterDataWrapper dw = marvelJarService.getAllCharacters();
            return ResponseEntity.ok(dw);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<CharacterDataWrapper> getCharacterById(@PathVariable Long id){
		try {
            CharacterDataWrapper dw = marvelJarService.getCharacterById(id);
            return ResponseEntity.ok(dw);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
	}

}
