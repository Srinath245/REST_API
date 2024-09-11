package com.Back_end.REST_API.CONTROLLER;

import com.Back_end.REST_API.CRUD_OPERATIONS.CRUD_REP;
import com.Back_end.REST_API.SERVICE.STUDENT_DETAILS_SERVICE;
import com.Back_end.REST_API.TABLE_ENTITY.STUDENT_DETAILS;
import com.Back_end.REST_API.TABLE_ENTITY.Student_Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class STUDENT_DETAILS_CONTROLLER
{
    @Autowired
    STUDENT_DETAILS_SERVICE studentDetailsService;
  //  Student_Address studentAddress;
   // CRUD_REP crud_rep;

    @PostMapping("/add")
    public STUDENT_DETAILS add_details(@RequestBody STUDENT_DETAILS name)
    {
        //return studentDetailsService.add_DETAILS(name);
        return studentDetailsService.add_DETAILS(name);
    }

    @GetMapping("/getdata/{id}")
    public STUDENT_DETAILS Read_user(@PathVariable Integer id)
    {
        return studentDetailsService.Read_data(id);
    }

    @DeleteMapping("/delete/{id}")
    public String details_user(@PathVariable Integer id)
    {
        return studentDetailsService.delete_user(id);

    }

    @GetMapping("/all_user")
    public List<STUDENT_DETAILS> All_user()
    {
        return studentDetailsService.all_user();
    }

    @PutMapping("/update/{id}")
    public STUDENT_DETAILS update_value(@PathVariable Integer id , @RequestBody STUDENT_DETAILS name)
    {
        return studentDetailsService.updated_values(id,name);
    }

}
