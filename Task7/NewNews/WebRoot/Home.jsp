<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>qelger测试首页</title>


<style type="text/css">
<!--
body {
	font: 100%/1.4 Verdana, Arial, Helvetica, sans-serif;
	background: #42413C;
	margin: 0;
	padding: 0;
	火影忍者终章已上映: #000;
}

/* ~~ 元素/标签选择器 ~~ */
ul, ol, dl { /* 由于浏览器之间的差异，最佳做法是在列表中将填充和边距都设置为零。为了保持一致，您可以在此处指定需要的数值，也可以在列表所包含的列表项（LI、DT 和 DD）中指定需要的数值。请注意，除非编写一个更为具体的选择器，否则您在此处进行的设置将会层叠到 .nav 列表。 */
	padding: 0;
	margin: 0;
}
h1, h2, h3, h4, h5, h6, p {
	margin-top: 0;	 /* 删除上边距可以解决边距会超出其包含的 div 的问题。剩余的下边距可以使 div 与后面的任何元素保持一定距离。 */
	padding-right: 15px;
	padding-left: 15px; /* 向 div 内的元素侧边（而不是 div 自身）添加填充可避免使用任何方框模型数学。此外，也可将具有侧边填充的嵌套 div 用作替代方法。 */
}


/* ~~ 此固定宽度容器包含其它 div ~~ */
.container {
	width: 1060px;
	background: #fff;
	margin: 5px auto; /* 侧边的自动值与宽度结合使用，可以将布局居中对齐 */
}

/* ~~ 标题未指定宽度。它将扩展到布局的完整宽度。标题包含一个图像占位符，该占位符应替换为您自己的链接徽标 ~~ */
.header {
	height:56px;
	background:#999999;
}
.header .nav{ 
  background:url(img/header.png);
  height:28px;
}
.header .nav li { 
float:left;
list-style:none;}


.header .nav li a{ color:#fff;
 text-decoration:none;
  padding-top:4px; 
  display:block; 
  width:120px; 
  height:22px; 
  text-align:center; 
  margin-left:2px;}
.header .nav li a:hover { background-color:#bbbbbb; color:#ffffff;}
.header .nav li a#current { background-color:#bbbbbb; color:#fff;}
.header .today{ 
margin-top:2px;
  height:28px;
  font-size:12px;
  
}
.header .today .time{
	margin-left:10px;
	float:left
}
.header .today .weather{
	margin-left:10px;
	float:left
}
.header .today .con{
	margin-left:10px;
	float:left;
	width:420px;
	
}
.header .today .sear{
	
	float:left
}
/* ~~ 这是布局信息。 ~~ 

1) 填充只会放置于 div 的顶部和/或底部。此 div 中的元素侧边会有填充。这样，您可以避免使用任何“方框模型数学”。请注意，如果向 div 自身添加任何侧边填充或边框，这些侧边填充或边框将与您定义的宽度相加，得出 *总计* 宽度。您也可以选择删除 div 中的元素的填充，并在该元素中另外放置一个没有任何宽度但具有设计所需填充的 div。

*/

.content {

	padding: 10px 0;
}

.content .toutiao {
	height:auto;
	width:98%;
  margin-left:1%;
	
}
.content .toutiao .tou_img{
    float:left;
	width:150px;
	
}
/*居中问题*/
.content .toutiao .tou_title{
    float:left;
	margin:0px auto;
}

.content .new{
	margin-top:5px;
	height:370px;
	
}
.content .new .new_img{
	float:left;
	margin-left:10px;
	width:486px;
	background:#ccc;
	height:300px;
}
.content .new .new_title{
	float:left;
	margin-left:20px;
	height:300px;
	border:1px;
	border-style:solid;
	background-color:#F5F5F5;
	border-color:#ccc;
	width:520px;

	
}
.content .new .new_title li{
	
	margin-left:30px;
		
}
.content .link{
	background:url(img/link_back.png);
	height:105px;
	width:98%;
	margin-left:1%;
}
.content .link .l_left{
	float:left;
	margin-left:5px;
}
.content .link .l_img{
	float:left;
	margin-left:20px;
	margin-top:15px;
}
.content .link .l_right{
	float:right;
	margin-right:5px;
}

.content .lanmu{
	width:98%;
	margin-left:1%;
	height:350px;
	
}
.content .lanmu .lan_left{
	float:left;
	width:72%;
	
	height:98%;
	margin-top:1%;
	
}
.content .lanmu .lan_left #lan_left1{
	float:left;
	width:49%;
	height:49%;
	margin-top:0px;;
	border:1px;
	border-style:solid;
	border-color:#ccc;
}
.content .lanmu .lan_left .lan_tiltle{
	height:80px;
	border:1px;
	border-style:solid;
	border-color:#ccc;
	
}
.content .lanmu .lan_left .lan_content ul{
	margin-top:15px;
	margin-left:30px;
}
#strong{
	font-weight:bold
}


