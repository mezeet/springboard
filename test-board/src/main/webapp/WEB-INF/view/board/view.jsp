<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
		<!-- 게시글  하나 보기 영역 시작 -->
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
				    <tr>
					    <td>${board.no}</td>
					    <td>${board.title}</td>
					    <td>${board.writer}</td>
					    <td>${board.wdate}</td>
					    <td>${board.target}</td>
				    </tr>
				    <tr>
					    <td colspan="4" class="text-left">
					    		${board.content}
					    </td>
				    </tr>
				    				
			    </tbody>        
					</table>




           </div>
           					<div class="clearfix"></div>
						<ul class="pagination pull-right">
							<li><a class="btn btn-primary"href="${path}/board/update.do?no=${board.no}&table=board"><i class="fa fa-home fa-fw"></i>&nbsp; 글 수정</a></li>
							<li><a class="btn btn-primary"href="#"  data-title="Delete" data-toggle="modal" data-target="#delete"><i class="fa fa-home fa-fw"></i>&nbsp; 글 삭제</a></li>
						  <li><a class="btn btn-primary"href="${path}/board/list.do"><i class="fa fa-home fa-fw"></i>&nbsp; 글 목록</a></li>
						</ul>
        	</div>
				</div>
				<!-- 게시글 하나 보기 영역 끝 -->