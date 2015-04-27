package board.controller;


import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import board.common.ListInterface;
import board.common.ViewInterface;
import board.model.Board;

/**
 * 게시판 관련 서비스 컨트롤러
 * @author crown204
 *
 */
@Controller
public class BoardController {
	
	List<Object> list; 
	
	/**
	 * 특정 글 번호를 가진 게시물 내용을 조회 후 뷰로 넘긴다.
	 * @param model
	 * @param no 게시글 번호
	 * @return
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
	
	@RequestMapping(value="/board/list.do")
	public String list(Model model, @RequestParam(value="table",required=false) String table){

		common.util.Identify.getLocation(0);
		list = listInterface.process(table);
		List<Board> boardList = common.util.GenericConverter.convBoard(list);
		model.addAttribute("boardList", boardList);
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


	
}
