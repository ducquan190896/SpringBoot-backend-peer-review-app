package com.quan.coursepeerreview.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.quan.coursepeerreview.Entity.Course;

@Repository
public interface CourseRepos extends JpaRepository<Course, Long> {
    
}