package model;



import java.sql.PreparedStatement;

import java.sql.ResultSet;

import java.sql.SQLException;



import connection.GetConnection;



public class ProPojo {



private String pname;

private String pprice;



@Override

public String toString() {

return "ProPojo [pname=" + pname + ", pprice=" + pprice + "]";

}



public String getPname() {

return pname;

}



public void setPname(String pname) {

this.pname = pname;

}



public String getPprice() {

return pprice;

}



public void setPprice(String pprice) {

this.pprice = pprice;

}



public void addProduct() {





try {

PreparedStatement preparedStatement = GetConnection.getConnection().prepareStatement("insert into product values(?,?)");

preparedStatement.setString(1, getPname());

preparedStatement.setString(2, getPprice());

preparedStatement.executeUpdate();

} catch (SQLException e) {

// TODO Auto-generated catch block

e.printStackTrace();

}


}



public void updateProduct() {

PreparedStatement preparedStatement = null;

try {

preparedStatement = connection.GetConnection.getConnection()

.prepareStatement("update product set pname=? where pprice=?");

} catch (SQLException e) {

// TODO Auto-generated catch block

e.printStackTrace();

}

try {

preparedStatement.setString(1, getPname());

} catch (SQLException e) {

// TODO Auto-generated catch block

e.printStackTrace();

}

try {

preparedStatement.setString(2, getPprice());

} catch (SQLException e) {

// TODO Auto-generated catch block

e.printStackTrace();

}

try {

preparedStatement.executeUpdate();

} catch (SQLException e) {

// TODO Auto-generated catch block

e.printStackTrace();

}



}



public void deleteProduct() {

PreparedStatement preparedStatement = null;

try {

preparedStatement = connection.GetConnection.getConnection()

.prepareStatement("delete from product where pname=?");

} catch (SQLException e) {

// TODO Auto-generated catch block

e.printStackTrace();

}

try {

preparedStatement.setString(1, getPname());

} catch (SQLException e) {

// TODO Auto-generated catch block

e.printStackTrace();

}

try {

preparedStatement.setString(2, getPprice());

} catch (SQLException e) {

// TODO Auto-generated catch block

e.printStackTrace();

}

try {

preparedStatement.executeUpdate();

} catch (SQLException e) {

// TODO Auto-generated catch block

e.printStackTrace();

}



}



public void showproduct() {

PreparedStatement preparedStatement = null;

try {

preparedStatement = connection.GetConnection.getConnection().prepareStatement("select * from product");

} catch (SQLException e) {

// TODO Auto-generated catch block

e.printStackTrace();

}

ResultSet resultSet = null;

try {

preparedStatement.setString(1, getPname());

} catch (SQLException e) {

// TODO Auto-generated catch block

e.printStackTrace();

}

try {

while (resultSet.next()) {

System.out.println(resultSet.getString(1));

System.out.println(resultSet.getString(2));

}

} catch (SQLException e) {

// TODO: handle exception

e.printStackTrace();

}



}



}