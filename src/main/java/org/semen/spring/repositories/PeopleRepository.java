package org.semen.spring.repositories;

import org.semen.spring.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PeopleRepository extends JpaRepository<Person, Integer> {
    //сортировка по имени
    List<Person> findByName(String name);
    //сортировка одинаковых имен по возрасту
    List<Person> findByNameOrderByAge(String name);
    //сортировка по email
    List<Person> findByEmail(String email);
    //сортировка по первой букве имени
    List<Person> findByNameStartingWith(String startingWith);
    //сортировка по имени или email
    List<Person> findByNameOrEmail(String name, String email);
}