.content .lanmu .lan_left #lan_left2{
	float:right;
	width:49%;
	
	height:49%;
	margin-top:opx;
	border:1px;
	border-style:solid;
	border-color:#ccc;
}
.content .lanmu .lan_left #lan_left3{
	float:left;
	width:49%;
	
	height:49%;
	margin-top:1%;
	margin-bottom:opx;
	border:1px;
	border-style:solid;
	border-color:#ccc;
}
.content .lanmu .lan_left #lan_left4{
	float:right;
	width:49%;
	margin-top:1%;
	height:49%;
	margin-bottom:opx;
	border:1px;
	border-style:solid;
	border-color:#ccc;
}
.content .lanmu .lan_right{
	float:right;
	width:26%;
	
	height:98%;
	margin-top:1%;
	
}
.content .lanmu .lan_right .lan_right-top{
	float:right;
	width:100%;
	
	height:23%;
	margin-top:opx;
	
}
.content .lanmu .lan_right .lan_right-top .lan1{
	
	float:left;
	width:49%;
	height:49%;
	margin-top:0px;
	border:1px;
	border-style:solid;
	border-color:#ccc;

}

.content .lanmu .lan_right .lan_right-top .lan2{
	float:right;
	width:49%;
	
	height:49%;
	margin-top:opx;
	border:1px;
	border-style:solid;
	border-color:#ccc;
}
.content .lanmu .lan_right .lan_right-top .lan3{
	float:left;
	width:49%;
	
	height:49%;
	margin-top:1%;
	margin-bottom:opx;
	border:1px;
	border-style:solid;
	border-color:#ccc;
}
.content .lanmu .lan_right .lan_right-top .lan4{
	float:right;
	width:49%;
	margin-top:1%;
	height:49%;
	margin-bottom:opx;
	border:1px;
	border-style:solid;
	border-color:#ccc;
}
.content .lanmu .lan_right .lan_right-middle{
	float:right;
	width:100%;
	margin-top:4%;
	margin-bottom:3%;
	height:39%;
	border:1px;
	border-style:solid;
	border-color:#ccc;
	
}
.content .lanmu .lan_right .lan_right-bottom{
	float:right;
	width:100%;
	
	height:32%;
	margin-bottom:opx;
	border:1px;
	border-style:solid;
	border-color:#ccc;
}
.content .lanmu .lan_right .lan_right-bottom #rb1{
	width:75%;
}
.content .lanmu .lan_right .lan_right-bottom #rb2{
	width:22%;
	float:right
}
.content .lanmu .lan_right .lan_right-bottom #rb3{
	margin-left:15px;
	margin-top:5px;
}
.content .b1{
	width:98%;
	margin-left:1%;
	margin-top:15px;
}
.content .b2{
	width:98%;
	margin-left:1%;
	margin-top:15px;
	border:1px;
	border-style:solid;
	border-color:#C00;
	background:url(img/b.png);
	height:145px;
	
}
.content .b2 .a1{
	width:96%;
	float:right;
	
	margin-top:1px;
	height:70px;
	
}
.content .b2 .a2{
	width:96%;
	float:right;
	
	margin-top:1px;
	height:70px;
	
}
.content .b2 li { 
margin:0px auto;
align:center;
float:left;
list-style:none;
width:100px;}
.content .b2 li a {
	color:#000;
 text-decoration:none;
  padding-top:4px; 
  display:block; 
  text-align:center; 
  margin-left:2px;
}



/* ~~ 脚注 ~~ *地下的背景dddddddddddddddddddddddd*/
.footer {
	margin-top:10px;
	padding: 10px 0;
	background:#666666;
	color:#666666;
}
.footer p{
	text-align:center;
}
.footer #link2{
margin_left:800px;;
}
.footer ul{
	margin-left:295px;
}
.footer li { 
margin:0px auto;
align:center;
float:left;
list-style:none;}
.footer li a {
	color:#fff;
 text-decoration:none;
  padding-top:4px; 
  display:block; 
  text-align:center; 
  margin-left:2px;
}


