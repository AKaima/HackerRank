package HackerRank.Java.DataStructures.JavaPriorityQueue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * Created by kaima on 6/7/17.
 */

class Student{
    private int token;
    private String fname;
    private double cgpa;
    public Student(int id, String fname, double cgpa) {
        super();
        this.token = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }
    public int getToken() {
        return token;
    }
    public String getFname() {
        return fname;
    }
    public double getCgpa() {
        return cgpa;
    }

    /*
    Can do this instead of having a Comparator in the PriorityQueue instantiation.
    Need to implement Comparable if you do this.

    @Override
    public int compareTo(Student s) {
        if(this.getCgpa() == s.getCgpa())
        {
            if(this.getFname().equals(s.getFname()))
                return this.getToken() - s.getToken(); //No real reason to sort by id in this particular problem, as only the first names are outputted.
            return this.getFname().compareTo(s.getFname());
        }
        return (int)(s.getCgpa() * 1000 - this.getCgpa() * 1000);
    }
     */
}

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int totalEvents = Integer.parseInt(scan.nextLine());
        PriorityQueue<Student> q = new PriorityQueue<>((
                Comparator.comparing(Student::getCgpa).reversed()
                        .thenComparing(Student::getFname)
                        .thenComparing(Student::getToken)));
        while(totalEvents > 0){
            String event = scan.next();

            if(event.equals("ENTER"))
            {
                String name = scan.next();
                double cgpa = scan.nextDouble();
                int token = scan.nextInt();
                Student student = new Student(token, name, cgpa);
                q.add(student);
            }
            else
            {
                q.poll();
            }

            totalEvents--;
        }
        if(q.isEmpty())
            System.out.println("EMPTY");
        else
        {
            while(!q.isEmpty())
                System.out.println(q.poll().getFname());
        }
    }
}
