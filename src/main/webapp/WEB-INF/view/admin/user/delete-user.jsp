<%@ page contentType="text/html;charset=UTF-8" language="java" %> <%@taglib
prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> <%@ taglib prefix="form"
uri="http://www.springframework.org/tags/form"%>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Delete User</title>
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
        <div class="col-md-6 col-12 mx-auto">
          <h3>Delete a user with ${id}</h3>
          <hr />
          <div class="alert alert-danger" role="alert">
            Are you sure you want to delete this user?
          </div>
          <form:form
            action="/admin/user/delete/${id}"
            method="post"
            modelAttribute="deleteUser"
          >
            <div class="mb-3" style="display: none">
              <label class="form-label">Id:</label>
              <form:input type="text" class="form-control" path="id" />
            </div>
            <button class="btn btn-danger">Confirm</button>
          </form:form>
        </div>
      </div>
    </div>
  </body>
</html>
