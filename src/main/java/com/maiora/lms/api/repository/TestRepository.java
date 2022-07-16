package com.maiora.lms.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.maiora.lms.api.model.ReadTest;
@Repository
public interface TestRepository extends JpaRepository<ReadTest, Long>{

	@Query(value = "select * from readtest where lessonid = :id", nativeQuery = true)
	ReadTest getTestByLessonId(@Param("id") int id);

	@Query(value = "select * from readtest where `index` = :lessonid and lessonid = :id", nativeQuery = true)
	ReadTest getTestByLessonandTestId(int id, int lessonid);

}
