package pacakge.project.topic;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import pacakge.project.common.StringValidator;

//annotation used to declare it is a entity 
@Valid
public class TopicDto {
	// Id is used to define which key is primary.

	private String id;
	@NotNull(groups = { TopicDto.Existing.class })
	private String name;
	
	
	@StringValidator(groups = { TopicDto.Existing.class})
	private String description;

//	/**
//	 * The Interface Existing.
//	 */
	public interface Existing {
	}

	/**
	 * The Interface New.
	 */
	public interface New {

	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public TopicDto() {
	}

	public TopicDto(String id, String name, String description) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
	}

	// getters and setters
	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
