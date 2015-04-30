<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
		<!-- 게시글  하나 보기 영역 시작 -->
    <div class="row panel">
      <div class="col-xs-12">
      	<h4>공지 게시판</h4>
      	<div class="table-responsive">

					<form class="form-horizontal" method="post" action="${path}/board/write.do?table=board" >
						
					  <div class="form-group">
					    <label for="title" class="col-sm-2 control-label">제목</label>
					    <div class="col-sm-10">
					      <input type="text" class="form-control" name="title" id="title" placeholder="게시글 제목" />
					    </div>
					  </div>
					  <div class="form-group">
					    <label for="title" class="col-sm-2 control-label">작성자</label>
					    <div class="col-sm-10">
					     <input class="form-control" id="disabledInput" type="text" placeholder="세션.사용자 명" disabled>
					    </div>
					  </div>
					  <div class="form-group">
					    <label for="title" class="col-sm-2 control-label">작성일</label>
					    <div class="col-sm-10">
					     <input class="form-control" id="disabledInput" type="text" placeholder="게시글 작성일은 오늘" disabled>
					    </div>
					  </div>
					  <div class="form-group">
					    <label for="content" class="col-sm-2 control-label">내용</label>
					    <div class="col-sm-10">
					      <textarea class="form-control" id="content"></textarea>
					    </div>
					  </div>
			
					  <div class="row">
				     	<div class="col-sm-offset-8 col-sm-12 btn-group" role="group" aria-label="...">
							  <button type="button" class="btn btn-default" onclick="history.go(-1);">취소</button>
							  <button type="submit" class="btn btn-default">수정완료</button>		  
							</div>
				    </div>
					</form>
				</div>
			</div>
		</div>
		
				<!-- 게시글 하나 보기 영역 끝 -->