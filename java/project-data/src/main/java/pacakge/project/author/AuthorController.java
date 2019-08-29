package pacakge.project.author;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mysql.cj.Messages;

import pacakge.project.config.Response;


@RestController
public class AuthorController {
	
	@Autowired
	private AuthorService authorService;
	
	
	@RequestMapping("/authors")
    public Response getAuthors() {
		return new Response(HttpStatus.OK.value(), "OK", authorService.getAllAuthors());
	}
//	@RequestMapping("/authors")
//    public List<Author> getAuthorsByPagination() {
//		return authorService.getAllAuthors();
//	}
}
