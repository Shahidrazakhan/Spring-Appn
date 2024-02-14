<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<center>
<body bgcolor="aqua">
<h1 style="color: brown"> Customre Details</h1>


<a href="/">Home</a>&nbsp;&nbsp;&nbsp;&nbsp;
<a href="/newAccount">New Account</a>&nbsp;&nbsp;&nbsp;
<a href="/balance">Balance</a>&nbsp;&nbsp;&nbsp;
<a href="/deposite">Deposite</a>&nbsp;&nbsp;&nbsp;
<a href="/withdraw">Withdraw</a>&nbsp;&nbsp;&nbsp;
<a href="/transfer">Transfer</a>&nbsp;&nbsp;&nbsp;
<a href="/closeAC">Close/A.C.</a>&nbsp;&nbsp;&nbsp;
<a href="about">About US</a><br><br>

<h2>Welcome${data.name}</h2>

<table border="2">
<tr>
 <th>Account No.</th>
 <th>UserName</th>
 <th>Amount</th>
 <th>Address</th>
 <th>Phone</th>
</tr>

<tr>
 <td>${data.accountNumber}</td>
<td>${data.name}</td>
<td>${data.amount}</td>
<td>${data.address}</td>
<td>${data.mobileNumber}</td>
</tr>


</table>

</body>

</center>