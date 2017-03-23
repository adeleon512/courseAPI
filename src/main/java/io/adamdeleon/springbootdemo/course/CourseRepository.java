package io.adamdeleon.springbootdemo.course;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Adam on 2/21/2017.
 */
public interface CourseRepository extends CrudRepository<Course, String> {

    public List<Course> findByTopicId(String topicId);
}
