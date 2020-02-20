package pacakge.project.topic;

import org.springframework.beans.BeanUtils;


public class TopicMapper {
 public static Topic toEntity(TopicDto topicDto) {
	 Topic topic = new Topic();
	 BeanUtils.copyProperties(topicDto, topic);
	 return topic;
 }
}
