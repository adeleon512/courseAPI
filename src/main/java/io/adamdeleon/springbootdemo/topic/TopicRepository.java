package io.adamdeleon.springbootdemo.topic;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by Adam on 2/21/2017.
 */
public interface TopicRepository extends CrudRepository<Topic, String> {
}
