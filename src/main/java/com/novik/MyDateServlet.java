package com.novik;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.Arrays;
public class MyDateServlet  extends HttpServlet {


    @Override       //from client, to client
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        LocalDate currentDate = LocalDate.now();
        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();
        writer.println("<h1>Current date: " +" "+currentDate+ "</h1>");
        writer.println("<h1>Current day of the week: " +" "+currentDate.getDayOfWeek()+ "</h1>");
        writer.println("<h1>Current day of the year: " +" "+currentDate.getDayOfYear()+ "</h1>");
    }}



