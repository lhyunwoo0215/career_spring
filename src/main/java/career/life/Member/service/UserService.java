package career.life.Member.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	@Autowired
	private UserDao dao;


	public MemberDTO getUserByUid(String id) {
		MemberDTO user = dao.getUserDTOById(id);
		return user;
	}

	public void update(MemberDTO user) {
		dao.save(user);
	}
	public MemberDTO login(String id, String password) {
		MemberDTO user = dao.findByIdAndPassword(id,password);
		return user;
	}
	public void delete(String id) {
		dao.deleteById(id);
	}
	public MemberDTO findPw(String id, String email) {
		MemberDTO users = dao.findByIdAndEmail(id, email);
		return users;
	}
	
	
	
}
