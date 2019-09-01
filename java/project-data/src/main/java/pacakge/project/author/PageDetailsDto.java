package pacakge.project.author;

public class PageDetailsDto {
	private int pagenumber;
	  private int pagesize;
	  
	  public PageDetailsDto(int pagenumber, int pagesize) {
			super();
			this.pagenumber = pagenumber;
			this.pagesize = pagesize;
		}
	  
	  public PageDetailsDto() {
			super();
		}
	  
	  public int getPagenumber() {
		return pagenumber;
	}
	public void setPagenumber(int pagenumber) {
		this.pagenumber = pagenumber;
	}
	public int getPagesize() {
		return pagesize;
	}
	public void setPagesize(int pagesize) {
		this.pagesize = pagesize;
	}
	


}
