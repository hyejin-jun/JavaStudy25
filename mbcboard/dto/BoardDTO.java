package mbcboard.dto;

import java.sql.Date;

public class BoardDTO {
	
		private int	bno ;  // 게시글 번호
		private String	btitle ;  // 게시글 제목
		private String bcontent ; // 게시글 내용
		private String	bwriter ; // 게시글 작성자
		private Date date  ; // 게시글 날짜
		
		
		// 기본 생성자
		
		// 메서드 >> 게터 (출력용) / 세터 (입력용)
		
		
		public int getBno() {
			return bno;
		}
		public String getBtitle() {
			return btitle;
		}
		public String getBcontent() {
			return bcontent;
		}
		public String getBwriter() {
			return bwriter;
		}
		public Date getDate() {
			return date;
		}
		public void setBno(int bno) {
			this.bno = bno;
		}
		public void setBtitle(String btitle) {
			this.btitle = btitle;
		}
		public void setBcontent(String bcontent) {
			this.bcontent = bcontent;
		}
		public void setBwriter(String bwriter) {
			this.bwriter = bwriter;
		}
		public void setDate(Date date) {
			this.date = date;
		}
		
		
			

}
