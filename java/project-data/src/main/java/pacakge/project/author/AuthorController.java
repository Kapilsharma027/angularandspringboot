package pacakge.project.author;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mysql.cj.Messages;

import pacakge.project.config.PageResponse;
import pacakge.project.config.Response;


@RestController
public class AuthorController {
	
	@Autowired
	private AuthorService authorService;
	
	 
	@RequestMapping(method = RequestMethod.POST, value = "/authors")
    public PageResponse getAuthors(@RequestBody PageDetailsDto pageDetailsDto) {
		return  authorService.getAllAuthors(pageDetailsDto);
	}
//	@RequestMapping("/authors")
//    public List<Author> getAuthorsByPagination() {
//		return authorService.getAllAuthors();
//	}
}
