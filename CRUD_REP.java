package com.Back_end.REST_API.CRUD_OPERATIONS;

import com.Back_end.REST_API.TABLE_ENTITY.STUDENT_DETAILS;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface CRUD_REP extends JpaRepository< STUDENT_DETAILS, Integer>
{

}


