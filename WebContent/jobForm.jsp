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

    <title>Job Form</title>

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
                    <li>
                        <a class="page-scroll" href="#about">About</a>
                    </li>
                   
                    <li>
                        <a class="page-scroll" href="#contact">Contact</a>
                    </li>
                </ul>
            </div>
            <!-- /.navbar-collapse -->
        </div>
        <!-- /.container-fluid -->
    </nav>

    <header>
        <div class="header-content">
            <div class="header-content-inner">
                <h1 style="color:white;">Job Form</h1>
             <br><br><br><br><br><br>
             <form action=”updateJob.do” method=”post”>
			<%-- Employee ID: ${employee.id}  --%>
			
			
			Job ID: <input style="color:black;" name=”jobID” value=”${job.id}” /> <br><br>
		
		
			<%-- <select name=”department”>
				<c: forEach items=”${departments}” var=”dept”>
					<option value-“${dept.id}” label=”${dept.name}”
						<c:if test=”${employee.department_id}= dept.id”>selected</c:if>>${dept.name}</option>
				</c: forEach>
				
			</select> <input name=”jobId” value=”${employee.jobId}” /> <br />  --%>
			<input class="btn btn-primary btn-xl page-scroll" type="submit" name="job" value="Submit" />
			
		</form>
              <!--   <p style="color:grey;">Exercise freedom, pursue happiness, and make a lasting impact in the world.</p> -->

			<!-- <a href="#about" class="btn btn-primary btn-xl page-scroll">Search</a> -->
            </div>
        </div>
    </header>


		
		
  <!--   <section class="bg-primary" id="about">
        <div class="container">
            <div class="row">
                <div class="col-lg-8 col-lg-offset-2 text-center"> -->
                    
                <!--     <hr class="light"><br> -->
                   <!-- <h2 class="section-heading">Find information on your employees.</h2><br> -->

				
					<!-- <p class="text-faded">I am passionate about bringing disruptive web and mobile software to market. Interests include innovative service models in healthcare and finance that unlock capabilities in social, location-based interaction, cognitive computing, and Internet of Things.

Active blogger and burgeoning motivational speaker. 

My previous experience in developing the strategy and operating model for a mobile startup, executing project management operations for a large tech-implementation, and leading teams in the US Navy have fine-tuned my execution skills in complex, demanding, and uncertain environments. I seek to leverage these skills in my next start-up endeavor.</p>
           -->          
           		<!-- 	<hr class="light">  -->  <br><br> 
                  <!--   <a href="http://google.com" class="btn btn-default btn-xl">Pending Update</a>
                     <a href="http://google.com" class="btn btn-default btn-xl">Pending Update</a> -->
      <!--           </div>
            </div>
        </div>
    </section> -->

<!--     <aside class="bg-dark">
        <div class="container text-center">
            <div class="call-to-action">
                <h2>Pending Update</h2>
                <a href="#" class="btn btn-default btn-xl wow tada">pending update</a>
            </div>
        </div>
    </aside> -->

   <!--  <section id="contact">
        <div class="container">
            <div class="row">
                <div class="col-lg-8 col-lg-offset-2 text-center">
                    <h2 class="section-heading">Technical Support</h2>
                    <hr class="primary">
                    <p>Need Assistance? Send a message or call, and we will get back to you as soon as possible!</p>
                </div>
              <div class="col-lg-4 col-lg-offset-2 text-center">
                    <i class="fa fa-phone fa-3x wow bounceIn"></i>
                    <p>411-867-5309</p>
                </div>
                <div class="col-lg-4 text-center">
                    <i class="fa fa-envelope-o fa-3x wow bounceIn" data-wow-delay=".1s"></i>
                    <p><a href="mailto:your-email@your-domain.com">support@companydb.com</a></p>
                </div>
            </div>
        </div>
    </section> -->

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
