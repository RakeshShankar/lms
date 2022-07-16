package com.maiora.lms.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.maiora.lms.api.model.ExerciseLesson;

@Repository
public interface ExerciseLessonRepository extends JpaRepository<ExerciseLesson, Integer> {

	@Query(value = "select * from exerciselesson where id = :excerciseid and lessonid = :lessonid", nativeQuery = true)
	ExerciseLesson getReadExercisebylessonidandexerciseid(int lessonid, int excerciseid);

}
