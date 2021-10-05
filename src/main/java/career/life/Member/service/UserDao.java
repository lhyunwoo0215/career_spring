package career.life.Member.service;

import career.life.Domain.MemberDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends JpaRepository<MemberDTO, String>{
	MemberDTO getUserDTOByEmail(String email);
	MemberDTO getUserDTOById(String id);
	MemberDTO findByIdAndPassword(String id, String password);
	//Optional = 라이브러리 메서드가 반환할 결과값이 ‘없음’을 명백하게 표현할 필요가 있는 곳에서 제한적으로 사용할 수 있는 메커니즘을 제공
	//Optional<UserDTO> findUserDTObyEmailAndPassword(String email, String password);
	MemberDTO findByIdAndEmail(String id, String email);
}
