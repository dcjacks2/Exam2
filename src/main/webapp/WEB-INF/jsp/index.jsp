<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<head>
    <title>Viruses List</title>
    <style>
        table {
            font-family: Arial , sans-serif;
            border-collapse: collapse;
            width: 100%;
        }

        td, th {
            border: 1px solid #dddddd;
            text-align: left;
            padding: 8px;
        }

        tr:nth-child(even) {
            background-color: #FF0000;
        }
    </style>
</head>
<body>

<h2>Top 5 Deadly Viruses</h2>

<table>
    <tr>
        <th>Name</th>
        <th>Description</th>
        <th>Symptoms</th>
        <th>Duration</th>
        <th>Mortality Rate</th>

    </tr>
    <c:forEach var = "listitem" items = "${viruslist}">
        <tr>
            <td>${listitem.name}</td>
            <td>${listitem.description}</td>
            <td>${listitem.symptoms}</td>
            <td>${listitem.duration}</td>
            <td>${listitem.mortalityrate}</td>

        </tr>
    </c:forEach>
</table>

</body>
</html>

</head>
