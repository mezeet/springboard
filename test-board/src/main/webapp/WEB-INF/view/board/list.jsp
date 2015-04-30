<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
 
	<!-- 게시글  목록 보기 영역 시작 -->
    <div class="row panel">
      <div class="col-xs-12">
      	<h4>공지 게시판</h4>
      	<div class="table-responsive">

      		<table id="mytable" class="table table-bordred table-striped">

            <thead>
             <th>번호</th>
             <th>제목</th>
             <th>작성자</th>
             <th>작성일</th>
             <th>조회수</th>
            </thead>
            
  					<tbody>
	  					<c:forEach var="board" items="${boardList}">
								<tr>
									<td>${board.no}</td>
									<td><a href="${path}/board/view.do?no=${board.no}&table=board">${board.title}</a></td>
									<td>${board.writer}</td>
									<td>${board.wdate}</td>
									<td>${board.target}</td>
								</tr>							
							</c:forEach>
			    	</tbody>
			    	        
					</table>

					<div class="clearfix"></div>
						<ul class="pagination pull-right">
						  <li><a class="btn btn-primary"href="${path}/board/write.do"><i class="fa fa-home fa-fw"></i>&nbsp; 글 작성하기</a></li>
						</ul>
						<ul class="pagination pull-left">
						  <li class="disabled"><a href="#"><span class="glyphicon glyphicon-chevron-left"></span></a></li>
						  <li class="active"><a href="#">1</a></li>
						  <li><a href="#">2</a></li>
						  <li><a href="#">3</a></li>
						  <li><a href="#">4</a></li>
						  <li><a href="#">5</a></li>
						  <li><a href="#"><span class="glyphicon glyphicon-chevron-right"></span></a></li>
						</ul>

           </div>
        	</div>
				</div>
				<!-- 게시글 목록 보기 영역 끝 -->