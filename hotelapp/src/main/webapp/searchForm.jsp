<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Search Hotels</title>
<link rel="stylesheet" href="css/style.css" />
</head>
<body>
<h1>Search Hotels</h1>

<form action="hotels.do" method="get">
    <fieldset>
        <div class="span-8">
            <label for="searchString">Search String:</label>
            <input id="searchString" name="searchString"/>
         
        </div>
        <div class="span-6">
            <div>
                <label for="pageSize">Maximum results:</label>
                <select id="pageSize" name="pageSize" >
                    <option label="5" value="5"/>
                    <option label="10" value="10"/>
                    <option label="20" value="20"/>
                </select>
            </div>
        </div>
        <div class="span-3 last">
            <button type="submit">Find Hotels</button>
        </div>
    </fieldset>
</form>
</body>
</html>