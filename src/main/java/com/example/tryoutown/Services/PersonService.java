package com.example.tryoutown.Services;

import com.example.tryoutown.Components.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@Service
public class PersonService {


    final List<Person> persons = new ArrayList<>();



    public Person getPerson(int id)
    {
        for(int i = 0; i < persons.size();i++)
        {
            if(persons.get(i).getId() == id)
                return persons.get(i);
        }
        return null;
    }

    public void addPerson(Person person)
    {
        persons.add(person);
    }

    public List<Person> getPersons()
    {
        return persons;
    }

}
