    <%@ page language="java" contentType="text/html; charset=UTF-8"
             pageEncoding="UTF-8" %>
        <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
        <html>

        <head>
        <title>Tables</title>
        <!-- Bootstrap -->
        <link href="bootstrap/css/bootstrap.min.css" rel="stylesheet" media="screen">
        <link href="bootstrap/css/bootstrap-responsive.min.css" rel="stylesheet" media="screen">
        <link href="assets/styles.css" rel="stylesheet" media="screen">
        <link href="assets/DT_bootstrap.css" rel="stylesheet" media="screen">
        <!--[if lte IE 8]><script language="javascript" type="text/javascript"
        src="vendors/flot/excanvas.min.js"></script><![endif]-->
        <!-- HTML5 shim, for IE6-8 support of HTML5 elements -->
        <!--[if lt IE 9]>
        <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
        <![endif]-->
        <script src="vendors/modernizr-2.6.2-respond-1.1.0.min.js"></script>
        <script src="vendors/jquery-1.9.1.js"></script>
        <script src="bootstrap/js/bootstrap.min.js"></script>
        <script src="vendors/datatables/js/jquery.dataTables.min.js"></script>


        <script src="assets/scripts.js"></script>
        <script src="assets/DT_bootstrap.js"></script>
		<script>
		$(document).ready(function() {
		    $('#example').dataTable( {
		    	"processing": true,
		        "serverSide": true,
// 		        "ajax": "/loadStudentList",
		    	"scrollX": true,
		    	"bRetrieve": true
		    } );
		    $('#example tbody').on( 'click', 'tr', function () {
		        $(this).toggleClass('selected');
		    } );
		} );
		</script>
        </head>
        <body>
        <div class="navbar navbar-fixed-top">

        </div>
        <div class="container-fluid">
        <div class="row-fluid">
        <div class="span3" id="sidebar">
        <ul class="nav nav-list bs-docs-sidenav nav-collapse collapse">
        <li>
        <a href="/"><i class="icon-chevron-right"></i> disclineManagerment </a>
        </li>
        <li class="active">
        <a href="/"><i class="icon-chevron-right"></i> studentManagerment</a>
        </li>
        </ul>
        </div>
        <!--/span-->
        <div class="span9" id="content">
        <div class="row-fluid">
        <!-- block -->
        <div class="block">
        <div class="navbar navbar-inner block-header">
        <div class="muted pull-left">Bootstrap dataTables</div>
        </div>
        <div class="block-content collapse in">
        <div class="span12">
        <table cellpadding="0" cellspacing="0" border="1" class="table table-striped table-bordered" id="example">
        <thead>
        <tr>
        	<th>操作</th>
        	<th>编号</th>
            <th>报名点代码</th>
            <th>报名地点</th>
            <th>报名点邮编</th>
            <th>报名号</th>
            <th>姓名</th>
            <th>姓名拼音</th>
            <th>性别</th>
            <th>籍贯所在地</th>
            <th>婚姻</th>
            <th>出生日期</th>
            <th>移动电话</th>
            <th>电子信箱</th>
            <th>本毕业单位</th>
            <th>本毕业专业</th>
            <th>民族</th>
            <th>民族码</th>
            <th>本科毕年月</th>
            <th>毕业省市码</th>
            <th>毕单位省市</th>
            <th>本科毕证号</th>
            <th>考试地点</th>
            <th>政治面貌码</th>
            <th>政治面貌</th>
            <th>在校生学号</th>
            <th>学历码</th>
            <th>原学历</th>
            <th>学士证书号</th>
            <th>学位码</th>
            <th>原学位</th>
            <th>录取类别码</th>
            <th>录取类别</th>
            <th>入学方式码</th>
            <th>入学方式</th>
            <th>考试方式码</th>
            <th>自编专业码</th>
            <th>专业代码</th>
            <th>专业名称</th>
            <th>研究方向码</th>
            <th>研究方向</th>
            <th>报考单位码</th>
            <th>报考单位</th>
            <th>第二志愿</th>
            <th>第二志愿码</th>
            <th>导师编号</th>
            <th>导师</th>
            <th>导师职称</th>
            <th>系所码</th>
            <th>系所</th>
            <th>学院</th>
            <th>外国语码</th>
            <th>外语</th>
            <th>政治理论码</th>
            <th>政治</th>
            <th>业务课1码</th>
            <th>业务课1</th>
            <th>业务课2码</th>
            <th>业务课2</th>
            <th>专业方向</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${list}" var="student" varStatus="varstatus">
        	<td><a onclick="deleteStudent(${studentid})">delete</a></td>
			<td>${student.id}</td>
            <td>${student.baomingdiandaima}</td>
            <td>${student.baomingdidian}</td>
            <td>${student.baomingdianyoubian}</td>
            <td>${student.baominghao}</td>
            <td>${student.xingming}</td>
            <td>${student.xingmingpinyin}</td>
            <td>${student.xingbie}</td>
            <td>${student.jiguansuozaidi}</td>
            <td>${student.hunyin}</td>
            <td>${student.chushengriqi}</td>
            <td>${student.yidongdianhua}</td>
            <td>${student.dianzixinxiang}</td>
            <td>${student.benbiyedanwei}</td>
            <td>${student.benbiyezhuanye}</td>
            <td>${student.minzu}</td>
            <td>${student.minzuma}</td>
            <td>${student.benkebinianyue}</td>
            <td>${student.biyeshengshima}</td>
            <td>${student.bidanweishengshi}</td>
            <td>${student.benkebizhenghao}</td>
            <td>${student.kaoshididian}</td>
            <td>${student.zhengzhimianmaoma}</td>
            <td>${student.zhengzhimianmao}</td>
            <td>${student.zaixiaoshengxuehao}</td>
            <td>${student.xuelima}</td>
            <td>${student.yuanxueli}</td>
            <td>${student.xueshizhengshuhao}</td>
            <td>${student.xueweima}</td>
            <td>${student.yuanxuewei}</td>
            <td>${student.luquleibiema}</td>
            <td>${student.luquleibie}</td>
            <td>${student.ruxuefangshima}</td>
            <td>${student.ruxuefangshi}</td>
            <td>${student.kaoshifangshima}</td>
            <td>${student.zibianzhuanyema}</td>
            <td>${student.zhuanyedaima}</td>
            <td>${student.zhuanyemingchen}</td>
            <td>${student.yanjiufangxiangma}</td>
            <td>${student.yanjiufangxiang}</td>
            <td>${student.baokaodanweima}</td>
            <td>${student.baokaodanwei}</td>
            <td>${student.dierzhiyuan}</td>
            <td>${student.dierzhiyuanma}</td>
            <td>${student.daoshibianhao}</td>
            <td>${student.daoshi}</td>
            <td>${student.daoshizhicheng}</td>
            <td>${student.xisuoma}</td>
            <td>${student.xisuo}</td>
            <td>${student.xueyuan}</td>
            <td>${student.waiguoyuma}</td>
            <td>${student.waiyu}</td>
            <td>${student.zhengzhililunma}</td>
            <td>${student.zhengzhi}</td>
            <td>${student.yewuke1ma}</td>
            <td>${student.yewuke1}</td>
            <td>${student.yewuke2ma}</td>
            <td>${student.yewuke2}</td>
            <td>${student.zhuanyefangxiang}</td>
            </tr>
        </c:forEach>
        </tbody>
        </table>
        </div>
        </div>
        </div>
        <!-- /block -->
        </div>

        </div>
        </div>
        <hr>
        <footer>
        <p>&copy; Vincent Gabriel 2013</p>
        </footer>
        </div>
        <!--/.fluid-container-->
</body>
</html>