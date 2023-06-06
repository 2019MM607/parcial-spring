package com.example.ecommerce.dao;

import java.util.List;

import org.springframework.boot.autoconfigure.web.ServerProperties.Reactive.Session;
import org.springframework.data.jpa.provider.HibernateUtils;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.ecommerce.models.OrderDetails;

import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;

public interface OrderDetailsDao extends CrudRepository<OrderDetails, Long> {

    @Query("SELECT od FROM OrderDetails od WHERE od.order.id = ?1")
    public List<OrderDetails> findByOrder(Long id);
}
