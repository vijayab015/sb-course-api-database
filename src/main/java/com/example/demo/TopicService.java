package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {

	@Autowired
	private TopicRepository topicrep;
	

	public List<Topic> getAllTopics() {
		List<Topic> topics = new ArrayList<Topic>();
		topicrep.findAll().forEach(topics::add);
		return topics;

	}

	public Topic getTopic(String id) {
		return topicrep.findOne(id);
	}

	public void addTopic(Topic topic) {
		

		topicrep.save(topic);
		
	}

	public void updateTopi(String id, Topic topic) {
		topicrep.save(topic);

	}

	public void deletTopic(String id) {
		topicrep.delete(id);
	}

}
