package com.maiora.lms.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.maiora.lms.api.model.SpeakTestIntro;

@Repository
public interface SpeakingTestRepository extends JpaRepository<SpeakTestIntro, Integer> {

	@Query(value = "select * from speaktestintro where id=:testid and lessonid=:lessonid", nativeQuery = true)
	SpeakTestIntro getSpeakingTestbylessonidandtestid(int lessonid, int testid);

}
