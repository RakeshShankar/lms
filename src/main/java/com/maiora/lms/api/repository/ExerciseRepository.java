package com.maiora.lms.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.maiora.lms.api.model.ExcercisesWrite;
import com.maiora.lms.api.model.WriteLessonOne;

@Repository
public interface ExerciseRepository extends JpaRepository<ExcercisesWrite, Integer> {

	@Query(value = "Select ex.* from writelessonone Le inner join excerciseswrite ex on (Le.index=ex.ielw_fk) where Le.index = ?1 and ex.id= ?2", nativeQuery = true)
	List<WriteLessonOne> getExcerciseByLessonIdandExcerciseId(int introid, int id);

	@Query(value = "select * from excerciseswrite where id=:excerciseid and ielw_fk=:lessonid", nativeQuery = true)
	ExcercisesWrite getWritingExercisebylessonidandexerciseid(int lessonid, int excerciseid);

}
