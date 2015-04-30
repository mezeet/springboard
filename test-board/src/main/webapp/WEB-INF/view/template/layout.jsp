<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!-- jstl 변수 사용을 위해 taglib 로드! -->
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!-- HTML 영역 시작 -->
<!DOCTYPE html>
<html lang="ko">

<!-- <head>영역 시작  -->
<tiles:insertAttribute name="header-head"/>
<!-- 
		정적 include 를 사용해서 부모에서 정의한 변수를 자식 페이지에서 그냥 쓸 수 있게 한다.
		동적 jsp:include 디렉티브를 사용하면 param 을 자식으로 넘겨줘야 거기서 쓸 수 있다. 귀찮아.
	 -->
<!-- <head>영역 끝  -->

<!-- 	<body> 영역 시작 -->
<body>

	<!-- 		고정 헤더 네비게이션 막대 부분 시작 -->
	<tiles:insertAttribute name="header-nav"/>
	<!-- 		고정 헤더 네비게이션 막대 부분 시작 -->

	<!-- 메인 영역 시작-->
	<div class="container" id="main">
		<!-- container 클래스는 콘텐츠를 중앙으로 정렬시킨다. -->

		<div class="row">
		<!-- 	본문 좌측 영역 시작 -->
		
				
			<div class="col-xs-12 col-sm-12 col-md-7 col-lg-7">
					<tiles:insertAttribute name="main"/>
			</div>
		
		<!-- 	본문 좌측 영역 끝 -->
		
		<!-- 	본분 우측 영역 시작 -->
			<div class="col-sm-4  visible-md visible-lg">
				<div class="row">
					<div class="col-sm-11 col-sm-push-1">
						<tiles:insertAttribute name="main-sidenav"/>
					</div>
				</div>
			</div>
		<!-- 	본문 우측 영역 끝 -->
		</div>

		<!--	모달 영역 시작 -->
<%-- 		<tiles:insertAttribute name="main-modals"/> --%>
<tiles:insertAttribute name="main-modals" />
		<!--	모달 영역 끝 -->

	</div>
	<!-- 메인 영역 끝 -->

	<!-- 푸터 시작 -->
	<tiles:insertAttribute name="footer-footer"/>
	<!--	푸터 끝 -->

	<!-- 스크립트 영역 시작 -->
	<tiles:insertAttribute name="footer-script"/>
	<!-- 스크립트 영역 끝 -->
	
</body>
<!-- 	<body> 영역 끝 -->
</html>
<!-- HTML 영역 끝 -->