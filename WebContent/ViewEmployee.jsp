<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %><!--   THIS HAS TO BE IN YOUR FILE -->
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">

<head>

    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Company Database Results</title>

    <!-- Bootstrap Core CSS -->
    <link rel="stylesheet" href="css/bootstrap.min.css" type="text/css">

    <!-- Custom Fonts -->
    <link href='http://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800' rel='stylesheet' type='text/css'>
    <link href='http://fonts.googleapis.com/css?family=Merriweather:400,300,300italic,400italic,700,700italic,900,900italic' rel='stylesheet' type='text/css'>
    <link rel="stylesheet" href="font-awesome/css/font-awesome.min.css" type="text/css">

    <!-- Plugin CSS -->
    <link rel="stylesheet" href="css/animate.min.css" type="text/css">

    <!-- Custom CSS -->
    <link rel="stylesheet" href="css/creative.css" type="text/css">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>

<body id="page-top">

    <nav id="mainNav" class="navbar navbar-default navbar-fixed-top">
        <div class="container-fluid">
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header">
                <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand page-scroll" href="index.html">Home</a>
            </div>

            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav navbar-right">
                
                   <li><a href="listAll.do">View All</a></li>
                    <li><a href="ViewEmployee.jsp">Search | Update | Delete</a></li>
					<li><a href="AddEmployee.jsp">Add Employee</a></li>                   
                    
                    
                </ul>
            </div>
            <!-- /.navbar-collapse -->
        </div>
        <!-- /.container-fluid -->
    </nav>

    <header>
        <div class="header-content">
            <div class="header-content-inner">
                <h1 style="color:white;">View Employee</h1>
             
    
            </div>
            
            	<div class="text-center">

			<form action="GetEmployeeById.do" method="POST">
				<div class="row">
				<div class="col-md-2 col-md-offset-5" >
				
					<br>	<br>	<br>
				
				<label for="id">Employee ID</label> 
			
				<input class="form-control" type="text" name="id" placeholder="Enter the employee id"> <br>
				<input class="btn btn-info" type="submit" value="Get Employee" />
			</div>
			</div>
			</form>
		</div>
		<br>

		<form class="" action="UpdateEmployee.do" method="POST">

<div class="col-md-2">
<label for="id">Employee ID</label> <input class="form-control" type="text" name="id" value="${employee.id}" readonly>
</div>
		
<div class="col-md-2">
<label for="firstname">First Name</label> <input class="form-control" type="text" name="firstname" value="${employee.firstname}">
</div>
				
<div class="col-md-2">
<label for="middlename">Middle Name</label> <input class="form-control" type="text" name="middlename" value="${employee.middlename}">
</div>
				
<div class="col-md-2">
<label for="lastname">Last Name</label> <input class="form-control" type="text" name="lastname" value="${employee.lastname}">
</div>
			
<div class="col-md-2">
<label for="gender">Gender</label> <input class="form-control" type="text" name="gender" value="${employee.gender}">
</div>

<div class="col-md-2">
<label for="salary">Salary</label> <input class="form-control" type="text" name="salary" value="${employee.salary}">
</div>
				
<div class="col-md-2">
<label for="department_id">Department ID</label> <input class="form-control" type="text" name="department_id" value="${employee.department_id}">
</div>

<div class="col-md-2">
<label for="job_id">Job ID</label> <input class="form-control" type="text" name="job_id" value="${employee.job_id}">
</div>

<address>
<div class="col-md-5">
<label for="address">Street</label> <input class="form-control" type="text" name="address" value="${employee.address}">
</div>
							
<div class="col-md-3">
<label for="city">City</label> <input class="form-control" type="text" name="city" value="${employee.city}">
</div>

<div class="col-md-2">
<label for="state">State</label> <input class="form-control" type="text" name="state" value="${employee.state}">
</div>

<div class="col-md-2">
<label for="zipcode">Zipcode</label> <input class="form-control" type="text" name="zipcode" value="${employee.zipcode}">
</div>
</address>

<div class="row"></div>				
			
<div class="text-center">
<input class="btn btn-success" type="submit" name="submit" value="Update Employee" />
</div>
</form>

<div class="row">


<form action="deleteEmployee.do" method="POST">
			<input class="btn btn-danger" type="submit" name="submit" value="Delete Employee" /> <br> <br>
			<input type="hidden" name="id" value="${employee.id}"><br>		
</form>
       
       </div> 
    </header>

	
    <!-- jQuery -->
    <script src="js/jquery.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="js/bootstrap.min.js"></script>

    <!-- Plugin JavaScript -->
    <script src="js/jquery.easing.min.js"></script>
    <script src="js/jquery.fittext.js"></script>
    <script src="js/wow.min.js"></script>

    <!-- Custom Theme JavaScript -->
    <script src="js/creative.js"></script>

</body>

</html>
