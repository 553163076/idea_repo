package com.lmonkey.servlet.user;

import com.lmonkey.entity.LMONKEY_USER;
import com.lmonkey.service.LMONKEY_USERDao;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/manage/admin_douseradd")
public class DoUserAdd extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=utf-8");
        String username = request.getParameter("username");
        String name = request.getParameter("name");
        String passwd = request.getParameter("passwd");
//        String repasswd = request.getParameter("repasswd");
        String birthday = request.getParameter("birthday");
        String sex = request.getParameter("catid_sex");
        String email = request.getParameter("email");
        String address = request.getParameter("address");
        String phong = request.getParameter("phong");
//        创建用户实体
        LMONKEY_USER u = new LMONKEY_USER(name, username, passwd, sex, birthday, null, email, phong, address, 1);
//        加入到数据库的用户表
        int count = LMONKEY_USERDao.insert(u);
//        System.out.print(u);
//        成功或重定向到哪里
        if(count>0) {
            response.sendRedirect("admin_user.jsp");
        }else {
            PrintWriter out = response.getWriter();
            out.write("<script>");
            out.write("alert('用户添加失败')");
            out.write("location.href='manage/admin_useradd.jsp'");
            out.write("</script>");
        }

    }
}
