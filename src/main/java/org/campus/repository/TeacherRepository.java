package org.campus.repository;
import org.campus.domain.Teacher;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


/**
 * Created by Asif on 10/1/2016.
 */



public interface TeacherRepository extends CrudRepository<Teacher,Long> {
    List<Teacher> findAll();

}
