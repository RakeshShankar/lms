package com.maiora.lms.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.maiora.lms.api.model.WriteExerciseLesson;

@Repository
public interface WriteLessonExerciseRepository extends JpaRepository<WriteExerciseLesson, Integer>{
	
	
	@Query(value = "select * from writeexerciselesson where id =:excerciseid and lessonid = :lessonid", nativeQuery = true)
	WriteExerciseLesson getWriteExercisebylessonidandexerciseid(int lessonid, int excerciseid);

}
