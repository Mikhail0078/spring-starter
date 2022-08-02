package com.dmdev.spring.database.repository;

import java.util.Optional;

public interface CrudRepository <K, E>{

    void delete(E entity);

    Optional<E> findById(K id);

}
