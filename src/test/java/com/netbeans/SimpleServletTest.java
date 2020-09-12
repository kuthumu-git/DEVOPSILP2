/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.netbeans;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import javax.servlet.ServletException;

/**
 *
 * @author UI600212
 */
public class SimpleServletTest {
    
    public SimpleServletTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Mock
    HttpServletRequest request;
 
    @Mock
    HttpServletResponse response;
    
    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testFullName() throws IOException, ServletException {
 
        when(request.getParameter("firstname")).thenReturn("Naveen");
        when(request.getParameter("lastname")).thenReturn("Kuthumu");
 
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
         
        when(response.getWriter()).thenReturn(pw);
 
        SimpleServlet myServlet =new SimpleServlet();
        myServlet.doPost(request, response);
        String result = sw.getBuffer().toString().trim();
        assertEquals(result, "<h4>Naveen Kuthumu</h4>");
 
    }
   
}
