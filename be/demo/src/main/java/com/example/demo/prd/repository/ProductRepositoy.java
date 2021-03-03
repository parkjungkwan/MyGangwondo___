package com.example.demo.prd.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.mem.domain.Member;
import com.example.demo.prd.domain.Product;
interface IProductRepository{
	
}
public interface ProductRepositoy extends JpaRepository<Product, Integer>,
											IProductRepository{

}
