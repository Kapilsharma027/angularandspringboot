package pacakge.project.topic;
import java.lang.reflect.Method;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
 // reset controller here convert it in json by itself. 
 @RestController
public class TopicContoller {
	 //auto wired is used to inject the service
	 @Autowired
	 private TopicServce TopicServce;
	 
	@RequestMapping("/topics")
    public List<Topic> getTopics() {
		return TopicServce.getAllTopics();
	}
	/*
	
	@RequestMapping("/topics/{foo}")
	public Topic getTopicById(@PathVariable("foo") String id) {
		return TopicServce.getTopicById(id);
	}
	OR
	below
	*/
	@RequestMapping("/topics/{id}")
	public Topic getTopicById(@PathVariable String id) {
		return TopicServce.getTopicById(id);
		
	}
	
/*	Post request
 * Default Method is Get so we don't need to specify in case of get request.
 * For Post type we have to define ,like at value "/topic" it has Request of post.
 * @RequestBody defines the to type of object in body will accept. 
*/	
	@RequestMapping(method = RequestMethod.POST, value = "/topics")
	public void addTopic(@RequestBody Topic topic) {
		TopicServce.addTopic(topic);
	}
/*
 * For put we have to use both topic and id on which put
*/
	@RequestMapping(method = RequestMethod.PUT, value = "/topics/{id}")
	public void upDateTopic(@RequestBody Topic topic, @PathVariable String id) {
		TopicServce.updateTopic(topic, id);
	}
	/*
	 * For Delete have to use id on which we will delete
	*/
		@RequestMapping(method = RequestMethod.DELETE, value = "/topics/{id}")
		public void deleteTopic(@PathVariable String id) {
			TopicServce.delete(id);
		}
 }
