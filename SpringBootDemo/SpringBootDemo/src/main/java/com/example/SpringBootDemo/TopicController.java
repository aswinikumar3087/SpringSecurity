package com.example.SpringBootDemo;

import com.example.SpringBootDemo.entity.Topic;
import com.example.SpringBootDemo.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class TopicController {

    @Autowired
    private TopicService topicService;

    @RequestMapping("/getAllTopics")
    public List<Topic> getAllTopics() {
        return topicService.getAllTopics();
    }

    @RequestMapping("/getTopic/{id}")
    public Topic getTopicById(@PathVariable String id){
        return topicService.getTopicByID(id);
    }

    @RequestMapping(method= RequestMethod.POST,value="/topics")
    public void addTopic(@RequestBody Topic topic){
        topicService.addTopic(topic);
    }

    @RequestMapping(method= RequestMethod.PUT,value="/topics/{id}")
    public void updateTopic(@RequestBody Topic topic,@PathVariable String id){
        topicService.updateTopic(id,topic);
    }

    @RequestMapping(method= RequestMethod.DELETE,value="/topics/{id}")
    public void deleteTopic(@RequestBody Topic topic,@PathVariable String id){
        topicService.deletTopic(id,topic);
    }

    @RequestMapping("/hello")
    public String sayHi() {
        return "Hi";
    }

}



