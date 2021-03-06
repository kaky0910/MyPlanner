package com.spring.plan;

import java.io.Reader;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.spring.plan.controller.ChallengeController;
import com.spring.plan.model.vo.Challenge;
import com.spring.plan.model.vo.Daily;
import com.spring.plan.model.vo.Statics;

public class SqlTest {
	/*@Test
	public void boardInsert() throws Exception{
		Reader reader = Resources.getResourceAsReader("config/SqlMapConfig.xml");
		
		SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(reader);
		SqlSession sqlSession = factory.openSession();
		
		Member member = new Member();
		member.setPassword("搾腰");
		Daily daily = new Daily();
		daily.setEmotion("ばば");
		daily.setDay("20181128");
		daily.setMonth("11");
		daily.setMemberNo(4);
		Schedule schedule = new Schedule();
		schedule.setScheduleNo(0);
		schedule.setScheduleStartDate("20181206");
		schedule.setScheduleEndDate("20181214");
		schedule.setScheduleContent("鎧遂3");
		schedule.setScheduleTag("錘疑");
		schedule.setScheduleTitle("錘疑3");
		schedule.setMemberNo(4);
		/*
		System.out.println(sqlSession.insert("schedule-mapper.addSchedule",schedule));
		sqlSession.commit();
		
		
		System.out.println("11");
		System.out.println("@2");

	}*/
	
	
	/////////////////////////////////////////////////////
	/////////////////////////////////////////////////////
	
	
/*	@Test
	public void sendMessage() throws Exception { // 五室走 左鎧奄
		Reader reader = Resources.getResourceAsReader("config/SqlMapConfig.xml");

		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(reader);
		SqlSession sqlSession = factory.openSession();

		Message message = new Message(0, 0, 1, null, "五室走 左鎧奄 1 珍度闘", "SEND MESSAGE TITLE 1!!");

		// int sendMessage(Message message) // 五室走 左鎧奄
		System.out.println(message.getSenderMemberNo()+"還戚 "+message.getDestinationMemberNo()+ "還拭惟 五室走 左垣艦陥.");
		sqlSession.insert("message-mapper.sendMessage", message);
		sqlSession.commit();
		System.out.println(message.getMessageTitle()+"左鎧奄 失因!");
	}*/
	
	/*@Test
	public void getMessage() throws Exception {// 五室走 腰硲研 亜走澗 五室走 亜閃神奄
		Reader reader = Resources.getResourceAsReader("config/SqlMapConfig.xml");

		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(reader);
		SqlSession sqlSession = factory.openSession();

		//Message getMessage(int messageNo) / messageNo研 亜遭 五室走 舛左
		Message message = (Message)sqlSession.selectOne("message-mapper.getMessage", 13);
		
		System.out.println(message);
	}
	*/
/*	@Test
	public void deleteMessage() throws Exception {  // 五室走 腰硲研 亜走澗 五室走 肢薦馬奄
		Reader reader = Resources.getResourceAsReader("config/SqlMapConfig.xml");

		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(reader);
		SqlSession sqlSession = factory.openSession();

		System.out.println("五室走研 肢薦杯艦陥.");
		
		sqlSession.delete("message-mapper.deleteMessage", 16);
		sqlSession.commit();
		System.out.println("五室走 肢薦亜 刃戟鞠醸柔艦陥");	
	}*/
	
	/*@Test
	public void getMessageList() throws Exception {
		Reader reader = Resources.getResourceAsReader("config/SqlMapConfig.xml");

		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(reader);
		SqlSession sqlSession = factory.openSession();

		List<Message> messageList = sqlSession.selectList("message-mapper.getMessageList", 1);
		
		for(Message message : messageList)
			System.out.println(message);
	}
	*/
	/*@Test
	public void getSendMessageList() throws Exception {
		Reader reader = Resources.getResourceAsReader("config/SqlMapConfig.xml");

		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(reader);
		SqlSession sqlSession = factory.openSession();

		List<Message> messageList = sqlSession.selectList("message-mapper.getSendMessageList", 0);
		
		for(Message message : messageList)
			System.out.println(message);
	}*/
	/*
	@Test
	public void readMessage() throws Exception {
		Reader reader = Resources.getResourceAsReader("config/SqlMapConfig.xml");

		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(reader);
		SqlSession sqlSession = factory.openSession();

		sqlSession.update("message-mapper.readMessage", 18);
		sqlSession.commit();
		
		Message message = (Message)sqlSession.selectOne("message-mapper.getMessage", 18);
		
		System.out.println(message);
		System.out.println(message.isCheck());
		System.out.println("五室走研 石生写柔艦陥.");
	}*/
	
	
	