/* ~~ 其它浮动/清除类 ~~ */
.fltrt {  /* 此类可用于在页面中使元素向右浮动。浮动元素必须位于其在页面上的相邻元素之前。 */
	float: right;
	margin-left: 8px;
}
.fltlft { /* 此类可用于在页面中使元素向左浮动。浮动元素必须位于其在页面上的相邻元素之前。 */
	float: left;
	margin-right: 8px;
}
.clearfloat { /* 如果从 #container 中删除或移出了 #footer，则可以将此类放置在 <br /> 或空 div 中，作为 #container 内最后一个浮动 div 之后的最终元素 */
	clear:both;
	height:0;
	font-size: 1px;
	line-height: 0px;
}
-->
</style>
 <SCRIPT LANGUAGE="JavaScript" TYPE="text/JavaScript"> 
    

function right(){
	alert("right");
	var b=document.getElementById("temp").value;
	var a=parseInt(b);
	alert(a);
	a=a+1;
	
		
		
	if(a==1||a==5){
	document.getElementById("p1").src="img/link1.png";
	document.getElementById("p2").src="img/link2.png";
	document.getElementById("p3").src="img/link3.png";
	//document.getElementById("p4").src="img/link4.png";

	}
		
	else if(a==2){
		document.getElementById("p1").src="img/link4.png";
	document.getElementById("p2").src="img/link1.png";
	document.getElementById("p3").src="img/link2.png";
	document.getElementById("p4").src="img/link3.png";
	}
	else if(a==3){
		document.getElementById("p1").src="img/link3.png";
	document.getElementById("p2").src="img/link4.png";
	document.getElementById("p3").src="img/link1.png";
	document.getElementById("p4").src="img/link2.png";
	}
	else{
		document.getElementById("p1").src="img/link2.png";
	document.getElementById("p2").src="img/link3.png";
	document.getElementById("p3").src="img/link4.png";
	document.getElementById("p4").src="img/link1.png";
	}
	var a=document.getElementById("temp").value=a;
}
function left(){
	alert("left");
	var b=document.getElementById("temp").value;
	var a=parseInt(b);
	alert(a);
	a=a-1;
	
		
	if(a==4||a==0){
	document.getElementById("p1").src="img/link2.png";
	document.getElementById("p2").src="img/link3.png";
	document.getElementById("p3").src="img/link4.png";
	document.getElementById("p4").src="img/link1.png";
	}
	else if(a==2){
		document.getElementById("p1").src="img/link4.png";
	document.getElementById("p2").src="img/link1.png";
	document.getElementById("p3").src="img/link2.png";
	document.getElementById("p4").src="img/link3.png";
	}
	else if(a==3){
		document.getElementById("p1").src="img/link3.png";
	document.getElementById("p2").src="img/link4.png";
	document.getElementById("p3").src="img/link1.png";
	document.getElementById("p4").src="img/link2.png";
	}
	else{
		
	
	document.getElementById("p1").src="img/link1.png";
	document.getElementById("p2").src="img/link2.png";
	document.getElementById("p3").src="img/link3.png";
	document.getElementById("p4").src="img/link4.png";
	}
	var a=document.getElementById("temp").value=a;
}

</SCRIPT>


<style>
li{
	font-style: italic
}

h2, p {
	 color: gray;
	 font-weight:bold;

}


</style>

</head>

<body>

<div class="container">
  <div class="header">
  <div class="nav">
  <li><a href="" id="current">首页</a></li>
  <li>
  <a href="https://www.baidu.com/link?url=4AfdvDjWetdUzVnlqKaH2DA5xb_o-C4AsJ3YqK5zTae&wd=&eqid=d0fb2f3d0000c6ad00000005559abd3c">体育专栏</a></li>
  <li>
  <a href="https://www.baidu.com/link?url=4AmfLna76HIg8iGxsAIAHodMh-gfg_h4kEWaPRwQIcB0g8hPW_N49aAHhlrFT9Vq&wd=&eqid=ad9526a000011dc700000005559abd55">金融专栏</a></li> 
  <li><a href="https://www.baidu.com/link?url=KseXH6XviP5ffJJrSQVHk5zwko9t2QsK_yC2BionFJZUjHsj5AXRCSLmZqFXPXPW&wd=&eqid=fd68014e0000f4fe00000005559abda7">政治专栏</a></li>
  	<!-- end .nav --></div>
    <div class="today">
     <div class="time">
	 <SCRIPT LANGUAGE="JavaScript" TYPE="text/JavaScript">    
