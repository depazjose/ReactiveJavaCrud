package co.com.midesatech.reactive.web;

import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/employee")
@RequiredArgsConstructor
public class EmployeeService {

    @CrossOrigin
    @GetMapping(produces = MediaType.TEXT_PLAIN_VALUE)
    public String getEmployee(){
        return "{hola:hola}";
    }

}
