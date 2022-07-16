package com.maiora.lms.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.maiora.lms.api.model.WriteTestModel;
@Repository
public interface WriteTestRepository extends JpaRepository<WriteTestModel, Integer>{
	
	@Query(value = "select * from writetestmodel where id=:testid and lessonid=:lessonid",nativeQuery = true)
	WriteTestModel getWritingTestbylessonidandtestid(int lessonid, int testid);

}
