package com.maiora.lms.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.maiora.lms.api.model.ListenTest;
@Repository
public interface ListenTestRepository extends JpaRepository<ListenTest, Integer>{

	@Query(value = "select * from listentest where id=:testid and lessonid=:lessonid", nativeQuery = true)
	ListenTest getListeningTestbylessonidandtestid(int lessonid, int testid);

}
