package com.maiora.lms.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.maiora.lms.api.model.ListenExercise;

@Repository
public interface ListenExerciseRepository extends JpaRepository<ListenExercise, Integer> {

	@Query(value = " select * from listenexercise where id = :excerciseid and lessonid = :lessonid", nativeQuery = true)
	ListenExercise getExercisebylessonidandexerciseid(int lessonid, int excerciseid);

}
