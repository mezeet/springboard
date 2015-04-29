package board.controller;


import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import board.common.DeleteInterface;
import board.common.ListInterface;
import board.common.ResultStatus;
import board.common.UpdateInterface;
import board.common.ViewInterface;
import board.common.WriteInterface;
import board.model.Board;

/**
 * 게시판 관련 서비스 컨트롤러 여러 게시판에 적용 가능하다.
 * @author crown204
 *
 */
@Controller
public class BoardController {
	
	/**
	 * 특정 글 번호를 가진 게시물 내용을 조회 후 뷰로 넘긴다.
	 * @param model 서비스 처리 결과를 보낼 객체
	 * @param no 게시글 번호
	 * @param table 조회할 대상 테이블
	 * @return 게시글 하나를 보여줄 jsp 페이지
	 */
	@RequestMapping(value="/board/view.do")
	public String view(Model model, @RequestParam(value="no",required=true)int no,
																	@RequestParam(value="table",required=false) String table){
		
		common.util.Identify.getLocation(0);
		Board board = new Board();
		board = (Board)viewInterface.process(no,table);
		model.addAttribute("board", board);
		common.util.Identify.getLocation(1);
		return "board/view";
	}

	/**
	 *  게시글 목록을 조회하여 뷰로 넘긴다.
	 * @param model 서비스 처리 결과르 보낼 객체
	 * @param table 조회할 대상 테이블
	 * @return 목록을 보여줄 jsp 페이지
	 */
	@RequestMapping(value="/board/list.do")
	public String list(Model model, @RequestParam(value="table",required=false) String table){

		common.util.Identify.getLocation(0);
		List<Object> list = listInterface.process(table);
		List<Board> boardList = common.util.GenericConverter.convBoard(list);
		model.addAttribute("boardList", boardList);
		common.util.Identify.getLocation(1);
		return "Board";
	}

	
	/**
	 * get 방식 요청을 받으면 특정 글 번호를 가진 게시물 내용을 조회 후 수정 화면으로 넘긴다..
	 * @param model 서비스 처리 결과를 보낼 객체
	 * @param no 게시글 번호
	 * @param table 조회할 대상 테이블
	 * @return 게시글 수정 jsp 페이지
	 */
	@RequestMapping(value="/board/write.do",method=RequestMethod.GET)
	public String write(Model model, @RequestParam(value="table",required=false) String table){
		
		common.util.Identify.getLocation(0);
		common.util.Identify.getLocation(1);
		return "board/write";
	}
	
	/**
	 * post 방식 요청을 받으면 특정 글 번호 수정한 내용을 DB 에 적용한다.
	 * @param model 서비스 처리 결과를 보낼 객체
	 * @param no 게시글 번호
	 * @param table 수정 사항을 적용할 대상 테이블
	 * @param redirectAttributes 리다이렉트 시 파라미터 값을 주기 위해서 필요한 객체
	 * @see http://stackoverflow.com/questions/19249049/how-to-pass-parameters-to-redirect-page-in-spring-mvc
	 * @return 
	 */
	@RequestMapping(value="/board/write.do", method=RequestMethod.POST)
	public String write(Model model, 
											RedirectAttributes redirectAttributes, 
											@RequestParam(value="table",required=true)
											String table, Board inputForm){

		common.util.Identify.getLocation(0);
		ResultStatus resultStatus = writeInterface.process(table, inputForm);
		model.addAttribute("resultStatus", resultStatus);
		redirectAttributes.addFlashAttribute("no", resultStatus.getNextNo());
		common.util.Identify.getLocation(1);
		
		return "board/view";
	}
	
	
	/**
	 * get 방식 요청을 받으면 특정 글 번호를 가진 게시물 내용을 조회 후 수정 화면으로 넘긴다..
	 * @param model 서비스 처리 결과를 보낼 객체
	 * @param no 게시글 번호
	 * @param table 조회할 대상 테이블
	 * @return 게시글 수정 jsp 페이지
	 */
	@RequestMapping(value="/board/update.do",method=RequestMethod.GET)
	public String update(Model model,
											 @RequestParam(value="no",required=true)int no,
											 @RequestParam(value="table",required=false) String table){
		
		common.util.Identify.getLocation(0);
		Board board = new Board();
		board = (Board)viewInterface.process(no,table);
		model.addAttribute("board", board);
		common.util.Identify.getLocation(1);
		return "board/update";
	}
	
