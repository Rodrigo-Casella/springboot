package com.springbootdemo.topic;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TopicRepository extends JpaRepository<Topic, String> {
    
}
