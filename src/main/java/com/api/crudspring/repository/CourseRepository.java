package com.api.crudspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.crudspring.model.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {

}
