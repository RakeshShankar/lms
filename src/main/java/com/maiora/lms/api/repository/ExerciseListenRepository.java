package com.maiora.lms.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.maiora.lms.api.model.ExcercisesListen;
@Repository
public interface ExerciseListenRepository extends JpaRepository<ExcercisesListen, Integer>{
	
	@Query(value = "select * from excerciseslisten where id=:excerciseid and el_fk=:lessonid",nativeQuery = true)
	ExcercisesListen getListeningExercisebylessonidandexerciseid(int lessonid, int excerciseid);
	
	

}
