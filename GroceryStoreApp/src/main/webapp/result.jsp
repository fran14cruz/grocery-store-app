<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
    <body>
        <div style="text-align:center;">
            <h1>Available Products</h1>
            <%
                List result = (List) request.getAttribute("products");
                Iterator it = result.iterator();

                out.println("<br> Available now: <br><br>");
                while (it.hasNext()) {
                    out.println(it.next() + "<br>");
                }
            %>
        </div>
    </body>
</html>