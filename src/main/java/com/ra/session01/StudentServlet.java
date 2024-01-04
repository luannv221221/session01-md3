package com.ra.session01;

import com.ra.session01.model.Student;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "StudentServlet",value = "/student")
public class StudentServlet extends HttpServlet {
    private  List<Student> students = new ArrayList<>();

    @Override
    public void init() throws ServletException {
        // khoi tao List<Student>
        students.add(new Student("B01","Nguyễn Văn A",19,true));
        students.add(new Student("B02","Nguyễn Thị B",20,false));
        students.add(new Student("B03","Nguyễn Văn D",20,true));
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("students",students);
        req.getRequestDispatcher("student.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        System.out.println("Đã nhận dữ liệu từ form method POST");
        req.setCharacterEncoding("UTF-8");
        // bước 1: lấy từ form
        String studentCode = req.getParameter("studentCode");
        String studentName = req.getParameter("studentName");
        int age = Integer.parseInt(req.getParameter("age"));
        boolean sex = Boolean.parseBoolean(req.getParameter("sex"));
        // đẩy vào list student
        Student student = new Student(studentCode,studentName,age,sex);
        students.add(student);
        doGet(req,resp);
    }
}
