package controller;



import java.io.IOException;



import javax.servlet.ServletException;

import javax.servlet.annotation.WebServlet;

import javax.servlet.http.HttpServlet;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;



import model.ProPojo;



@WebServlet("/ProController")

public class ProController extends HttpServlet{

@Override

protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


String pname = req.getParameter("pname");

String pprice = req.getParameter("pprice");


String i = req.getParameter("i");

String u = req.getParameter("u");

String d = req.getParameter("d");

String s = req.getParameter("s");


String flag = i+u+d+s;



ProPojo pojo = new ProPojo();

pojo.setPname(pname);

pojo.setPprice(pprice);


if (flag.equals("insertnullnullnull")) {

pojo.addProduct();

System.out.println(flag);

System.out.println("Inserted succesfully");

}

else if (flag.equals("nullupdatenullnull")) {

pojo.updateProduct();

System.out.println("updated successfully...");


}

else if (flag.equals("nullnulldeletenull")) {

pojo.deleteProduct();

}

else {

System.out.println(flag);

pojo.showproduct();

}

}

}