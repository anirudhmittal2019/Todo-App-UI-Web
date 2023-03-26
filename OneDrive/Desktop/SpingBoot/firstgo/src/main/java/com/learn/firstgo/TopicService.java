package com.learn.firstgo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
    @Autowired
    private TopicRepositry topicRepositry;
    public List<Topic> getAllTopics() {
        List<Topic> topics = new ArrayList<>();
        topicRepositry.findAll().forEach(topics::add);
        return topics;
    }
    public Topic getTopic(String id) {
        return topicRepositry.findById(id).get();
    }
    public void addTopic(Topic topic) {
        topicRepositry.save(topic);
    }
    public void updateTopic(String id, Topic topic) {
        topicRepositry.save(topic);
    }
    public void deleteTopic(String id) {
        topicRepositry.deleteById(id);
    }
}
