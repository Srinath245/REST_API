package com.Back_end.REST_API.SERVICE;

import com.Back_end.REST_API.CRUD_OPERATIONS.CRUD_REP;
import com.Back_end.REST_API.TABLE_ENTITY.STUDENT_DETAILS;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class STUDENT_DETAILS_SERVICE {

    @Autowired
    CRUD_REP crud_rep;

    public STUDENT_DETAILS add_DETAILS(STUDENT_DETAILS name)
    {
        return crud_rep.save(name);
    }

    public STUDENT_DETAILS Read_data(Integer id)
    {
       return crud_rep.findById(id).orElse(null);
    }

    public String delete_user(Integer id)
    {
        crud_rep.deleteById(id);

        return " Number " + id + " USER ID DELETED";
    }

    public List<STUDENT_DETAILS> all_user()
    {
        return crud_rep.findAll();
    }

    public STUDENT_DETAILS updated_values(Integer id ,STUDENT_DETAILS name)
    {
        name.setROLL_NO(id);

        /*Optional<STUDENT_DETAILS> opt = crud_rep.findById(id);

        if(!opt.isPresent())
        {
            throw new EntityNotFoundException("STUDENT DETAIL IS NOT FOUND");
        }

        STUDENT_DETAILS new_details = opt.get();

        if(name.getSTUDENT_NAME() == null)
        {
            name.setSTUDENT_NAME(new_details.getSTUDENT_NAME());
        }

        if(name.)*/

        return crud_rep.save(name);
    }


}
