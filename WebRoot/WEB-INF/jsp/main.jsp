<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!doctype html>
<html lang="en">
 <head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta name="Keywords" content="网页关键词和关键字">
  <meta name="Description" content="网页描述信息">
  <title>520表白--假期学习</title>
  
  <!-- css样式 -->
  <style type="text/css">
  *{margin:0;padding:0;}
  body{background:url("images/6.jpg");background-size:cover;}
  .top{width:400px;height:100px;margin:60px auto;font-size:30px;font-family:"华文行楷";color:#FFF;}
  .box{width:310px;height:310px;margin:auto;perspective:800px;}
  .box .pic{position:relative;transform-style:preserve-3d;animation:play 20s linear infinite;}
  .box ul li{list-style:none;position:absolute;top:0;left:0;}
  
		  
  #text{width:500px;height:200px;color:#21beb7;margin:auto;font-size:24px;font-family:"华文行楷";}	
  /*定义一个关键帧*/	
  @keyframes play{
	from{transform:rotateY(0deg);}
	40%{transform:rotateY(180deg);}
	80%{transform:rotateY(0deg);}
	to{transform:rotateY(180deg);}
  }
  </style>
 </head>
 
 <body> 
 
  <!-- div 盒子 容器 层 -->
  <!-- 以class命名的样式册为类样式 -->
  <div class="top">
  <marquee behavior="alternate">${user.userName},欢迎您进入宝宝淘论坛。您当前积分为${user.credits};</marquee>
  </div>
  
  <div class="box">
	<div class="pic">
	 <ul>
	 <!-- 图片标签四要素 宽度高度写在这里是优化效果-->
	  <li><img src="images/1.png" height="";width="";alt="描述";/></li>
	  <li><img src="images/2.png" height="";width="";alt="描述";/></li>
	  <li><img src="images/3.png" height="";width="";alt="描述";/></li>
	  <li><img src="images/4.png" height="";width="";alt="描述";/></li>
	  <li><img src="images/5.png" height="";width="";alt="描述";/></li>
	  <li><img src="images/6.png" height="";width="";alt="描述";/></li>
	 </ul>
	</div>
  
  </div>

  <div id="text"></div>
<embed src="mp3/qiqiu.mp3" hidden="false"/>

<script src="js/jquery-1.11.3.min.js"></script>

<script>
	//拿到每一个li
	$(".pic ul li").each(function(i){
		var deg = 360/$(".pic ul li").size();
		//当前的li对象
		$(this).css({"transform":"rotateY("+deg*i+"deg)translateZ(216px)"});
		});
	var i = 0;	
	var str="能够遇见你是我最大的幸运，有了你世界变得丰富多彩起来，有了你，世界变得如此迷人，你是我的世界，我的世界是你，对我来说，不是在最美好的时光遇见了你，而是遇见你以后都是最美好的时光！";
	window.onload = function typing(){
		//获取DIV
		var mydiv = document.getElementById("text");
		mydiv.innerHTML += str.charAt(i);
		i++;
		var id = setTimeout(typing,100);
		if(i==str.length){
			clearTimeout(id);
		}
	}


	var imgs =["1.jpg", "2.jpg", "3.jpg","4.jpg","5.jpg","6.jpg"];    //（设定想要显示的图片）
	var x = 0;        
        function playBg(){
               x= Math.floor(Math.random()*5+1);                                                                            
               
			   $("body").css("background", "url(images/" +imgs[x]+ ")");
        }
		setInterval("playBg()",3000);

</script>	
	
 </body>
</html>