	//////////////////////////////////////////////////////////////////////////
	//////////////////////////////////////////////////////////////////////////
	//////////////////////////////////////////////////////////////////////////
	//////////////////////////////////////////////////////////////////////////
	
	/*@Test
	public void addChallenge() throws Exception {
		Reader reader = Resources.getResourceAsReader("config/SqlMapConfig.xml");

		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(reader);
		SqlSession sqlSession = factory.openSession();
		
		Challenge challenge = new Challenge(0,"馬欠拭 弘 食期 接 原獣奄", "2018-12-01", "2018-12-07",4, "闇悪", true);
		sqlSession.insert("challenge-mapper.addChallenge", challenge);
		sqlSession.commit();
		System.out.println(challenge.getChallengeTitle() + " << 亀穿 去系 失因!!");
	}*/
	
	/*@Test
	public void deleteChallenge() throws Exception {
		Reader reader = Resources.getResourceAsReader("config/SqlMapConfig.xml");

		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(reader);
		SqlSession sqlSession = factory.openSession();
	
		sqlSession.delete("challenge-mapper.deleteChallenge", 23);
		sqlSession.commit();

		System.out.println("Challenge亜 肢薦鞠醸柔艦陥.");
	}*/
	/*
	@Test
	public void addChallengeContent() throws Exception {
		Reader reader = Resources.getResourceAsReader("config/SqlMapConfig.xml");

		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(reader);
		SqlSession sqlSession = factory.openSession();
		
		List<ChallengeContent> challengeContentList = new ArrayList<ChallengeContent>();
		challengeContentList.add(new ChallengeContent(16, "Content 111"));
		challengeContentList.add(new ChallengeContent(16, "Content 222"));
		
		sqlSession.insert("challenge-mapper.addChallengeContent", challengeContentList);
		sqlSession.commit();
		
		for(int i = 0 ; i < challengeContentList.size(); i++)
			System.out.println(challengeContentList.get(i).getChallengeContent() + " << 室採 牌鯉 去系 失因!!");
	}*/
	
/*	@Test
	public void deleteChallengeContent() throws Exception {
		Reader reader = Resources.getResourceAsReader("config/SqlMapConfig.xml");

		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(reader);
		SqlSession sqlSession = factory.openSession();
		
		String challengeContent = "Content CCC";
		sqlSession.delete("challenge-mapper.deleteChallengeContent", challengeContent);
		sqlSession.commit();
		
		System.out.println(challengeContent + " << 戚 肢薦鞠醸柔艦雁.");
	}*/
	
	
	/*@Test
	public void writeChallengeComment() throws Exception {
		Reader reader = Resources.getResourceAsReader("config/SqlMapConfig.xml");

		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(reader);
		SqlSession sqlSession = factory.openSession();
		
		ChallengeComment challengeComment = new ChallengeComment(0,0,14,1,"せuせせせせせ",null);
		//challengeCommentList.add(new ChallengeComment(0,0,6,"huizz","照吃 依 旭精汽食...",null));
		
		sqlSession.insert("challenge-mapper.writeChallengeComment", challengeComment);
		sqlSession.commit();
		
		System.out.println("奇越 去系 失因!!");
	}*/
	
/*	@Test
	public void deleteChallengeComment() throws Exception {
		Reader reader = Resources.getResourceAsReader("config/SqlMapConfig.xml");

		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(reader);
		SqlSession sqlSession = factory.openSession();

		sqlSession.delete("challenge-mapper.deleteChallengeComment", 35);
		sqlSession.commit();
		
		System.out.println("奇越 肢薦 失因!!");
	}*/
	
