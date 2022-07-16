package com.maiora.lms.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.maiora.lms.api.model.ExcercisesSpeak;

@Repository
public interface ExerciseSpeakingRepository extends JpaRepository<ExcercisesSpeak, Integer> {

	@Query(value = "select * from excercisesspeak where `index`=:excerciseid and iess_fk=:lessonid", nativeQuery = true)
	ExcercisesSpeak getSpeakingExercisebylessonidandexerciseid(int lessonid, int excerciseid);

}
