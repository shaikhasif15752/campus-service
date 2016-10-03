package org.campus.web;

import org.campus.domain.Teacher;
import org.campus.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Asif on 10/1/2016.
 */

@RestController
@RequestMapping("/api/teacher")
public class TeacherController {

    @Autowired
    private TeacherRepository teacherRepository;
    /*
    URL:http://localhost:9988/api/teacher
    Payload : {	"name":"Asif",	"slot":21}
    */
    @RequestMapping(value = "",method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.CREATED)
    //List<Teacher> create(@RequestBody List<Teacher> teacher) { return (List<Teacher>)teacherRepository.save(teacher)
    public Teacher create(@RequestBody Teacher teacher) {
        checkNotNull(teacher.getName(), "Name");
        // checkNotNull(teacher.getSlot(), "Slot");
        return teacherRepository.save(teacher);
    }

    private void checkNotNull(String name, String name1) {
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    @ResponseBody public List<Teacher> find(){
        List<Teacher> teacher = (List<Teacher>) teacherRepository.findAll();
        return teacher;
    }

}


