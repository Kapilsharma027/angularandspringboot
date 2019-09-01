package pacakge.project.author;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import pacakge.project.config.PageResponse;
@Service
public class AuthorService {

	@Autowired
	private AuthorRepository authorRepository;
	
	public  PageResponse getAllAuthors(PageDetailsDto pageDetailsDto){
		System.out.println("pagedetrails"+pageDetailsDto.getPagenumber() + pageDetailsDto.getPagesize());
			List<Author> authors = new ArrayList<>();
			authorRepository.findAll().forEach(authors :: add);
			
			return new PageResponse(HttpStatus.OK.value(), "OK", this.getPage(authors ,pageDetailsDto.getPagenumber(), pageDetailsDto.getPagesize()) , authors.size() );
		}

/**
 * returns a view (not a new list) of the sourceList for the 
 * range based on page and pageSize
 * @param sourceList
 * @param page, page number should start from 1
 * @param pageSize
 * @return
 */
public static <T> List<T> getPage(List<T> sourceList, int page, int pageSize) {
    if(pageSize <= 0 || page <= 0) {
        throw new IllegalArgumentException("invalid page size: " + pageSize);
    }

    int fromIndex = (page - 1) * pageSize;
    if(sourceList == null || sourceList.size() < fromIndex){
        return Collections.emptyList();
    }

    // toIndex exclusive
    return sourceList.subList(fromIndex, Math.min(fromIndex + pageSize, sourceList.size()));
}
}