<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<script src="./js/jquery-1.11.2.min.js" type="text/javascript"></script>


  <div class="row hidden" id="user_profile">
  	<div class="col-xs-12">
  		<div class="row well">
  			<div class="col-xs-12">	
					<div class="media" id="user_media">
						<a class="thumbnail pull-left" href="#">
						<img
							class="media-object" src="//placehold.it/80">
						</a>
						<div class="media-body">
							<h4 class="media-heading">사용자 id</h4>
							<p>
								<a class="btn btn-block btn-default">1000 포인트</a>
							</p>
						</div>
					</div>
				</div>
  			<div class="row">
  				<div class="col-xs-12">
	  				<div class="progress" id="user_progress">
								<div class="progress-bar progress-bar-info" style="width: 60%">프로필 작성 60% 완료</div>
						</div>
					</div>
				</div>
				<div class="row">	
					<div class="col-xs-12">
						<a class="btn btn-block btn-default">프로필 업데이트 하기</a>
					</div>
				</div>
  		</div>
  	</div>
  </div>
  
	<!--    공시사항 카드영역 시작 -->
  <div class="row">
  	<div class="col-xs-12">
  		<div class="row panel">
  			<div class="col-xs-12">	
					<div class="panel-heading">
						<a href="./service/notice/list.jsp" class="pull-right">모두 보기</a>
						<button id="sid" class="sid"> 모두보기</button> 
						<h4>최신 소식들</h4>
					</div>
					<div class="panel-body" id="panel-body">
				    <table class="table table-striped" id="shim">
	            <tr>
	                <td>포인트 지급 방식 변경 안내</td>
	            </tr>
	            <tr>
	                <td>결제 시 유의 사항 안내</td>
	            </tr>
	            <tr>
	                <td>기업 연계 의뢰 안내</td>
	            </tr>
				    </table>
					</div>
				</div>
			</div>
		</div>
	</div>
		<!--    공시사항 카드영역 끝-->
  
  	<!--    회원가입 카드영역 시작 -->
  <div class="row" id="registration_form">
  	<div class="col-xs-12">
  		<div class="row panel">
  			<div class="col-xs-12">
  				<div class="row">
  						<div class="col-xs-12">
								<h4 class=" text-center">회원 가입</h4>
							</div>
					</div>
					<div class="row">	
						<div class="col-xs-12">
							<input type="email" class="form-control" id="exampleInputEmail1" placeholder="이메일 주소">
						</div>
					</div>
					<div class="row no-gutters">
						<div class="col-xs-4">
							<input type="text" class="form-control" id="exampleInputEmail1" placeholder="성">
						</div>
						<div class="col-xs-8">
							<input type="text" class="form-control" id="exampleInputEmail1" placeholder="이름">
						</div>
					</div>
					<div class="row">	
							<div class="col-xs-12">
								<input type="date" class="form-control" id="exampleInputEmail1" placeholder="생년월일">
						</div>
					</div>
					<div class="row no-gutters">
						<div class="btn-group  btn-group-justified" data-toggle="buttons">
						  <label class="btn btn-primary">
						    <input type="radio" name="options" id="option1"> 남
						  </label>
						  <label class="btn btn-primary">
						    <input type="radio" name="options" id="option2"> 여
						  </label>
						</div>
					</div>
					<div class="row">	
							<div class="col-xs-12">
								<input type="text" class="form-control" id="exampleInputEmail1" placeholder="우편번호">
						</div>
					</div>
					<div class="row no-gutters">
						<div class="col-xs-6">
							<input type="text" class="form-control" id="exampleInputEmail1"  placeholder="아이디">
						</div>
						<div class="col-xs-6">
							<input type="text" class="form-control" id="exampleInputEmail1"  placeholder="암호">
						</div>
					</div>
					<div class="row">	
						<div class="col-xs-12">
							<a class="btn form-control btn-primary"  id="exampleInputEmail1">회원가입하기</a>
						</div>
					</div>
					<div class="row">	
						<div class="col-xs-12">
							<div class="well text-center">회원가입을 함으로써<a href="#">회원약관</a>에 동의합니다.</div>
						</div>
					</div>
					<br>
				</div>
			</div>
		</div>
  </div>
  <!--    회원가입 카드영역 끝 -->