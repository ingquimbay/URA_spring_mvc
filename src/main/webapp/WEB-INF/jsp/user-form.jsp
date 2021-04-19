<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
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
			<a class="nav-link " aria-current="page" href="/">Home</a> <a
				class="nav-link active" href="/user/list">Users</a> </nav>
		</div>
		</header>

		<main class="px-3">
		<h1>Register User</h1>

		<form:form class="text-start" action="save" modelAttribute="user"
			method="post">
			<div class="mb-3">
				<form:hidden path="id" />
			</div>
			<div class="mb-3">
				<label class="form-label">First name</label>
				<form:input path="first_name" class="form-control" />
			</div>
			<div class="mb-3">
				<label class="form-label">Last Name</label>
				<form:input path="last_name" class="form-control" />
			</div>
			<div class="mb-3">
				<label class="form-label">Email</label>
				<form:input path="email" class="form-control" />
			</div>
			<div class="mb-3">
				<label class="form-label">Phone number</label>
				<form:input path="phone_number" class="form-control" />
			</div>
			<div class="mb-3">
				<form:hidden path="address.id" />
			</div>
			<div class="mb-3">
				<label class="form-label">Street</label>
				<form:input path="address.street" class="form-control" />
			</div>
			<div class="mb-3">
				<label class="form-label">City</label>
				<form:input path="address.city" class="form-control" />
			</div>
			<div class="mb-3">
				<label class="form-label">State</label>
				<form:input path="address.state" class="form-control" />
			</div>
			<div class="mb-3">
				<label class="form-label">Zip Code</label>
				<form:input path="address.zip_code" class="form-control" />
			</div>
			<button type="submit" class="btn btn-primary">Register</button>
			<a href="/user/list" class="btn btn-danger">Cancel</a>
		</form:form> </main>

		<footer class="mt-auto text-white-50"></footer>
</body>
</html>