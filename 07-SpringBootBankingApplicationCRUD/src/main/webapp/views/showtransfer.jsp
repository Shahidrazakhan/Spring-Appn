
  <%@ page contentType="text/html;charset=UTF-8" language="java" %>
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

  <center>
    <body bgcolor="blueviolet">
      
  <a href="/">Home</a>&nbsp;&nbsp;&nbsp;&nbsp;
  <a href="/newAccount">New Account</a>&nbsp;&nbsp;&nbsp;
  <a href="/balance">Balance</a>&nbsp;&nbsp;&nbsp;
  <a href="/deposite">Deposite</a>&nbsp;&nbsp;&nbsp;
  <a href="/withdraw">Withdraw</a>&nbsp;&nbsp;&nbsp;
  <a href="/transfer">Transfer</a>&nbsp;&nbsp;&nbsp;
  <a href="/closeAC">Close/A.C.</a>&nbsp;&nbsp;&nbsp;
  <a href="about">About US</a><br><br>

  <h1 style="color:chocolate">Account Info</h1>

  <h2>My Account Number Is:${transfer.accountNumber}</h2>
<h2>My Account Balance Is:${transfer.balance}</h2>
<h2>Transfer Amount Is:${transfer.tamount}</h2>

<h2>Target Account Number Is:${transfer.tar_account}</h2>
<h2>Target Account Balance Is:${transfer.prevBalance}</h2>
<h2>After Transfer Target Account Balance Is:${transfer.currentBalance}</h2>
</body>



</center>