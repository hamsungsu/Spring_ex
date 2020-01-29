package org.zerock.mapper;

import java.util.List;
import java.util.stream.IntStream;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.zerock.domain.Criteria;
import org.zerock.domain.ReplyVO;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class ReplyMapperTests {
	
	private Long[] bnoArr = { 8390699L, 8390695L, 8390694L, 8390693L, 8390691L };
	
	@Setter(onMethod_ = @Autowired)
	private ReplyMapper mapper;
	
//	@Test
//	public void testCreate() {
//		
//		IntStream.rangeClosed(1,10).forEach(i -> {
//			
//			ReplyVO vo =new ReplyVO();
//			
//			//게시물의 번호
//			vo.setBno(bnoArr[i % 5]);
//			vo.setReply("댓글 테스트" + i);
//			vo.setReplyer("replyer" + 1);
//			
//			mapper.insert(vo);
//		});
//	}
	
//	@Test
//	public void testRead() {
//		
//		Long targetRno = 5L;
//		
//		ReplyVO vo = mapper.read(targetRno);
//		
//		log.info(vo);
//		
//	}
//	
//	@Test
//	public void testDelect() {
//		
//		Long targetRno = 1L;
//		
//		mapper.delete(targetRno);
//	}
	
//	@Test
//	public void testUpdate() {
//		
//		Long targetRno = 10L;
//		
//		ReplyVO vo = mapper.read(targetRno);
//		
//		vo.setReply("Update Reply ");
//		
//		int count = mapper.update(vo);
//		
//		log.info("Update count: " + count);
//	}
	
	@Test
	public void testList() {
		
		Criteria cri = new Criteria();
		List<ReplyVO> replies = mapper.getListWithPaging(cri, bnoArr[0]);
		
		replies.forEach(reply -> log.info(reply));
		
	}
	
	@Test
	public void testMapper() {
		log.info(mapper);
	}
}
