package com.maiora.lms.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.maiora.lms.api.model.WriteLessonOne;

@Repository
public interface LessonRepository extends JpaRepository<WriteLessonOne, Integer> {

	@Query(value = "Select Le.* from writelessonone Le inner join excerciseswrite ex on Le.index=ex.ielw_fk where ex.id = :id", nativeQuery = true)
	List<WriteLessonOne> getLessonsByExerciseId(@Param("id") int id);


}
