<table class = "datatable">
    <tr>
        <td>
            <label>Flower List</label></br>
              <table class="datatable" >
                <tr>
                    <th>Species</th>
                    <th>Nr</th>
                    <th>Price</th>
                </tr>
                <#list flowers as flower>
                    <tr>
                        <td>${flower.species}</td> 
                        <td>${flower.nr}</td>
                        <td>${flower.price}</td>
                    </tr>
                </#list>
              </table>
         </td>
    </tr>
</table>