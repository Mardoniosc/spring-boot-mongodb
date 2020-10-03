package br.com.mardonio.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.mardonio.domain.User;

@RestController
@RequestMapping("/users")
public class UserResource {

	@GetMapping
	public ResponseEntity<List<User>> findAll(){
		User mardonio = new User("1", "Mardonio Costa", "mardonio@live.com");
		User maria = new User("2", "Maria Costa", "maria@live.com");
		
		List<User> lista = new ArrayList<>();
		lista.addAll(Arrays.asList(mardonio, maria));
		return ResponseEntity.ok().body(lista);
	}
}
