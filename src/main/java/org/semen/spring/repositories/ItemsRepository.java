package org.semen.spring.repositories;

import org.semen.spring.models.Item;
import org.semen.spring.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ItemsRepository extends JpaRepository<Item, Integer> {
    List<Item> findByItemName(String itemName);// поиск товаров по названию

    //person.getItem()
    List<Item> findByOwner(Person owner);//поиск товаров по владельцу
}
