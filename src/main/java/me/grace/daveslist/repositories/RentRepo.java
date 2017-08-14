package me.grace.daveslist.repositories;

import me.grace.daveslist.models.Rent;
import org.springframework.data.repository.CrudRepository;

public interface RentRepo extends CrudRepository<Rent,Long> {

    Iterable<Rent> findAllByIsRented(String partialString);
}
