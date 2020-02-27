package com.example.SpringBootDemo.service;

import com.example.SpringBootDemo.entity.Topic;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    List<Topic> listOfTopics = new ArrayList<>(Arrays.asList(new Topic("Spring", "SpringBoot", "SpringBOOT desc"),
            new Topic("java", "Core Java", "Core java desc"),
            new Topic("Python", "Python Script", "Python desc")));

    public List<Topic> getAllTopics() {
        return listOfTopics;
    }

    public Topic getTopicByID(String Id){
        return listOfTopics.stream().filter(t->t.getId().equals(Id)).findFirst().get();
    }

    public void addTopic(Topic topic) {
        listOfTopics.add(topic);
    }

    public void updateTopic(String id, Topic topic) {
        for(int i=0;i<listOfTopics.size();i++){
            Topic t = listOfTopics.get(i);
            if(t.getId().equals(id)){
                listOfTopics.set(i,topic);
                return;
            }
        }
    }

    public void deletTopic(String id, Topic topic) {
        listOfTopics.removeIf(t->t.getId().equals(id));
    }
}
