package neu.edu.entity;
// Generated Apr 26, 2017 11:58:46 PM by Hibernate Tools 5.2.1.Final

/**
 * Creator generated by hbm2java
 */
public class Creator implements java.io.Serializable {

	private Integer creatorId;
	private String creatorName;
	private int userUserId;

	public Creator() {
	}

	public Creator(String creatorName, int userUserId) {
		this.creatorName = creatorName;
		this.userUserId = userUserId;
	}

	public Integer getCreatorId() {
		return this.creatorId;
	}

	public void setCreatorId(Integer creatorId) {
		this.creatorId = creatorId;
	}

	public String getCreatorName() {
		return this.creatorName;
	}

	public void setCreatorName(String creatorName) {
		this.creatorName = creatorName;
	}

	public int getUserUserId() {
		return this.userUserId;
	}

	public void setUserUserId(int userUserId) {
		this.userUserId = userUserId;
	}

}