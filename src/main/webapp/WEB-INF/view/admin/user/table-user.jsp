<%@ page contentType="text/html;charset=UTF-8" language="java" %> <%@taglib
prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> <%@ taglib prefix="form"
uri="http://www.springframework.org/tags/form"%>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Table List User</title>
    <link
      href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
      rel="stylesheet"
    />

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>

    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>

    <!-- <link rel="stylesheet" href="/css/demo.css" /> -->
  </head>
  <body>
    <div class="container mt-5">
      <div class="row">
        <div class="col-12 mx-auto">
          <div class="d-flex justify-content-between">
            <h3>Table Users</h3>
            <a href="/admin/user/create" class="btn btn-primary"
              >Create a newUser</a
            >
          </div>

          <hr />

          <table class="table table-bordered table-hover">
            <thead>
              <tr>
                <td>ID</td>
                <td>Email</td>
                <td>Full name</td>
                <td>Action</td>
              </tr>
            </thead>

            <tbody>
              <c:forEach var="user" items="${users}">
                <tr>
                  <td>${user.id}</td>
                  <td>${user.email}</td>
                  <td>${user.fullName}</td>
                  <td>
                    <a href="/admin/user/${user.id}" class="btn btn-success"
                      >View</a
                    >
                    <button class="btn btn-warning mx-2">Edit</button>
                    <button class="btn btn-danger mx-2">Delete</button>
                  </td>
                </tr>
              </c:forEach>
            </tbody>
          </table>
        </div>
      </div>
    </div>
  </body>
</html>
