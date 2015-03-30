<div id="header">
        <h1>
            <a href="home"> Lab 5 - Servlets </a>
            
        </h1>
        
        <!--    User Info -->
        <div id="userinfo">
            <#if user??>
                Welcome, ${user}! <br />
                <a href="logout" > Logout</a>
            <#else>
                <a href="login">login </a>
            </#if>
        </div>
		</h1>
</div>