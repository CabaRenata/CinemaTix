<div>
  <h1>
  <table>

<p class="menu-category">
    <a href="#" onclick="return false" onmousedown="expand('div')">Available Options</a> </br>
</p>

<div id="div" class="mydivs">
    <li><a href="listFlowers">Flower List</a></li>
    <li><a href="orderFlowers">Order Flowers</a></li>
</div>

<script type="text/javascript">
    
    function expand(element){
    var target = document.getElementById(element);
    var h = target.offsetHeight;
    var sh = target.scrollHeight;
    var loopTimer = setTimeout('expand(\''+element+'\')',8);  
    if(h < sh){
            h += 5;
    } else {
            clearTimeout(loopTimer);
    }
    target.style.height = h+"px";
    }
</script>
    </table>
  </h1>
</div>
