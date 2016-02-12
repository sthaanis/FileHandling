/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.fileioapp;

import com.leapfrog.fileioapp.entity.Student;
import com.leapfrog.fileioapp.util.Handler;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 *
 * @author User
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            /**
             * Reading files
             */
            /*BufferedReader breader = new BufferedReader(new FileReader(new File("d:/appdata/sample.txt")));
             int i = 0;
             String line = "";
             while ((line = breader.readLine()) != null) {
             System.out.println(line);
             }
             
            //next method of reading files without using while loop . 
            breader.lines().forEach(l->{
            System.out.println(l);
            });
            breader.close();
            
            */
            
           
            /**
             * Writing on files
             */
            /*FileWriter writer = new FileWriter(new File("d:/appdata/students.csv"));
            Student std = new Student(1,"Anish","anishshrestha541@gmail.com","kathmandu","1234567",true);
            writer.write(std.toCSV());
            writer.close();*/ 
            
            List<Student> studentList = new ArrayList<Student>();
            StringBuilder builder = new StringBuilder();
            for (String line : Handler.readCSV("d:/appdata/students.csv")) {
                StringTokenizer token = new StringTokenizer(line,",");
                if(token.countTokens()>=6){
                    Student std = new Student();
                    std.setId(Integer.parseInt(token.nextToken()));
                    std.setName(token.nextToken());
                    std.setEmail(token.nextToken());
                    std.setAddress(token.nextToken());
                    std.setPhoneNo(token.nextToken());
                    std.setStatus(Boolean.parseBoolean(token.nextToken()));
                    studentList.add(std);
                } 
                else{
                    builder.append(line);
                }
            }
            studentList.forEach(s->{
                System.out.println(s.toString());
            });
            
            Handler.writeCSV("d:/appdata/brokenstudents.csv", builder.toString());
            
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
