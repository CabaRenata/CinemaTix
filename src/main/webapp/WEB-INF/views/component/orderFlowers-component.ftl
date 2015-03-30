<table class="updCar">
    <tr>
        <td><label>Place Order</label>
            <form name="flower" action="orderFlowers" method="post">
                    <table id="id" class="updateFlowers">
                           <tr>
                            <td>Species:</td>
                            <td colspan="2"><input type="text" name="species" autocomplete="off"/></td>
                        </tr>
                        <tr>
                            <td>Nr of flowers:</td>
                            <td colspan="2"><input type="text" name="nr" autocomplete="off"/> </td>
                        </tr>
                        <tr>
                            <td>
                                <input id="submitOrderBtn" class="yui3-button add-contact-button" type="submit" value="Place order" />
                            </td>
                        </tr>
                    </table>
                </form>
            </td>
        </tr>
        
<script type="text/javascript">
window.onbeforeunload=function(){
    var ta=document.getElementById("id");
    
    if (ta.value != "")
    {
        return "Are you sure ?"
    }
}
</script>
</table>