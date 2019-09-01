package pacakge.project.config;

public class PageResponse extends Response {

  /**
   * Constructor for PageResponse.
   * 
   * @param code
   *          Code
   * @param message
   *          Message
   * @param totalCount
   *          Long
   * @param data
   *          Response object
   */
  public PageResponse(Integer code, String message, Object data, long totalCount) {
    super(code, message, data);
    this.totalCount = totalCount;
//    this.pageNumber = pagenumber;
  }

  /** The total count. */
  private long totalCount;
  
  /** The page number. */
//  private long pageNumber;
//  public long getPageNumber() {
//	return pageNumber;
//}
//
//public void setPageNumber(long pageNumber) {
//	this.pageNumber = pageNumber;
//}



  /**
   * Return the totalCount.
   *
   * @return the totalCount
   */
  public long getTotalCount() {
    return totalCount;
  }

  /**
   * Set the totalCount.
   *
   * @param totalCount
   *          the totalCount to set
   */
  public void setTotalCount(long totalCount) {
    this.totalCount = totalCount;
  }

  /**
   * Method is used to set https status code and message.
   * 
   * @param status
   *          Http status
   * @param statusMessage
   *          Http status message
   * @param pageResponse
   *          Response
   * @return {@link PageResponse}
   */
  public PageResponse setHTTPResponse(int status, String statusMessage, PageResponse pageResponse) {
    pageResponse.setCode(status);
    pageResponse.setMessage(statusMessage);
    return pageResponse;
  }
}
