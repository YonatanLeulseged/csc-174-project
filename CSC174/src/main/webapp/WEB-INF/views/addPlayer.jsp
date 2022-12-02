<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>


<html>

   <%-- Create the head of the page --%>
   <head>
      <title>Add a Player</title>
   </head>


   <%-- Create the body of the page --%>
   <body>

      <%-- Alight the content to be at the center of the page --%>
      <div align="center">
         <table border="1" cellpadding="5">

            <tr>

               <%-- Create a caption at the head of the Table --%>
               <caption>
                  <h2>Player Table</h2>
               </caption>

            <tr>

               <%-- Create the labels for the columns of the Player Table --%>
               <th>User Name</th>
               <th>Legend name</th>

            </tr>

            <%-- Create a forEach loop to loop through all of the data in playerdata --%>
            <c:forEach var="item" items="${playerData.items}">

               <tr>
                  <td><c:out value="${item.playerName}"/></td>
                  <td><c:out value="${item.legendName}"/></td>
               </tr>

            </c:forEach>

            </tr>

         </table>
      </div>

      <%-- Add breaks between the two divs to have space between the Table and the Add Player --%>
      <br></br>
      <br></br>
      <br></br>

      <%-- Alight the content to be at the center of the page --%>
      <div align="center">
         <tr>

            <%-- Create a caption at the head of the Add a Player functionality --%>
            <caption>
               <h2>Add a Player</h2>
            </caption>

         <tr>

            <form:form method="POST" modelAttribute="player">
               <table>

                  <tr>
                     <%-- Create a label for the Player Name field --%>
                     <td>
                        <label>Player Name</label>
                     </td>

                     <%-- Create a input path for the Player Name field --%>
                     <td>
                        <form:input path="playerName"/>
                     </td>
                  </tr>

                  <tr>

                     <%-- Create a label for the Legend Name field --%>
                     <td>
                        <label>Legend Name</label>
                     </td>

                     <%-- Create a input path for the Legend Name field --%>
                     <td>
                        <form:input path="legendName"/>
                     </td>

                  </tr>

                  <%-- Create a submit button to be able to submit the data that was entered --%>
                  <tr>
                     <td><input type="submit" value="Submit"></td>
                  </tr>

               </table>
            </form:form>

      </div>
   </body>
</html>