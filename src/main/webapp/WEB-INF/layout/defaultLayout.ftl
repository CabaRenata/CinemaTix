
<#macro loginLayout title="Login">
  <html>
	<table>
		<#--<#include "/views/component/login-component.ftl"/>-->
          <td>
            <#nested/>
          </td>
	</table>	

  </html>
</#macro>

<#macro mainLayout title="Freemarker example">
  <html>
	<script src="http://yui.yahooapis.com/2.6.0/build/utilities/utilities.js"></script>
	<script src="http://yui.yahooapis.com/2.6.0/build/calendar/calendar-min.js"></script>
	<script src="http://yuiblog.com/sandbox/yui/3.3.0pr3/build/charts/charts-min.js"></script>
	<script src="http://yuiblog.com/sandbox/yui/3.3.0pr3/build/yui/yui-min.js"></script>
	<link rel="stylesheet" type="text/css" href="http://yui.yahooapis.com/2.6.0/build/assets/skins/sam/skin.css">
	<link rel="stylesheet" type="text/css" href="http://yui.yahooapis.com/3.8.1/build/cssgrids/grids-min.css">
	<link rel="stylesheet" type="text/css" href="http://yui.yahooapis.com/3.8.1/build/cssbutton/cssbutton.css">
	<link rel="stylesheet" type="text/css" href="resources/css/main.css">





    <body class="yui-skin-sam">
      <table border="1" cellspacing="0" cellpadding="0" style="width:100%;height:100%">
        <tr>
          <td colspan="2" height=130>
            <#include "header.ftl"/>
          </td>
        </tr>
        <tr>
          <td>
            <#include "menu.ftl"/>
          </td>
          <td VALIGN = TOP width = 1400 height = 600 >
            <#nested/>
          </td>
        </tr>
        <tr>
          <td colspan="2" height = 130>
            <#include "footer.ftl"/>
          </td>
        </tr>
      </table>
    </body>

  </html>
</#macro>