	/*@Test
	public void checkChallenge() throws Exception {
		Reader reader = Resources.getResourceAsReader("config/SqlMapConfig.xml");

		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(reader);
		SqlSession sqlSession = factory.openSession();

		sqlSession.update("challenge-mapper.checkChallenge", new ChallengeContent(14, "微闘 仙壕帖 食税裟 焼晦奄"));
		sqlSession.commit();
		
		System.out.println("神潅税 耕芝 陳巴鹸~~");
	}*/
	
	/*@Test
	public void getAllChallengeList() throws Exception {
		Reader reader = Resources.getResourceAsReader("config/SqlMapConfig.xml");

		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(reader);
		SqlSession sqlSession = factory.openSession();

		List<Challenge> challengeList = sqlSession.selectList("challenge-mapper.getAllChallengeList");
		
		for(Challenge c : challengeList)
			System.out.println(c);
	}*/
	
	/*@Test
	public void updateChallengeLog() throws Exception {
		Reader reader = Resources.getResourceAsReader("config/SqlMapConfig.xml");

		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(reader);
		SqlSession sqlSession = factory.openSession();

		sqlSession.insert("challenge-mapper.updateChallengeLog", new ChallengeLog(20,"log test", 1));
		sqlSession.commit();
		
		System.out.println("穣汽戚闘 失因!");
	}*/
	
	/*@Test
	public void getChallengeByNo() throws Exception {
		Reader reader = Resources.getResourceAsReader("config/SqlMapConfig.xml");

		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(reader);
		SqlSession sqlSession = factory.openSession();

		Challenge challenge = sqlSession.selectOne("challenge-mapper.getChallengeByNo", 14);
		System.out.println("11"+challenge.getChallengeLogList());
		System.out.println("22"+challenge.getChallengeContentList());
		System.out.println("33"+challenge.getChallengeCommentList());
	}*/
	
	/*@Test
	public void getChallengeByMonth() throws Exception {
		Reader reader = Resources.getResourceAsReader("config/SqlMapConfig.xml");

		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(reader);
		SqlSession sqlSession = factory.openSession();
		
		Daily challengeByMonth = new Daily(1, "11", "28");
		List<Challenge> list = sqlSession.selectList("challenge-mapper.getChallengeByMonth",challengeByMonth);
		
		System.out.println(list);
		for(Challenge c : list)
			System.out.println(c);
		
		System.out.println("窒径 刃戟");
	}*/
	
	/*@Test
	public void getChallengeByMonth() throws Exception {
		Reader reader = Resources.getResourceAsReader("config/SqlMapConfig.xml");

		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(reader);
		SqlSession sqlSession = factory.openSession();
		
		Daily challengeByDay = new Daily(0, "11", "20181128");
		List<Challenge> list = sqlSession.selectList("challenge-mapper.getChallengeByDay",challengeByDay);
		
		System.out.println(list);
		for(Challenge c : list)
			System.out.println(c);
		
		System.out.println("窒径 刃戟");
	}*/
	
	/*@Test
	public void getTodayEmotion() throws Exception {
		Reader reader = Resources.getResourceAsReader("config/SqlMapConfig.xml");

		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(reader);
		SqlSession sqlSession = factory.openSession();
		
		Daily daily = new Daily();
		daily.setDay("20181217");
		daily.setMemberNo(7);
		String result = sqlSession.selectOne("daily-mapper.getTodayEmotion", daily);
		System.out.println(result);
	}*/
	@Test
	public void emotionStat() throws Exception{
		Reader reader = Resources.getResourceAsReader("config/SqlMapConfig.xml");

		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(reader);
		SqlSession sqlSession = factory.openSession();
		
		Daily daily = new Daily();
		daily.setMemberNo(7);
		daily.setDay("20181218");
		
		Statics stat = sqlSession.selectOne("daily-mapper.emotionStat",daily);
		System.out.println(stat);
		
	}
	
}
