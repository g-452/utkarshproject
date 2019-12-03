<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="showdetails">
<h1>sell my bike</h1>
<table boder="1"> 
<tr>
Owner name:<input type="text" name="nm">
Bike NAME:<select name="select">
<option>activa</option>
<option>jupitor</option>
<option>bajaj scooter</option>
</select>
Color:<select name="color">
<option>select color</option>
<option>red</option>
<option>black</option>
<option>green</option>
<option>silver</option>
</select>

date of purchase<input type="date" name="date">
description<input type="text name="desc">
selling cost:<input type="text" name="scost">
Negotiable<input type="checkbox" name="chk">
<input type="submit" value="submit" name="submit">
</tr>
</table>
</form>
</body>
</html>