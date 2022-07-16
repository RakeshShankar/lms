package com.maiora.lms.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.maiora.lms.api.model.LesExcercises;

@Repository
public interface ExerciseReadingRepository extends JpaRepository<LesExcercises, Integer> {
	
	@Query(value = "select * from lesexcercises where id=:excerciseid and iler_fk=:lessonid",nativeQuery = true)
	LesExcercises getExercisebyLessonidandExerciseid(int lessonid, int excerciseid);


}
