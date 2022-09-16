package com.desarrollo.questions.repository;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.desarrollo.questions.models.Autor;



@Repository
@Transactional
public interface AutorRepository extends CrudRepository<Autor, Long>{

}