var day="";
var month="";
var ampm="";
var ampmhour="";
var myweekday="";
var year="";
mydate=new Date();
myweekday=mydate.getDay();
mymonth=mydate.getMonth()+1;
myday= mydate.getDate();
myyear= mydate.getYear();
year=(myyear > 200) ? myyear : 1900 + myyear;
if(myweekday == 0)
weekday=" 星期日 ";
else if(myweekday == 1)
weekday=" 星期一 ";
else if(myweekday == 2)
weekday=" 星期二 ";
else if(myweekday == 3)
weekday=" 星期三 ";
else if(myweekday == 4)
weekday=" 星期四 ";
else if(myweekday == 5)
weekday=" 星期五 ";
else if(myweekday == 6)
weekday=" 星期六 ";
document.write(year+"年"+mymonth+"月"+myday+"日    "+weekday);
</SCRIPT></div>
    	
       
          <div class="weather"><iframe  src="http://m.weather.com.cn/m/pn3/weather.htm"  height="28px" width="240px" marginwidth="0" marginheight="0" hspace="0" vspace="0" frameborder="0" scrolling="no" allowtransparency="true" ></iframe> </div>
        
      
         <div class="con">投稿邮箱：NewNews@news.com&nbsp;&nbsp;&nbsp;&nbsp;新闻热线：0230-5393822</div>
        <div class="sear">
        
            <form action="" method="get" target="_blank">
			
                <input type="text" class="text" name="q" id="q"/><input type="submit" value="搜 索" class="button" />
            </form>
          
            
        </div>
       
    <!-- end .today --></div>
    
  <!-- end .header --></div>
  <div class="content">
  <div class="toutiao">

  <div class="tou_title"><h1>NewNews:      &nbsp; To Make the World Better!</h1></div>
  <!--头条结束--></div>
    
    <div class="new">
    <div class="new_img">
    <div>


   <SCRIPT type=text/javascript>
	var imgUrl=new Array();
	var imgLink=new Array();
	var imgText=new Array();
//imgUrl[1]="http://pic1.nmgnews.com.cn/0/10/79/69/10796924_452800.jpg";
//imgLink[1]="http://inews.nmgnews.com.cn/system/2014/11/12/011570005.shtml";
imgUrl[1]="http://news.xinhuanet.com/sports/2015-06/17/medium-ac06a32d-5a3f-45d7-be5f-60db14e485a81n.jpg";
imgLink[1]="http://news.xinhuanet.com/sports/2015-06/17/c_7925976.htm";
imgText[1]="勇士队时隔40年夺冠";

//imgUrl[2]="http://pic1.nmgnews.com.cn/0/10/79/62/10796282_601354.jpg";
//imgLink[2]="http://inews.nmgnews.com.cn/system/2014/11/11/011569314.shtml";
imgUrl[2]="http://u.candou.com/2015/0702/1435817561161.jpeg";
imgLink[2]="http://news.candou.com/586777_8.shtml";
imgText[2]="火影忍者完结，大结局";

//imgUrl[3]="http://pic1.nmgnews.com.cn/0/10/79/62/10796289_071558.jpg";
//imgLink[3]="http://inews.nmgnews.com.cn/system/2014/11/11/011569191.shtml";
imgUrl[3]="http://www.snedu.gov.cn/file/upload/201507/01/17-52-10-97-1.jpg";
imgLink[3]="http://www.snedu.gov.cn/jynews/gdxx/201507/01/50270.html";
imgText[3]="西电代表团访问英国爱尔兰开展国际交流合作";

//imgUrl[4]="http://pic1.nmgnews.com.cn/0/10/79/61/10796193_993977.jpg";
//imgLink[4]="http://inews.nmgnews.com.cn/system/2014/11/10/011569149.shtml";
imgUrl[4]="http://img1.cache.netease.com/catchpic/E/E0/E092D15FF31ABFA375B5E6F735AEB808.jpg";
imgLink[4]="http://news.163.com/15/0530/02/AQR33ML000014AED.html";
imgText[4]="范冰冰探望李晨家人";

