<%-- 
    Document   : index
    Created on : 2 Sep 2020, 23:17:22
    Author     : UI600212
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Simple JSP Page</title>
        <style>
            form {
                border: 3px solid #f1f1f1;
            }
            input[type=text], input[type=password] {
                width: 100%;
                padding: 12px 20px;
                margin: 8px 0;
                display: inline-block;
                border: 1px solid #ccc;
                box-sizing: border-box;
            }
            button {
                background-color: blue;
                color: white;
                padding: 14px 20px;
                margin: 8px 0;
                border: none;
                cursor: pointer;
                width: 100%;
            }
            button:hover {
                opacity: 0.8;
            }
            .container {
                padding: 16px;
            }
            span.psw {
                float: right;
                padding-top: 16px;
            }
            /* Change styles for span and cancel button on extra small screens */
            @media screen and (max-width: 300px) {
                span.psw {
                   display: block;
                   float: none;
                }
            }
        </style>
    </head>
    <body>
        <h1>Hello!</h1>
        
          <form action="Welcome" method="post">
              <div class="container">

                <label><b>First Name</b></label>
                <input type="text" placeholder="Enter First Name" name="firstname" required>

                <label><b>Last Name</b></label>
                <input type="text" placeholder="Enter Lastt Name" name="lastname" required>

                <button type="submit">Click</button>
              </div>
          </form>
    </body>
</html>
