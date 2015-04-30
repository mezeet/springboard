/**
 * 로그인과 회원등록 관련 화면에 관련된 jquery 소스만 담았다.
 * 담당자 : 고재범
 * 전체div : servaym
 * 상위div id : vote-title, answer-title, appraiser-title, versus-title
 * 각 a button : opvote, opanswer, opappraiser, opversus, opevery
 */
$(function() {
    $('.opvote').click(function () {
//    	alert("vote");
    	$(".servaym>div").hide();
    	$("#vote").show();
    });
    $('.opanswer').click(function () {
//    	alert("answer");
    	$(".servaym>div").hide();
    	$("#answer").show();
    });
    $('.opappraiser').click(function () {
//    	alert("appaiser");
    	$(".servaym>div").hide();
    	$("#appaiser").show();
    });
    $('.opversus').click(function () {
//    	alert("versus");
    	$(".servaym>div").hide();
    	$("#versus").show();
    });
    $('.opevery').click(function () {
//    	alert("every");
    	$(".servaym>div").hide();
    	$("#every").show();
    });
/**
 * #addSelection 버튼 클릭 시 qselection.html 조각을 ajax 로 load 한 뒤
 * .qselection 에다가 집어 넣는다.
 */
	$('#addSelection').click(function() {
//		alert("add");
    	no = $("#qselection").children().children().length; // 현재 문항수 카운트
    	
	    if($("#qselection").children().children().length >=6){ // 현재 카운트가 5 이상이면 추가불가
	    	alert("5개 이상 보기문항을 추가할 수 없습니다.");
	    } else{ // 현재 문항수 카운트가 5 이하일때 아작스로 추가보기를 생성한다
//	    	alert("ajax");
	    	$.ajax({      
	    	type:"post",                // 보내는 방식
	    	// 요청주소에 no로 현재 문항수 카운트하여 전달
	    	// no가 보기문항 위의 '질문내용(<div>로 구현)'도 카운트 하기때문에 따로 +1할 필요없음
	    	url:"./qselection.jsp?no="+no,    
	    	dataType:'html',            // 받을 자료 종류, html 은 생략가능?
	    	
	    	success:function(args){
	    		$("#qselection > #area").append(args);
	  			}, // 성공했을때 실행할 콜백, args 에는 받아온 결과내용이 들어 있다.
	      
	  		error:function(e){
	  			alert(e.responseText);
	  			}// 실패했을때 실행할 콜백, e는 오류 객체이고 responseText 로 결과내용을 출력
	    	});
	    }
	});
	
	// 보기항목 제거부분
	$('#qselection > #area').on( "click", 'span' ,function() {
		// 이벤트(삭제) 다음 값들 하나씩 가져오기
		$(this).parent().parent().parent().nextAll().find('.bogi').each(function(){
			// 하나씩 가져온 다음 값들 -1로 수정 후 text로 입력
			$(this).text($(this).text()-1);
		});
		// 해당 이벤트 삭제
		$(this).parent().parent().parent().remove();
	});
	//질문 제목 체크하기 // 간단설문 id=selecttitle  //대결설문 id=versustitle
	 $('#selectM').click(function () {
		 if($('#selecttitle').val()==''){
			 alert('질문제목은 반드시 입력해야 합니다.');
			 return false;
		}else{
			 return true;
		}
	 });
	 $('#versusM').click(function () {
		if($('#versustitle').val()==''){
			 alert('질문제목은 반드시 입력해야 합니다.');
			 return false;
		}else{
			 return true;
	    }
	 });

	//라디오 버튼 체크하기
	$('#dovote').click(function() {
		var qcheck = $(':input[name=voteData]:radio:checked').val();
		var verqcheck = $(':input[name=verData]:radio:checked').val();
		if( qcheck ){
            alert(qcheck+"번을 선택했습니다");
            return true;}
        else if (verqcheck){
            alert(verqcheck+"번을 선택했습니다");
            return true;}
        else{
        	alert("투표할 번호를 선택하세요");
            return false;
        } 
   	});	
	// 삭제하기 확인 코드
	$('#deleteVote').click(function() {
		var result = confirm("삭제하시겠습니까?");
		if(result){
			return true;
		}else{
			location.reload();
		}
		
   	});		
});
//대결 간단설문 // 이미지 미리보기 코드
$(function() {
//	alert("in?");
	var fileRoL = null;
	var fileshow = null;
	$('#fileL').click(function() {
//		alert("L in?");
		fileRoL= "fileL";
		fileshow = "showfL";
		alert(fileRoL+"    "+fileshow);
		
		var upload = document.getElementById(fileRoL);
	    var holder = document.getElementById(fileshow);
	 
		upload.onchange = function (e) {
		e.preventDefault();

		var file = upload.files[0], reader = new FileReader();
		reader.onload = function (event) {
	    var img = new Image();
	    img.src = event.target.result;
	    // note: no onload required since we've got the dataurl...I think! :)
	    img.width = 200; img.height=200;
//	    	if (img.width > 560) { // holder width
//	    		img.width = 120;
//	    		img.height = 120;
//	    	}
	    	holder.innerHTML = '';
	    	holder.appendChild(img);
		};
		reader.readAsDataURL(file);
		return false;
		};
	 });
	$('#fileR').click(function() {
//		alert("R in?");
		fileRoL= "fileR";
		fileshow = "showfR";
		
		var upload = document.getElementById(fileRoL);
	    var holder = document.getElementById(fileshow);
	 
		upload.onchange = function (e) {
		e.preventDefault();

		var file = upload.files[0], reader = new FileReader();
		reader.onload = function (event) {
	    var img = new Image();
	    img.src = event.target.result;
	    // note: no onload required since we've got the dataurl...I think! :)
	    img.width = 200; img.height=200;
//	    	if (img.width > 560) { // holder width
//	    		img.width = 120;
//	    		img.height = 120;
//	    	}
	    	holder.innerHTML = '';
	    	holder.appendChild(img);
		};
		reader.readAsDataURL(file);
		return false;
		};
		
	 });
 });