//imgUrl[5]="http://pic1.nmgnews.com.cn/0/10/79/61/10796175_738635.jpg";
//imgLink[5]="http://inews.nmgnews.com.cn/system/2014/11/10/011569136.shtml";
imgUrl[5]="http://static.statickksmg.com/image/2013/03/05/e7fc0f2127a102377bf546ce921bfad5.jpg";
imgLink[5]="http://www.kankanews.com/ICstar/news/2013-03-05/2511296.shtml";
imgText[5]="Running Man 成龙特辑";


	var focus_width=500;
	var focus_height=299;
	var text_height=40;
        var text_height2=20+15;
   

	var swf_height = focus_height+text_height

	var j=0;
	for (i=1;i<=(5-1+1);i++) {
		if( (imgUrl[i]!="") && (imgLink[i]!="") ) {
			j++;
		} else {
			break;
		}
	}	

	var pics=""

	var links=""

	var texts=""

	for (i=1;i<=j;i++) {
	pics=pics+imgUrl[i]
	if( (i<j)) {
		pics=pics+"|";
	} 

	links=links+imgLink[i]

	if( (i<j)) {
		links=links+"|";} 

		texts=texts+imgText[i]

	if( (i<j)) {
		texts=texts+"|";} 

	}	

	document.write('<object classid="clsid:d27cdb6e-ae6d-11cf-96b8-444553540000" codebase="http://fpdownload.macromedia.com/pub/shockwave/cabs/flash/swflash.cab#version=6,0,0,0" width="'+ focus_width +'" height="'+ swf_height +'">');

	document.write('<param name="allowScriptAccess" value="sameDomain"><param name="movie" value="http://www.nmgnews.com.cn/sys/flash_news/flash_news.swf"><param name="quality" value="high"><param name="bgcolor" value="#dfdfdf">');

	document.write('<param name="menu" value="false"><param name=wmode value="opaque">');

	document.write('<param name="FlashVars" value="pics='+pics+'&links='+links+'&texts='+texts+'&borderwidth='+focus_width+'&borderheight='+focus_height+'&textheight='+text_height+'">');

	document.write('<embed src="http://www.nmgnews.com.cn/sys/flash_news/flash_news.swf" wmode="opaque" FlashVars="pics='+pics+'&links='+links+'&texts='+texts+'&borderwidth='+focus_width+'&borderheight='+focus_height+'&textheight='+text_height2+'" menu="false" bgcolor="#dfdfdf" quality="high" width="'+ focus_width +'" height="'+ focus_height +'" allowScriptAccess="sameDomain" type="application/x-shockwave-flash" pluginspage="http://www.macromedia.com/go/getflashplayer" />');		
	document.write('</object>');

</SCRIPT>
    </div>
    
    </div>
    <div class="new_title">
	<h2>利文斯顿疑恶意攻击诺天王下体</h2>
	<h4></h4>
	<a href = "http://china.nba.com/index.html?gr=www" title = "NBA Home Page">
