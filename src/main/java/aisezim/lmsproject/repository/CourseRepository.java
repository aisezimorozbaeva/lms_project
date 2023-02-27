package aisezim.lmsproject.repository;

import aisezim.lmsproject.model.Course;
import aisezim.lmsproject.model.Group;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
Optional<Group> getGroupsByCourse(Long courseId);
}