package com.spring.plan.model.vo;

public class ChallengeComment {

	private int challengeCommentNo;
	private String challengeReplyComment;
	private int challengeNo;
	private int challengeCommentMemberNo;
	private String challengeComment;
	private String challengeCommentWriteDate;
	
	public ChallengeComment() {}
	
	//////여기에 생성자 추가(어따쓰는지도  *주*석*)

	
	public int getChallengeCommentNo() {
		return challengeCommentNo;
	}
	public void setChallengeCommentNo(int challengeCommentNo) {
		this.challengeCommentNo = challengeCommentNo;
	}
	
	public int getChallengeNo() {
		return challengeNo;
	}
	public void setChallengeNo(int challengeNo) {
		this.challengeNo = challengeNo;
	}

	public String getChallengeReplyComment() {
		return challengeReplyComment;
	}

	public void setChallengeReplyComment(String challengeReplyComment) {
		this.challengeReplyComment = challengeReplyComment;
	}
	
	public int getChallengeCommentMemberNo() {
		return challengeCommentMemberNo;
	}

	public void setChallengeCommentMemberNo(int challengeCommentMemberNo) {
		this.challengeCommentMemberNo = challengeCommentMemberNo;
	}

	public String getChallengeComment() {
		return challengeComment;
	}

	public void setChallengeComment(String challengeComment) {
		this.challengeComment = challengeComment;
	}

	public String getChallengeCommentWriteDate() {
		return challengeCommentWriteDate;
	}

	public void setChallengeCommentWriteDate(String challengeCommentWriteDate) {
		this.challengeCommentWriteDate = challengeCommentWriteDate;
	}
	@Override
	public String toString() {
		return "ChallengeComment [challengeCommentNo=" + challengeCommentNo + ", challengeReplyComment="
				+ challengeReplyComment + ", challengeNo=" + challengeNo + ", challengeCommentMemberNo="
				+ challengeCommentMemberNo + ", challengeComment=" + challengeComment + ", challengeCommentWriteDate="
				+ challengeCommentWriteDate + "]";
	}
}
