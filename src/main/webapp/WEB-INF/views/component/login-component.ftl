
   <table class="login">
   <link rel="stylesheet" type="text/css" href="resources/css/main.css">
   <tr>
      <td><label>Log in</label>
         <form name="login" action="login" method="post">
                <table class="login2">
                      <tr>
                     <td>User name:</td>
                     <td colspan="2"><input id ="user" type="text" name="username" autocomplete="off"/></td>
                  </tr>
                  <tr>
                     <td>Password:</td>
                     <td colspan="2"><input id="passw" type="password" name="password" autocomplete="off"/> </td>
                  </tr>
                  <tr>
                     <td>
                        <input id="login" class="yui3-button add-contact-button" type="submit" value="Log in" />
                     </td>
                  </tr>
                  <#--<tr>
                        <td>
                           <FORM METHOD="LINK" ACTION="register">
                        <INPUT TYPE="submit" VALUE="Register">
                        </FORM>
                     </td>
                  </tr>-->
                  <li><a href="register">Register</a></li>
               </table>
            </form>
         </td>
      </tr>
</table>
<table>


<script type="text/javascript">
window.onbeforeunload=function(){
   var ta=document.getElementById("passw");
   var ta2=document.getElementById("user");
   if (ta.value != "")
   {
      return "Are you sure you wanna leave?"
   }
   
   if(ta2.value !="")
   { 
      return "Are you sure you wanna leave?"
   }
}
</script>
</table>