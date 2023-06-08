package com.example.springbootRESTAPI;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.example.springbootRESTAPI.Entity.User;
import com.example.springbootRESTAPI.Repostory.UserRepostory;
import com.example.springbootRESTAPI.Service.UserService;

@SpringBootTest
class SpringbootRestapiApplicationTests {

	@Autowired
	private UserService userService;
	
	@MockBean
	private UserRepostory userRepostory;
	
	@Test
	public void registerUserTest() {
		User user = new User("wengel", "alemu");
		
		when(userRepostory.save(user)).thenReturn(user);
		assertEquals(user, userService.registerUser(user));
	}
//	@Test
//	public void getUserTest() {
//		when(userRepostory.findAll()).thenReturn(Stream
//				.of(new User("menge","chla")).collect(Collectors.toList()));
//		assertEquals(1, userService.getUser().size());
//	}
	
//	@Test
//	public void getByAddessTest() {
//		String address = "adama";	
//		when(userRepostory.findByAdress(address)).thenReturn(Stream
//				.of(new User("menge","chla")).collect(Collectors.toList()));
//		assertEquals(1, userService.getByAddess().size());
//	}
	

}
