<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html lang="en">
<head>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6"
	crossorigin="anonymous">
<title>User Registration Application</title>
</head>
<body>
	<div class="cover-container d-flex w-100 h-100 p-3 mx-auto flex-column">
		<header class="mb-auto">
		<div>
			<h3 class="float-md-start mb-0">URA</h3>
			<nav class="nav nav-masthead justify-content-center float-md-end">
			<a class="nav-link active" aria-current="page" href="#">Home</a> <a
				class="nav-link" href="/user/list">Users</a> </nav>
		</div>
		</header>

		<main class="px-3">
		<h1>User Registration Application</h1>
		<p class="lead">
			URA is a simple Spring Boot application to register users in a
			Relational Database. <br>URA uses MySQL, Hibernate and JSP. It
			also accomplishes basic CRUD operations.
		</p>
		<p class="lead">
			<a href="/user/list"
				class="btn btn-lg btn-secondary fw-bold border-white">Access App</a>
		</p>
		</main>

		<footer class="mt-auto">
		<p>
			Cover template for <a href="https://getbootstrap.com/"
				class="text-blue">Bootstrap</a>, by <a
				href="https://twitter.com/mdo" class="text-blue">@mdo</a>.
		</p>
		</footer>
	</div>
</body>
</html>