package com.healthyapplication.healthyapplication.repository;

import com.healthyapplication.healthyapplication.domain.Diary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface DiaryRepository extends JpaRepository<Diary, Long> {

    @Query("select d from Diary d join fetch d.member m where m.id = :id")
    List<Diary> findAllById(@Param("id") String id);

}
