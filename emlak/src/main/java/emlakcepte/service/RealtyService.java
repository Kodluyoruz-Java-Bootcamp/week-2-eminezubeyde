package emlakcepte.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Service;

import emlakcepte.dao.RealtyDao;
import emlakcepte.model.Realty;
import emlakcepte.model.RealtyType;
import emlakcepte.model.User;
import emlakcepte.model.UserType;

@Service
public class RealtyService {
	
	private RealtyDao realtyDao = new RealtyDao();
	
	@Autowired // ejekte et
	private UserService userService;
	
	public void createRealty(Realty realty) {	
		
		//userService.printAllUser();
		
		if (UserType.INDIVIDUAL.equals(realty.getUser().getType()) ) {
			// en fazla 5 ilan girebilir.
			
			System.out.println("Bireysel kullanıclar en fazla 5 ilan girebilir.");
		}
			
		realtyDao.saveRealty(realty);
		System.out.println("createRealty :: " + realty.getTitle());
	}
	
	public List<Realty> getAll(){
		return realtyDao.findAll();
	}

	public long getNumberOfRealtyByProvince(@NonNull String province){
		return getAll().stream().filter(realty -> realty.getAddress().getProvince().equals(province)).count();
	}

	public void printAll(List<Realty> realtList) {
		realtList.forEach(realty -> System.out.println(realty));
	}

	public void getAllByProvince(@Nullable String province) {
			getAll().stream()
					.filter(realty -> realty.getAddress().getProvince().equals(province))
					//.count();
					.forEach(realty -> System.out.println(realty));

	}
	public List<Realty> getRealtiesByProvinceAndDistrict(String province,String district){
		return getAll().stream().filter(realty -> realty.getAddress().getProvince().equals(province)
				&& realty.getAddress().getDistrict().equals(district)).collect(Collectors.toList());
	}
	
	public List<Realty> getAllByUserName(User user){	
		return getAll().stream()
		.filter(realty -> realty.getUser().getMail().equals(user.getMail()))
		.toList();		
	}

	public List<Realty> getActiveRealtyByUserName(User user) {
		
		return getAll().stream()
		.filter(realty -> realty.getUser().getName().equals(user.getName()))
		.filter(realty -> RealtyType.ACTIVE.equals(realty.getStatus()))
		.toList();

	}

}
