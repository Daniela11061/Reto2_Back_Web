/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Reto2_Web.interfaces;


import Reto2_Web.modelo.Laptops;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author Daniela
 */
public interface InterfaceLaptops extends MongoRepository<Laptops, String> {
}
