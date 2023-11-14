package com.gerenciapedidos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gerenciapedidos.entities.Pedidos;

public interface PedidosRepository extends JpaRepository<Pedidos, Long> {

}