	/**
	 * post 방식 요청을 받으면 특정 글 번호 수정한 내용을 DB 에 적용한다.
	 * @param model 서비스 처리 결과를 보낼 객체
	 * @param no 게시글 번호
	 * @param table 수정 사항을 적용할 대상 테이블
	 * @param formInput 입력을 위해 전달받은 폼값이 담긴 커맨드 객체 
	 * @param redirectAttributes 리다이렉트 시 파라미터 값을 주기 위해서 필요한 객체
	 * @return 
	 */
	@RequestMapping(value="/board/update.do", method=RequestMethod.POST)
	public String update(Model model,
											 RedirectAttributes redirectAttributes,
											 @RequestParam(value="table",required=false) String table,
											 Board formInput){

		common.util.Identify.getLocation(0);
		
		ResultStatus resultStatus = updateInterface.process(table, formInput.getNo(),formInput);
		model.addAttribute("resultStatus", resultStatus);
		redirectAttributes.addFlashAttribute("no", resultStatus.getNextNo());
		common.util.Identify.getLocation(1);
		
		return "board/view";
	}
	
	/**
	 * get 방식 요청을 받으면 특정 글 번호 게시글을 DB 에서 제거한다.
	 * @param model 서비스 처리 결과를 보낼 객체
	 * @param no 게시글 번호
	 * @param table 수정 사항을 적용할 대상 테이블  
	 * @param redirectAttributes 리다이렉트 시 파라미터 값을 주기 위해서 필요한 객체
	 * @return 
	 */
	@RequestMapping(value="/board/delete.do")
	public String delete(Model model,
											 RedirectAttributes redirectAttributes,
											 @RequestParam(value="table",required=true) String table,
											 @RequestParam(value="no",required=true) int no){

		common.util.Identify.getLocation(0);
		
		ResultStatus resultStatus = deleteInterface.process(table, no);
		model.addAttribute("resultStatus", resultStatus);
		
		common.util.Identify.getLocation(1);
		
		return "board/list";
	}
	
	//	2. 사용할 의존 서비스 객체를 형변환 해서 처리할 인터페이스 객체 변수 준비
	
	// 2-1. view 인터페이스를 사용하여 모든 view 서비스 객체를 주입받는다.
	private ViewInterface viewInterface;
	public void setViewInterface(ViewInterface viewInterface) {
		this.viewInterface = viewInterface;
	}
	// 2-2. list 인터페이스를 사용하여 모든 list 서비스 객체를 주입받는다.
	private ListInterface listInterface;
	public void setListInterface(ListInterface listInterface) {
		this.listInterface = listInterface;
	}
	
	// 2-3. Update 인터페이스를 사용하여 모든 update 서비스 객체를 주입받는다.
	private UpdateInterface updateInterface;
	public void setUpdateInterface(UpdateInterface updateInterface) {
		this.updateInterface = updateInterface;
	}
	
	// 2-4. Write 인터페이스를 사용하여 모든 update 서비스 객체를 주입받는다.
	private WriteInterface writeInterface;
	public void setWriteInterface(WriteInterface writeInterface) {
		this.writeInterface = writeInterface;
	}
	
	// 2-5. Delete 인터페이스를 사용하여 모든 update 서비스 객체를 주입받는다.
	private DeleteInterface deleteInterface;
	public void setDeleteInterface(DeleteInterface deleteInterface) {
		this.deleteInterface = deleteInterface;
	}
	
	
}
