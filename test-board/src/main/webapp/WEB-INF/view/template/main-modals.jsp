<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!-- 모달- 로그인 시작-->
<div id="loginModal" class="modal fade" tabindex="-1" role="dialog"
	aria-hidden="true">
	<div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal"
					aria-hidden="true">×</button>
				 <h2 class="text-center">
						스카이 서베이
				 </h2>
			</div>
			<div class="modal-body">
				<form class="form col-sm-12 center-block" id="login_form" method="post" name="login_form">
					<div class="alert alert-warning hide" id="login_form_alert"><strong>주의!</strong>아이디나 암호가 맞지 않습니다.</div>
					<div class="form-group">
						<input type="text" class="form-control input-lg"
							placeholder="아이디" name="loginid" id="loginid">
					</div>
					<div class="form-group">
						<input type="password" class="form-control input-lg"
							placeholder="암호" name="loginpassword" id="loginpassword">
					</div>
					<div class="form-group">
						<a class="btn btn-primary btn-lg btn-block" id="login_submit">로그인</a>
						<span class="pull-right">
							<a href="#getPasswordModal" role="button" data-toggle="modal" data-dismiss="modal">비밀번호 찾기</a>
							<!-- data-toggle 과 data-dismiss 를 동시에 넣으면 현재 모달이 닫히고 새 모달이 열린다. -->
						</span>

						<span>
							<div class="checkbox">
  							<label>
    							<input type="checkbox" value="">
     							입력한 정보 기억하기
  							</label>
							</div>
						</span>
					</div>
				</form>
			</div>
			<div class="modal-footer">
<!-- 				<div class="col-sm-12"> -->
<!-- 					<button class="btn" data-dismiss="modal" aria-hidden="true">취소</button> -->
<!-- 				</div> -->
			</div>
		</div>
	</div>
</div>
<!--	모달-로그인 끝 -->

<!-- 모달- 비번찾기 시작-->
<div id="getPasswordModal" class="modal fade" tabindex="-1" role="dialog"
	aria-hidden="true">
	<div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal"
					aria-hidden="true">×</button>
				 <h2 class="text-center">
						비밀번호 찾기
				 </h2>
				 
			</div>
			<div class="modal-body">
				<form class="form col-sm-12 center-block">
				<div class="alert alert-success"><strong>성공</strong> 암호 재설정 메일을 보냈습니다.</div>
					<div class="form-group">
						<p>회원님의 계정과 연결된 이메일 주소를 입력해 주십시오.</p>
							<input type="text" class="form-control input-lg"
								placeholder="이메일">
						</div>
					<div class="row">
						<div class="col-sm-12">
							<img src="${path}/assets/img/captcha.jpg" class="img-responsive" alt="Responsive image">
							<p>위 이미지에 보이는 숫자를 입력하여 주세요.</p>
						</div>
					</div>
					<div class="form-group">
						<input type="password" class="form-control input-lg"
							placeholder="인증번호">
					</div>
					<div class="form-group">
						<button class="btn btn-primary btn-lg btn-block">전송</button>
					</div>
				</form>
			</div>
			<div class="modal-footer">
<!-- 				<div class="col-sm-12"> -->
<!-- 					<button class="btn" data-dismiss="modal" aria-hidden="true">취소</button> -->
<!-- 				</div> -->
			</div>
		</div>
	</div>
</div>
<!--	모달-비번찾기 끝 -->

<!-- 시작 : 수정/삭제 모달   -->

<div class="modal fade" id="edit" tabindex="-1" role="dialog" aria-labelledby="edit" aria-hidden="true">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-hidden="true"><span class="glyphicon glyphicon-remove" aria-hidden="true"></span></button>
        <h4 class="modal-title custom_align" id="Heading">글 수정하기</h4>
      </div>
  	    <div class="modal-body">
      	  <div class="form-group">
    	  	  <input class="form-control " type="text" placeholder="결제 사항변경 안내">
        	</div>
        <div class="form-group">
        	<input class="form-control " type="text" placeholder="관리자">
        </div>
        <div class="form-group">
        	<textarea rows="2" class="form-control" placeholder="결제 사항이 변동되었습니다. 착오 없도록 부탁드려요~"></textarea>
        </div>
      </div>
      <div class="modal-footer ">
        <button type="button" class="btn btn-warning btn-lg" style="width: 100%;"><span class="glyphicon glyphicon-ok-sign"></span> 수정완료</button>
      </div>
    </div><!-- /.modal-content --> 
  </div><!-- /.modal-dialog --> 
  
  </div>
    <div class="modal fade" id="delete" tabindex="-1" role="dialog" aria-labelledby="edit" aria-hidden="true">
      <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-hidden="true"><span class="glyphicon glyphicon-remove" aria-hidden="true"></span></button>
        
        <h4 class="modal-title custom_align" id="Heading">이 게시글 삭제</h4>
        
      </div>
  	  <div class="modal-body">
      	<div class="alert alert-danger"><span class="glyphicon glyphicon-warning-sign"></span>&nbsp;정말 이 기록을 삭제하길 원하는게 맞습니까?</div>
      </div>
      	<div class="modal-footer ">
	        <a href="${path}/board/delete.do?no=${board.no}&table=board">
	        <button type="button" class="btn btn-success" ><span class="glyphicon glyphicon-ok-sign"></span> 네</button>
	        </a>
	        <button type="button" class="btn btn-default" data-dismiss="modal"><span class="glyphicon glyphicon-remove"></span> 아니오</button>
      	</div>
      </div> <!-- /.modal-content --> 
  </div> <!-- /.modal-dialog --> 
</div>
 <!-- 끝 : 수정/삭제 모달   -->