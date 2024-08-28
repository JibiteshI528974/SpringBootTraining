package com.example.tryoutown.Controller;

import com.example.tryoutown.Components.Person;
import com.example.tryoutown.Services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/personapi")
public class PersonController {

    @Autowired
    PersonService personService;

    @GetMapping
    public List<Person> getPeronsService(){
        return personService.getPersons();
    }

    @GetMapping("/{id}")
    public Person getPersonService(@PathVariable int id)
    {
        Person person = personService.getPerson(id);

        return person;
    }

    @PostMapping
    public void addPersonService(@RequestBody Person person)
    {
        personService.addPerson(person);
    }


}
