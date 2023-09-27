package mx.com.angeldev.marveljar.app;

import mx.com.angeldev.marveljar.model.CharacterDataWrapper;

public interface MarvelJarService {
	
	CharacterDataWrapper getAllCharacters() throws Exception;
	
	
	CharacterDataWrapper getCharacterById(Long id) throws Exception;

}
