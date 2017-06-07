package HackerRank.Java.DataStructures.JavaSort;

import java.util.*;

/**
 * Created by kaima on 6/7/17.
 */
class Student{
    private int id;
    private String fname;
    private double cgpa;
    public Student(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }
    public int getId() {
        return id;
    }
    public String getFname() {
        return fname;
    }
    public double getCgpa() {
        return cgpa;
    }
}

//Complete the code
public class Solution
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        List<Student> studentList = new ArrayList<Student>();
        while(testCases>0){
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();

            Student st = new Student(id, fname, cgpa);
            studentList.add(st);

            testCases--;
        }

        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if(o1.getCgpa() == o2.getCgpa())
                {
                    if(o1.getFname().equals(o2.getFname()))
                        return o1.getId() - o2.getId(); //No real reason to sort by id in this particular problem, as only the first names are outputted.
                    return o1.getFname().compareTo(o2.getFname());
                }
                return (int)(o2.getCgpa() * 1000 - o1.getCgpa() * 1000);
            }
        });

        for(Student st: studentList){
            System.out.println(st.getFname());
        }
    }
}