/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.periferiait.integracion;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/**
 *
 * @author jaime
 */
public class AritmeticaTest {
    
    public AritmeticaTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }
    @Tag("test")
    @Test
    public void suma() {
        System.err.println("test suma");
        Aritmetica aritmetica=new Aritmetica();
        assert(aritmetica.suma(1, 1)==2);
    }
    
    @Tag("test")
      @Test
    public void multiplicacion() {
        System.err.println("test multiplicacion");
        Aritmetica aritmetica=new Aritmetica();
        assert(aritmetica.multiplicacion(1, 1)==1);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
