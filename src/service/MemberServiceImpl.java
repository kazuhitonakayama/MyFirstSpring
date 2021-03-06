package service;

import java.util.ArrayList;

import entity.Member;

public class MemberServiceImpl implements MemberService {
	private static MemberServiceImpl singleton = new MemberServiceImpl();
	private MemberServiceImpl() {};
	public static MemberServiceImpl getInstance() {
		return singleton;
	}

	@Override
	public String greet(int i) {
		String[] greetings = {"Good morninig","Hello","Good evening"};
		return greetings[i]; // iの値に応じて、戻り値を異ならせる
	}
	
	@Override
	public int sumOf(int i,int n) {
		int sum = 0;
		for (int number = i;number <= n;number++) {
			sum += number;
			// 1週目=>3
			// 2週目=>3+1
			// 3週目=>3+2
		}
		return sum;
	}

	@Override
	public ArrayList<Member> getAll() {
		ArrayList<Member> list = new ArrayList<>();
		Member mem1 = new Member(1, "Linda", "linda@example.com");
		Member mem2 = new Member(2, "James", "james@example.com");
		list.add(mem1);
		list.add(mem2);
		
		return list;
	}

}
