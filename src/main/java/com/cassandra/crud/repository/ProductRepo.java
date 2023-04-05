package com.cassandra.crud.repository;

import com.cassandra.crud.model.Product;
import org.springframework.data.cassandra.repository.CassandraRepository;

public interface ProductRepo extends CassandraRepository<Product,Integer> {
}
