package mx.com.angeldev.marveljar.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import mx.com.angeldev.marveljar.component.MarvelJarClient;
import mx.com.angeldev.marveljar.model.CharacterDataWrapper;

@Service
public class MarvelJarServiceImpl implements MarvelJarService {
	
	@Autowired
	private MarvelJarClient jarClient;
	
	@Value("${endpoint.all.characters}")
	private String epAllCharacters;
	
	@Value("${endpoint.by.id}")
	private String epById;

	@Override
	public CharacterDataWrapper getAllCharacters() throws Exception {
		return jarClient.getCharacters(epAllCharacters, null);
	}

	@Override
	public CharacterDataWrapper getCharacterById(Long id) throws Exception {
		return jarClient.getCharacters(epById, id);
	}

}
