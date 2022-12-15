package emlakcepte.model;

import java.time.LocalDateTime;

public class Realty {
	
	private Long no;
	private String title;
	private LocalDateTime publishedDate;
	private User user;
	private RealtyType status;
	private Address address;
	
	public Realty() {
	}
	
	public Realty(Long no, String title, LocalDateTime publishedDate, User user, RealtyType status) {
		this.no = no;
		this.title = title;
		this.publishedDate = publishedDate;
		this.user = user;
		this.status = status;
	}
	public Long getNo() {
		return no;
	}
	public void setNo(Long no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public LocalDateTime getPublishedDate() {
		return publishedDate;
	}
	public void setPublishedDate(LocalDateTime publishedDate) {
		this.publishedDate = publishedDate;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}

	public RealtyType getStatus() {
		return status;
	}

	public void setStatus(RealtyType status) {
		this.status = status;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}


	@Override
	public String toString() {
		return "Realty{" +
				"no=" + no +
				", title='" + title + '\'' +
				", publishedDate=" + publishedDate +
				", user=" + user +
				", status=" + status +
				", address=" + address +
				'}';
	}
}
