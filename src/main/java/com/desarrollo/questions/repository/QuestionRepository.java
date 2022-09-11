package com.desarrollo.questions.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.desarrollo.questions.models.Questions;


@Repository
@Transactional
public interface QuestionRepository extends CrudRepository<Questions, Long>{

    @Query(value = "SELECT * FROM `tbl_questions` WHERE categoria = :idCategoria", nativeQuery = true)
    Iterable<Questions> findByCategoria(@Param("idCategoria") Long Id);

}