<img src = "basketball.gif">
</a>
	<p>小牛主场迎战勇士</p>

    </div>
    
    <!--new结束--></div>
    <div class="link">
    
    <div class="l_left"><a  onclick="left()"><img src="img/link_left.png"/></a></div>
    <div id="1">
    <div class="l_img"><a href="#"><img id="p1" src="img/link1.png"/></a></div>
    <div class="l_img"><a href="#"><img id="p2" src="img/link2.png"/></a></div>
    <div class="l_img"><a href="#"><img id="p3" src="img/link3.png"/></a></div>
    <div class="l_img"><a href = "login.jsp" target = "_blank"><img id="p4" src="img/link4.png"/></a></div>
    </div>

    <input id="temp" value="1" type="hidden"/>
    <div class="l_right"><a onclick="right()"><img src="img/link_right.png"/></a>></div>
    <!--link结束--></div>
    <div class="lanmu">
    <div class="lan_left">
    <div id="lan_left1">
    <div  class="lan_title"><img src="img/lan1.png"/></div>
    <div  class="lan_content">
    <ul>
		    <li>王思聪与凤姐隔空对骂</li>
    <li>李晨冯冰冰低调举行婚礼</li>
    <li>文章本传闻再次出轨</li>
    <li>成龙豪言永不退休</li>


    
    </ul>
    </div>
    </div>
    <div id="lan_left2" class="lan">
    <div  class="lan_title"><img src="img/lan2.png"/></div>
    <div  class="lan_content">
    <ul>
	   <li>乡村爱情第10部正在热播</li>
    <li>天将雄狮2将于8月份上映</li>
    <li >Running Man第19期已开拍</li>
    <li >
	<a href = "http://movie.douban.com/subject/25938113/" target = "_blank">火影忍者终章已上映</a>
	</li>

    </ul>
    </div>
    </div>
    <div id="lan_left3" class="lan">
    <div  class="lan_title"><img src="img/lan3.png"/></div>
    <div  class="lan_content">
    <ul>
    <li >习大大会见韩国总统朴槿惠</li>
    <li >奥巴马称部署海军并非针对中国</li>
    <li >沙特宣称与美国断绝贸易关系</li>
    <li >安倍开始实行驻军海外战略</li>
    
    </ul>
    </div>
    </div>
    <div id="lan_left4" class="lan">
    <div  class="lan_title"><img src="img/lan4.png"/></div>
    <div  class="lan_content">
    <ul>
    <li >暂无</li>
    <li >暂无</li>
    <li >暂无</li>
    <li >暂无</li>
  
    
    </ul>
    </div>
    </div>
    </div>
    <div class="lan_right">
    <div class="lan_right-top">
   
    <div class="lan1"><a href="LogIn.html" target = "_blank"><img src="img/naruto.jpg" /></a></div>

    
    </div>
    <div class="lan_right-middle"><img src="img/r-m.png" /></div>
    <div class="lan_right-bottom"><img src="img/r-b1.png" id="rb1"/>
    <a href="#"><img src="img/r-b2.png" id="rb2"/></a>
    <ul id="rb3">
    <li >习大大会见韩国总统朴槿惠</li>
    <li >李晨冯冰冰低调举行婚礼</li>
    <li >火影忍者终章已上映</li>
    </ul>
    </div>
    </div>
    <!--lanmu结束--></div>
    <div class="b1"><img src="img/b1.png"/></div>
    <div class="b2">
    	<div class="a1">
        <ul>
        <li><a href="http://news.xidian.edu.cn/" target = "_blank">西电新闻网</a></li>
        <li><a href="#">清华网</a></li>
        <li><a href="#">北京大学日报</a></li>
        <li><a href="#">浙大周刊</a></li>
        <li><a href="#">南大新闻</a></li>
        <li><a href="#">西交每日一报</a></li>
        <li><a href="#">北航新闻网</a></li>
        <li><a href="#">同济大学网</a></li>
        <li><a href="#">复旦周报</a></li>
        <li><a href="#">上海交大网</a></li>
        <li><a href="#">武汉大学日报</a></li>
        <li><a href="#">厦门大学周刊</a></li>

        </ul>
        </div>
    	<div class="a2">
        <ul>
        <li><a href="#">中国网</a></li>
        <li><a href="#">新华网</a></li>
        <li><a href="#">人民网</a></li>
        <li><a href="#">中新网</a></li>
        <li><a href="#">中青网</a></li>
        <li><a href="#">国际在线</a></li>
        <li><a href="#">中国日报</a></li>
        <li><a href="#">中经网</a></li>
        
       
        <li><a href="#">光明网</a></li>
        <li><a href="#">求是理论网市</a></li>
        <li><a href="#">中国文明网</a></li>
        <li><a href="#">中国法院</a></li>
        <li><a href="#">中国网群</a></li>
        <li><a href="#">环球网</a></li>
        <li><a href="#">中国台湾网</a></li>
        </ul>
        </div>
        
  
    </div>
    <!-- end .content --></div>
  <div class="footer">
    <div id="link2"><ul><li><a href="#">网站介绍|</a></li><li><a href="#">广告服务|</a></li><li><a href="#">网络律师|</a></li><li><a href="#">诚聘英才|</a></li><li><a href="#">联系方式|</a></li><li><a href="#">网站工作人员</a></li></ul></div>
   <p>&nbsp;&nbsp;&nbsp;&nbsp;</p>
    <p>NewNews网版权所有，未经书面授权不得网络转载或镜像</p>
    <p>NewsICP备053204s12号</p>
    <!-- end .footer --></div>
  <!-- end .container --></div>
</body>
</html>
